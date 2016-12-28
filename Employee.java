package assignmentOne;

class Employee{
	public String employeeName;
	public int employeeId;
	public String company;
	public int extensionNumber;
	public String employeeDepartment;
	public String employeeDesignation;
	
	Employee(String name,int eid, String company, int ext, String dep, String des){
		
		employeeName=name;
		employeeId=eid;
		this.company=company;
		extensionNumber=ext;
		employeeDepartment=dep;
		employeeDesignation=des;
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
}
