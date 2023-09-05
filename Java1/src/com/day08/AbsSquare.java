package com.day08;

public class AbsSquare extends AbsShape {

	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}

	@Override
	public void move() {
		System.out.println("사각형 이동하기");
	}

}
