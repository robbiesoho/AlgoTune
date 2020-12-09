package com.algotune.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algotune.model.Songs;
import com.algotune.model.User;

@Repository
public interface SongRepo extends JpaRepository<Songs, Integer> {

	public List<Songs> findAllByCreator(User user);
}
