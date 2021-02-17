package ch05;

public class Exam07 {

	public static void main(String[] args) {
		int[] scores = {90,85,87};
		int sum = 0;
		for(int i : scores) {
			sum += i;
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double) sum / scores.length);
	}
	
	

}
