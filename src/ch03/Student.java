package ch03;

public class Student {

	public int studentId;
	public String studentName;	
	public String address;
		
	public void showStudentInfo()
	{
			// 메서드 
		System.out.println(studentId + " 학번 학생의 이름은 " + studentName + " 이고 주소는 " + address + "입니다. ");
			
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name)
	{
		studentName = name; // 학생의 이름을 지정하는 메서드
							// name을 받아와서 studentName에 대
	}
		

}
