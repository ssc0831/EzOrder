package com.day08;

import java.util.ArrayList;

class Buyer {
	private int money;
	private int point;
	// 크기가 10인 배열 arr 생성
	//Product[] arr = new Product[10];
	// ArrayList alist 사용
	ArrayList<Product> alist= new ArrayList<>();
	
	//int cnt;
	public Buyer(int money) {
		this.money = money;
	}

	public void buy(Product p) { // 물품 구매
		alist.add(p);
		money -= p.price;
		point += p.bonus;
		}

	public void show() { // 구매 내역 출력
		int sum = 0;
//		for (int i = 0; i < cnt; i++) {
//			sum += arr[i].price;
//			System.out.println(arr[i]);
//			System.out.println("구매 총액 : "+ sum);
//		}
		
//		for(int i=0; i<alist.size(); i++) {
//			sum += alist.get(i).price;
//			System.out.println(alist.get(i));
//		}
		
		// for~each
		for(Product p : alist) {
			sum += p.price;
			System.out.println(p);
		}
		System.out.println("잔액 : " + money);
	}

}

class Product {
	int price; // 가격
	int bonus; // 가격의 10%

	public Product(int price) {
		this.price = price;
	}
}

class TV extends Product {
	public TV(int price) {
		super(price);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "TV";
	}
}

class Computer extends Product {
	public Computer(int price) {
		super(price);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "컴퓨터";
	}
}

class Audio extends Product {
	public Audio(int price) {
		super(price);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "오디오";
	}
}

public class ProductMain {

	// TV Computer Audio
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		TV tv = new TV(200);
		Computer com = new Computer(150);
		Audio audio = new Audio(70);
		b.buy(tv);
		b.buy(com);
		b.show();
		System.out.println("------------------");
		b.buy(audio);
		b.show();
		System.out.println("------------------");
		Buyer b1 = new Buyer(500);
		b1.buy(com);
		b1.show();


	}
}
