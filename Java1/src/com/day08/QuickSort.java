package com.day08;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");

	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");

	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("QuickSort 정렬 알고리즘");
	}
}
