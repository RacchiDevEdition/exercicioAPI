package com.exercicioJavaAPI.userdept.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exercicioJavaAPI.userdept.dto.UserDepartmentDto;
import com.exercicioJavaAPI.userdept.entities.User;
import com.exercicioJavaAPI.userdept.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	public UserService service;

	@GetMapping
	public List<UserDepartmentDto> findAll() {
		List<UserDepartmentDto> result = service.findAll();
		return result;
	}

	@GetMapping(value = "/{id}")
	public UserDepartmentDto findById(@PathVariable("id") Long id) {

		UserDepartmentDto userIdDto = service.findById(id);
		return userIdDto;
	}

	@PostMapping
	public UserDepartmentDto insert(@RequestBody UserDepartmentDto user) {
		UserDepartmentDto newUser = service.save(new User(user));
		return newUser;
	}

}
