package com.defect.tracker.services;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;

import com.defect.tracker.data.dto.DefectStatusCountResponseDto;
import com.defect.tracker.data.entities.Defect;

public interface DefectService {

	public void createDefect(Defect defect) throws UnsupportedEncodingException, MessagingException;

	public List<Defect> getAllDefect();

	public void deleteById(Long id);

	public boolean existsById(Long id);

	public Object getByIdDefect(Long id);

	public boolean isModuleIdAlreadyExist(Long moduleId);

	public void updateDefect(Defect defect) throws UnsupportedEncodingException, MessagingException;

	public void sendNotificationEmail(Defect defect) throws UnsupportedEncodingException, MessagingException;

	public void sendUpdateNotificationEmail(Defect defect) throws UnsupportedEncodingException, MessagingException;

	public DefectStatusCountResponseDto countByProjectStatus(String projectName);

	public long countDefect();

}
