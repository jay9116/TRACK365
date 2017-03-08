package com.track365.action;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.SessionInformation;

@SuppressWarnings("serial")
public class LogoutAction extends ActionSupport {

	
	public String execute(){
		SessionInformation si=new SessionInformation();
		si.DestroySession();
		return SUCCESS;
	}
}

