//abstract class employee having abstract method for calculating salary
abstract class Employee{
	public int salary=25000;
	abstract public int calcuSalary();
}
//Class Manager extends employee class and overrides method of employee class
class Manager extends Employee{

	public int allowance=5000;
	@Override
	public int calcuSalary() {
		return salary=allowance+salary;
		
	}
	
}
//class salesManager extends employee and override method of employee
class SalesManager extends Employee{

	public int commission=10000;
	@Override
	public int calcuSalary() {
		// TODO Auto-generated method stub
		return salary=commission+salary;
	}
	
	
	public static void main(String[] args) {
		
		Employee e=new Manager();//e is the object of base class employee which is extend by manager 
		System.out.println(e.calcuSalary());
		e=new SalesManager();//e is the object of base class employee which is extend by salesManager 
		System.out.println(e.calcuSalary());
	}
}
