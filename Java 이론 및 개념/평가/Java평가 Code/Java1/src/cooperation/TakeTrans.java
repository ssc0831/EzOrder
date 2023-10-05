package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		// 두 명의 학생을 생성
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);

		// 버스 생성
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();

		// 지하철 생성
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();

		// 토마스 버스타다
		studentTomas.takeBus(bus100);
		// 토마스 정보 출력
		studentTomas.showInfo();
		// 버스 정보 출력
		bus100.showInfo();

	}
}
