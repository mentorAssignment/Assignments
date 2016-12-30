package testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import assignment2.User1;
import utility.Calc;

public class TestCase {
	User1 u;
	
	@Before
	public void initial(){
		u = new User1();
		u.user();
		
		
	}
	
	@Test
	public void test(){
	assertEquals(7.071068,Calc.findRoot(50));
		
	}
	

}
