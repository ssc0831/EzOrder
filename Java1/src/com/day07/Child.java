package com.day07;

public class Child extends Father { // 단일 상속(Father, GrandFather 불가)
	public Child() {
		System.out.println("Child 생성자");
	}
	public void childMethod() {
		System.out.println("childMethod");
	}
	
	@Override
	public void method() {
		System.out.println("child가 method 수정함");
	}
}
