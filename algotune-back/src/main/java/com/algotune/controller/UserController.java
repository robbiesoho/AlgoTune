package com.algotune.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algotune.model.User;
import com.algotune.model.dto.UserDto;
import com.algotune.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserService us;
	
	@PostMapping("/create")
	public String create(@RequestBody User user) {
		return us.save(user);
	}
	
	@PostMapping("/verify")
	public boolean verifyUser(@RequestBody UserDto ud) {
		return us.verifyUser(ud.getEmail(), ud.getPassword());
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return us.getAllUsers();
	}
}
