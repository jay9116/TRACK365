package com.track365.hibernate;

public enum Status {
	Active("Active"),Deactive("Deactive"),Delete("Delete");
	String status;
	
	
	Status(String status) {
		this.status = status ;
	}

	public String toString() {
		return status;
	}
}