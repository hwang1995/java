package ch05;

import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		// 배열을 생성
		String[] arr1 = new String[3];
		
		// 배열 항목의 값을 읽고 출력하기
		for(String i : arr1) {
			System.out.println(i);
		}
		
		// 배열 항목의 값을 변경
		arr1[0] = "홍길동";
		arr1[1] = "홍자바";
		arr1[2] = "홍개발";
		for(String i : arr1) {
			System.out.println(i);
		}
		
		// 배열 항목 비교
		System.out.println(arr1[0].equals("홍길동"));
		System.out.println(!arr1[0].equals("홍길동"));
		
	}
	
	

}
