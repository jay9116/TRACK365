package com.track365.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.ShareMarket;
import com.track365.hibernate.InvestmentShareMarket;
@SuppressWarnings("serial")
public class EditShareRecordAction extends ActionSupport {

	List<InvestmentShareMarket> sharemarket=null;
	
	public List<InvestmentShareMarket> getSharemarket() {
		return sharemarket;
	}

	public void setSharemarket(List<InvestmentShareMarket> sharemarket) {
		this.sharemarket = sharemarket;
	}

	public String execute(){
		
		ShareMarket sm=new ShareMarket();
		sharemarket=sm.getShareRecord();
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session1=request.getSession();
		session1.setAttribute("list",sharemarket);
		return SUCCESS;
	}
}
