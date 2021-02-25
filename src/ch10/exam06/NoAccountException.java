package ch10.exam06;

public class NoAccountException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -33313013847135078L;
	public NoAccountException() {
	}
	public NoAccountException(String message) {
		super(message);
	}

}
