package com.day02;

public class Exam09 {
	public static void main(String[] args) {
		// 2단~4단
		for (int d = 2; d < 5; d++) {
			System.out.println(d + "단");
			for (int i = 1; i < 10; i++) {
				System.out.println(d + "*" + i + "=" + d * i);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		// 5단~7단
		for (int i = 5; i < 8; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		// 이중 for문 활용 구구단(옆으로 쭉 늘여서 나오게 하기)
		System.out.println("----------------------------------------------");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		for (int i = 1; i < 10; i++) {
			for (int j = 3; j < 8; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		// 3단, 5단, 7단만 출력해 보세요.
		for (int i = 3; i < 8; i++) {
			if(i%2==1)
				for (int j = 1; j < 10; j++) {
					System.out.print(i + "*" + j + "=" + i * j+"\t");
				}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		for (int i = 3; i < 8; i++) {
			if(i%2==0)continue;
				for (int j = 1; j < 10; j++) {
					System.out.print(i + "*" + j + "=" + i * j+"\t");
				}
			System.out.println();
		}
	} // main
} // class
