package com.day07;

public class Main {

	public static void main(String[] args) {
		Father f = new Father();
		f.fatherMethod();
		System.out.println("-----------------");
		Child c = new Child();
		c.childMethod();
		c.fatherMethod();
		c.grandFatherMethod();
		f.grandFatherMethod();
		System.out.println("-----------------");
		c.method();
		f.method();
		System.out.println(c.value);
		
		GrandFather gf = new GrandFather();
		// gf.childMethod(); 오류발생
		System.out.println("-----------------");
		Father f1; // 자료 선언만 한 것 
		Child c1 = new Child();
		f1 = c1; // Father = Child Father 참조, f1=Father형임. 상속관계이기에 가능
		f1.fatherMethod();
		// f1.childMethod(); 오류 발생
		f1.grandFatherMethod();
		Father f2 = new Child(); // f2는 Father형인데 Child의 오버라이딩 된 메소드 접근 가능하게 만듬.
		f2.method();
		
	}

}
