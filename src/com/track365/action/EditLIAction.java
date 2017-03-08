package com.track365.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.hibernate.InvestmentLifeInsurance;

import com.track365.other.LifeInsurance;


@SuppressWarnings("serial")
public class EditLIAction extends ActionSupport {
	
	private int id;
	private String CompanyName;
	private String PlanCode;
	private Date BuyDate;
	private Date EndDate;
	private String PayPeriod;
	private Double Premium;
	private String Description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getPlanCode() {
		return PlanCode;
	}
	public void setPlanCode(String planCode) {
		PlanCode = planCode;
	}
	public Date getBuyDate() {
		return BuyDate;
	}
	public void setBuyDate(Date buyDate) {
		BuyDate = buyDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public String getPayPeriod() {
		return PayPeriod;
	}
	public void setPayPeriod(String payPeriod) {
		PayPeriod = payPeriod;
	}
	public Double getPremium() {
		return Premium;
	}
	public void setPremium(Double premium) {
		Premium = premium;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	List<InvestmentLifeInsurance> lifeinsurance = null;
	public List<InvestmentLifeInsurance> getLifeinsurance() {
		return lifeinsurance;
	}
	public void setLifeinsurance(List<InvestmentLifeInsurance> lifeinsurance) {
		this.lifeinsurance = lifeinsurance;
	}
	
	public String execute(){
		System.out.println(getId());
	
		
		LifeInsurance li=new  LifeInsurance();
		
		lifeinsurance=li.getSpecificRecord(getId());
		InvestmentLifeInsurance ili=lifeinsurance.get(0);
		
		setId(ili.getId());
		setCompanyName(ili.getCompanyName());
		setPlanCode(ili.getPlanCode());
		setBuyDate(ili.getBuyDate());
		setEndDate(ili.getEndDate());
		setPayPeriod(ili.getPayPeriod());
		setPremium(ili.getPremium());
		setDescription(ili.getDescription());
		return SUCCESS;
	}

}
