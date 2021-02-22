package ch06homework.check_question;

public class Account {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		if(!(balance < 0 || balance > MAX_BALANCE)) {
			this.balance = balance;
		}
	}
	
	

}
