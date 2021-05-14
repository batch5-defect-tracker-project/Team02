package com.defect.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.SubModule;
import com.defect.tracker.data.repositories.SubModuleRepository;



@Service
public class SubModuleServiceImpl implements SubModuleService{
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

}
