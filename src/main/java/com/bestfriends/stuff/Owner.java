package com.bestfriends.stuff;

public class Owner {
	
	private int ownerId;
	private String firstName;
	private String lastName;
	private String secondaryFirstName;
	private String secondaryLastName;
	
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSecondaryFirstName() {
		return secondaryFirstName;
	}
	public void setSecondaryFirstName(String secondaryFirstName) {
		this.secondaryFirstName = secondaryFirstName;
	}
	public String getSecondaryLastName() {
		return secondaryLastName;
	}
	public void setSecondaryLastName(String secondaryLastName) {
		this.secondaryLastName = secondaryLastName;
	}
}
