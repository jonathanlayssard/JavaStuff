package com.ex.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ex.domain.Message;
import com.ex.domain.Room;
import com.ex.domain.User;
import com.ex.service.ForumService;

@RestController
public class ForumRestController {
	
	@Autowired
	private ForumService forumService;
	
	@RequestMapping(value="user", method=RequestMethod.POST, produces={MediaType.APPLICATION_JSON_VALUE})
	public User auth(@RequestBody User user){
		System.err.println("POST User Request: " + user);
		return forumService.auth(user);
	}
	
	@RequestMapping(value="rooms", method=RequestMethod.GET)
	public List<Room> rooms(){
		System.err.println("GET - All Rooms");
		return forumService.getRooms();
	}
	
	@RequestMapping(value="room/{roomName}/messages", method=RequestMethod.GET)
	public List<Message> roomMessages(@PathVariable String roomName){
		return forumService.getMessagesByRoom(roomName);
	}
	
	@RequestMapping(value="room/{roomName}/messages", method=RequestMethod.POST)
	public void postMessage(@RequestBody Message message, @PathVariable String roomName){
		forumService.postMessage(message, roomName);
	}
	
	
}
