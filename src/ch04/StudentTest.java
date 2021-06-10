package ch04;

public class StudentTest {
// 클라이언트 모듈 , Student는 서버 모
	public static void main(String[] args)
	{
		Student studentLee = new Student(); // 기본 생성자가 제공 되므로 이러한 형식으로 생성자 생성이 가능
		System.out.println(studentLee.showStudentInfo());
		// 이 출력으로 알 수 있는 것은 멤버변수는 자동으로 초기화가 됨을 알 수 있다.
		Student studentKim = new Student(123456,"Kim",3);
		
		System.out.println(studentKim.showStudentInfo());
	}
}
