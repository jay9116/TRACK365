package com.track365.action;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.LifeInsurance;


@SuppressWarnings("serial")
public class DeleteLIAction extends ActionSupport{
	private int id;
	
	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	public String execute() {
		
		LifeInsurance li=new LifeInsurance();
		
		li.deleteLifeInsurance(getId());
		return SUCCESS;
	}

}
