package com.defect.tracker.services;

import com.defect.tracker.data.entities.Type;

public interface TypeService {

	public void createType(Type type);

	public boolean isTypeNameAlreadyExist(String typeName);

	public boolean existsById(Long id);

	public Object getTypeById(Long id);

}
