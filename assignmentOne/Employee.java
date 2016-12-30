package assignmentOne;

class Employee{
	
	//	private members of the class Employee as information
	private String employeeName;
	private int employeeId;
	private String company;
	private int extensionNumber;
	private String employeeDepartment;
	private String employeeDesignation;
	
	//	constructor
	Employee() {
		super();
	}

	// parametarised constructor to set the values while instantiating object
	public Employee(String employeeName, int employeeId, String company,
			int extensionNumber, String employeeDepartment,
			String employeeDesignation) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.company = company;
		this.extensionNumber = extensionNumber;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
	}

	// setter and getter methods for data members of employee
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setExtensionNumber(int extensionNumber) {
		this.extensionNumber = extensionNumber;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getCompany() {
		return company;
	}

	public int getExtensionNumber() {
		return extensionNumber;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	
	//	display method to print the information of the employee
	public void displayEmployeeData(Employee emp){
		System.out.println("Employee Details are: ");
		System.out.println("Employee Name : " + emp.getEmployeeName());
		System.out.println("Employee Id   : " + emp.getEmployeeId());
		System.out.println("Company Name  : " + emp.getCompany());
		System.out.println("Extension No. : " + emp.getExtensionNumber());
		System.out.println("Department    : " + emp.getEmployeeDepartment());
		System.out.println("Designation   : " + emp.getEmployeeDesignation());
		System.out.println();
	}
	
	public static void main(String[] args) {
//		Creating objects of Employee class
		
			Employee employee = new Employee("Rohan Naidu", 17186, "Cybage Softwares Pvt. Ltd.", 8430, "Engineering", "Trainee Software Engineer");
			
			Employee employee1 = new Employee();
			employee1.setEmployeeName("Aditya");
			employee1.setEmployeeId(17168);
			employee1.setCompany("TCS");
			employee1.setExtensionNumber(7345);
			employee1.setEmployeeDepartment("Engineering");
			employee1.setEmployeeDesignation("Trainee Software Engineer");
			
			employee.displayEmployeeData(employee);
			employee1.displayEmployeeData(employee1);
	}
}
