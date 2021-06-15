package ch09;

public class Person {

	String name;
	int age;
	
	public Person()
	{
		
		this("이름없음",1);
	}
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}// 생성자에서 다른 생성자를 호출하는 방
	
	public void showPerson()
	{
		System.out.println(name + ", " + age);
	}
	
	public Person getPerson()
	{
		return this;
	}
	public static void main(String[] args)
	{
		Person person = new Person();
	
		person.showPerson();
		System.out.println(person); // 인스턴스의  address
		Person person2 = person.getPerson();
		System.out.println(person2);
	}
}
