package com.day09trans;

public class Taxi extends Trans {

	private int taxiNumber;

	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	@Override
	public void showInfo() {
		System.out.println(this+"==> 번호 : " + taxiNumber);
		super.showInfo();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "택시";
	}
}
