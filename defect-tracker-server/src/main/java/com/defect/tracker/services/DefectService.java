package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.Defect;

public interface DefectService {

	void createDefect(Defect defect);

	public List<Defect> getAllDefect();

	void deleteById(Long id);

	boolean existsByDefectId(Long id);

	boolean existsById(Long id);

	boolean getByIdDefect(Long id);

	boolean isModuleIdAlreadyExist(Long moduleId);

}
