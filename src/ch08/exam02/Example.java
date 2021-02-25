package ch08.exam02;

public class Example {

	public static void main(String[] args) {
		// Audio라는 객체를 RemoteControl이라는 인터페이스로 사용하겠다라고 해석해라.
		RemoteControl rc = new Audio();
		// RemoteContorl의 인터페이스 변수 rc를 이용해 텔레비전 객체를 사용하려 한다.
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		// 내가 인터페이스의 사용법을 안다면 뒤에 Audio가 오든, 
		// Television이 오든 사용할 수 있다.

	}

}
