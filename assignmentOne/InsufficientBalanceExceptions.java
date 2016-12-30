package assignmentOne;

public class InsufficientBalanceExceptions extends Exception {
   private double amount;
  
   public InsufficientBalanceExceptions(double amount) {
	   this.amount = amount;
       System.out.println("Sorry!!! You dont have enough balance...");
   }
	   
   public double getAmount() {
      return amount;
   }
}
