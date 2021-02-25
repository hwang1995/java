package ch08.exam02;

public class Audio implements RemoteControl{
	// Field
	private int volume;
	
	// Constructor
	
	// Method
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		System.out.println("Audio의 볼륨을 " + this.volume + "으로 설정합니다.");
		
	}

}
