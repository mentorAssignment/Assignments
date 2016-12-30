package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment6.InsufficientBalanceException;
import assignment6.Main;
import assignment6.NegativeNumberException;

public class TestCase {

	@Test
	
	public void test() throws NegativeNumberException{
		
		assertEquals(5,Main.findSqrRoot(25));
		
		assertEquals(5,Main.findSqrRoot(-25));
		
	}
	
	@Test
	public void test2() throws InsufficientBalanceException{
		assertEquals(9000,Main.withdrawal(1000));
		assertEquals(9000,Main.withdrawal(1000000));
	}
}
