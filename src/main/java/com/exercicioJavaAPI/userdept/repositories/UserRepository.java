package com.exercicioJavaAPI.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioJavaAPI.userdept.entities.User;

public interface UserRepository extends JpaRepository<User,Long	>{

}
