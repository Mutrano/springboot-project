package com.mutra.springb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mutra.springb.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
