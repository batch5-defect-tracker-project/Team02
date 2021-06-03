package com.defect.tracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Module;
import com.defect.tracker.data.repositories.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {
	@Autowired
	private ModuleRepository moduleRepository;

	@Override
	public void createModule(Module module) {
		moduleRepository.save(module);
	}

	@Override
	public boolean isModuleNameAlreadyExist(String moduleName) {
		return moduleRepository.existsByName(moduleName);
	}

	@Override
	public void updateModule(Module module) {
		moduleRepository.save(module);
	}

	@Override
	public boolean existsById(Long id) {
		return moduleRepository.existsById(id);
	}

	@Override
	public List<Module> getAllModule() {
		return moduleRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		moduleRepository.deleteById(id);
	}

	@Override
	public Object getModuleById(Long id) {
		return moduleRepository.findById(id);
	}

	@Override
	public boolean isUpdatedModuleNameAlreadyExist(Long id, String moduleName) {
		if ((!moduleRepository.findById(id).get().getName().equalsIgnoreCase(moduleName))
				&& (isModuleNameAlreadyExist(moduleName))) {
			return true;
		}
		return false;
	}

	@Override
	public Optional<Module> findById(Long id) {
		return moduleRepository.findById(id);
	}

}
