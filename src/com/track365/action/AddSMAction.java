package com.track365.action;

import java.util.Date;
import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.GenerateDate;
import com.track365.other.ShareMarket;


@SuppressWarnings("serial")
public class AddSMAction extends ActionSupport {
	private int Id;
	
	

	private String StockExchange;
	private String CompanyName;
	private String CompanyCode;
	private Date BuyDate;
	private int Units;
	private Double UnitPrice;
	private String Description;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public String getStockExchange() {
		return StockExchange;
	}
	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCompanyCode() {
		return CompanyCode;
	}
	public void setCompanyCode(String companyCode) {
		CompanyCode = companyCode;
	}
	public Date getBuyDate() {
		return BuyDate;
	}
	public void setBuyDate(Date buyDate) {
		BuyDate = buyDate;
	}
	public int getUnits() {
		return Units;
	}
	public void setUnits(int units) {
		Units = units;
	}
	public Double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		UnitPrice = unitPrice;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
		ShareMarket sm=new ShareMarket();
	
	public String execute() {
		
		
		GenerateDate gd=new GenerateDate();
		
		sm.insertInvestmentShare(getStockExchange(),getCompanyName(),getCompanyCode(),getBuyDate(),getUnits(),getUnitPrice(),getDescription());
		return SUCCESS;
	}
	
	public String addeditsm(){
		
		
		GenerateDate gd=new GenerateDate();
		
		
		sm.insertEditedInvestmentShare(getStockExchange(),getCompanyName(),getCompanyCode(),getBuyDate(),getUnits(),getUnitPrice(),getDescription(),getId());
		return SUCCESS;
	}
	
}
