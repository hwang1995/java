package ch05;

import java.util.Arrays;

public class Exam09 {

	public static void main(String[] args) {
		int[][] scores = {
			{10, 20},
			{15, 25, 35},
			{45, 55, 65, 75}
		};
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[2].length);
		// ================== //
		int result = 0;
		int count = 0;
		for(int[] i : scores) {
			for(int k : i) {
				result += k;
				count++;
			}

		}
		System.out.println("avg : " + (double) result / count);
	}
	
	

}
