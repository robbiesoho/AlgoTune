package com.algotune.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Songs {

	public enum PostProcessingType {
		NONE, REFLECT, MOD
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int songId;
	
	private String title;
	
	private int[] harmony;
	
	private int[] melody;
	
	private int iterations;
	
	private String[] noteNames;
	
	private PostProcessingType postProcessingType;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User creator;
}
