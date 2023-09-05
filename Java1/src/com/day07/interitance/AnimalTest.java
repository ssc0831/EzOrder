package com.day07.interitance;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	@Override
	public String toString() {
		return "Human";
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {
	
	public void moveAnimal(Animal animal) {
		animal.move();
		System.out.println(animal);
		if(animal instanceof Human) { // class형이 맞는지 물어볼때 instanceof 사용 p.273
			System.out.println("Human");
		}
		if(animal instanceof Animal) {
			System.out.println("Animal");
		}
		//System.out.println(animal.getClass().getSimpleName());
		
	}
	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
		at.moveAnimal(new Human());
		at.moveAnimal(new Tiger());
		at.moveAnimal(new Eagle());
		System.out.println();
	
		
	}

}