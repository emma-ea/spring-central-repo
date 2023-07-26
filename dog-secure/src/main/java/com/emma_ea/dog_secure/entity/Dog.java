package com.emma_ea.dog_secure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Dog {

	@Id
	@GeneratedValue()
	private Long id;
	private String name;
	private String breed;
	private String origin;

	public Dog() {}

	public Dog(Long id, String name, String breed, String origin) {
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.origin = origin;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public String getOrigin() {
		return origin;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
}
