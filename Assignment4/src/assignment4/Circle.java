package assignment4;

public class Circle implements Shape{
	float radius;
	
	//method to calculate area of circle
	public float calculateArea(){
		radius = 10;
		return (22/7*radius*radius);
	}
	
	//method to display area of circle
	public void display(){
		
		float area = calculateArea();
		System.out.println("Area of Circle is : "+area);
		
	}
	
}
