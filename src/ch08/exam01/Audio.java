package ch08.exam01;

public class Audio implements RemoteControl{

	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	public void setVolume(int volume) {
		System.out.println("Audio의 볼륨을 " + volume + "으로 설정합니다.");
		
	}

}
