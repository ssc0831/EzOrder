package com.day03;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		// 수를 입력받아 짝수만 더하시오.(-1 사용시 종료, while문, continue문 사용)
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(-1 입력시 종료)");
		while (true) {
			int num = sc.nextInt();
			int sum = 0;

			if (num == -1) {
				break;
			}
			if (num % 2 != 0) {
				continue;
			}
				sum += num;
				System.out.println("짝수의 합 :" + sum);
			}
		sc.close();
		}
}
