package com.track365.hibernate;

import java.util.Date;

import com.track365.other.GenerateDate;

public class InvestmentShareMarket {

	private int Id;
	private int UserId;
	private String StockExchange;
	private String CompanyName;
	private String CompanyCode;
	private Date BuyDate;
	private int Units;
	private Double UnitPrice;
	private String Description;
	
	public InvestmentShareMarket(){}
	@SuppressWarnings("deprecation")
	public InvestmentShareMarket(int id,String userId, String stockExchange,
			String companyName, String companyCode,Date buyDate,String units,
			String unitPrice, String description) {
		
		
		this.Id = id;
		this.UserId = Integer.parseInt(userId);
		this.StockExchange = stockExchange;
		this.CompanyName = companyName;
		this.CompanyCode = companyCode;
		int day=buyDate.getDay();
		int month=buyDate.getMonth();
		int year=buyDate.getYear();
		GenerateDate gd=new GenerateDate();
		this.BuyDate = gd.CreateDate(day, month, year);
		this.Units = Integer.parseInt(units);
		this.UnitPrice =Double.parseDouble(unitPrice);
		this.Description = description;
		
	}
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
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
	
	
	
	
	
	
}
