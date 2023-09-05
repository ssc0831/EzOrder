package com.day07;

import java.util.Scanner;

public class BookVOMain {
	static Scanner sc = new Scanner(System.in);
	Book[] arr = new Book[20];
	private int cnt;

	public static void showMenu() {
		System.out.println("--- 메뉴 ---");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 전체보기");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}

	public void bookInsert() {
		System.out.println("데이터 입력");
		// 책제목, 저자
		System.out.println("책 제목>>");
		String title = sc.nextLine();
		System.out.println("저자>>");
		String writer = sc.next();
		// 입력 받은 값을 배열에 저장하기
		arr[cnt++] = new Book(title, writer);
	}

	public void bookList() {
		System.out.println("책 리스트");
		for (Book b : arr) {
			if (b == null)
				break;
			System.out.println("책 제목 : " + b.getTitle());
			System.out.println("저자 : " + b.getWriter());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		BookVOMain bm = new BookVOMain();

		while (true) {
			BookVOMain.showMenu();
			System.out.println("번호를 입력하세요.");
			int num = BookVOMain.sc.nextInt();
			BookVOMain.sc.nextLine();
			switch (num) {
			case 1:
				bm.bookInsert();
				break;
			case 2:
				bm.bookList();
				break;
			case 3:
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("입력 오류");

			}// switch ~ case
		} // while

	} // main
} // class
