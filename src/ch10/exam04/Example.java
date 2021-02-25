package ch10.exam04;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[3];
		
		while(true) {
			try {
				System.out.print("저장 위치 : ");
				int index = Integer.parseInt(scanner.nextLine());
				System.out.print("저장할 값 : ");
				arr[index] = scanner.nextLine();
				} catch(NumberFormatException e) {
					System.out.println("숫자만 가능합니다.");
				} catch(Exception e) {
					System.out.println("0~" + (arr.length - 1) + "까지 가능하다.");
				}
			
				finally {
					System.out.println("다시 입력하세요.");
				}
		}
		

	}

}
