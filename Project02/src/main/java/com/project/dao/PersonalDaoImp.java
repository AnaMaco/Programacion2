package com.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.model.Personal;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonalDaoImp implements PersonalDao  {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Personal> obtenerPersonal() {
		
		String query= "from Personal";
		
		return entityManager.createQuery(query).getResultList();
	}

}
