package com.day08;

public class Calc2Main implements Calc2 {

	public static void main(String[] args) {
		Calc2 c2 = new Calc2Main();
		System.out.println(c2.value);
		//c2.value=50; // final로 선언되어 있어서 오류(수정 불가)

	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
