package com.track365.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.hibernate.InvestmentShareMarket;
import com.track365.other.ShareMarket;

@SuppressWarnings("serial")
public class DeleteShareRecordAction extends ActionSupport {
	
	private ArrayList<InvestmentShareMarket> sharemarket=new ArrayList<InvestmentShareMarket>();
	private InvestmentShareMarket ism;
	
	public ArrayList<InvestmentShareMarket> getSharemarket() {
		return sharemarket;
	}

	public void setSharemarket(ArrayList<InvestmentShareMarket> sharemarket) {
		this.sharemarket = sharemarket;
	}

	public InvestmentShareMarket getIsm() {
		return ism;
	}

	public void setIsm(InvestmentShareMarket ism) {
		this.ism = ism;
	}

	
	
	public String execute(){
		
		ShareMarket sm=new ShareMarket();
		this.sharemarket=sm.getShareRecord();
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session1=request.getSession();
		session1.setAttribute("list",sharemarket);
		return SUCCESS;
	}
}
