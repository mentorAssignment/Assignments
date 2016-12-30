package testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import assignment3.CurrentAccount;
import assignment3.Manager;
import assignment3.SalesManager;
import assignment3.SavingAccount;

public class TestCase {
	
	Manager mn; 
	SalesManager sm; 
	SavingAccount SA;
	CurrentAccount CA;
	
	@Before
	public void initial(){
		
		//for Employee Salary
		mn = new Manager();
		sm = new SalesManager();
		mn.display(5000);
		sm.display(2500);
		
		//For BankAccount
		 SA = new SavingAccount();
		CA = new CurrentAccount();
		
		SA.display(45000, 4, 4);
		CA.display(50000, 2, 1);
	}
	
	@Test
	public void test(){
		
		assertEquals(7200.0, SA.calculateRateOfInterest(45000, 4, 4));
		assertEquals(1000.0, CA.calculateRateOfInterest(50000, 2, 1));
		
	}

}
