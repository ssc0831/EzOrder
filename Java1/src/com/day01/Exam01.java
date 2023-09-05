package com.day01;

public class Exam01 {
	public static void main(String[]args) {
		// 자바 출력문
		/* 자바 여러줄
		주석 */
		
//		여기는 설명 글입니다.
//		나이 20 -> 30 변경
//		이름 홍길동
//		주소 부산 -> 서울 변경
	System.out.println("Hello");
	System.out.println("안녕");
	int age = 20;
	age = 30;
	String name = "홍길동";
	String addr = "부산";
	addr = "서울";
	System.out.println("나이="+age);
	System.out.println("이름="+name);
	System.out.println("주소="+addr);
	
	//숫자 a에 15 b에 8을 할당하여 사칙연산
	int a = 15;
	int b = 8;
	System.out.println("a+b="+(a+b)); // 15+8
	System.out.println("a-b="+(a-b)); // 15-8
	System.out.println("a*b="+(a*b)); // 15*8
	System.out.println("a/b="+(a/b)); // 15/8=1(몫)
	System.out.println("a%b="+(a%b)); // 15/8=7(나머지)
//	반지름 r을 5로 지정하고 원 넓이 구하기(파이*r제곱)
	int r=5;
	final double PI=3.14;
//	PI=5; - final이 있어서 오류 발생
	System.out.println(r*r*PI);
	
//	double d1 = 3.56;
//	float d2 = 3.56; - 에러 발생
//	float d2 = 3.56f; - 오류 없음
//	자료형의 크기
//	int : 4byte (1byte -> 8bit)
//	double(실수) : 8byte - 디폴트값 
//	float(실수) : 4byte
	
	int num; //변수 선언
	num = 100; // 변수에 값을 할당
	int su = 200; // 변수 선언 + 값 할당
	int sum = num + su;
	System.out.println(sum);
	
	//100 + 200 = 300
	System.out.println(num+"+"+su+"="+sum);
	
	long n = 1000000000000L; //8byte
	char ch = 'A'; //문자 하나를 이야기한다. (2byte-홑따옴표)
	
	float f = 5.0f;
	int num1 = 10;
	f = num1;
	System.out.println("f="+f);
	// float(4byte) = int(4byte) : 형변환(자동형변환 - 실수가 크기 때문에 자동으로 형변환)
	
	num1 = (int)f; // int = float (명시적 형변환 - 오류가 날수도 있음.)
	System.out.println("num1="+num1);
	
	}
}
