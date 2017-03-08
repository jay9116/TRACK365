package com.track365.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.GenerateDate;
import com.track365.other.UserData;
import com.track365.other.VerifyUser;

@SuppressWarnings("serial")
public class RegistrationAction extends ActionSupport {
	
	private String Email;
	private String Password;
	private String ConfirmPassword;
	private String FirstName;
	private String LastName;
	private Date date;
	private String Gender;
	
	
	
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
	
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
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
	
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	public String execute() throws Exception {
		
		GenerateDate gd=new GenerateDate();
		UserData ud=new UserData();
		VerifyUser vu=new VerifyUser();
		
		System.out.println(getDate());
		
		boolean emailresult=vu.CheckUserEmail(getEmail());
		System.out.println(emailresult);
		
		if(emailresult)
		{
			boolean insertreturn=ud.adddata(getEmail(), getPassword(), getFirstName(),getLastName(),getGender(),getDate());
		
			if(!insertreturn)
				return ERROR; 
			else {
				boolean verifyreturn=vu.CheckUser(getEmail(), getPassword());
				if(verifyreturn){
					return SUCCESS;
				}
				else
					return ERROR;	
			}
		}
		else
		{
			addActionError("Email has already been registered.");
			return ERROR;
		}
	}
	
	public void validate(){
		if(!(getPassword().equals(getConfirmPassword()))) {
			addFieldError("ConfirmPassword", "Password should be same.");
		}
		if(getGender()==null){
			addFieldError("Gender", "Please select your gender.");
		}
		
		
	}
}
