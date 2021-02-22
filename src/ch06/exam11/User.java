package ch06.exam11;

public class User {
	// Field -> Instance Field
	String id; // 객체 있어야 사용 가능
	String name;
	String password;
	final static String nation = "한국인"; // 객체 없이도 가능
	
	// Constructor -> 생성자는 클래스의 멤버지만 인스턴스 멤버는 될 수 없다.
	// 생성자는 객체를 생성하기 위한 목적이지, 멤버를 만들기 위함이 아니다.
	
	User(String name){
		this.name = name;
	}
	// Method
	
	void login() {
		System.out.println(name + "님이 로그인합니다.");
	}
	void logout() {
		System.out.println(name + "님이 로그아웃합니다.");
	}
	
	static void info() {
		System.out.println("모든 유저는 한국인입니다.");
	}

}
