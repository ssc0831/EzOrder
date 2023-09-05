package com.day03;

import java.util.Scanner;

public class ArrayTest01 {
	public static void main(String[]args) {
	/* 데이터를 5개 입력 받아 합계를 출력한 뒤 입력받은 데이터 5개를 출력받으세요.
			합계 : ?, 입력데이터 : ? 형태로 출력하세요.	 */
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int sum=0;
		int[] arr = new int[5]; // Array 선언
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt(); // 입력한 데이터가 arr 각index에 저장
			sum+=arr[i];
			
			//System.out.println("입력 데이터 :"+ arr[i]); // arr[0]~[4]//
		}
		System.out.println("배열의 합계 :"+ sum);
		System.out.println("-----------------------------------");
		//for~each문으로 구성
		for(int a: arr) {
			System.out.print(a+"\t");
		}
		
}
}
