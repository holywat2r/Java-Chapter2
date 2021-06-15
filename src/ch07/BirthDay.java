package ch07;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	// private로 선언 시 외부에서 접근 불가능 함.
	
	private boolean isValid;
	// boolean의 default값은 false이다.
	
	public int getDay()
	{
		return day;
	}
	public void setDay(int day)
	{
		this.day = day;
		
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12)
		{
			isValid = false;
		}
		else
		{
			isValid = true;
		}
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid)
		{
			System.out.println(year + "년 " + month + "월 " + day +"일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
}
