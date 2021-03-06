package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TODO")
public class Todo {

	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	@Column
	private String status;
	
	public Todo(){}

	public Todo(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
	
	
}
