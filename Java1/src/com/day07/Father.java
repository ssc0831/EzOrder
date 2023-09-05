package com.day07;

public class Father extends GrandFather {
	public Father() {
		System.out.println("Father 생성자");
	}
	public void fatherMethod() {
		System.out.println("fatherMethod");
	}
	/*Overriding( 상위 클래스의 특성과 동작을 하위 클래스에게 상속받았을 때, 
	하위 클래스에서 상위 클래스의 메서드를 필요에 맞게 수정하거나 추가적인 동작을 정의하기 위해 사용)*/
	@Override
	public void method() {
		System.out.println("father가 method 수정함");
	}
}
