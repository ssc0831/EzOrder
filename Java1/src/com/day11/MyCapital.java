package com.day11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import com.day10.CapitalApp;

public class MyCapital {
	private HashMap<String, String> hm = new HashMap<>();
	private File dir, file;

	// 생성자
	public MyCapital() {
		dir = new File("src\\com\\day11");
		file = new File(dir, "capital.txt");

		try {
			if (!file.exists()) { // 파일이 없다면
				file.createNewFile(); // 파일 생성
				return; // 종료
			}
			// 파일이 있다면 읽어오기
			Scanner sc = new Scanner(file);
			// map에 추가
			while (sc.hasNext()) {
				String key = sc.next(); // 나라
				String value = sc.next(); // 수도
				hm.put(key, value);
			}
			System.out.println(hm);
			sc.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void showMenu() {
		System.out.println("=== 수도 맞추기 게임 시작 ===");
		System.out.println("1. 문제 입력 2. 퀴즈 3. 종료 >>>");
	}

	public void input() {
		// 문제 추가
		while (true) {
			System.out.println("현재 : " + hm.size());
			System.out.println("나라와 수도 입력(종료는 X)>>");
			String nara = CapitalApp.sc.next();
			if (nara.equalsIgnoreCase("x"))
				break;
			if (hm.containsKey(nara)) {
				System.out.println("이미 입력한 나라입니다.");
				continue;
			}
			String sudo = CapitalApp.sc.next();
			hm.put(nara, sudo);
		}
	}

	public void quiz() {
		// 키 값만 구하기
		Set<String> set = hm.keySet();
		// 구한 키값 set을 ArrayList에 담기 ==> 순서가 중요
		Object[] arr = set.toArray();
		while (true) {
			int r = (int) (Math.random() * hm.size());
			String country = (String) arr[r]; // 문제
			String result = hm.get(country); // 정답
			// 문제 출제
			System.out.println(country + "수도는 ?(종료 X) >>");
			String dap = CapitalApp.sc.next();
			if (dap.equalsIgnoreCase("x"))
				break;
			if (result.equals(dap)) {
				System.out.println("정답");
			} else {
				System.out.println("틀렸습니다.");
			}
		} // while
	} // quiz

	public void save() {
		// map을 파일로 저장 후 종료
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Set<String> set = hm.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = hm.get(key);
			try {
				fw.write(key + " ");
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fw.write(value + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
		System.exit(0);
	}

 

	public static void main(String[] args) {
		CapitalApp app = new CapitalApp();
		while (true) {
			CapitalApp.showMenu();
			int choice = CapitalApp.sc.nextInt();
			switch (choice) {
			case 1:
				app.input();
				break;
			case 2:
				app.quiz();
				break;
			case 3:
				app.save();
				break;
			default:
				System.out.println("입력 오류");
			}

		}

	}

}