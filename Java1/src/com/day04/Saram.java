package com.day04;

public class Saram {
	private String name;
	private String addr;
	private String tel;

	public void showInfo() {
		System.out.println(name + "의 주소는 " + addr + " 입니다.");
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Saram() {

	}

	public Saram(String name, String addr, String tel) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;

	}
}