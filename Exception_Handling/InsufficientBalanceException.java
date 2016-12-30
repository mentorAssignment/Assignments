package ExceptionHandling;

public class InsufficientBalanceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String toString(){
		return "Balance is Insufficient";
	}

}

