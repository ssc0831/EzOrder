package com.day08;

public class AbsCircle extends AbsShape{

	@Override
	public void draw() {
		System.out.println("원 그리기");
		
	}

	@Override
	public void move() {
		System.out.println("원 이동하기");
	}
}
