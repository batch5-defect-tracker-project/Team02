package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.Defect;

public interface DefectService {

	public void createDefect(Defect defect);

	public List<Defect> getAllDefect();

	public void deleteById(Long id);

	public boolean existsByDefectId(Long id);

	public boolean existsById(Long id);

	public Object getByIdDefect(Long id);

	public boolean isModuleIdAlreadyExist(Long moduleId);

	public void updateDefect(Defect defect);

}
