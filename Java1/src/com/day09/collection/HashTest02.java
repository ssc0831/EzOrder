package com.day09.collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashTest02 {
	/* 1. HashMap map을 생성
	 * 2. 단어를 입력받아서 단어와 입력 횟수 저장
	 * 3. 대소문자 구분없이 X를 입력시 종료
	 * 4. map 출력
	 * ex)java test java test java test test test abc x
	 */
	
	
	public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("단어를 입력하세요.");
	
	
	while(true) {
		String word=sc.next();
		int value;
		if(word.equalsIgnoreCase("x")) break;
	/*if(map.containsKey(word)) {
		// map.put(word, map.get(word)+1);
		value = map.get(word)+1;
		}else {
			// map.put(word, 1);
			value = 1;
		} */
		
		
		map.put(word, map.containsKey(word)? map.get(word)+1 : 1); // 3항 연산자로 1줄 요약해서 표현
		
		
		// map.put(word, value); 
}	
	

	System.out.println(map);
	
	}
}

