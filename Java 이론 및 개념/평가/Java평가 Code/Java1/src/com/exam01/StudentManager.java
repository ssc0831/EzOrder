package com.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager{
	static Scanner sc = new Scanner(System.in);
	ArrayList<Student> arr = new ArrayList<>();
	
	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 전체보기");
		System.out.println("3. 종료");
}
	
	public void inputData() {
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.(x를 입력시 종료)");
		String name = sc.next();
		String department = sc.next();
		int studentID = sc.nextInt();
		double avg = sc.nextDouble();
		arr.add(new Student(name, department, studentID, avg));
	}

	public void viewData() {
		// for-each
		for (Student s : arr) {
			System.out.println("이름 : " + s.getName());
			System.out.println("학과 : " + s.getDepartment());
			System.out.println("학번 : " + s.getStudentID());
			System.out.println("평균 : " + s.getAvg());
			System.out.println();
			}
		}

  public static void main(String[] args){
	  StudentManager s = new StudentManager();
		while (true) {
			StudentManager.showMenu();
			int num = sc.nextInt();
			switch (num) {
			case 1:
				s.inputData();
				break;
			case 2:
				s.viewData();
				System.exit(0); // 종료
			default:
				System.out.println("입력오류");
				sc.close();
			}
		}
  
		
		
		
		
	}
}
	  
	  
	  
	  
	  
	  
	  
	  
 


