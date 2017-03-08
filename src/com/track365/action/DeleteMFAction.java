package com.track365.action;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.MutualFund;

@SuppressWarnings("serial")
public class DeleteMFAction extends ActionSupport{
	private int id;
	
	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	public String execute() {
		
		MutualFund mf=new MutualFund();
		mf.deleteMutualFund(getId());
		return SUCCESS;
	}

}
