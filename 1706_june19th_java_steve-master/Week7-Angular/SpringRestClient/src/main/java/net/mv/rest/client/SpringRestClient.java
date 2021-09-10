package net.mv.rest.client;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ex.domain.Room;
import com.ex.domain.User;

public class SpringRestClient {
	public static void main(String[] args) {
		
		/*
		 *  Spring RestTemplate
		 *  
		 */
		RestTemplate restTemplate = new RestTemplate();
		
		//Base URL Path
		String baseUrl = "http://localhost:8085/SpringRestService/";
		
		//User Object to be sent to Exposing API 
		User user = new User("john", "123");
		
		/*
		 *  Post Request with Object
		 *  	-append the URL with the specific endpoint
		 */
//		ResponseEntity<User> responseEntity = restTemplate.postForEntity(baseUrl+"/user", user, User.class);
//		
//		User authUser = responseEntity.getBody();
//		HttpStatus httpStatus = responseEntity.getStatusCode();
//		
//		System.out.println("AuthUser: " + authUser);
//		System.out.println("Http Status Code: " + httpStatus);
//		System.out.println("Http Header: " + responseEntity.getHeaders());
		
		
		ResponseEntity<List<Room>> rooms = restTemplate.exchange(baseUrl + "rooms/",HttpMethod.GET,null, new ParameterizedTypeReference<List<Room>>(){});
		System.out.println("Rooms: " + rooms.getBody());
		
	}
}
