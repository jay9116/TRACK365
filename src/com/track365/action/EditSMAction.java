package com.track365.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.other.ShareMarket;
import com.track365.hibernate.InvestmentShareMarket;;

@SuppressWarnings("serial")
public class EditSMAction extends ActionSupport{

	private int id;
	private String StockExchange;
	private String CompanyName;
	private String CompanyCode;
	private Date BuyDate;
	private int Units;
	private Double UnitPrice;
	private String Description;
	
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



	List<InvestmentShareMarket> sharemarket=null;
	
	public List<InvestmentShareMarket> getSharemarket() {
		return sharemarket;
	}

	public void setSharemarket(List<InvestmentShareMarket> sharemarket) {
		this.sharemarket = sharemarket;
	}

	public int getId() {
		return id;
		}

	public void setId(int id) {
		this.id = id;
	}
		
		
	
	public String execute(){
		System.out.println(getId());
		ShareMarket sm=new ShareMarket();
		sharemarket=sm.getSpecificRecord(getId());
		InvestmentShareMarket ism=sharemarket.get(0);
		setId(ism.getId());
		setStockExchange(ism.getStockExchange());
		setCompanyName(ism.getCompanyName());
		setCompanyCode(ism.getCompanyCode());
		setBuyDate(ism.getBuyDate());
		setUnits(ism.getUnits());
		setUnitPrice(ism.getUnitPrice());
		setDescription(ism.getDescription());
		return SUCCESS;
	}
}
