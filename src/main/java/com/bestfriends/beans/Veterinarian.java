package com.bestfriends.beans;

public class Veterinarian {
	
	private int veterinarianId;
	private String vetCompanyName;
	private String vetFirstName;
	private String vetLastName;
	private int phone;
	private String street;
	private String city;
	private String state;
	private int postalCode;
	
	public int getVeterinarianId() {
		return veterinarianId;
	}
	public void setVeterinarianId(int veterinarianId) {
		this.veterinarianId = veterinarianId;
	}
	public String getVetCompanyName() {
		return vetCompanyName;
	}
	public void setVetCompanyName(String vetCompanyName) {
		this.vetCompanyName = vetCompanyName;
	}
	public String getVetFirstName() {
		return vetFirstName;
	}
	public void setVetFirstName(String vetFirstName) {
		this.vetFirstName = vetFirstName;
	}
	public String getVetLastName() {
		return vetLastName;
	}
	public void setVetLastName(String vetLastName) {
		this.vetLastName = vetLastName;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
}
