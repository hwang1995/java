package ch11.exam05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class String01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// byte 배열을 문자열로 바꾸고 싶다면?
		byte[] arr1 = {65, 66, 67};
		String str1 = new String(arr1);
		System.out.println(str1);
		
		// String -> byte[]
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2));
		
		// String => byte (EUC-KR, UTF-8)
		String str3 = "가나다";
		byte[] arr31 = str3.getBytes("EUC-KR"); // 2bytes 로 인코딩
		byte[] arr32 = str3.getBytes("UTF-8"); // 3bytes 로 인코딩
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));
		
		// byte (EUC-KR, UTF-8) => String
		String str4 = new String(arr31, "EUC-KR"); // EUC-KR
		String str5 = new String(arr32, "UTF-8"); // UTF-8
		System.out.println(str4);
		System.out.println(str5);
		
	}

}
