package com.day11;

// Runnable 사용
class Saram2 implements Runnable {
	private String name;

	public Saram2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(name + "이 " + i + "번째 말한다.");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadSaram02 {

	public static void main(String[] args) {
		Saram2 s1 = new Saram2("홍길동");
		Saram2 s2 = new Saram2("이순신");
		Saram2 s3 = new Saram2("강감찬");

		new Thread(s1).start();
		new Thread(s2).start();
		new Thread(s3).start();
		// Thread t3 = new Thread(s3);
		// t3.start(); 와 같음
	}

}