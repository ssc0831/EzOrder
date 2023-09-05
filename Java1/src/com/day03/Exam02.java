package com.day03;

public class Exam02 {
	public static void main(String[] args) {

		for (char i = 'z'; i >= 'a'; i--) { // i=z
			for (char j = 'a'; j <= 'z'; j++) { // j==a
				if (i > j) { // z>a, z>b, ... = z앞까지 *출력
					System.out.print("*");
				}
				else {
					System.out.print(j); // z부터 1씩 줄어들면서 출력
				}
			} // i
			System.out.println();
		} // j
		
		
		
		System.out.println();
		// * 출력 반복하기 홀수 개만큼 증가 (1,3,5,7개)
		for (int i = 1; i < 8; i += 2) { // i = 1,2,3,4
			for (int j = 1; j <= i; j++) {// j= 1,3,5,7
				System.out.print("*");
			}
			System.out.println("(" + i + ")");
		}
		System.out.println();
		// * (7,3,5,1개 반복)
		for (int i = 7; i > 0; i -= 2) { // i=7,5,3,1
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("(" + i + ")");
		}
		System.out.println();
		for (int i = 7; i > 0; i -= 2) { // i=7,5,3,1
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("(" + i + ")");
		}
		System.out.println("======================");

	}
}
