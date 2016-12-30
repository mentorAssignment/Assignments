package assignmentOne;
//	Abstraction Example.

// creating abstract class shape
abstract class Shape{
	// abstract method
	abstract public double calculateArea();
}
class Rectangle extends Shape{
	double side1, side2;
	//constructor
	Rectangle(double s1, double s2){
		this.side1=s1;
		this.side2=s2;
	}
	//overriding calculateArea of the abstract class
	public double calculateArea() {
		return side1*side2;
	}
}

class Circle extends Shape{
	double pi=3.14;
	int radius;
	// constructor
	Circle(int rad){
		this.radius=rad;
	}
	@Override
	public double calculateArea() {
		return radius*radius*pi;
	}
}

class Triangle extends Shape{
	double height, base;
	//constructor
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	@Override
	public double calculateArea() {
		return 0.5*base*height;
	}
}

// class consisting main method
class ShapeDemo{
	public static void main(String[] args) {
		Shape shape=new Rectangle(5,4);
		System.out.println("Area of Rectangle is: "+ shape.calculateArea()+"\n");
		shape=new Circle(8);
		System.out.println("Area of Circle is: "+ shape.calculateArea()+"\n");
		shape=new Triangle(3.5,7.5);
		System.out.println("Area of Triangle is: "+ shape.calculateArea()+"\n");
	}
}
