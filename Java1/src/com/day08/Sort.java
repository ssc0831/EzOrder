package com.day08;
//p.347
public interface Sort {
	void ascending(int[]arr);
	void descending(int[]arr);
	default void description() {
		System.out.println("숫자 정렬 알고리즘");
	}

}
