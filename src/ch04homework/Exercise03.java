package ch04homework;

public class Exercise03 {

	public static void main(String[] args) {
		int result = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%3==0) {
				result += i;
			}
		}
		System.out.println("3의 배수의 합 : " + result);

	}

}
