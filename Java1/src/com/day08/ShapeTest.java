package com.day08;

import java.util.ArrayList;
import java.util.List;
// p.279
class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("Triangle");
	}
}

public class ShapeTest {
	
	public static void main(String[] args) {
		//ArrayList<Shape> list = new ArrayList<>();
		List<Shape> list=new ArrayList<>(); // ArrayList<Shape> list = new ArrayList<>();와 같다.
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		// 출력문 => Circle, Triangle, Shape
		for(Shape s : list) {
			s.draw(); // return 값이 없으므로 sysout 사용할 필요 없음.
		}
		
		

	}

}
