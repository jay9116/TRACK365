package com.track365.other;

import java.util.Random;


public class GenerateRandomNumber {

	Random r=new Random();
	private long ValidationNumber;
	
	public long generatevalidation() {
		
	ValidationNumber=r.nextLong();
	
	System.out.println(ValidationNumber);
	return ValidationNumber;
	}
	
}
	
	


