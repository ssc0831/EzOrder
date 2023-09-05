package com.day02;

public class Exam07 {
	public static void main(String[]args) {
		//1~10 홀수의 합
	
		//1.for if 사용해서
		int sum=0;
		for(int i=1; i<10; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("홀수 합계 :"+sum);
		
		//2.for만 사용
		sum=0;
		for(int i=1; i<10; i+=2) {
			sum += i;
		}
		sum=0;
		for(int i=1; i<10; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("홀수 합계 :"+sum);
		
		//3. for if continue 사용
		int s=0;
		for(int i=1; i<11; i++) {
			if(i%2==0) continue; { //짝수면 합을 하지 않음.
				s+=i;
			}
		}
		
		//break 사용
		int h=0;
		for(int i=1; i<11; i++) {
			if(i%2==0)break; //짝수면 반복문 빠져나오기
			h+=i;
		}
		
		}

}
