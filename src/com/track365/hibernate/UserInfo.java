package com.track365.hibernate;

import java.util.Date;

public class UserInfo {

	private int Id;
	private Date BirthDate;
	private Gender gender;
	private String DrivingLicence;
	private String PanCard;
	private String ElectionCard;
	private String AadharCard;
	private String RationCard;
	private User user;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id =id;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDrivingLicence() {
		return DrivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		DrivingLicence = drivingLicence;
	}
	public String getPanCard() {
		return PanCard;
	}
	public void setPanCard(String panCard) {
		PanCard = panCard;
	}
	public String getElectionCard() {
		return ElectionCard;
	}
	public void setElectionCard(String electionCard) {
		ElectionCard = electionCard;
	}
	public String getAadharCard() {
		return AadharCard;
	}
	public void setAadharCard(String aadharCard) {
		AadharCard = aadharCard;
	}
	public String getRationCard() {
		return RationCard;
	}
	public void setRationCard(String rationCard) {
		RationCard = rationCard;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
