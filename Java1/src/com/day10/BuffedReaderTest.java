package com.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class BuffedReaderTest {

	public static void main(String[] args) {
		// 한 줄 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps = null;
			String str;
			try {
				str = br.readLine();
				ps = new PrintStream("text1.txt"); // 파일로 한 줄 출력
				ps.print(str);
				System.out.println(str);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
	}

}
