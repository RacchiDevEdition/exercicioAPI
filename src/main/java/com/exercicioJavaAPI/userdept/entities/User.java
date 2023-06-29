package com.exercicioJavaAPI.userdept.entities;

import com.exercicioJavaAPI.userdept.dto.UserDepartmentDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	public User() {

	}

	public User(UserDepartmentDto dto) {
		this.id = dto.getId();
		this.name = dto.getName();
		this.email = dto.getEmail();
		department = dto.getDepartment();

	}

	public User(Long id, String name, String email, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		department = new Department(id, name);
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
	}

}
