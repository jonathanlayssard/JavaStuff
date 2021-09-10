package com.ex.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ex.domain.Message;
import com.ex.domain.Room;
import com.ex.domain.User;

@Service
public class ForumServiceImpl implements ForumService {
	
	private static User john = new User(1, "john", "123", "john@email.com");
	private static User amy =  new User(2, "amy",  "456", "amy@email.com");
	private static Room java = new Room(1, "Java", "cafebabe", john, new Timestamp(2016, 5, 10, 0, 0, 0, 0), null);
	private static Room spring = new Room(1, "Spring", "Not about winter, fall, or summer.", amy, new Timestamp(2016, 2, 11, 0, 0, 0, 0), null);
	private static Room rest = new Room(1, "REST", "zzzzzz", amy, new Timestamp(2015, 4, 18, 0, 0, 0, 0), null);
	
	
	@Override
	public User auth(User user) {
		if("john".equals(user.getUsername()) && "123".equals(user.getPassword())){
			return new User(1, "john", "123", "john@email.com");
		}else {
			return null;
		}
	}

	@Override
	public List<Room> getRooms() {
		
		List<Room> roomList = new ArrayList<>();
		
		roomList.add(java);
		roomList.add(spring);
		roomList.add(rest);
		
		return roomList;
	}

	@Override
	public List<Message> getMessagesByRoom(String roomName) {
		
		
		if("Java".equals(roomName)){
			List<Message> messageList = new ArrayList<>();
			messageList.add(new Message("This is a cool room!", amy, java));
			messageList.add(new Message("That's why I made it...", john, java));
			return messageList;
		}else {
			return null;
		}
	}

	@Override
	public void postMessage(Message message, String roomName) {
		System.out.println("Posted message to room: " + roomName);
		System.out.println("\t"+message);
	}

}
