package com.project.dao;

import java.util.List;

import com.project.model.Personal;

import jakarta.transaction.Transactional;

@Transactional
public interface PersonalDao {
	
	List<Personal> obtenerPersonal();

}
