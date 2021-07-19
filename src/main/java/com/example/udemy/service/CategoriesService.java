package com.example.udemy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.udemy.repository.CategoriesRepository;

@Service
public class CategoriesService {
	
	@Autowired
	public CategoriesRepository repo;
	
	public void buscar(Integer id ) {
		repo.findById(id);
		
		
	}

}
