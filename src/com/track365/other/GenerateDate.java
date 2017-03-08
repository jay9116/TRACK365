package com.track365.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateDate {

	public Date CreateDate(int day,int month,int year){
		try {
		String date=day+"-"+month+"-"+year;
		SimpleDateFormat formatdate= new SimpleDateFormat("dd-MM-yyyy");
		Date d=formatdate.parse(date);
			
		return d;
		
		} catch (ParseException e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
	public Date CreateDate(String date){
		try {
		SimpleDateFormat formatdate= new SimpleDateFormat("dd-MM-yyyy");
		Date d=formatdate.parse(date);
			
		return d;
		
		} catch (ParseException e) {
			
			e.printStackTrace();
			return null;
		}
		
	}
	
}
