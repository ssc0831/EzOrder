package com.day11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedTest {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		String str1 = sc.nextLine();
//		System.out.println(str1);
		
		// Scanner 이용해서 File 읽어오기
		Scanner fs = null;
		try {
			fs = new Scanner(new File("cap.txt"));
			System.out.println(fs.nextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	// BufferedReader 사용 한 줄 입력받아 출력하기
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			String str = br.readLine();
//			System.out.println(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// sc.close();
		fs.close();

	}
}
