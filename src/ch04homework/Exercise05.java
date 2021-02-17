package ch04homework;

public class Exercise05 {

	public static void main(String[] args) {
		// 4x + 5y = 60의 값을 구하라
		for(int i=1; i <= 10; i++) {
			for(int j=1; j <= 10; j++) {
				int result = (4 * i) + (5 * j);
				if (result == 60) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}

}
