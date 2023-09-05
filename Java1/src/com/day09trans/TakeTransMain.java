package com.day09trans;

public class TakeTransMain {


	public static void main(String[] args) {
	 Person p1 = new Person("홍길동", 15000);
	 Person p2 = new Person("이순신", 10000);
	 
	 Bus bus = new Bus(100);
	 SubWay subwayGreen = new SubWay("2호선");
	 Taxi taxi = new Taxi(1234);
	 
	 //홍길동이 버스를 타다.
	 p1.take(bus,1000);
	 //홍길동이 택시를 타다.
	 p1.take(taxi,4500);
	 p1.showInfo();
	 System.out.println("-------------------------------------");
	 p2.take(subwayGreen, 1500);
	 p2.take(taxi,5500);
	 p2.showInfo();
	 System.out.println("-------------------------------------");
	 subwayGreen.showInfo();
	 System.out.println("-------------------------------------");
	 bus.showInfo();
	 System.out.println("-------------------------------------");
	 taxi.showInfo();
	}

}
