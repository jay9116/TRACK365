package com.track365.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.GenerateDate;
import com.track365.other.MutualFund;

@SuppressWarnings("serial")
public class AddMFAction extends ActionSupport {

	private int id;
	private String CompanyName;
	private String SchemeName;
	private String SchemeClass;
	private String SchemeType;
	private String SchemeCode;
	private String PlanType;
	private String Description;
	private Date BuyDate;

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

	public String execute() {

		MutualFund mf = new MutualFund();
		GenerateDate gd = new GenerateDate();
		System.out.println("asdf");
		
		
		mf.insertInvestmentMutualFund(getCompanyName(), getSchemeName(),
				getSchemeClass(), getSchemeType(), getSchemeCode(),
				getPlanType(), getDescription(), getBuyDate());
		return SUCCESS;

	}

	public String addeditmf() {

		GenerateDate gd = new GenerateDate();
		
		MutualFund mf = new MutualFund();
		mf.insertEditedMutualFund(getCompanyName(), getSchemeName(),
				getSchemeClass(), getSchemeType(), getSchemeCode(),
				getPlanType(), getDescription(), getBuyDate(), getId());
		return SUCCESS;
	}

}
