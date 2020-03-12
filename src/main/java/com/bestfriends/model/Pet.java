package com.bestfriends.model;

import java.time.LocalDate;

public class Pet {

	private int petId;
	private String petName;
	private String petType;
	private String petBreed;
	private int petAge;
	private LocalDate petDateOfBirth;
	private String petGender;
	private boolean petFixed;
	private int ownerId;
	private int veterinarianId;
	
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getPetBreed() {
		return petBreed;
	}
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	public LocalDate getPetDateOfBirth() {
		return petDateOfBirth;
	}
	public void setPetDateOfBirth(LocalDate petDateOfBirth) {
		this.petDateOfBirth = petDateOfBirth;
	}
	public String getPetGender() {
		return petGender;
	}
	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}
	public boolean isPetFixed() {
		return petFixed;
	}
	public void setPetFixed(boolean petFixed) {
		this.petFixed = petFixed;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getVeterinarianId() {
		return veterinarianId;
	}
	public void setVeterinarianId(int veterinarianId) {
		this.veterinarianId = veterinarianId;
	}
}
