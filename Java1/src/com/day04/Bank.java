package com.day04;

public class Bank {
	
	String name; //이름
	int money; //잔액
	
	
/*
 * 한 계좌는 이름(name), 잔액(money)
 * 입금(inputMoney)
 * 출금(outMoney)
 * 잔액확인(getMoney)
 */
	public void name() {
		
	}
	
	public void money () {
		
	}
	
	public void inputMoney(int money) {
		this.money += money;
	}
	
	public void outMoney(int money) {
		if(money > this.money) {
			System.out.println(name+"님의 잔액이 부족합니다.");
			return; // 종료의 의미, if~else로 사용해도 가능
		}
		this.money -=money;
	}
	
	/*
	 *  if(money > this.money) {
			System.out.println(name+"님의 잔액이 부족합니다.");
			}
		else this.money -=money;
	 */	
	
	public void getMoney() {
		System.out.println(name+"님의 잔액은 "+money+"원 입니다.");
	}

	public Bank() {
		
	}
	
	public Bank(String name) {
		this.name=name;
	}
	
	public Bank(String name, int money) {
		this.name=name;
		this.money=money;
	}
	
	public static void main(String[] args) {
	Bank b1=new Bank();
	b1.name="홍길동";
	b1.inputMoney(5000);
	b1.getMoney();
	b1.outMoney(7000);
	b1.getMoney();
	
	//b2 객체생성, 이름 : 강감찬, 4000원 입금 3000원 출금, 잔액확인
	Bank b2=new Bank();
	b2.name="강감찬";
	b2.inputMoney(4000);
	b2.getMoney();
	b2.outMoney(3000);
	b2.getMoney();
	
	Bank b3 = new Bank("이순신");
	b3.getMoney();
	Bank b4 = new Bank("홍길순", 5000);
	b4.getMoney();
	
	
	}
}
