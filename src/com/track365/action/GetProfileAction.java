package com.track365.action;

import java.util.ArrayList;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.hibernate.Gender;
import com.track365.hibernate.User;
import com.track365.hibernate.UserInfo;
import com.track365.other.UserInformationData;

@SuppressWarnings("serial")
public class GetProfileAction extends ActionSupport {

	private String FirstName;
	private String Email;
	private Date Birthdate;
	private Gender gender;
	private String DrivingLicence;
	private String AadharCard;
	private String PanCard;
	private String RationCard;
	private String ElectionCard;
	ArrayList<Object> al = new ArrayList<Object>();
	UserInformationData ui = new UserInformationData();

	public Date getBirthdate() {
		return Birthdate;
	}

	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getDrivingLicence() {
		return DrivingLicence;
	}

	public void setDrivingLicence(String drivingLicence) {
		DrivingLicence = drivingLicence;
	}

	public String getAadharCard() {
		return AadharCard;
	}

	public void setAadharCard(String aadharCard) {
		AadharCard = aadharCard;
	}

	public String getPanCard() {
		return PanCard;
	}

	public void setPanCard(String panCard) {
		PanCard = panCard;
	}

	public String getRationCard() {
		return RationCard;
	}

	public void setRationCard(String rationCard) {
		RationCard = rationCard;
	}

	public String getElectionCard() {
		return ElectionCard;
	}

	public void setElectionCard(String electionCard) {
		ElectionCard = electionCard;
	}

	public String execute() {
		System.out.println("in getprofile");
		al = ui.getProfileInfo();
		
		User user = (User) al.get(0);
		UserInfo userinfo = (UserInfo) al.get(1);
		
		setFirstName(user.getFirstName());
		setEmail(user.getEmail());
		setBirthdate(userinfo.getBirthDate());
		setGender(userinfo.getGender());
		
		setAadharCard(userinfo.getAadharCard());
		setPanCard(userinfo.getPanCard());
		setElectionCard(userinfo.getElectionCard());
		setDrivingLicence(userinfo.getDrivingLicence());
		setRationCard(userinfo.getRationCard());

		return SUCCESS;
	}

}
