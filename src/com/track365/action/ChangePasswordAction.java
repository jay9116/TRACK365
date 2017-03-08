package com.track365.action;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.UserData;
import com.track365.other.VerifyUser;

@SuppressWarnings("serial")
public class ChangePasswordAction extends ActionSupport {

	private String OldPass;
	private String NewPass;
	private String ConNewPass;

	public String getOldPass() {
		return OldPass;
	}

	public void setOldPass(String oldPass) {
		OldPass = oldPass;
	}

	public String getNewPass() {
		return NewPass;
	}

	public void setNewPass(String newPass) {
		NewPass = newPass;
	}

	public String getConNewPass() {
		return ConNewPass;
	}

	public void setConNewPass(String conNewPass) {
		ConNewPass = conNewPass;
	}

	public String execute() {
		
		VerifyUser vu = new VerifyUser();
		boolean cpassresult;
		
		cpassresult = vu.CheckPassword(getOldPass());
		
		if (cpassresult) {
			
			UserData ud = new UserData();
			ud.UpdatePassword(getNewPass());
			addActionError("Password changed Successfully.");
			return SUCCESS;
			
		} else {
			
			addActionError("Old Password do not match.");
			return ERROR;
		}

	}

	public void validate() {
		if (!getNewPass().equals(getConNewPass())) {
			addFieldError("ConNewPass", "Password should be same.");

		}

	}
}
