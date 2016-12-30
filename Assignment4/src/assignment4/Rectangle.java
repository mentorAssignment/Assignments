package assignment4;

public class Rectangle implements Shape{
	float length, breadth;
	
	//method to calculate area of rectangle
	public float calculateArea(){
		length =5;
		breadth = 2;
		return (length*breadth);
	}
	
	//method to display area of rectangle
	public void display(){
		
		float area = calculateArea();
		System.out.println("Area of Rectangle is : "+area);
		
	}
	
}