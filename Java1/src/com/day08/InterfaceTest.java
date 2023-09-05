package com.day08;


//도형의 넓이와 둘레 구하기
interface ShapeArea {
	double area();
	double circum();
}

	class Rectangle implements ShapeArea {
		private int x;
		private int y;

		public Rectangle(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public double area() {
			// TODO Auto-generated method stub
			return x * y;
		}

		@Override
		public double circum() {
			// TODO Auto-generated method stub
			return (x + y) * 2;
		}

	}
	
	class SCircle implements ShapeArea {
		private int r;
		public SCircle(int r) {
			this.r=r;
		}
		
		@Override
		public double area() {
			// TODO Auto-generated method stub
			return r*r*Math.PI;
		}
		@Override
		public double circum() {
			// TODO Auto-generated method stub
			return r*2*Math.PI;
		}
	}

	
	public class InterfaceTest {

		public static void main(String[] args) {
			Rectangle rec = new Rectangle(5, 7);
			System.out.println("사각형 넓이 : " + rec.area());
			System.out.println("사각형 둘레 : " + rec.circum());
			SCircle cir = new SCircle(7);
			System.out.println("원 넓이 : " + cir.area());
			System.out.println("원 둘레 : " + cir.circum());
		}

	}


