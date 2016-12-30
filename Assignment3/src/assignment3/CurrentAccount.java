package assignment3;

public class CurrentAccount extends BankAccount{
	float current_account_intrest;
	
	//method to calculate rate of interest for current account
	@Override
	public float calculateRateOfInterest(float principle, float rate, float time) {
		
		return ((principle*rate*time)/100);
	}
	
	//method to display calculated rate of interest for saving account
	@Override
	public
	void display(float principle, float rate, float time){
		current_account_intrest = calculateRateOfInterest(principle, rate, time);
		System.out.println("Rate of Interst for Current Account is : "+current_account_intrest);
	}
	
}
