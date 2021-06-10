package ch05;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo Kim = new UserInfo();
		Kim.userId = "a12345";
		Kim.userPassword = "asjdkgj12345";
		Kim.userName = "Kim";
		Kim.phoneNumber = "01022223333";
		Kim.userAddress = "seoul,korea";
		System.out.println(Kim.showuserInfo());
		
		UserInfo Lee = new UserInfo("b12345","0949590a","Lee");
		System.out.println(Lee.showuserInfo());
	}

}
