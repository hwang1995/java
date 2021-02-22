package ch06.exam12;

public class Calculator {
	// Field
	// 이 필드는 객체마다 존재하나? 공통적으로 사용 가능한가?
	static double pi = 3.14159;
	int memory;
	
	// Constructor
	
	// Method
	// 이 메소드는 객체와는 상관 있는가? 상관 없는가?
	static void plus(int x, int y) {
		int result = x+y;
		System.out.println(result);
	}
	
	

}
