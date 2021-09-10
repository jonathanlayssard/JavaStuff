package com.revature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "TODO_ROLE")
@Component
public class TodoRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String role;
	
	public TodoRole() {}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "TodoRole [id=" + id + ", role=" + role + "]";
	}

	
}
