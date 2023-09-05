package com.day04;

public class Student {
	String name;
	int kor;
	int math;
	
	public Student(String name, int kor, int math) {
		this.math=math;
		this.kor=kor;
		this.name=name;
	}
	
	public int getTotal() {
		return math+kor;
	}
	public float getAvg() {
		return getTotal()/2.0f;
	}
	
	public static void main(String[] args) {
	Student s1 = new Student("홍길동", 100, 85);
	Student s2 = new Student("이순신", 50, 70);
	System.out.println("이름 : " +s1.name);
	System.out.println("국어 : " +s1.kor);
	System.out.println("수학 : " +s1.math);
	System.out.println("총점 : " +s1.getTotal());
	System.out.println("평균 : " +s1.getAvg());
	System.out.println();
	System.out.println("이름 : " +s2.name);
	System.out.println("국어 : " +s2.kor);
	System.out.println("수학 : " +s2.math);
	System.out.println("총점 : " +s2.getTotal());
	System.out.println("평균 : " +s2.getAvg());
	
}
}
