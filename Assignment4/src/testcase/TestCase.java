package testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import assignment4.Animals;
import assignment4.Cat;
import assignment4.Circle;
import assignment4.Dog;
import assignment4.Lion;
import assignment4.Printable;
import assignment4.Rectangle;
import assignment4.Shapes;
import assignment4.Triangle;
import assignment4.Utility;


public class TestCase {
	//Object declaration 
	Cat cat;
	Dog dog;
	Lion lion;
	
	Printable printableArray[];
	Rectangle rec;
	Triangle tri;
	Circle cir;
	
	
	@Before
	public void initial(){
		cat = new Cat();
		dog = new Dog();
		lion = new Lion();
		rec = new Rectangle();
		tri = new Triangle();
		cir = new Circle();
		
		cat.respirate();
		cat.talk();
		
		dog.respirate();
		dog.talk();
		
		lion.respirate();
		lion.talk();
		
		Printable printableArray[] = new Printable[]{new Shapes(),new Animals()};
		
		new Utility().printAll(printableArray);;
		
		rec.display();
		tri.display();
		cir.display();
		
	}
	
	@Test
	public void test(){
		//test for method calculateArea of class Rectangle
		assertEquals(10.0,rec.calculateArea());
		
		//test for method calculateArea of class Triangle
		assertEquals(40.0,tri.calculateArea());
		
		//test for method calculateArea of class Circle
		assertEquals(300.0,cir.calculateArea());
	}

}
