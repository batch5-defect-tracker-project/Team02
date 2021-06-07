package com.defect.tracker.services;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.dto.DefectPriorityCountResponseDto;
import com.defect.tracker.data.dto.DefectStatusCountResponseDto;
import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.entities.Module;
import com.defect.tracker.data.entities.Priority;
import com.defect.tracker.data.entities.Project;
import com.defect.tracker.data.entities.Status;
import com.defect.tracker.data.repositories.DefectRepository;

@Service
public class DefectServiceImpl implements DefectService {
	@Autowired
	private DefectRepository defectRepository;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private ModuleService moduleService;
	@Autowired
	private StatusService statusService;
	@Autowired
	private PriorityService priorityService;
	@Autowired
	private JavaMailSender mailSender;

	@Override
	public List<Defect> getAllDefect() {
		return defectRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		defectRepository.deleteById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return defectRepository.existsById(id);
	}

	@Override
	public Object getByIdDefect(Long id) {
		return defectRepository.findById(id);
	}

	@Override
	public boolean isModuleIdAlreadyExist(Long moduleId) {
		return defectRepository.existsById(moduleId);
	}

	@Override
	public void updateDefect(Defect defect) throws UnsupportedEncodingException, MessagingException {
		defectRepository.save(defect);
		sendUpdateNotificationEmail(defect);
	}

	@Override
	public void createDefect(Defect defect) throws UnsupportedEncodingException, MessagingException {
		defectRepository.save(defect);
		sendNotificationEmail(defect);
	}

	@Override
	public void sendNotificationEmail(Defect defect) throws UnsupportedEncodingException, MessagingException {
		Optional<Employee> toAddress = employeeService.findById(defect.getAssignedTo().getId());
		Optional<Employee> fromAddress = employeeService.findById(defect.getAssignedBy().getId());
		Optional<Project> projectName = projectService.findById(defect.getProject().getId());
		Optional<Module> moduleName = moduleService.findById(defect.getModule().getId());
		Optional<Status> statusName = statusService.findById(defect.getStatus().getId());

		String senderName = fromAddress.get().getName();

		String subject = "Defect Added Newely";
		String content = "Dear [[name]],<br><br>"
				+ "Project Name : [[projectName]] <br>"
				+ "Module Name : [[moduleName]] <br>" 
				+ "Defect Status :[[statusName]] <br><br>" 
				+ "Thank you, <br>"
				+ fromAddress.get().getName();

		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom("meera10testmail@gmail.com", senderName);
		helper.setTo(toAddress.get().getEmail());

		content = content.replace("[[name]]", toAddress.get().getName());
		content = content.replace("[[projectName]]", projectName.get().getName());
		content = content.replace("[[moduleName]]", moduleName.get().getName());
		content = content.replace("[[statusName]]", statusName.get().getName());

		helper.setSubject(subject);
		helper.setText(content, true);

		mailSender.send(message);
	}

	@Override
	public void sendUpdateNotificationEmail(Defect defect) throws UnsupportedEncodingException, MessagingException {
		Optional<Employee> toAddress = employeeService.findById(defect.getAssignedTo().getId());
		Optional<Employee> fromAddress = employeeService.findById(defect.getAssignedBy().getId());
		Optional<Project> projectName = projectService.findById(defect.getProject().getId());
		Optional<Module> moduleName = moduleService.findById(defect.getModule().getId());
		Optional<Status> statusName = statusService.findById(defect.getStatus().getId());

		String subject = "Please Check Your Status";
		String content = "Dear [[name]],<br><br>" 
						+ "Project Name : [[projectName]] <br>"
						+ "Module Name : [[moduleName]] <br>" 
						+ "Defect Status :[[statusName]] <br><br>" 
						+ "Thank you, <br>"
						+ "[[senderName]]";

		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom("meera10testmail@gmail.com");
		helper.setSubject(subject);

		if ("Reopen".equalsIgnoreCase(statusName.get().getName())
				|| "Closed".equalsIgnoreCase(statusName.get().getName())) {

			String senderName = fromAddress.get().getName();
			helper.setFrom("meera10testmail@gmail.com", senderName);
			helper.setTo(toAddress.get().getEmail());
			helper.setSubject(subject);
			content = content.replace("[[name]]", toAddress.get().getName());
			content = content.replace("[[senderName]]", fromAddress.get().getName());
			helper.setText(content, true);
		}
		if ("Open".equalsIgnoreCase(statusName.get().getName()) || "Fixed".equalsIgnoreCase(statusName.get().getName())
				|| "Reject".equalsIgnoreCase(statusName.get().getName())) {
			String senderName = toAddress.get().getName();

			helper.setFrom("meera10testmail@gmail.com", senderName);
			helper.setTo(fromAddress.get().getEmail());
			helper.setSubject(subject);
			content = content.replace("[[name]]", fromAddress.get().getName());
			content = content.replace("[[senderName]]", toAddress.get().getName());
			helper.setText(content, true);
		}
		content = content.replace("[[projectName]]", projectName.get().getName());
		content = content.replace("[[moduleName]]", moduleName.get().getName());
		content = content.replace("[[statusName]]", statusName.get().getName());

		helper.setText(content, true);

		mailSender.send(message);
	}

	@Override
	public DefectPriorityCountResponseDto countByProjectPriority(String projectName) {
		DefectPriorityCountResponseDto defectPriorityCountResponseDto = new DefectPriorityCountResponseDto();
		Project project = projectService.findByName(projectName);

		Priority High = priorityService.findByName("High");
		Priority Medium = priorityService.findByName("Medium");
		Priority Law = priorityService.findByName("Law");

		defectPriorityCountResponseDto.setPriorityHigh(defectRepository.countByPriorityAndProject(High, project));
		defectPriorityCountResponseDto.setPriorityMedium(defectRepository.countByPriorityAndProject(Medium, project));
		defectPriorityCountResponseDto.setPriorityLaw(defectRepository.countByPriorityAndProject(Law, project));
		defectPriorityCountResponseDto.setTotalPriority(defectRepository.countByProject(project));
		return defectPriorityCountResponseDto;
	}
	
	public DefectStatusCountResponseDto countByProjectStatus(String projectName) {
		DefectStatusCountResponseDto defectStatusCountResponseDto = new DefectStatusCountResponseDto();
		Project project = projectService.findByName(projectName);

		Status New = statusService.findByName("New");
		Status Open = statusService.findByName("Open");
		Status ReOpen = statusService.findByName("Reopen");
		Status Fixed = statusService.findByName("Fixed");
		Status Closed = statusService.findByName("Closed");
		Status Reject = statusService.findByName("Reject");

		defectStatusCountResponseDto.setStatusNew(defectRepository.countByStatusAndProject(New, project));
		defectStatusCountResponseDto.setStatusOpen(defectRepository.countByStatusAndProject(Open, project));
		defectStatusCountResponseDto.setStatusReopen(defectRepository.countByStatusAndProject(ReOpen, project));
		defectStatusCountResponseDto.setStatusFixed(defectRepository.countByStatusAndProject(Fixed, project));
		defectStatusCountResponseDto.setStatusClosed(defectRepository.countByStatusAndProject(Closed, project));
		defectStatusCountResponseDto.setStatusReject(defectRepository.countByStatusAndProject(Reject, project));
		defectStatusCountResponseDto.setTotal(defectRepository.countByProject(project));

		return defectStatusCountResponseDto;
	}

}