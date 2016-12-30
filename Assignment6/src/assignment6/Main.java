package assignment6;

public class Main {
	/**
	 * method to find square root of a positive number
	 * @param number
	 * @return
	 * @throws NegativeNumberException
	 */
	public static  float findSqrRoot(float number) throws NegativeNumberException{
		if(number < 0){
			throw new NegativeNumberException();
		}else{
		float square_root = (float) Math.sqrt(number);
		return square_root;
		}
	}

	
	/**
	 * method to withdrawal of money
	 * @param Amount
	 * @return
	 * @throws InsufficientBalanceException
	 */
	public static float withdrawal(float Amount) throws InsufficientBalanceException{
		float Balance = 10000;
		if(Amount > Balance){
			throw new InsufficientBalanceException();
		}else{
			Balance = Balance - Amount;
			return Balance;
		}
	}
	public static void main(String[] args) throws NegativeNumberException, InsufficientBalanceException {
			/*float sqrroot = findSqrRoot(-100);
			System.out.println("SquareRoot is : "+sqrroot);
			
			float balance = insufficientBalance(100000);
			System.out.println("Success ! Cleared Balance is :"+balance);*/
			
	}
}
 
