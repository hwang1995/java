package ch05homework;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i : scores) {
			sum1 += i;
		}
		
		System.out.println("총합 : " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : " + sum2);
		System.out.println();
		

	}

	public static int add(int[] scores) {
		int sum = 0;
		for(int i : scores) {
			sum += i;
		}
		return sum;
	}

}
