package ch03;

public class Exam02 {

	public static void main(String[] args) {
		// 연산의 결과가 boolean(true, false)으로 나오는 연산 기호
		int var1 = 2;
		int var2 = 3;
		boolean var3 = var1 == var2; // f
		boolean var4 = var1 != var2; // t
		boolean var5 = var1 > var2;// f
		boolean var6 = var1 >= var2;// f
		boolean var7 = var1 < var2;// t
		boolean var8 = var1 <= var2; // t
		boolean var9 = !(var1 == var2); // t
		boolean var10 = ((var1 == var2) || (var1 < var2)); // t
		boolean var11 = ((var1 == var2) && (var1 < var2)); // f
		System.out.println(var11);
		
	}

}
