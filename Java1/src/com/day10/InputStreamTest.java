package com.day10;

import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		while (true) {
			try {
				int i = System.in.read(); // 표준 입력
				if(i==-1) break;
				System.out.print((char)i); // 표준 출력
			} catch (IOException e) {
				e.printStackTrace();
			
		}
	}

	
	
	}
}
