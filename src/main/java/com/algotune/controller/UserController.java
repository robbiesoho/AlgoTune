package com.algotune.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algotune.model.User;
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
	
	@GetMapping("/{email:.+}/{password}")
	public boolean verifyUser(@PathVariable String email, @PathVariable String password) {
		return us.verifyUser(email, password);
	}
}
