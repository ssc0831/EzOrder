package com.day01;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("이름 입력>>");
//		String name = sc.next();// 문자입력
//		System.out.println(name);
		System.out.println("숫자 입력>>");
		int num=sc.nextInt();// 정수입력
		System.out.println(num);
		
		// 입력한 숫자가 홀수인지 짝수인지 출력
		if(num % 2 ==0) {
			System.out.println("짝수");
			}
		else {
			System.out.println("홀수");
		}
	
	// 나이값을 입력시 20세 이상이면 입장가능
	// 15세이상 20세 미만이면 부모님과 동반입장
	// 15세 미만이면 입장 불가능
	int age = sc.nextInt();
	System.out.println("숫자 입력>>");
	if(age >= 20) {
		System.out.println("입장가능");
	}
	else if(age >=15 && age < 20) {
		System.out.println("부모님과 동반 입장");
	}
	else {
		System.out.println("입장 불가능");
		}
	
	//if 문만 사용해서 수정하기
	System.out.println("===========");
	if(age >= 20) {
		System.out.println("입장가능");
	}
	if(age<20 && age>=15) {
		System.out.println("부모님과 동반 입장");
	}
	else {
		System.out.println("입장 불가능");
		}
	sc.close();
	} //main
}//class
	

