package assignment3;

public class Manager extends Employee{
	float allowance;
	
	//method to display salary
	public void display(float dis){
		float manager_salary = calculateSalary(dis);
		System.out.println("Salary of Manger is : Rs "+manager_salary);
		
	}
	
	//method to calculate salary of manager
	@Override
	float calculateSalary(float var) {
		
		allowance = var;
		float manager_salary = salary + allowance;
		return manager_salary;
	}
	
}