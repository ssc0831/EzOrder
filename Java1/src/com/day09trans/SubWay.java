package com.day09trans;

public class SubWay extends Trans{

	private String lineNumber;

	public SubWay(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	@Override
	public void showInfo() {
		System.out.println(this+"==> 노선 : " + lineNumber);
		super.showInfo();
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "지하철";
}
}
