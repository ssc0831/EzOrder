package com.day09;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("one", "첫번째"); // map 추가
		hm.put("two", "두번째");
		hm.put("three", "세번째");
		hm.put("four", "네번째");
		System.out.println(hm); // 순서 없음, 중복 허용 안 함(key에 대한 중복을 허용하지 않음.)
		System.out.println("=======================================");
		hm.put("one", "첫번째첫번째");
		System.out.println(hm);
		System.out.println("=======================================");
		hm.put("oneone", "첫번째첫번째");
		System.out.println(hm);
		System.out.println("크기 : " + hm.size()); // map의 크기
		System.out.println(hm.get("two")); // value값을 알려준다.
		hm.remove("oneone");
		System.out.println(hm); // map 제거, 지운 것을 알 수 있음.
		String value = hm.remove("four");
		System.out.println("제거 : " + value);
		System.out.println(hm); // 제거 확인
		System.out.println("=======================================");
		HashMap<String, String> h = new HashMap<>();
		h.put("1", "딸기1");
		h.put("2", "딸기2");
		h.put("3", "딸기3");
		h.put("4", "딸기4");
		// h에 있는 value 값 출력
//		System.out.println(h.get("1"));
//		System.out.println(h.get("2"));
//		System.out.println(h.get("3"));
//		System.out.println(h.get("4"));
//		System.out.println(h.get(i));
		for (int i = 1; i < 5; i++) {
			// System.out.println(h.get(i+""));
			System.out.println(h.get(String.valueOf(i)));
		}
		System.out.println("=======================================");
		// h 해쉬맵에서 키값이 "1"이 있는가?
		System.out.println(h.containsKey("1"));
		// h라는 해쉬맵에서 value값에서 "딸기"가 있나요?
		System.out.println(h.containsValue("딸기")); // 값이 없기 때문에 false로 출력됨
		System.out.println("=======================================");
		// h라는 해쉬맵에서 키값만 출력
		System.out.println(h.keySet()); // key만 나오게 한다.
		Set<String> set = h.keySet();
		System.out.println("set : " + set);
		// h라는 해쉬맵에서 value 값만 출력
		System.out.println(h.values());
		System.out.println("=======================================");

		HashMap<String, String> hash = new HashMap<>();
		hash.put("one", "바나나1");
		hash.put("two", "바나나2");
		hash.put("three", "바나나3");
		hash.put("four", "바나나4");
		// value 값만 출력
		System.out.println(hash.values());
		// get을 이용해서 value 값을 출력
		for (String key : hash.keySet()) {
			System.out.println("value = " + hash.get(key));
		}
		for (String v : hash.values()) {
			System.out.println("v = " + v);
		}
		
		HashMap<Integer, String> h1 = new HashMap<>(); // 자료형 선언에는 class형 써줘야함.
		h1.put(1, "사과");
		h1.put(2, "사과2");
		h1.put(3, "사과3");
		h1.put(4, "사과4");
		for(int i=1; i<=h1.size(); i++) {
			System.out.println(h1.get(i));
		}

	}
}
