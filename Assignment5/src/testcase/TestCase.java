package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment5.CommandlineMain;

public class TestCase {
	CommandlineMain cm = new CommandlineMain();
	@Test
	public void test(){
		int testa[]={1,2,4,5,5,6,8};
		int testb[]={8,5,2,1,4,5,6};
		
		//test for sort method 
		assertArrayEquals(testa,CommandlineMain.sort(testb));
	}

}
