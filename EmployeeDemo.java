

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


class Employee
{
int Salary =40000;
public int calculateSalary()//this method calculates employee's salary.
{
	
	return Salary;
}
}
class Manager extends Employee
{
	int allowance =10000;
	@Override
	public int calculateSalary()
	{
		
		return (Salary+allowance);
	}
	
}
class SlaesManager extends Employee
{
	int commission =15000;
	@Override
	public int calculateSalary()
	{
	
		return Salary+commission;
	}
	
}
class EmployeeDemo
{
	public static void main(String arga[])
	{
		Employee E = new Employee();
		Employee E1 = new Manager();
		Employee E2 = new SlaesManager ();
		
		System.out.println("Employee's Salary is:"+E.calculateSalary());
		System.out.println("Manager's Salary is:"+E1.calculateSalary());
	    System.out.println("Sales Manager's Salary is:"+E2.calculateSalary());
	    
	    JUnitCore junit = new JUnitCore();
	    Result result = junit.run(EmployeeTest.class);
		
	}
}

