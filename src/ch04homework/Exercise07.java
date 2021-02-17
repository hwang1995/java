package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("==================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
			System.out.println("==================================");
			System.out.print("선택 > ");
			
			String inputData = scanner.nextLine();
			if(inputData.equals("1")) {
				System.out.print("예금액 > ");
				int depositMoney = Integer.parseInt(scanner.nextLine());
				balance += depositMoney;
			} else if(inputData.equals("2")) {
				System.out.print("출금액 > ");
				int withdrawalMoney = Integer.parseInt(scanner.nextLine());
				balance -= withdrawalMoney;

			} else if(inputData.equals("3")) {
				System.out.println("잔고 > " + balance);
				System.out.println();
			} else if(inputData.equals("4")) {
				System.out.println();
				System.out.println("프로그램 종료");
				run = false;
			}
		}

	}

}
