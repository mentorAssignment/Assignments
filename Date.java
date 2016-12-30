
class Date
{
	private int date;
	private int month;
	private int year;
	Date()
	{
		date=1;
		month=1;
		year=2000;
	}
	Date(int date,int month,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		return "Date:"+date+"/"+month+"/"+year;
	}
	public static void main(String ar[])
	{
		Date d=new Date();
		System.out.println(d);
		d=new Date(23,01,1994);
		System.out.println(d);
	}
}

