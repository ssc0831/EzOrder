package com.day03;

public class Person {
	
	//이름, 주소, 전화(name, addr, phone)
	String name;
	String addr;
	String phone;

	//study
	public void study() {
		System.out.println(name + " study");
	}
	//eatting
	public  void eatting() {
		System.out.println(name + " eatting");
	}
	//hobby
	public void hobby() {
		System.out.println(name + " hobby");
	}
	
	public static void main(String[]args) {
		
		//Person 객체 p1 생성
		//이름 p1name, 주소 부산, 전화번호 010-1111-2222, 공부중
		Person p1=new Person();
		p1.name="p1name";
		p1.addr="부산";
		p1.phone="010-1111-2222";
		p1.study();
		
		//Person 객체 p2 생성
		//이름 p2name, 주소 서울, 전화번호 010-3333-4444, 식사중
		Person p2=new Person();
		p2.name="p2name";
		p2.addr="서울";
		p2.phone="010-3333-4444";
		p2.eatting();
		System.out.println(p1.addr);
		System.out.println(p2.addr);
	}
}
