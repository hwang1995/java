package ch08.exam03;

public class Car implements Shipable, Flyable{

	@Override
	public void takeOff() {
		System.out.println("이륙합니다.");
		
	}

	@Override
	public void land() {
		System.out.println("착륙합니다.");
		
	}

	@Override
	public void fly() {
		System.out.println("하늘을 나는 중입니다.");
		
	}

	@Override
	public void sailing() {
		System.out.println("항해 중입니다.");
		
	}

	@Override
	public void anchor() {
		System.out.println("정박 중입니다.");
		
	}

}
