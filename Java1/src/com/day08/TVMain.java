package com.day08;

class TV1{
	private int size;
	public TV1(int size) {
		this.size=size;
	}
	
	//getter
	public int getSize() {
		return size;
	}
}


class ColorTV {
	private int size;
	private int color;

	public ColorTV(int size, int color) {
		this.size = size;
		this.color = color;
	}
	
	public void print() {
		System.out.println(size +"인치 "+ color+"컬러 입니다.");
	}
	
	
}

class IPTV extends ColorTV {
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	@Override
	public void print() {
		System.out.print("나의TV는 "+ip+"주소의 ");
		super.print();
		
	}

}

public class TVMain {
	public static void main(String[] args) {
		ColorTV mytv = new ColorTV(32, 1024);
		mytv.print(); // 32 inch, 1024 Color

		ColorTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.print(); // 나의TV 는 192.1.1.2 주소의 32인치 2048 Color
	}
}
