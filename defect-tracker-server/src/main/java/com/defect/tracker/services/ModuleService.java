package com.defect.tracker.services;

import java.util.List;
import java.util.Optional;

import com.defect.tracker.data.entities.Module;

public interface ModuleService {

	public void createModule(Module module);

	public boolean isModuleNameAlreadyExist(String moduleName);

	public void updateModule(Module module);

	public boolean existsById(Long id);

	public List<Module> getAllModule();

	public void deleteById(Long id);

	public Object getModuleById(Long id);

	public boolean isUpdatedModuleNameAlreadyExist(Long id, String moduleName);

	public Optional<Module> findById(Long id);

}
