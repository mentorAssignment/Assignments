package assignment6;
/**
 * 
 * @author pratikpate
 *
 */
//User defined Exception for Invalid input
public class InsufficientBalanceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Insufficient Balance In account");
}

}
