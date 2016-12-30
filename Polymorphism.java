
abstract class Animal
{
	public String respirate()
	{return("Breathe in, Breathe out");}
	public abstract String talk();
}
class Cat extends Animal{
		@Override
		public String talk() {
			// TODO Auto-generated method stub
			return("Meow");
		}
	}
class Dog extends Animal{
	@Override
	public String talk() {
		// TODO Auto-generated method stub
	return("Bark");	
	}
}
class Lion extends Animal{
	@Override
	public String talk() {
		// TODO Auto-generated method stub
	return("Roar");	
	}
}
class Polymorphism
{
	public static void main(String ar[])
	{
		Animal cat[]=new Cat[3];
		cat[0]=new Cat();cat[1]=new Cat();cat[2]=new Cat();
		cat[0].respirate(); cat[1].talk();cat[2].talk();
		Animal dog[]=new Dog[3];
		dog[0]=new Dog();dog[1]=new Dog();dog[2]=new Dog();
		dog[0].respirate(); dog[1].talk();dog[2].talk();
		Animal lion[]=new Lion[3];
		lion[0]=new Lion();lion[1]=new Lion();
		lion[2]=new Lion();
		lion[0].respirate(); lion[1].talk();lion[2].talk();
	}
}