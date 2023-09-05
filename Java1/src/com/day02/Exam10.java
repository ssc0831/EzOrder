package com.day02;

public class Exam10 {
	public static void main(String[]args) {
		/* 1~10, 11~20, 21~30, 31~40, 41~50, 51~60, 61~70, 71~80
		 81~90, 91~100까지의 합을 출력하세요. */
		//1. for문
		int sum=0;
		for(int i=1; i<101; i++) {
			sum+=i;
			if(i%10==0) {
				System.out.println((i-9) +"에서 "+ i +"까지의 합 : " + sum);
				sum=0;
				}
		}
		System.out.println("------------------------------------------");
		System.out.println();
		
		//2. 이중 for문
		/* int j;
		int hap=0;
		for(int i=1; i<101; i+=10) { // 10회 동작
			for(j=i; j<i+10; j++) { // 1~10, 11~20, ...
				hap+=j;
			}
			System.out.println(i+"부터 "+(j-1)+"까지의 합:"+hap);
			hap=0;
		} */
		System.out.println("------------------------------------------");
		System.out.println();
		for(int i=1; i<101; i+=10) { // 10회 동작
			int h=0;
			int j;
			for(j=i; j<i+10; j++) { // 1~10, 11~20, ...
				h+=j;
			}
			System.out.println(i+"부터 "+(j-1)+"까지의 합:"+h);
			}
		System.out.println();
		/* 123456789 4번 반복*/
		System.out.println("------------------------------------------");
		for(int j=0; j<4; j++) {
			System.out.println();
			for(int i=1; i<10; i++) {
				System.out.print(i);
			}
		}
		System.out.println();
		System.out.println("------------------------------------------");
		/* 123456789
		 * 1234567
		 * 12345
		 * 123
		 * 1
		 의 형태로 출력하시오.*/
		for(int i=9; i>0; i-=2) { // 5회 반복
			for(int j=1; j<=i; j++) { // 1~9, 1~7, 1~5, 1~3, 1
				System.out.print(j);
			}	
			System.out.println();
		}
				
	}
}
