package assignmentOne;
// Exception Example
public class ExceptionMain {
	public static void main(String[] args){
		 Account c = new Account(1000);      
	      try {
	         c.withdraw(500);
	         c.withdraw(400);
	         // throws exception as balance is less
	         c.withdraw(300);
	      }catch(InsufficientBalanceExceptions e) {
	         System.out.println("You need " + e.getAmount());
	         e.printStackTrace();
	      }

	}
}