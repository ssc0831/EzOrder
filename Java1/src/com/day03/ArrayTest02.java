package com.day03;

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		/* 입력 개수를 입력받아 그 수만큼 데이터를 입력받고 입력 받으세요.
		 * 데이터 값의 합계와 최대값을 출력하고 입력받은 데이터를 출력하시오. */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int length = sc.nextInt();
		int sum = 0, max = 0;
		int[] arr = new int[length]; // int Array 생성
				
		/*for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if (arr[i] > max) {
				max = arr[i];
			}
		}*/
			
		//for문과 while문을 활용하여 해보세요.
		int n=0;
		while(true) { // while(n<length)
			arr[n]=sc.nextInt();
			sum+=arr[n];
			if(max<arr[n]) {
				max=arr[n];
			}
			
			n++;
			if(n==length) break;
		}
			
		
		System.out.println("배열의 합계 : " + sum);
		System.out.println("최대값은 " + max + " 입니다.");
		for (int a : arr) {
			System.out.print(a + "\t");
		}
		
			sc.close();
	} // main
} //class
