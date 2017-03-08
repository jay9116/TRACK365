package com.track365.hibernate;

import java.util.Date;



public class InvestmentMutualFund {
	private int id;
	private int UserId;
	private String CompanyName;
	private String SchemeName;
	private String SchemeClass;
	private String SchemeType;
	private String SchemeCode;
	private String PlanType;
	private String Description;
	private Date BuyDate;
	
	
	public InvestmentMutualFund() {
	}
	
	
	public int getId() {
		return id;
	}
	public InvestmentMutualFund(int id, int userId, String companyName,
			String schemeName, String schemeClass, String schemeType,
			String schemeCode, String planType, String description, Date buyDate) {
		
		this.id = id;
		UserId = userId;
		CompanyName = companyName;
		SchemeName = schemeName;
		SchemeClass = schemeClass;
		SchemeType = schemeType;
		SchemeCode = schemeCode;
		PlanType = planType;
		Description = description;
		BuyDate = buyDate;
		System.out.println("asdf");
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getSchemeName() {
		return SchemeName;
	}
	public void setSchemeName(String schemeName) {
		SchemeName = schemeName;
	}
	public String getSchemeClass() {
		return SchemeClass;
	}
	public void setSchemeClass(String schemeClass) {
		SchemeClass = schemeClass;
	}
	public String getSchemeType() {
		return SchemeType;
	}
	public void setSchemeType(String schemeType) {
		SchemeType = schemeType;
	}
	public String getSchemeCode() {
		return SchemeCode;
	}
	public void setSchemeCode(String schemeCode) {
		SchemeCode = schemeCode;
	}
	public String getPlanType() {
		return PlanType;
	}
	public void setPlanType(String planType) {
		PlanType = planType;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getBuyDate() {
		return BuyDate;
	}
	public void setBuyDate(Date buyDate) {
		BuyDate = buyDate;
	}
	
	
	}
