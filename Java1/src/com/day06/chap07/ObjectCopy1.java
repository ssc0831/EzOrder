package com.day06.chap07;

public class ObjectCopy1 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("태백산맥1", "조정래1");
		bookArray1[2] = new Book("태백산맥2", "조정래2");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}

	}
}
