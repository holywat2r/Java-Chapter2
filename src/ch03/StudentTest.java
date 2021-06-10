package ch03;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(); // int num 처럼 선언하듯이 class 선언(크기는 멤버 변수 사이즈 만큼으로 예상)
											// 데이터 타입  변수 이름(참조 변수) = new 생성자(); 즉 student하나를 생성하라.
											// 클래스는 하나지만 이 클래스 하나로 여러명의 학생을 생성 할 수 있다. 이렇게 생성되는 객체는 인스턴스라고 부른다.
											// 클래스를 기반으로 여러개의 인스턴스가 생성이 된다.
		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentId = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
