package assignment3;

public class SavingAccount extends BankAccount{
	float saving_account_intrest;
	
	//method to calculate rate of interest for saving account
	@Override
	public float calculateRateOfInterest(float principle, float rate, float time) {
		
		return ((principle*rate*time)/100);
	}
	//method to display calculated rate of interest
	@Override
	public
	void display(float principle, float rate, float time){
		saving_account_intrest = calculateRateOfInterest(principle, rate, time);
		System.out.println("Rate of Interst for Savings Account is : "+saving_account_intrest);
	}
	
}