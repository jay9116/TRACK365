package com.track365.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import com.track365.other.LifeInsurance;

@SuppressWarnings("serial")
public class AddLifeInsuranceRecordAction extends ActionSupport {

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
	
	public String execute(){
		
		LifeInsurance li=new LifeInsurance();
		li.insertInsurance(getCompanyName(), getPlanCode(), getBuyDate(), getEndDate(), getPayPeriod(), getPremium(), getDescription());
		return SUCCESS;
	}
	
	public String addeditli() {

		LifeInsurance li=new LifeInsurance();
		li.insertEditedLifeInsurance(getCompanyName(), getPlanCode(), getBuyDate(), getEndDate(), getPayPeriod(), getPremium(), getDescription(), getId());
		return SUCCESS;
	}
	
	
	
}
