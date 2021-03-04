package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		/*Integer var1 = new Integer(500);
		Integer var2 = new Integer(500);*/
		
		/*Integer var1 = 500; -> false
		Integer var2 = 500;   -> true  */
		
		Integer var1 = 10;
		Integer var2 = 10;
		
		
		System.out.println(var1 == var2); // 주소 값 비교, false
		System.out.println(var1.equals(var2)); // 값만 비교한다면 true
		
		

	}

}
