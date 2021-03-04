package ch11.exam04;

import java.lang.reflect.Constructor;

public class Example {

	public static void main(String[] args) {
		Class<A> var1 = A.class;
		Constructor[] constructors = var1.getDeclaredConstructors();
		for (int i = 0; i < constructors.length; i++) {
			System.out.println(constructors[i]);
		}
		
		

	}

}
