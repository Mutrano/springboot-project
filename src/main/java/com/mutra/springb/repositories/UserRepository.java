package com.mutra.springb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mutra.springb.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
