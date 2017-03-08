package com.track365.action;

import java.util.ArrayList;
import com.opensymphony.xwork2.ActionSupport;
import com.track365.hibernate.BSE;
import com.track365.other.BSEdata;

@SuppressWarnings("serial")
public class AddShareRecordAction extends ActionSupport {

	ArrayList<BSE> bselist=null;
	
	public ArrayList<BSE> getBselist() {
		return bselist;
	}
	
	public void setBselist(ArrayList<BSE> bselist) {
		this.bselist = bselist;
	}



	public String execute(){
		
		BSEdata bse = new BSEdata();
		bselist=bse.getdata();
		
		
		return SUCCESS;
	}
	
}
