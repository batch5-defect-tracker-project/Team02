package com.defect.tracker.services;

	import com.defect.tracker.data.entities.ProjectAllocator;

	public interface ProjectAllocatorService {

		public boolean isEmployeeIdAlreadyExist(Long EmployeeId);

		public void createProjectAllocator(ProjectAllocator projectAllocator);
}
