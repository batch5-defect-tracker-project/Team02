package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.SubModule;
import com.defect.tracker.data.repositories.SubModuleRepository;

@Service
public class SubModuleServiceImpl implements SubModuleService {
	@Autowired
	private SubModuleRepository subModuleRepository;

	@Override
	public void createSubModule(SubModule subModule) {
		subModuleRepository.save(subModule);

	}

	@Override
	public boolean isSubModuleNameAlreadyExist(String subModuleName) {
		return subModuleRepository.existsByName(subModuleName);
	}

	@Override
	public void updateSubModule(SubModule subModule) {
		subModuleRepository.save(subModule);

	}

	@Override
	public boolean existsById(Long id) {
		return subModuleRepository.existsById(id);
	}

	@Override
	public List<SubModule> getAllSubModule() {
		return  subModuleRepository.findAll();
	}

	@Override
	public Object getSubModuleById(Long id) {
		return subModuleRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		subModuleRepository.deleteById(id);
		
	}

}
