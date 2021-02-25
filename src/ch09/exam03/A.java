package ch09.exam03;

public class A {
	public void method(final int x) {
		final int y = 2;
		// x = 10;
		// y = 20;
		// 로컬 클래스에서 클래스의 필드 값을 이용하면 final을 붙여야 한다 (자바 8은 자동으로 붙음)
		
		
		class B {
			// 컴파일러에서 값을 복사 x와 y의 값을
			// ex) int x2 = x; int y2 = y; 
			public void method() {
				// ex) result = x2 + y2;
				int result = x + y;
			}
		}
		
	}
}
