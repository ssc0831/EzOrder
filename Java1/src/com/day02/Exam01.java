package com.day02;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		// 단을 입력 받아서 단이 짝수면 구구단을 출력하고 홀수이면 홀수단입니다 출력.
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요.");
		int dan = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			if (dan % 2 == 0) { // 짝수
				System.out.println(dan + "*" + i + "=" + dan * i);
			} else {// 홀수
				System.out.println("홀수단입니다.");
			}
		}		
		
		// 1부터 10까지의 합을 출력해보세요. 1+2+3+...+10 = 55
		int sum=0;
		for(int i=1; i<11; i++) { //i=1,2,3,4,...
			sum+=i; // sum=sum+i; //sum=1 3 6 10
		}
		System.out.println(sum);
	
	sc.close();
	}
}

