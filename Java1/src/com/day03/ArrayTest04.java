package com.day03;

public class ArrayTest04 {
	public static void main(String[]args) {
		// Math.random()함수 - 난수 출력 (8byte의 0과 1 사이 double형)
		// System.out.println(Math.random());
		// 0과 50사이의 정수형 난수 발생
		// System.out.println((int)(Math.random()*50));
		// int r=(int)(Math.random()*50);
		// System.out.println(r);
		
		/* 크기가 10인 배열을 만들고 0~50사이의 정수형 난수를 발생
		 * 0이 아닌 배열값을 넣으세요.(중복 허용)
		 */
		int[] arr = new int[10];
		/*
		 * for(int i=0; i<arr.length; i++) { int r=(int)(Math.random()*50);
		 * System.out.println(r); if(r==0) { i--; continue; } arr[i]=r; }
		 */

		// while 문으로 사용할 시
		int n = 0;
		while (n < arr.length) {
			int r = (int) (Math.random() * 50);
			if (r == 0) continue;
			arr[n] = r;
			n++;	
			//arr[n++]=r;으로 두 줄 코드를 한 줄로 사용가능하다.(후위 연산자)
		}
		// 데이터 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.println();
		// for~each 활용하여 데이터 출력
		System.out.println();
		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}
}
