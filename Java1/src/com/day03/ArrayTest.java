package com.day03;

public class ArrayTest {
	public static void main(String[] args) {
		/*
		 * 5개의 정수 선언 a=1, b=2, c=3, d=4, e=5 크기가 5인 int형 변수를 표현 = 배열
		 */
		int[] arr = new int[5];
		arr[4] = 100;
		arr[1] = 30;

		// 크기가 5인 배열형, 크기를 지정하지 않으면 사용X
		// index 0,1,2,3,4

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("배열길이 : " + arr.length);
		System.out.println("---------------------------------------------------");
		// 정수 크기가 5인 tmp 배열 선언
		int[] tmp = new int[5]; // int tmp[]=new int[5];와 같다.
		tmp[0] = 1;
		tmp[1] = 2;
		tmp[2] = 3;
		tmp[3] = 4;
		tmp[4] = 5;
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = i + 1;
			System.out.print(tmp[i] + "\t");
		}
		System.out.println("---------------------------------------------------");
		int[] arr2 = { 100, 200, 300 }; // arr2[0]=100;, arr2[1]=200;, arr2[2]=300;과 같은 의미
		// 배열의 합 구하기
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}
		System.out.println("\n배열합계 : " + sum);
		/* 순서가 있고 중복 허용하는 것이 Array다. */
		System.out.println("---------------------------------------------------");
		// 문자열 출력//
		String[] str = { "one", "two", "three", "four" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("---------------------------------------------------");
		String[] str2 = new String[3];
		str2[0] = "딸기0";
		str2[1] = "딸기1";
		str2[2] = "딸기2";
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		// str2[3]="딸기3";
		// System.out.println(str2[3]); 배열의 크기는 한번에 정해지면 수정이 불가.
		System.out.println("---------------------------------------------------");
		// for~each
		for (String s : str2) {
			System.out.println(s);
		}
		
	} // main

} // class
