package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.PersonalDao;
import com.project.model.Personal;

@RestController
public class PersonalController {
		
	@Autowired
	private PersonalDao personalDao;
		
	@RequestMapping (value="api/personal")
	public List<Personal> getPersonal(){
	
		List<Personal> user=personalDao.obtenerPersonal();
			
		return user;
	}
}
