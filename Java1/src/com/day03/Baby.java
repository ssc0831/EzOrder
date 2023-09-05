package com.day03;

public class Baby {
	// Class - 속성과, Method(행위)로 나타낸다.
	String name;
	int age;

	// 웃는다.
	public void smile() {
		System.out.println(name + "웃는다.");
	}

	// 운다.
	public void cry() {

	}

	public static void main(String[] args) {
		Baby b1 = new Baby(); // 객체 생성
		b1.name = "홍길동";
		b1.age = 10;
		System.out.println(b1.name);
		System.out.println(b1.age);
		b1.smile();
		System.out.println(b1); // Array & Object는 주소값을 출력시킨다.
		// yourcar 클래스 생성 - 노란색
		Car yourcar = new Car(); // Class명 + 새로운 클래스명 = new + Class명;으로 생성
		yourcar.carColor = "노랑";
		System.out.println(yourcar.carColor);
	}
}
