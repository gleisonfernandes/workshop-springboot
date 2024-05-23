package com.gfsoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gfsoftware.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
