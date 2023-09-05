package com.day04;

public class SaraMain {
	
	public void name() {
		
	}
	
	public void addr() {
		
	}
	
	public void tel() {
		
	}
	public void showInfo() {
		
	}
	
	public static void main(String[] args) {
	Saram s1 = new Saram();
	//s1.name="홍길동";
	s1.setName("홍길동");
	//s1.addr="부산";
	s1.setAddr("부산");
	//s1.tel="010-1111-2222";
	s1.setTel("010-1111-2222");
	s1.showInfo(); // 홍길동의 주소는 부산, 전화번호는 tel이 나오도록 하세요.
	
	Saram s2 = new Saram("이순신","서울","010-2222-3333");
	s2.showInfo(); // 이순신의 주소는 서울, 전화번호가 나오도록 하세요.

	
}
}