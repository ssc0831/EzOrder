package com.day02;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		// 학생 수와 한줄에 앉을 학생 수를 입력 받아 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요.");
		int tot = sc.nextInt(); // 15
		System.out.println("한줄에 앉을 학생 수를 입력하세요.");
		int line = sc.nextInt(); // 7
		for (int i = 1; i <= tot; i++) {
			System.out.print(i + "\t");
			if (i % line == 0) {
				System.out.println();
			}
		} // for

		// 필요한 라인수 출력
		int row = tot / line;
		if (tot % line != 0) {
			row += 1;
		}
		System.out.println("\n필요한 총 라인수: " + row);
		int r;
		if (tot % line == 0) {
			r = tot / line;
		}

		else {
			r = tot / line + 1;
		}
		System.out.println("필요한 총 라인 수 r:" + r);
		
		// 조건연산자(삼항 연산자)
		int rr = (tot % line == 0) ? tot / line : tot / line + 1;
		System.out.println("필요한 총 라인수 rr: " + rr);

	}
}
