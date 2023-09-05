package com.day07;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		// Array
		// int형 크기가 4인배열 arr
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		// ArrayList : 객체를 다루는 자료 구조
		ArrayList alist = new ArrayList();
		alist.add("one");
		alist.add("1");
		alist.add("two");
		System.out.println(alist.size());
		// 2 추가 => int 내부적으로 Interger로 변환작업 수행(Wrapper Class)
		alist.add(2);
		System.out.println(alist.size());
		alist.add("three");
		System.out.println("alist 길이 : " + alist.size());
		// alist.add(new Interger(3); - 사용할 필요 없음
		System.out.println("alist 첫 번째 : " + alist.get(0));
		System.out.println("alist 마지막 번째 : " + alist.get(alist.size() - 1));
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("-------------------------------");
		for (Object obj : alist) {
			System.out.println(obj);
		}
		// 2번째에 딸기를 추가해 보세요.
		alist.add(2, "딸기");
		for (Object obj : alist) {
			System.out.println(obj);
		}
		System.out.println(alist.size());

		alist.remove(0);
		System.out.println("size : " + alist.size());
		String su = (String) alist.get(1);// two
		System.out.println("su : " + su);

		// 객체를 다루는 구조 : Collection
		// Generic
		ArrayList<String> blist = new ArrayList<>();
		blist.add("바나나");
		// blist.add(1);
		System.out.println("---------------------------------");
		for (String s : blist) {
			System.out.println(s);
		}
		System.out.println("---------------------------------");
		ArrayList<Integer>clist = new ArrayList<>();
		clist.add(1); // Wrapper Class
		clist.add(3);
		for(Integer i : clist) {
			System.out.println(i);
		}
		
	}
}
