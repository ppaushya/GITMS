package org.cap.model;

import java.util.Date;

import javax.validation.constraints.Past;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;


public class Register {

	@NotEmpty(message="Please enter first name")
	private String firstName;
	
	private String lastName;
	private String address;
	private String city;
	private String gender;
	private String qualification;

	@DateTimeFormat(pattern="dd-MMM-yyyy")
	@Past(message="+Please enter a valid date of birth")
	private Date dateOfBirth;
	
	
	@Email(message="+Please enter email in correct format")
	@NotEmpty(message="+Please enter email")
	private String emailId;
	
	@Range(min=2000,max=50000,message="+registration fee should be between 2000 and 50000")
	private double regFee;
	
	@Length(min=6,max=16,message="+password length should be 6-16")
	private String password;
	
	private String confirmPassword;
	
	
	public Register()
	{
		
	}

	

	public Register(String firstName, String lastName, String address, String city, String gender, String qualification,
			Date dateOfBirth, String emailId, double regFee, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.gender = gender;
		this.qualification = qualification;
		this.dateOfBirth = dateOfBirth;
		this.emailId = emailId;
		this.regFee = regFee;
		this.password = password;
		//this.confirmPassword = confirmPassword;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	
	public double getRegFee() {
		return regFee;
	}

	public void setRegFee(double regFee) {
		this.regFee = regFee;
	}
	
	

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	@Override
	public String toString() {
		return "Register [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", gender=" + gender + ", qualification=" + qualification + ", dateOfBirth=" + dateOfBirth
				+ ", emailId=" + emailId + ", regFee=" + regFee + ", password=" + password + "]";
	}

	
	
	
	
}
