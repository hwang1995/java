package ch06.exam13;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
//		Singleton result1 = new Singleton();
		
		// Factory Method
		Singleton result2 = Singleton.getInstance();
		Singleton result3 = Singleton.getInstance();
		if(result2 == result3) {
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("다른 객체를 참조");
		}
	}

}
