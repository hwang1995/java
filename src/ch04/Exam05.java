package ch04;

public class Exam05 {

	public static void main(String[] args) {
		// 주사위를 던져 나오는 수 얻기(1~6)
		double temp = Math.random() ;
		System.out.println(temp); //[0,1) 실수
		System.out.println(temp * 6); // [0, 6) 실수
		System.out.println((int) (temp * 6)); // 0~5
		System.out.println((int) (temp * 6) + 1); // 1~6
		
		int value = (int) (temp * 6) + 1;
		if(value % 2 == 0) {
			System.out.println("짝수가 나왔다.");
		} else {
			System.out.println("홀수가 나왔다.");
		}

	}

}
