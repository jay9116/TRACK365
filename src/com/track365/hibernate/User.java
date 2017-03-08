package com.track365.hibernate;


public class User {

	private int Id;
	private String Email;
	private String Password;
	private String FirstName;
	private String LastName;
	private long VerificationNumber;
	private Isverified isverified;
	private Status status;
	private UserInfo userinfo;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public long getVerificationNumber() {
		return VerificationNumber;
	}
	public void setVerificationNumber(long verificationNumber) {
		VerificationNumber = verificationNumber;
	}
	public Isverified getIsverified() {
		return isverified;
	}
	public void setIsverified(Isverified isverified) {
		this.isverified = isverified;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public UserInfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}
	
}
