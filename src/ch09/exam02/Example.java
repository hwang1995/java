package ch09.exam02;

public class Example {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.field = 10;
		b.method();
		System.out.println(b.field);
		
		A.C c = new A.C();
		c.field = 100;
		System.out.println(c.field);
	}

}
