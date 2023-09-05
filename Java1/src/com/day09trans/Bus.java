package com.day09trans;

public class Bus extends Trans {

	private int busNumber;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	@Override
	public void showInfo() {
		System.out.println(this+"==> 버스 : " + busNumber);
		super.showInfo();
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "버스";
	}
}
