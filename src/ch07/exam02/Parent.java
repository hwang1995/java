package ch07.exam02;

public class Parent {
	// Field
	public String lastName; // 성
	public String firstName; // 이름
	
	// Constructor
	public Parent(String lastName, String firstName) {
		System.out.println("Parent 객체 생성");
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	// Method
	public void method1() {
		System.out.println("method1() 실행");
	}

}
