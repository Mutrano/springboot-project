package com.mutra.springb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mutra.springb.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
