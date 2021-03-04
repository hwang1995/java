package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		
		// 특정 위치의 문자 1개만 얻기 위한다면
		char sex = ssn.charAt(7);
		if(sex == '1' || sex == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// 문자열 잘라내기 : 방법 1
		
		String first = ssn.substring(0, 6);
		String second = ssn.substring(7);
		System.out.println(first);
		System.out.println(second);
		
		// 문자열 잘라내기 : 방법 2 "-" 구분자를 이용해서 부분 문자열을 가져오기
		String[] parts = ssn.split("-");
		for(String s : parts) {
			System.out.println(s);
		}
		
		// 문자열 분리하기 : 방법 3
		System.out.println("문자열 나누");
		StringTokenizer st = new StringTokenizer(ssn, "-");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		
		
		// 문자열 포함 여부 : 방법 1
		String content = "이것은 자바 책입니다.";
		System.out.println(content.contains("자바"));
		
		// 문자열 포함 여부 : 방법 2
		int index = content.indexOf("자바");
		if(index != -1) {
			System.out.println("자바 관련 책이군요");
		} else {
			System.out.println("자바 관련 책이 아니군요");
		}
		
		
		
		// 문자열의 길이
		int length = content.length();
		System.out.println(length);

		// 문자열 바꾸기
		String modifiedContent = content.replace("자바", "Java");
		System.out.println(modifiedContent);
	}

}
