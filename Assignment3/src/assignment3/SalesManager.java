package assignment3;

public class SalesManager extends Manager{
	float commission;
	
	//method to display salary of sales manager
	public void display(float dis){
		float sales_manager_salary = calculateSalary(dis);
		System.out.println("Salary of Salesmanager is : Rs "+sales_manager_salary);
		
	}
	
	//method to calculate salary of sales manager 
	@Override
	float calculateSalary(float var) {
		
		commission = var;
		float sales_manager_salary = salary + commission;
		return sales_manager_salary;
	}
	
}
