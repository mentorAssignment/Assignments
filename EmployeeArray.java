
class Employee
{
	private int employee_id;
	private String employee_name;
	private String department;
	static int count=0;
	Employee(int id,String name,String dept)
	{count++;
	employee_id=id;
	employee_name=name;
	department=dept;
	}
	public int getCount()
	{System.out.println("Number of employee objects:"+count);
	return count;}
	public String toString()
	{
		return (employee_id+"|"+employee_name+"|"+department);
	}
}
public class EmployeeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=4; int i=0;
		Employee emp[]=new Employee[5];
		for(i=0;i<emp.length;i++)
		{
			emp[i]=new Employee(id++,"abc","Engineering");
		}
		emp[--i].getCount();
		for(i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		
	}

}
