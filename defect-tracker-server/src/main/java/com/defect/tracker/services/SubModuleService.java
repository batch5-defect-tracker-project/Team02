package com.defect.tracker.services;

import com.defect.tracker.data.entities.SubModule;

public interface SubModuleService {
	
	public void createSubModule(SubModule subModule);

	public boolean isSubModuleNameAlreadyExist(String subModuleName);

    public void updateSubModule(SubModule subModule);

	public boolean existsById(Long id);
	



}
