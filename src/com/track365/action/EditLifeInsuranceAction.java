package com.track365.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.hibernate.InvestmentLifeInsurance;
import com.track365.other.LifeInsurance;




@SuppressWarnings("serial")
public class EditLifeInsuranceAction extends ActionSupport {
	
	List<InvestmentLifeInsurance> lifeinsurance=null;

	public List<InvestmentLifeInsurance> getLifeinsurance() {
		return lifeinsurance;
	}

	public void setLifeinsurance(List<InvestmentLifeInsurance> lifeinsurance) {
		this.lifeinsurance = lifeinsurance;
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
