package com.day01;
import java.util.Scanner;

public class Exam06 {
public static void main(String[]args) {
	// 두 수와 연산자를 입력 받아 연산자에 따라 계산하기(switch~case문)	
	Scanner sc = new Scanner(System.in);
	System.out.println("두 수와 연산자 입력 >>");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	String op=sc.next();
	float result=0;
	switch(op) {
	case "+" : result=num1+num2; break;
	case "-" : result=num1-num2; break;
	case "*" : result=num1*num2; break;
	case "/" : result=num1/num2; break;
	default: System.out.println("연산자 오류");
	}
	System.out.println("결과:" +result);
	System.out.println("==========");
	if(op=="+") {
		result=num1+num2;
	}
	else if(op=="-") {
		result=num1-num2;
	}
	else if(op=="*") {
		result=num1*num2;
	}
	else if(op=="/") {
		result=num1/num2;
	}
	else {		
	}
		System.out.println("결과 : " + result);
		sc.close();
}

}

