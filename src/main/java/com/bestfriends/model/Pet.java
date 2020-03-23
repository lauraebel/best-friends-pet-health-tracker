package com.bestfriends.model;

import java.time.LocalDate;

public class Pet {

	private int petId;
	private String petName;
	private String petType;
	private String petBreed;
	private int petAge;
	private String petDateOfBirth;
	private String petGender;
	private String petFixed;
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
	public String getPetGender() {
		return petGender;
	}
	public void setPetGender(String petGender) {
		this.petGender = petGender;
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
	public String getPetDateOfBirth() {
		return petDateOfBirth;
	}
	public void setPetDateOfBirth(String petDateOfBirth) {
		this.petDateOfBirth = petDateOfBirth;
	}
	public String getPetFixed() {
		return petFixed;
	}
	public void setPetFixed(String petFixed) {
		this.petFixed = petFixed;
	}
	
}
