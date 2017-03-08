package com.track365.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.track365.hibernate.InvestmentMutualFund;

import com.track365.other.MutualFund;

@SuppressWarnings("serial")
public class DeleteMutualFundAction extends ActionSupport {

	private ArrayList<InvestmentMutualFund> mutualfund = new ArrayList<InvestmentMutualFund>();
	private InvestmentMutualFund imf;

	public ArrayList<InvestmentMutualFund> getMutualfund() {
		return mutualfund;
	}

	public void setMutualfund(ArrayList<InvestmentMutualFund> mutualfund) {
		this.mutualfund = mutualfund;
	}

	public InvestmentMutualFund getImf() {
		return imf;
	}

	public void setImf(InvestmentMutualFund imf) {
		this.imf = imf;
	}

	public String execute() {

		MutualFund mf = new MutualFund();

		this.mutualfund = mf.getMFRecord();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session1 = request.getSession();
		session1.setAttribute("list", mutualfund);
		return SUCCESS;
	}

}
