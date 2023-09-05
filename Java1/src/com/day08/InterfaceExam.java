package com.day08;

interface PhoneInterface{
	final int TIMEOUT=10000;
	void sendCall();
	void receiveCall();
	default void printLogo() { // Default Method Java 1.8 버전부터 사용 가능
		System.out.println("*** Phone ***");
	}
}

interface MobileInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface extends PhoneInterface{
	void play();
	void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x*y;
	}
}

//class PDA implements PhoneInterface{ // class로 interface를 상속받을때는 implements
//	
//}

public class InterfaceExam extends PDA implements MobileInterface, MP3Interface{ // Add해서 Override 해줘야함. 다중으로도 interface 사용 가능
	public static void main(String[] args) {
	 InterfaceExam ex = new InterfaceExam();
	 System.out.println("3*5=" +ex.calculate(3,5));
	 ex.printLogo();
	 ex.sendCall();
	 ex.receiveCall();
	 ex.sendSMS();
	 ex.receiveSMS();
	 ex.play();
	 ex.stop();
	}

	@Override
	public void sendCall() {
		System.out.println("sendCall");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("receieveCall");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("sendSMS");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("receieveSMS");
		
	}

	@Override
	public void play() {
		System.out.println("play");
		
	}

	@Override
	public void stop() {
		System.out.println("stop");
		
	}

}
