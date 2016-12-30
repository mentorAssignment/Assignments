package assignment4;

public class Triangle implements Shape{
	float base, height;
	
	//Method to calculate area of circle
	public float calculateArea(){
		base = 8;
		height = 10;
		float a = (base*height)/2;
		return (a);
	}
	
	//Method to display area of circle
	public void display(){
	
		float area = calculateArea();
		System.out.println("Area of Triangle is : "+area);
		
	}
	
}