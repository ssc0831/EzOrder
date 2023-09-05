package com.day04;

public class Person {
	// 이름(name), 주소(addr), 전화번호(tel)
	String name;
	String addr;
	String tel;
	// study(), //play()
	public void study() {
		System.out.println(name+"는(은) "+" 공부합니다.");
	}
	public void play() {
		System.out.println(name+"는(은) "+" 운동합니다.");
	}
	public void addr() {
		System.out.println(name+"의"+" 주소는 "+addr+"입니다.");
	}
	public void tel() {
		System.out.println(name+"의"+" 전화번호는 "+tel+"입니다.");
	}
	// p1 객체 생성
	public static void main(String[]args) {
		Person p1=new Person();
		p1.name="홍길동";
		p1.tel="010-1111-2222";
		p1.addr="부산";
		p1.study();
		// 홍길동 운동한다 출력
		p1.play();
		// 부산에 사는 홍길동 전화번호는 ""이다. 출력되도록 만들어보세요.
		System.out.println(p1.addr + "에 사는 "+ p1.name +"입니다."+ " 전화번호는 "+ p1.tel + "입니다.");
		// 이름 : 홍길동, 전화 010-1111-2222, 홍길동은 공부한다. 출력
		System.out.println(p1.addr + "에 사는 "+ p1.name +"입니다."+ " 전화번호는 "+ p1.tel + "입니다.");
	}
	

	


	
	
	
}
