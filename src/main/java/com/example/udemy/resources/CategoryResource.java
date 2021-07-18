package com.example.udemy.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.udemy.domain.Categories;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categories> list() {
		
		Categories cat1 = new Categories(1, "Imformática");
		Categories cat2 = new Categories(2, "Escritório");
		Categories cat3 = new Categories(3, "sada");
		
		List<Categories> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
			
		return list;
	}

}
