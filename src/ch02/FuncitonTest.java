package ch02;

public class FuncitonTest {
// 함수 구현 예
	public static int addNum(int num1,int num2) // 데이터 타입은 int 고 함수 이름은 addNum 이며 num1과 num2 매개변수를 받아들인다.
	{
		int result;
		result = num1 + num2;
		return result;
		
	} //반환 값이 있는 경우는 데이터 타입을 지정해준다.
	
	public static void sayHello(String greeting)
	{
		System.out.println(greeting);
	}
	// 반환 값이 없으므로 데이터 타입이 void 이다.
	
	public static int calcSum()
	{
		int sum = 0;
		int i;
		
		for (i = 0; i <=100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2); // n1 과 n2를 매개변수로 하는 addNum의 반환값을 total에 넣는다.
		System.out.println(total);
		
		sayHello("안녕하세요");
		
		total = calcSum();
		System.out.println(total);
	}

}
