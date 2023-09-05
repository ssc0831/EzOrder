package com.day04;

public class Car {
	
	int speed; // 멤버변수 초기값을 지정하지 않으면 0
	String carName;
	String carColor;
	public void carName() {
		
	}
	public void pub() {

	}
	
	public Car() { //디폴트 생성자 생략 가능(혼자 있을때) : 멤버 변수 초기화때 사용
		
	}
	
	public Car(String carName, String carColor) { // 생성자, this : 자기 자신의 생성자
		this.carName=carName;
		this.carColor=carColor;
	}
	
	public Car(String carColor) { // 생성자 OverLoading
		//this.carColor=carColor;
		this("미정",carColor);
	}
	
	public void speedUp(int speed) {
		this.speed +=speed;
	}
	public void stop() {
		speed = 0;
	}
	public void getSpeed() {
		System.out.println(carName+":"+speed);
	}
	public void infor() {
		System.out.println("차종:"+carName);
		System.out.println("색상:"+carColor);
		System.out.println("속도:"+speed);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		String carName; 
		int speedUp;
		
		Car c1=new Car(); // 디폴트 생성자
		c1.speedUp(30);
		System.out.println(c1.speed);
		c1.speedUp(50);
		c1.speedUp(60);
		System.out.println(c1.speed);
		c1.stop();
		System.out.println(c1.speed);
		c1.speedUp(100);
		System.out.println(c1.speed);
		c1.carName="제네시스";
		c1.getSpeed(); // 제네시스 : 100(현재 스피드)
	
		
		Car c2=new Car("제네시스2", "흰색"); //생성자, 멤버 변수 초기화를 위해서 사용함
		c2.speed=50;
		c2.getSpeed();
		System.out.println(c2.carColor);
		
		Car c3=new Car("Black");
		System.out.println(c3.carColor);
		c1.infor();
		c2.infor();
		c3.infor();
		
		
}
}