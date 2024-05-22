package com.gfsoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gfsoftware.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
