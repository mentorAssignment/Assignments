
abstract class BankAccount {
	private String name, address;
	private int age;int accno;
	
	BankAccount(String nameTemp, String addTemp, int ageTemp, int accnoTemp){
		this.name=nameTemp;
		this.address=addTemp;
		this.age=ageTemp;
		this.accno=accnoTemp;
	}
	public abstract double calculateInterest(double principle, double time);
	
	public int getAccno() {
		return accno;
	}
	public String toString()
	{return ("Name:"+name+"\nAddress:"+address+"\nAge:"+age+"\nAccount number:"+accno);}
}

class Savings extends BankAccount{
	private final double rate = 0.06;
	public double getRate()	{
		return rate;
	}
	
	Savings(String nameTemp, String addTemp, int ageTemp, int accnoTemp) {
		super(nameTemp, addTemp, ageTemp, accnoTemp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateInterest(double principle, double time) {
		return principle * rate * time;
	}
}
	class Current extends BankAccount
	{
		private final double rate=0.02;
		public double getRate(){
			return rate;
		}
		public Current(String nameTemp, String addTemp, int ageTemp, int accnoTemp) {
			super(nameTemp, addTemp, ageTemp, accnoTemp);
			// TODO Auto-generated constructor stub
		}
		public double calculateInterest(double principle, double time) {
			return principle * rate * time;
	}
}

class Inheritance
{
	public static void main(String ar[])
	{
		BankAccount bank=new Savings("Pritha","Kalyaninagar",22,101);
		System.out.println(bank);
		System.out.println("Interest in savings:"+bank.calculateInterest(20000, 3));
		BankAccount bank1=new Current("Suravi","Kalyaninagar",22,103);
		System.out.println(bank1);
		System.out.println("The interest in curent account:"+bank1.calculateInterest(20000, 4));
	}
}
