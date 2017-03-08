package com.track365.action;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.ShareMarket;

@SuppressWarnings("serial")
public class DeleteSMAction extends ActionSupport {

		private int id;
		
	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	public String execute() {
		ShareMarket sm = new ShareMarket();
		
		sm.deleteInvestmentShare(getId());
		return SUCCESS;
	}
}
