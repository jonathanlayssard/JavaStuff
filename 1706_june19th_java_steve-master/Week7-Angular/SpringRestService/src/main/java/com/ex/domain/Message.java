package com.ex.domain;

import java.sql.Timestamp;

public class Message {
	
	private Integer id;
	private String message;
	private User owner;
	private Timestamp created;
	private Room room;
	
	public Message(){}

	public Message(Integer id, String message, User owner, Room room) {
		super();
		this.id = id;
		this.message = message;
		this.owner = owner;
		this.room = room;
	}

	public Message(String message, User owner, Room room) {
		super();
		this.message = message;
		this.owner = owner;
		this.room = room;
	}	
	
	public Message(String message, User owner, Timestamp created, Room room) {
		super();
		this.message = message;
		this.owner = owner;
		this.created = created;
		this.room = room;
	}	

	public Message(Integer id, String message, User owner, Timestamp created, Room room) {
		super();
		this.id = id;
		this.message = message;
		this.owner = owner;
		this.created = created;
		this.room = room;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", owner=" + owner + ", room=" + room + "]";
	}
	
}
