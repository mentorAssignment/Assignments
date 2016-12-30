import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


class Animal3 {
	public String respriate()
	{
	
		return "in Animal3 res";
	}
	public String talk()
	{
		
		return"in Animal3";
	}

}
class Cat extends Animal3
{
	@Override
	public String talk()
	{
	
		return"in cat";
	}
	
}
class Dog extends Animal3
{ 
	@Override
	public String talk()
	{
		return "in dog";
	}
}
class Lion extends Animal3
{ 
	@Override
	public String talk()
	{
		
		return "in lion";
	}
}
class AnimalDemo
{
	public static void main(String args[])
	{
	Animal3 ob[] = new Animal3[4];
	ob[0]=new Animal3();
	ob[1]=new Lion();
	ob[2]=new Cat();
	ob[3]=new Dog();
	System.out.println(ob[0].talk());
	System.out.println(ob[1].talk());
	System.out.println(ob[2].talk());
	System.out.println(ob[3].talk());
	JUnitCore junit = new JUnitCore();
	Result result = junit.run(AnimalTest.class);
		
	
	}
}