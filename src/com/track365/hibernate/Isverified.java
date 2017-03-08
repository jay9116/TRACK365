package com.track365.hibernate;

public enum Isverified {
	True("true"),False("false");
	String name;
	
	Isverified(String name)
	{
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
}

