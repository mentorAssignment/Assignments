package ExceptionHandling;

public class Account {
	
	public void withdraw(int n) throws Exception{
		
		if(n>30000)
			throw new InsufficientBalanceException();
		else
			System.out.println("withdrawal done..");
		
	}
	
	public static void main(String[] args) throws Exception{
		Account acc=new Account();
		acc.withdraw(31000);
	}

}
