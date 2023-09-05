package com.day01;
import java.util.Scanner;
public class Exam08 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	// 두 수(정수)를 입력 받아 큰 수, 작은 수, 두 수의 차이를 출력하시오.
	System.out.println("두 수를 입력하세요.");
	int max=sc.nextInt();
	int min=sc.nextInt();
	if(max<min) {
		int tmp=max;
		max=min;
		min=tmp;
	}
	System.out.println("큰 수:"+ max);
	System.out.println("작은 수:"+ min);
	System.out.println("두 수 차이 :"+(max-min));
	sc.close();
}
}
