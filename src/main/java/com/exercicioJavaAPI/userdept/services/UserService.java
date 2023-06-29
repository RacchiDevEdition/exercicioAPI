package com.exercicioJavaAPI.userdept.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercicioJavaAPI.userdept.dto.UserDepartmentDto;
import com.exercicioJavaAPI.userdept.entities.User;
import com.exercicioJavaAPI.userdept.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository repository;

	public List<UserDepartmentDto> findAll() {
		List<User> result = repository.findAll();
		List<UserDepartmentDto> dto = result.stream().map(x -> new UserDepartmentDto(x)).toList();
		return dto;
	}

	public UserDepartmentDto findById(Long id) {
		User userId = repository.findById(id).get();
		UserDepartmentDto idDto = new UserDepartmentDto(userId);
		return idDto;
	}

	public UserDepartmentDto save(User user) {
		User newUser = repository.save(user);
		UserDepartmentDto newUserDto = new UserDepartmentDto(newUser);
		return newUserDto;

	}
}
