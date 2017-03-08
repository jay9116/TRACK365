package com.track365.hibernate;

public enum Gender {
	
	Male("Male"),Female("Female");
	String name;
	
	Gender(String name)
	{
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
}
