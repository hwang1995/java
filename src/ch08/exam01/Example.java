package ch08.exam01;

public class Example {
	// RemoteControl이 클래스라면 객체는 물론, 상속한 자식 객체는 사용 가능
	// 인터페이스로 사용되면 인터페이스로 다형성 보장
	public static void method(RemoteControl rc) {
		// 인터페이스의 설명대로만 사용하는 코드
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	};
	
	
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		method(rc);
		rc = new Audio();
		method(rc);
	}

}
