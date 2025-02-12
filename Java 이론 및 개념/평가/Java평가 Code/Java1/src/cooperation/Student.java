package cooperation;

public class Student {
	public String studentName; // 학생명
	public int grade; // 학년
	public int money; // 학생이 가지고 있는 돈

	// 생성자 생성
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// 버스 타다
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}

	// 지하철 타다
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}

	public void showInfo() { // 학생 출력
		System.out.println(studentName + " 님의 남은 돈은 " + money + "원 입니다.");
	}
}
