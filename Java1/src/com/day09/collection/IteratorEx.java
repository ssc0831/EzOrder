package com.day09.collection;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> vc = new Vector<Integer>();
		vc.add(5);
		vc.add(-1);
		vc.add(new Integer(4));
		for (Integer i : vc) {
			System.out.println(i);
		}
		vc.add(2, 100);
		System.out.println("===");
		for (Integer i : vc) {
			System.out.println(i);
		}
		System.out.println("===");
		Iterator<Integer> it = vc.iterator(); // for문으로도 사용이 가능하지만 객체 반복 반환은 Iterator를 사용.
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		
		
	}

}
