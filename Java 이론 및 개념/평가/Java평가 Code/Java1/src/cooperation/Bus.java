package cooperation;

public class Bus {
	int busNumber; // 버스 번호
	int passengerCount; // 버스 승객수
	int money; // 버스 수입

	// 생성자 생성
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 승객 탑승
	public void take(int money) {
		this.money += money; // 버스 수입 증가
		passengerCount++;
	}

	// 버스 정보 출력
	public void showInfo() {
		System.out.println(busNumber + "번의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
}