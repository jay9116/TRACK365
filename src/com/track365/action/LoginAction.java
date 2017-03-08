package com.track365.action;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.VerifyUser;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

	private String Email;
	private String Password;
	
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

	public String execute(){
		
		VerifyUser vu= new VerifyUser();
		boolean userresult=vu.CheckUser(getEmail(),getPassword());
		if(userresult) {
			String verifyresult=vu.CheckIsVerified();
			
			if(verifyresult.equals("true")){
				
				return SUCCESS;
			}
			else
				
				return "verify";
		}
		else {
			addActionError("The Email or Password you entered in incorrect.");
			return ERROR;
		}
		
	}

	
}
