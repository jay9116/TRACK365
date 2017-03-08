package com.track365.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.hibernate.InvestmentLifeInsurance;
import com.track365.other.LifeInsurance;

@SuppressWarnings("serial")
public class ViewLifeInsuranceRecordAction extends ActionSupport {

	private ArrayList<InvestmentLifeInsurance> lifeinsurance=new  ArrayList<InvestmentLifeInsurance>();
	private InvestmentLifeInsurance ili;
	public ArrayList<InvestmentLifeInsurance> getLifeinsurance() {
		return lifeinsurance;
	}
	public void setLifeinsurance(ArrayList<InvestmentLifeInsurance> lifeinsurance) {
		this.lifeinsurance = lifeinsurance;
	}
	public InvestmentLifeInsurance getIli() {
		return ili;
	}
	public void setIli(InvestmentLifeInsurance ili) {
		this.ili = ili;
	}
	
	public String execute(){
		
		LifeInsurance li=new LifeInsurance();
		lifeinsurance=li.getLIRecord();
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session1=request.getSession();
		session1.setAttribute("list",lifeinsurance);
		return SUCCESS;
	}
}
