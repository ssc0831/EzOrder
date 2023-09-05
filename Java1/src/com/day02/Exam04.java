package com.day02;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		// 몇 개를 입력 받을 지를 물어보고 그 수만큼 숫자를 입력하여 그 수의 합계를 구하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 몇개 입력 받으시겠습니까?");
		int cnt = sc.nextInt(); // --->5
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			sum += sc.nextInt();
		}
		System.out.println("입력합계:" + sum);

	}
}