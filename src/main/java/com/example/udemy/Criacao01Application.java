package com.example.udemy;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.udemy.domain.Categories;
import com.example.udemy.repository.CategoriesRepository;

@SpringBootApplication
public class Criacao01Application implements CommandLineRunner {

	@Autowired
	private CategoriesRepository categoriesRepository;
	public static void main(String[] args) {
		SpringApplication.run(Criacao01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categories cat1 = new Categories(null, "Informática");
		Categories cat2 = new Categories(null, "Escritorio");
		
		categoriesRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}
