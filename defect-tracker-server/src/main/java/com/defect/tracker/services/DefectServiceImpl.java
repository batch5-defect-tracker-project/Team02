package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.repositories.DefectRepository;

@Service
public class DefectServiceImpl implements DefectService {
	
	@Autowired
	private DefectRepository defectRepository;

	

	@Override
	public void createDefect(Defect defect) {
		defectRepository.save(defect);

	}

	@Override
	public List<Defect> getAllDefect() {
		return defectRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		defectRepository.deleteById(id);
		
	}

	@Override
	public boolean existsByDefectId(Long id) {
		
		return defectRepository.existsById(id);
	}

	@Override
	public boolean existsById(Long id) {
		
		return defectRepository.existsById(id);
	}

	@Override
	public Object getByIdDefect(Long id) {
		
		return defectRepository.findById(id);
	}

	@Override
	public boolean isModuleIdAlreadyExist(Long moduleId) {
		return defectRepository.existsById(moduleId);
	}

	

	
}
