package assignmentOne;

class EmployeeSalary{
	// so that the inheriting classes can access the salary
	protected int salary;
	public EmployeeSalary(){
		this.salary=36500;
	}
	public int getSalary(){
		return salary;
	}
	public int calculateSalary(){
		return salary;
	}
	
	// main method of EmployeeSalary
	public static void main(String[] args) {
		EmployeeSalary employee = new EmployeeSalary();
		System.out.println("The basic salary for employee is: "+employee.calculateSalary());
		Manager manager = new Manager();
		System.out.println("The total salary of Manager with allowance is: " + manager.calculateSalary());
		SalesManager salesManager = new SalesManager();
		System.out.println("The total salary of Sales Manager with commision is: " + salesManager.calculateSalary());

	}
}

// Manager class inheriting the EmployeeSalary class
class Manager extends EmployeeSalary{
	public int allowance;
	public Manager(){
		this.allowance=1150;
	}
	public int getAllowance(){
		return allowance;
	}
	public int getSalary(){
		return super.getSalary();
	}
	public int calculateSalary(){
		return getSalary()+getAllowance();
	}
}

// SalesManager inheriting the Manager class
class SalesManager extends Manager{
	public int commision;
	
	public SalesManager(){
		this.commision=5500;
	}
	public int getCommision(){
		return commision;
	}
	public int getSalary(){
		return super.getSalary();
	}
	public int calculateSalary(){
		return getSalary()+getCommision();
	}
	
}
