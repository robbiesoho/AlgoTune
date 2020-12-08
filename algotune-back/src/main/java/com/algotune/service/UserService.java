package com.algotune.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algotune.model.User;
import com.algotune.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo ur;
	
	public String save(User user) {
		try {
			ur.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			return "User did not save.";
		}
		
		return "Saved user!";
	}
	
	public boolean verifyUser(String email, String password) {
		boolean verified = false;
		
		try {
			User user = ur.findByEmail(email);
			
			if (user.getPassword().equals(password))
				verified = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			verified =  false;
		}
		return verified;
	}
}
