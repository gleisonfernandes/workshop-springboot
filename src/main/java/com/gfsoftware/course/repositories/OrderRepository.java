package com.gfsoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gfsoftware.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
