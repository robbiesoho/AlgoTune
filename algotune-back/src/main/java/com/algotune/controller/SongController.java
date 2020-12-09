package com.algotune.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algotune.model.Songs;
import com.algotune.model.User;
import com.algotune.service.SongService;

@RestController
@CrossOrigin
@RequestMapping("/song")
public class SongController {

	@Autowired
	private SongService ss;
	
	@PostMapping("/save")
	public String saveSong(@RequestBody Songs song) {
		return ss.saveSong(song);
	}
	
	@PostMapping("/")
	public List<Songs> getAllSongsByUser(@RequestBody User user){
		return ss.getAllSongsByUser(user);
	}
	
	@GetMapping("/all")
	public List<Songs> getAllSongs(){
		return ss.getAllSongs();
	}
}
