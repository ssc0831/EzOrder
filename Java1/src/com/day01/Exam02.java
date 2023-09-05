package com.day01;

public class Exam02 {
public static void main(String[] args) {
	// 정수 a 49할당
	int a = 49;
	//조건문
	if(a > 50) {
		System.out.println("크다"); // 참일때 수행
		System.out.println("50보다 크다"); 
	}
	else{
		System.out.println("작다"); // 거짓일때 수행
		System.out.println("50보다 작다"); 
	}
	//ln은 개행문자 
	// {} 2개 이상의 println일때는 표시 해줘야 에러 걸리지 않음
	// (1개일때는 생략해도 되지만 가급적이면 사용하는게 좋음)

	// a가 짝수인지 홀수 인지 출력하기
	if(a%2 == 0) {
		System.out.println("짝수");
	}
	else {
		System.out.println("홀수");
	}

	//다중 조건문
	a=51;
	if(a>100){
		System.out.println("100보다 크다");
		}
	else if(a>70) {
		System.out.println("70보다 크다");
	}
	else if(a>50) {
		System.out.println("50보다 크다");
		}
	else if(a>30) {
		System.out.println("30보다 크다");
		}
	else{
		System.out.println("30보다 작거나 같다.");
	}

	System.out.println("============");
	int b=151;
	if(b>100){
		System.out.println("100보다 크다");
		}
	if(b>70) {
		System.out.println("70보다 크다");
	}
	if(b>50) {
		System.out.println("50보다 크다");
		}
	if(b>30) {
		System.out.println("30보다 크다");
		}
	else{
		System.out.println("30보다 작거나 같다.");
	}
	
	//<조건문과 논리 연산자>
	System.out.println("============");
	int c=72;
	if(c>100){
		System.out.println("100보다 크다");
		}
	if(c>70 && c<=100) {
		System.out.println("70보다 크다");
	}
	if(c>50 && c<=70) {
		System.out.println("50보다 크다");
		}
	if(c>30) {
		System.out.println("30보다 크다");
		}
	
	int d = 30;
	if(d<100 && d!=30) { //  T && F 둘다 참일때
		System.out.println("조건만족");
	}
	
	if(d<100 || d!=30) { // T || F 둘 중 하나가 참일때
		System.out.println("조건만족");
	}
	
}

}