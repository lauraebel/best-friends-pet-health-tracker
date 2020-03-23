package com.bestfriends.stuff;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Registration {
	
	@NotBlank(message="You Must Enter Your First Name")
	private String firstName;

	@NotBlank(message="You Must Enter Your Last Name")
	private String lastName;
	
	@NotBlank(message="You Must Enter Your Email Address")
	@Email(message="Invalid Email- Please Try Again")
	private String email;
	
	@NotBlank(message="You Must Create A Password")
	@Size(min = 8, message="Password Must be 8 Characters or Longer")
	private String password;
	
	@NotBlank(message="You Must Confirm Your Password")
	private String confirmPassword;
	
	private boolean passwordMatching; 
	@AssertTrue(message="Passwords must match")
	public boolean isPasswordMatching() {
		if(password != null) {
			return password.equals(confirmPassword);
		} else {
			return false;
		}
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
}
