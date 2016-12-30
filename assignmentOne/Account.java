package assignmentOne;

public class Account {
	   private double balance;
	   // constructor used to set the balance amount
	   public Account(int balance){
		   this.balance = balance;
	   }
	   private int number;
	   
	   // method to transact the amount from available balance
	   public void withdraw(double amount) throws InsufficientBalanceExceptions {
	      if(amount > balance) {
	         throw new InsufficientBalanceExceptions(amount-balance);
	      }else {
	    	  /// updating the balance after transaction
	    	  balance-=amount;
	    	  System.out.println("Available Balance is: "+ balance);
	      }
	   }
	   
	   // method to get the available balance
	   public double getBalance() {
	      return balance;
	   }
}