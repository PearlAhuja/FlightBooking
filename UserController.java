package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class UserController{
	@Autowired
	UserService userService;


	@PostMapping
	int saveUser(@RequestBody User user ) {//create user
		userService.Save(user);
		System.out.println("Details of Booking");
		System.out.println(" Name : "+ user.getName());
		System.out.println(" Email : "+ user.getEmail());
		System.out.println(" No. Of Tickets  : "+ user.getNoOfTickets());
		System.out.println(" Flight Id  : "+ user.getFlightId());
		System.out.println(" Gender : "+ user.getGender());
		System.out.println(" Age : "+ user.getAge());
	    int pnr = userService.generatePnr();
	    System.out.println("Pnr Controller : "+pnr);
		return pnr;
	}
	

}


