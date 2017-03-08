package com.track365.action;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.UserInformationData;

@SuppressWarnings("serial")
public class UpdateProfileAction extends ActionSupport {

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
	
	public String execute(){
		UserInformationData uid=new UserInformationData();
		uid.UpdateProfileInfo(getDrivingLicence(),getPanCard(),getElectionCard(),getAadharCard(),getRationCard());
		return SUCCESS;
	}
}
