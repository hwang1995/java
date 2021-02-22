package ch06homework.check_question;

import java.util.Arrays;
import java.util.Scanner;

public class Q20BankApplication {
	private static Q20Account[] accountArray = new Q20Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	static int index  = 0; 
	

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}
	
	private static void createAccount() {

		System.out.print("계좌 번호 : " );
		String ano = scanner.nextLine();
		System.out.print("계좌 주 : " );
		String owner = scanner.nextLine();
		System.out.print("초기 입금액 : " );
		String balance = scanner.nextLine();
	
		Q20Account createAcc = new Q20Account(ano, owner, Integer.parseInt(balance));
		accountArray[index] = createAcc;
		index++;
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
	}
	
	private static void accountList() {
		System.out.println("---------------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("---------------------------------------------------");
		for(int i=0 ; i < index; i++) {
			System.out.print(accountArray[i].getAno() + "\t");
			System.out.print(accountArray[i].getOwner() + "\t");
			System.out.print(accountArray[i].getBalance() + "\t");
			System.out.println();
		}
		
		
		
	}
	
	private static void deposit() {
		System.out.println("---------------------------------------------------");
		System.out.println("예금");
		System.out.println("---------------------------------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		Q20Account result = findAccount(ano);
		if(result != null) {
			System.out.print("예금액: ");
			int balance = Integer.parseInt(scanner.nextLine());
			int getBalance = result.getBalance() + balance;
			result.setBalance(getBalance);
			System.out.println("결과 : 예금이 성공되었습니다.");
		} else {
			System.out.println("결과 : 계좌가 존재하지 않습니다.");
		}
		
	}
	
	private static void withdraw() {
		System.out.println("---------------------------------------------------");
		System.out.println("출금");
		System.out.println("---------------------------------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		Q20Account result = findAccount(ano);
		if(result != null) {
			System.out.print("출금액: ");
			int balance = Integer.parseInt(scanner.nextLine());
			int getBalance = result.getBalance() - balance;
			result.setBalance(getBalance);
			System.out.println("결과 : 출금이 성공되었습니다.");
		} else {
			System.out.println("결과 : 계좌가 존재하지 않습니다.");
		}
		
		
	}
	
	private static Q20Account findAccount(String ano) {
		for(int i =0; i < index; i++) {
			String getAno = accountArray[i].getAno();
			if(getAno.equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
		
	}

}
