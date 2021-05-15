package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.SubModule;

public interface SubModuleService {

	public void createSubModule(SubModule subModule);

	public boolean isSubModuleNameAlreadyExist(String subModuleName);

	public void updateSubModule(SubModule subModule);

	public boolean existsById(Long id);
	
	public List<SubModule> getAllSubModule();

	public Object getSubModuleById(Long id);
	
	public void deleteById(Long id);
	
}