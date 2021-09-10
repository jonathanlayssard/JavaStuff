package com.ex.service;

import java.util.List;

import com.ex.domain.Message;
import com.ex.domain.Room;
import com.ex.domain.User;

public interface ForumService {
	
	public User auth(User user);
	public List<Room> getRooms();
	public List<Message> getMessagesByRoom(String roomName);
	public void postMessage(Message message, String roomName);
	
}
