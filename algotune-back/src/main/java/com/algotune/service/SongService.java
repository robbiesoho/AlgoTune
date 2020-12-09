package com.algotune.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algotune.model.Songs;
import com.algotune.model.User;
import com.algotune.repository.SongRepo;
import com.algotune.repository.UserRepo;

@Service
public class SongService {

	@Autowired
	private SongRepo sr;
	
	public String saveSong(Songs song) {
		String response;
		try {
			sr.save(song);
			response = "Song saved!";
		} catch (Exception e) {
			e.printStackTrace();
			response = "Song could not be saved.";
		}
		
		return response;
	}
	
	public List<Songs> getAllSongsByUser(User user){
		try {
			return sr.findAllByCreator(user);
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	public List<Songs> getAllSongs(){
		return sr.findAll();
	}
}
