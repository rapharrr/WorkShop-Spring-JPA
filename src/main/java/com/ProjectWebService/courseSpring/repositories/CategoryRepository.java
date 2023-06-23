package com.ProjectWebService.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectWebService.courseSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}