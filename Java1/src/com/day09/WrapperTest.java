package com.day09;

// boolean – Boolean
// int – Integer
// char – Character
// short – Short
// long – Long
// double – Double
// float – Float
// byte - Byte

public class WrapperTest {
	int a;

	public void setValue(Integer i) {
		this.a = i;
	}

	public Integer returnValue() {
		return 5; // Integer(리턴형) <- 5(int)
	}

	public static void main(String[] args) { // i(Integer) = 20(int);
		int value = 7; // int != Integer
		Integer val = new Integer(value);
		WrapperTest test = new WrapperTest();
		test.setValue(20);
	}
}
