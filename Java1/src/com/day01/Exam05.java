package com.day01;
import java.util.Scanner;
public class Exam05 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("이름을 입력하세요. >>");
	String name = sc.next();
	System.out.println("국어 영어 수학성적을 입력 하세요. >>");
	int kor = sc.nextInt(); // 국어 성적
	int eng = sc.nextInt(); // 영어 성적
	int math = sc.nextInt(); // 수학 성적
	int tot = kor+eng+math;
	System.out.println(name +": 총점"+" "+tot);
	System.out.println(name +": 평균"+" "+tot/3);
	float avg = tot/3.0f;
	// 평균 90이상 A학점
	//	평균 80이상 B학점
	//	평균 70이상 C학점
	//	나머지 F학점을 나타내보세요.
	
	if (avg >= 90) {
        System.out.println("A학점");
    } else if (avg >= 80) {
        System.out.println("B학점");
    } else if (avg >= 70) {
        System.out.println("C학점");
    } else {
        System.out.println("F학점");
    }
	// 다른 방법으로 학점 표현하기
	System.out.println("=========================");
String grade;
	if(avg >= 90) {
		grade="A";
		}
	else if (avg >= 80) {
        grade="B";
    } else if (avg >= 70) {
      grade = "C";
    } else {
      grade = "F";
    }
	System.out.println(grade+"학점");
	//switch ~ case문
	int average=(int)avg;
	switch(average/10) {
	case 10:
	case 9: grade="A"; break;
	case 8: grade="B"; break;
	case 7: grade="C"; break;
	default: grade="F"; break;
	}
	System.out.println("학점 switch : " + grade);
	
	int a=10;
	switch(a) {
	case 10: System.out.println("10");break;
	case 9: System.out.println("9");break;
	case 8: System.out.println("8");break;
	default: System.out.println("default");
	}
	sc.close();
}
}
