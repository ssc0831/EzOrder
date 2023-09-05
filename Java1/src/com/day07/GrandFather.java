package com.day07;

public class GrandFather {
	protected String value = "재산있음"; // protected 상속자에서만 사용할 수 있음.

	public GrandFather() {
		System.out.println("GrandFather 생성자");
	}

	public void grandFatherMethod() {
		System.out.println("grandFatherMethod");
	}

	public void method() {
		System.out.println("method");
	}
}
