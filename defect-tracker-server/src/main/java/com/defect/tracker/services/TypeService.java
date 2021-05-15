package com.defect.tracker.services;

import com.defect.tracker.data.entities.Type;

public interface TypeService {

	void createType(Type type);

	boolean isTypeNameAlreadyExist(String name);

	boolean existsById(Long id);

	public Object getTypeById(Long id);

} 
