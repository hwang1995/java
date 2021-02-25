package ch08.exam01;

public interface RemoteControl {
	// 상수는 구현 객체 (Television , Audio)에 어떤 값을 제한할 목적이나 ,어떤 값을 참조해서 이용하고 싶다면 상수로 인터페이스 선언하고 나머지는 이용하고 싶어
	String COMPANY = "삼성";
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	// 메소드 (객체 사용 설명)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
