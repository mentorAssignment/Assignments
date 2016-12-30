class Account
{
	private int accno;
	private String name;
	private static double balance;
	Account(int accno,String name,double balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	public static double getBalance() {
		return balance;
	}
	public double withdraw(double amount)throws InsufficientBalanceException
	{
		if(balance>1000 && amount<balance)
		{balance-=amount;
		return balance;
		}
		else
			throw new InsufficientBalanceException(); 
	}
	public double deposit(double amount)
	{
		balance+=amount;
		return balance;
	}
	public String toString()
	{return ("Name:"+name+"\nAccount number:"+accno+"\nBalance:"+balance);}
}
 class InsufficientBalanceException extends Exception {
	static final long serialVersionUID=1l;
	
	public String toString()
	{return "Insufficient Balance. Cannot withdraw!! ";}
}
class ExceptionHandling
{
	public static void main(String ar[]) throws InsufficientBalanceException
	{
		Account newAcc=new Account(101,"Pritha",45000);
		double bal=Account.getBalance();
		bal=newAcc.deposit(2000);
		bal=newAcc.withdraw(23000);
		System.out.println(newAcc);
		//bal=newAcc.withdraw(25000);
		System.out.println(newAcc);
	}
}

