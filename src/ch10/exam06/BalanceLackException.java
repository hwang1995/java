package ch10.exam06;

public class BalanceLackException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BalanceLackException () {
		System.out.println("잔고가 부족합니다.");
		
	}
	
	public BalanceLackException (String message) {
		super(message);
	}

}
