package ch06.exam05;

public class Korean {
	// Field
	// 이름이나 주민등록번호는 생성자를 생성할때 부여하는것이 합당
	String nation = "한국";
	String name;
	String ssn;
	int age;
	
	// Constructor Overloading
	Korean(){
		
	}
	
	Korean(String name){
		this.name = name;
	}
	
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	
	Korean(String name, int age, String ssn){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		
	}
	

}
