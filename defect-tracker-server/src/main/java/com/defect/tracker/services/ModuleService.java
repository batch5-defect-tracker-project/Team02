package com.defect.tracker.services;

import com.defect.tracker.data.entities.Module;

public interface ModuleService {
	
	public void createModule(Module module);

	public boolean isModuleNameAlreadyExist(String moduleName);

    public void updateModule(Module module);

	public boolean existsById(Long id);
	



}
