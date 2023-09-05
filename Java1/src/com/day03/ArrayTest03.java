package com.day03;

import java.util.Scanner;

public class ArrayTest03 {
	public static void main(String[]args) {
		int[]data= {10,5,90,100,250,30,77};
		int sum=0;
		int max=data[0];
		int maxPos = 0;
			for(int i=0; i< data.length; i++) {
			sum += data[i];
			if(max<data[i]) {
				max=data[i];
				maxPos=i;
			} 
		}

		System.out.println("최대값 : "+max);
		System.out.println("최대값 위치 : "+maxPos);
		System.out.println("배열의 합계 : "+sum);
		System.out.println("배열의 평균 : "+(float)sum/data.length);
		System.out.println("----------------------------------------------");
		System.out.println("찾을 숫자를 입력하세요.");
		Scanner sc=new Scanner(System.in);
		int search = sc.nextInt();
		//찾는 숫자가 배열에 있으면 몇 번째인지 알려구조 없으면 찾는수가 없습니다.를 출력
		/*for(int i=0; i<data.length; i++) {
			if(search==data[i]) {
				System.out.println(search+" : "+i+"번째 있습니다.");
			}
			else {
			System.out.println(search+":"+"해당되는 숫자가 없습니다.");
			}
		break;
		}*/	
		
		
		// boolean flag라는 변수 사용
		boolean flag=false;
		for(int i=0; i<data.length; i++) {
			if(search==data[i]) {
				flag=true;
				System.out.println(search+" : "+i+"번째 있습니다.");
				break;
			}
			if(flag==false) {
			System.out.println(search+" : "+"해당되는 숫자가 없습니다.");
			}
		}	
		
		}//main
}//class

