package com.day04;

public class Test01 {
public static void main(String[]args) {
	/* 1~45까지 난수 6개를 발생시켜서 배열에 넣어서 출력하시오.
	 * (중복값은 허용X) - 로또 번호 등에 응용
	 */
	int [] lotto = new int[6]; // 0 1 2 3 4 5
	int n = 0;
	while(n < lotto.length) { // n = 0
		int r = (int) (Math.random()*45) +1; // 난수 = Double(실수)형 자료
		lotto[n]=r; // Array = 10 15 13
		for(int i=0; i < n; i++) {
			if(lotto[i] == r) { // 중복값 발생 10==10 10==15
			n--; // n = 0 1
			break;
		}
	}
		n++; // n = 1 2 2 3
	}
	//for~each문
	for(int i : lotto) {
		System.out.print(i+"\t");
	}
	
	
}
}
