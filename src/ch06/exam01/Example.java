package ch06.exam01;

public class Example {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = s1;
		
		if(s1 == s2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}

	}

}
