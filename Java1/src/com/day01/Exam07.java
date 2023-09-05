package com.day01;

import java.util.Scanner;

public class Exam07 {
public static void main(String[]args) {
	// 밑변과 높이를 입력받아 삼각형의 넓이 구하기
	Scanner sc = new Scanner(System.in);
	System.out.println("밑변과 높이를 입력하세요");
	float width=sc.nextFloat();
	float height=sc.nextFloat();
	System.out.println("삼각형의 넓이 = " + width*height*1/2);

	sc.close();
}

}
