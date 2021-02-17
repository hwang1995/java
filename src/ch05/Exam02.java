package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		int[] scores1 = {90, 85, 95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		// 변수를 선언한 후 값 목록을 제공할 경우 
		int[] scores2 = null;
		scores2 = new int[] {10,20, 30};
		
		// 메소드 호출
		add(scores1);
		add(scores2);
		add(new int[] {100,200,300});
	}
	
	public static  void add(int[] arr) {
		int result = 0;
		System.out.println("값 : " + Arrays.toString(arr));
		for (int i : arr) {
			result += i;
		}
		System.out.println(result);
		
		
	}

}
