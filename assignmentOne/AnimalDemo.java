package assignmentOne;
// interface example
// creating interface Animal
interface Animal{
	public String respirate();
	public String talk();
}

// Cat class implementing Animal Interface
class Cat implements Animal{
	// override respirate method in interface
	@Override
	public String respirate() {
		return "Cat is breathing...";
	}
	// override talk method in interface
	@Override
	public String talk() {
		return "Cat is making noise...";
	}
}
class Dog implements Animal{
	@Override
	public String respirate() {
		return "Dog is breathing...";
	}
	@Override
	public String talk() {
		return "Dog is making noise...";
	}
}
class Lion implements Animal{
	@Override
	public String respirate() {
		return "Lion is breathing...";
	}
	@Override
	public String talk() {
		return "Lion is making noise...";
	}
}

//	AnimalDemo consisting of  main class
class AnimalDemo{
	public static void main(String[] args) {
		// creating array of objects with reference to Animal interface
		Animal[] animal={new Cat(), new Dog(), new Lion()};
		System.out.println(animal[0].respirate());
		System.out.println(animal[0].talk());
		System.out.println();
		
		System.out.println(animal[1].respirate());
		System.out.println(animal[1].talk());
		System.out.println();
		
		System.out.println(animal[2].respirate());
		System.out.println(animal[2].talk());
	}
}