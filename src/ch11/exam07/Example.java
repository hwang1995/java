package ch11.exam07;

public class Example {

	public static void main(String[] args) {
		// int와 Integer의 차이는 값 타입이나 참조 타입이냐의 차이이다.
		int var1 = 10; // 변수 var1를 선언해서 저장한다.
		Integer var2 = new Integer(10); // 참조 변수
		Integer var3 = 10; // 어떻게 되는가? -> Auto Boxing
		
		double var4 = 3.5;
		Double var5 = new Double(3.5);
		Double var6 = 3.5; // Auto Boxing
		
		Integer var7 = new Integer(10200000);
		int var8 = var7;
		
		Double var10 = new Double(3.5);
		double var11 = var10.doubleValue();
		double var12 = var10;
		System.out.println(var12);
		
		Object[] arr = new Object[5];
		arr[0] = "abc";
		arr[1] = 10; // 객체가 아닌데 어떻게 자동으로 들어가지? Wrapper를 이용해서 번지가 들어간다.
		arr[2] = new Boolean(true); 
	}

}
