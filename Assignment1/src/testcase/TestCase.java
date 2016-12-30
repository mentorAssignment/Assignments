package testcase;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import assignment1.Date;
import assignment1.Employee;
import assignment1.Greeting;


public class TestCase {
	//Declaring objects
	Employee employee;
	Employee employee2;
	Date date1;
	Date date2;
	Greeting greet;

	@Before
	public void initialization(){
		//Employee class object
		employee = new Employee();
		employee.set_employee_code(17183);
		employee.set_employee_name("Pratik Patel");
		employee.set_employee_address("Viman Nagar");
		employee.set_employee_salary(18000);
		
		employee2 = new Employee();
		employee2.set_employee_code(17120);
		employee2.set_employee_name("Rohan Naidu");
		employee2.set_employee_address("Viman Nagar");
		employee2.set_employee_salary(18000);
		
		//Date class objects
		date1 = new Date();
		date2 = new Date(25,01,1994);
		
		//Greeting class object
		greet =new Greeting();
		greet.display();
		
		System.out.println(employee.equals(employee2));
        System.out.println(employee);
	}
	
	@Test
	public void testEmployee(){
		//test of method get employe_code
		assertEquals(17183, employee.get_employee_code());
		
		//test of method get employe_name
		assertEquals("Pratik Patel", employee.get_employee_name());
		
		//test of method get employe_address
		assertEquals("Viman Nagar", employee.get_employee_address());
		
		//test of method get employe_salary
		assertEquals(18000, employee.get_employee_salary());
		
	}
}
