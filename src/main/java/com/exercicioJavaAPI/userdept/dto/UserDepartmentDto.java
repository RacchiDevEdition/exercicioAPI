package com.exercicioJavaAPI.userdept.dto;

import com.exercicioJavaAPI.userdept.entities.Department;
import com.exercicioJavaAPI.userdept.entities.User;

public class UserDepartmentDto {

	private Long id;
	private String name;
	private String email;
	private Department department;

	public UserDepartmentDto() {

	}

	public UserDepartmentDto(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		department = entity.getDepartment();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "UserDepartmentDto [department=" + department + ", email=" + email + ", id=" + id + ", name=" + name
				+ "]";
	}

}
