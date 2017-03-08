package com.track365.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.UserInformationData;

@SuppressWarnings("serial")
public class EditProfileAction extends ActionSupport {
	
	private String DrivingLicence;
	private String PanCard;
	private String ElectionCard;
	private String AadharCard;
	private String RationCard;
	
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

	ArrayList<String> userinfo=new ArrayList<String>();
	
	public String execute(){
		
	UserInformationData uid=new UserInformationData();
	userinfo=uid.getPrivateInfo();
	setDrivingLicence(userinfo.get(0));
	setPanCard(userinfo.get(1));
	setElectionCard(userinfo.get(2));
	setAadharCard(userinfo.get(3));
	setRationCard(userinfo.get(4));
	//System.out.println(getDrivingLicence());
	//System.out.println(getPanCard());
	return SUCCESS;
	}
}
