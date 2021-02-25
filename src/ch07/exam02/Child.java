package ch07.exam02;

public class Child extends Parent {
	// Field
	// Constructor
	public Child(String firstName) {
		super("김", firstName);
		System.out.println("Child 객체 생성");
	}
	// Method
	public void method2() {
		System.out.println("method2() 실행");
	}
	
}
