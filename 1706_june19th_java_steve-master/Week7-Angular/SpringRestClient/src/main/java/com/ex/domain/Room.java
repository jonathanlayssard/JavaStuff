package com.ex.domain;

import java.sql.Timestamp;

public class Room {
	
	private Integer id;
	private String name;
	private String description;
	private User owner;
	private Timestamp created;
	private Timestamp closed;
	
	public Room(){}

	public Room(Integer id, String name, String description, User owner, Timestamp created, Timestamp closed) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.owner = owner;
		this.created = created;
		this.closed = closed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getClosed() {
		return closed;
	}

	public void setClosed(Timestamp closed) {
		this.closed = closed;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", description=" + description + ", owner=" + owner + ", created="
				+ created + ", closed=" + closed + "]";
	}
	
}
