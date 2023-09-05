package com.day04;

public class Sachik2 {
	int a;
	int b;
	public Sachik2() {
		
	}
	public Sachik2(int a, int b) {
			this.a=a;
			this.b=b;
	}
	
	public void sum(){
		System.out.println("더하기 : " +(a+b));
	}
	
	// Method Overloading
	public void sum(int num1, int num2) {
		System.out.println("더하기 : " +(num1+num2));
	}
	
	public void sub(){
		System.out.println("빼기 : " +(a-b));
	}
	
	public void sub(int num1, int num2) {
		System.out.println("빼기 : " +(num1-num2));
	}
	
	public void mul() {
		System.out.println("곱하기 : " +(a*b));
	}
	
	public void mul(int num1, int num2) {
		System.out.println("곱하기 : " +(num1*num2));
	}
	
	public void divide() {
		System.out.println("나누기 : " +(a/b));
	}
	
		public void div(int num1, int num2) {
			System.out.println("나누기 : " +(num1/num2));
		}
	
	
	public int div() {
		return a/b; // return 선언할때 자료형 값을 명시해줘야 함.
	}
		
	public static void main(String[] args) {
	Sachik2 sa1 = new Sachik2(20,10);
	sa1.sum();
	sa1.sub();
	sa1.mul();
	sa1.divide();
		
	Sachik2 sa2 = new Sachik2(56,8);
	sa2.sum();
	System.out.println("나누기 : "+ sa2.div());
	
	//Method Overloading 활용하여 사칙연산
	Sachik2 sa3 = new Sachik2();
	sa3.sum(5, 7);
	sa3.mul(6, 8);
	sa3.div(40, 5);
	sa3.sub(10, 9);
	
	}
}
