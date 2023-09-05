package com.day02;

public class Exam02 {
	public static void main(String[] args) {
		// 1부터 50까지의 짝수의 합 출력
		int sum = 0;
		for (int i = 1; i < 51; i+=1) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("짝수 합계:" + sum);
		
		//1부터 50까지 홀수의 합 출력(if 사용 안한상태)
		int hap = 0;
		for (int i = 1; i < 50; i += 2) {
			hap += i;
		}
		System.out.println("홀수 합계:" + hap);
				
	}
}
