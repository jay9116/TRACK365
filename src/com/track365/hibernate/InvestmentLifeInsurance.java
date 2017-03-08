package com.track365.hibernate;

import java.util.Date;

public class InvestmentLifeInsurance {

	private int id;
	private int UserId;
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

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
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

	public InvestmentLifeInsurance() {

	}

	public InvestmentLifeInsurance(int id, int userId, String companyName,String planCode, Date buyDate, Date endDate, String payPeriod,Double premium, String description) {
		this.id = id;
		this.UserId=userId;
		this.CompanyName = companyName;
		this.PlanCode = planCode;
		this.BuyDate = buyDate;
		this.EndDate = endDate;
		this.PayPeriod = payPeriod;
		this.Premium = premium;
		this.Description = description;
		
	}

}
