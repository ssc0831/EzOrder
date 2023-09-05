package com.day07.shape;

public class Square extends Shape {
	// 중심(x,y), 가로(width), 세로(height)
	private int width;
	private int height;

	public Square(int x, int y, int w, int h) {
		super(x, y);
		this.width = w;
		this.height = h;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사각형";
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("가로 = " + width + " " + "높이 = " + height);

	}
}
