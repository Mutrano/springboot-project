package com.mutra.springb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mutra.springb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
