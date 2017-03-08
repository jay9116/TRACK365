package com.track365.action;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.SessionInformation;
import com.track365.other.UserData;
import com.track365.other.VerifyUser;
@SuppressWarnings("serial")
public class VerifyAction extends ActionSupport {
	
	private long VeriNumber;
	
	public long getVeriNumber() {
		return VeriNumber;
	}

	public void setVeriNumber(long veriNumber) {
		VeriNumber = veriNumber;
	}

	public String execute() {
		
		VerifyUser vu=new VerifyUser();
		UserData ud= new UserData();
		SessionInformation si= new SessionInformation();
		
			int id=si.GetSessionid();
			boolean veriresult=vu.CheckVeriNumber(getVeriNumber());
			if(veriresult){
				ud.UpdateIsverified(id);
				return SUCCESS;
			}
			else{
				addActionError("Verification code does not match.Try Again.");
				return INPUT;
			}
	}
	
	public void validate()
	{
		if(getVeriNumber()==0)
		{
			addFieldError("VeriNumber","Verification Number is required.");
		}
	}
}
