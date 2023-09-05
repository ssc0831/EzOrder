package com.day08;

public class AbsShapeMain {
	public static void main(String[] args) {
		AbsCircle circle = new AbsCircle();
		// 원 그리기
		circle.draw();
		// 도형 출력
		circle.print();
		// 원 이동
		circle.move();
		AbsShape square = new AbsSquare();
		// 사각형 그리기
		square.draw();
		// 도형 출력하기
		square.print();
		// 사각형 이동하기
		square.move();
		// AbsShape shape = new AbsShape();
		// 오류발생 추상클래스는 객체 생성 불가
		
		AbsShape as = new AbsCircle();
		as.draw();
		as.move();
		
	}
}
