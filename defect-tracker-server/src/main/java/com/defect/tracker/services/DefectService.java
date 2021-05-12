package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.Defect;

public interface DefectService {

	boolean isDefectIdAlreadyExist(Long id);

	void createDefect(Defect defect);

	public List<Defect> getAllDefect();

}
