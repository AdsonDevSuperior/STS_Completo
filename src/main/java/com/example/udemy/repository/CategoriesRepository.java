package com.example.udemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemy.domain.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer>{


}
