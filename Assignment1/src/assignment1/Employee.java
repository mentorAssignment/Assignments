package assignment1;

public class Employee{
    int employee_code;
    String employee_name;
    float employee_salary;
    String employee_address;
    

    //Method to set value of class members
    public void set_employee_code(int ec){
        this.employee_code=ec;
    }
    
  //Method to set value of class members
    public void set_employee_name(String en){
        this.employee_name=en;
    }
  //Method to set value of class members
    public void set_employee_salary(float es){
        this.employee_salary=es;
    }
    
  //Method to set value of class members
    public void set_employee_address(String ea){
        this.employee_address=ea;
    }
    
    public int get_employee_code(){
        return employee_code;
    }
    public String get_employee_name(){
        return employee_name;
    }
    public float get_employee_salary(){
        return employee_salary;
    }
    public String get_employee_address(){
        return employee_address;
    }
    
    //Overridden equals method of assignment 5th
    public boolean equals(Employee obj) {
    	if(this.employee_code == obj.employee_code){
    		return true;
    	}else{
    	return false;
    	}
    }
    
  //Overridden toString method of assignment 5th
    public String toString() {
    	
		return employee_address;
    	
    }
}