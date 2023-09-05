package com.day02;

public class Exam03 {
public static void main(String[]args) {
	// 1~10 까지의 합 55, 1~20, 1~30, 1~40, 1~50
	// 1~60, 1~70, 1~80, 1~90, 1~100 합을 구해보세요.
	
	int sum = 0;
	for (int i=1; i<=100; i+=1) {
		sum +=i;
		if(i%10==0) {
			System.out.println("1에서 "+ i +"까지의 합 :" + sum);
		}
	}
	
	//1~10, 11~20, 21~30, 31~40, 41~50, 51~60, 61~70, 71~80, 81~90, 91~100의 합을 구하시오.
	int hap = 0;
	for(int i=1; i<=100; i++){
		hap +=i;
		if(i%10==0) {
			System.out.println((i-9) +"에서 "+ i +"까지의 합 : " + hap);
			hap = 0;
		}
	}
			
}//main
}//class
