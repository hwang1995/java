package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		Account account = new Account();
		String ano = null;
		try {
			account.deposit(ano, 10000);
		} catch(NoAccountException e) {
			System.out.println(e.getMessage());
			
		}
		ano = "111-222-333";
		try {
			account.withdraw(ano, 1000);
			System.out.println("===========");
			account.withdraw(ano, 1000000);
			System.out.println("출금 성공 1");
		} catch (NoAccountException | BalanceLackException e) {
			System.out.println(e.getMessage());
		}

	}

}
