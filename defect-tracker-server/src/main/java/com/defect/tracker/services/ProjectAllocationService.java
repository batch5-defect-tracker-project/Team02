package com.defect.tracker.services;

	import java.util.List;

import com.defect.tracker.data.entities.ProjectAllocation;

	public interface ProjectAllocationService {

		public boolean isEmployeeIdAlreadyExist(Long EmployeeId);

		public void createProjectAllocation(ProjectAllocation projectAllocation);
		
		public List<ProjectAllocation> getAllProjectAllocation();
		
		public void updateProjectAllocation(ProjectAllocation projectAllocation);
		
		public boolean existsById(Long id);
		
		public void deleteById(Long id);

		public Object getProjectAllocationById(Long id);
		
		
		
}
