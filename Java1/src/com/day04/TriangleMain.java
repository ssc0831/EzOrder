package com.day04;

import java.util.Scanner;

class Triangle { // 같은 파일 내에 클래스 생성
	double bottom;
	double height;

	public Triangle(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}

	public double getArea() {
		return bottom * height * 0.5;
	}
	

	public void setBottom(double bottom) {
		this.bottom=bottom;
	}

	public void setHeight(double height) {
		this.height=height;
	}
}

public class TriangleMain {
	

	public static void main(String[] args) {
	/*	Triangle tr1 = new Triangle(10.2, 17.3);
		System.out.println("삼각형의 넓이 : " + tr1.getArea());
		tr1.setBottom(7.5);
		tr1.setHeight(11.2);
		System.out.println("삼각형의 넓이 : " + tr1.getArea()); */
		
		// 밑변과 높이를 입력 받아서 삼각형 넓이 구하기
		Scanner sc=new Scanner(System.in);
		System.out.println("밑변과 높이를 입력 하세요.");
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		Triangle tr2 = new Triangle(b, h);
		/* Triangle tr2;
		 * tr2=new Triangle(b, h);은 같은표현이다. */
		System.out.println("삼각형의 넓이 :" + tr2.getArea() + "입니다.");
		// System.out.println("삼각형의 넓이 :" + (b*h*0.5) + "입니다.");
	
	
		
	
	}
}

