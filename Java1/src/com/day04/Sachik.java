package com.day04;

public class Sachik {
	// 덧셈
	public void sum(int a, int b) {
		System.out.println("덧셈 : "+(a+b));
	}
	// 뺄셈
	public void sub(int a, int b) { // {} 표시는 지역변수
		System.out.println("뺄셈 : "+(a-b));
	}
	// 곱셈
	public void mul(int a, int b) {
		System.out.println("곱셈 : "+(a*b));
	}
	// 나눗셈
	public void div(int a, int b) {
		System.out.println("나누기 : "+(a/b));
	}
	public int div2(int i, int j) {
		int r = i/j;
		return r;
	}
	
	
	public static void main(String[] args) {
		Sachik s1 = new Sachik();
		s1.sum(20, 10); // 20+10
		s1.sub(20, 10);
		s1.mul(20, 10);
		s1.div(20, 10);
		int r = s1.div2(20, 4);
		System.out.println("리턴값 : " + r);
		System.out.println(s1.div2(100, 10));
		// System.out.println(s1.sum(10, 10)); 오류발생
		
}
}
