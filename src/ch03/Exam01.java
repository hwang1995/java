package ch03;

public class Exam01 {

	public static void main(String[] args) {
		// 산술 연산(덧셈, 뺄셈, 나눗셈) 의 다양한 형태 
		int var1 = 1;
		var1 = var1 + 1;
		var1 += 1;
		var1++;
		System.out.println(var1);
		
		int var2 = 10;
		var2 = var2 - 1;
		var2 -= 1;
		var2--;
		
		int var3 = 16;
		var3 = var3/ 2;
		var3 /= 2;
		
		// 자바는 정수 / (나눗셈)의 결과는 정수입니다.
		/**
		 * 실수 나눗셈의 결과는 실수입니다.
		 */
		int var4 = 11;
		int var5 = 4;
		System.out.println(var4 / var5);
		double var6 = (double) var4 / var5;
		System.out.println(var6);
		// 나머지 구하기
		System.out.println(var4 % var5);
		

		

	}

}
