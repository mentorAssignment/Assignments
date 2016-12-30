import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


 class Dateinfo {
	int date;
	int month;
	int year;
	Dateinfo(int date)// one parameterized constructor
	{
		this.date= date;
	}
	Dateinfo(int date,int month,int year)// three parameterized constructor
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public Dateinfo display(Dateinfo di)//display the data on the screen
	{
		
		return di;
	}
	public String toString()
	{
		
		return "Date: "+ this.date+"/"+this.month +"/"+this.year;
	}
	
}
 class Date{ // main class
	 public static void main(String args[])
	 {
		 
		 Dateinfo s =new Dateinfo(10);
		 Dateinfo s1= new Dateinfo(8,8,2016);
	
		System.out.println(s.display(s));
		System.out.println(s1.display(s1));
		 JUnitCore junit = new JUnitCore();
		  Result result = junit.run(DateTest.class);
			
	 }
 }

 