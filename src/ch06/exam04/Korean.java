package ch06.exam04;

public class Korean {
	// Field
	// 이름이나 주민등록번호는 생성자를 생성할때 부여하는것이 합당
	String nation = "한국";
	String name;
	String ssn;
	
	// Constructor
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	

}
