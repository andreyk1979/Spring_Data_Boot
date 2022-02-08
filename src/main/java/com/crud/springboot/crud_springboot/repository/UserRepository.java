package com.crud.springboot.crud_springboot.repository;

import com.crud.springboot.crud_springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import web.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
