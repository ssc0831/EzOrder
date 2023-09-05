package com.day08;

public abstract class AbsShape {
	// 도형 그리기
	 public abstract void draw();
	
	 // 도형 출력하기
	 public void print() {
		System.out.println("도형 출력하기");
	}
	 // 도형 이동하기
	 public abstract void move();

}
