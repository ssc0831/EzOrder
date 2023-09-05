package com.day07.interitance;

public class Customer {
	private int customID;
	private String customerName;
	protected int bonusPoint;
	protected String customerGrade;
	protected double bonusRate;
	
	public Customer() {
		customerGrade="SILVER";
		bonusRate=0.01;
		
	}
	
	public Customer(int customerID, String customerName) {
		this();
		this.customID=customerID;
		this.customerName=customerName;
	}
	
	public int calPrice(int price) {
		bonusPoint+=price*bonusRate;
		return price;
	}
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
	}

	// getter
	public String getCustomerName() {
		return customerName;
	}
	
}
