package com.mutra.springb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mutra.springb.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
