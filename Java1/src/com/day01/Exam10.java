package com.day01;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { // i=1, i=2, i=3, i=4, i=5, i=6(i가 6보다 작지 않기 때문에 빠져나옴)
			System.out.println(i + " : Hello World!");
		}
// 구구단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("2*" + i + "=" + 2 * i);
		}
// 1부터 10까지의 합을 구하시오.
		for (int i = 1; i <= 10; i++) {

		}
		System.out.println("\n==========");
// 1부터 10까지 짝수만 출력
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
			System.out.println("\n==========");
		}
// 단을 입격받아 그 단의 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("\n단 입력>>");
		int dan = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
sc.close();
	}// main
}// class
