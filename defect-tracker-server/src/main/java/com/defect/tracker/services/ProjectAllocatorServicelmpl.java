package com.defect.tracker.services;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.defect.tracker.data.entities.ProjectAllocator;
	import com.defect.tracker.data.repositories.ProjectAllocatorRepository;

	@Service
		public class ProjectAllocatorServicelmpl  implements ProjectAllocatorService {
			
		@Autowired
			private ProjectAllocatorRepository projectAllocatorRepository;

			@Override
			public boolean isEmployeeIdAlreadyExist(Long EmployeeId) {
				
				return projectAllocatorRepository.existsById(EmployeeId);
			}

			@Override
			public void createProjectAllocator(ProjectAllocator projectAllocator) {
				projectAllocatorRepository.save(projectAllocator);

}
}