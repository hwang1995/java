package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		
		// 올바른 사용 방법 (static으로 만들었을 경우)
		System.out.println(Calculator.pi);
		Calculator.plus(3, 5);
		
		// 잘못된 생성 방법
		Calculator myCalc = new Calculator();
		System.out.println(myCalc.pi);
		myCalc.plus(100, 100);
	}

}
