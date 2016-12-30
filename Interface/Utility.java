
interface Printable{
	public String print();
}

class Shapes implements Printable{

	@Override
	public String print() {
		return "In shape class";
		
	}
	
}

class Animal implements Printable{

	@Override
	public String print() {
		return "In animal class";
		
	}
	
}

public class Utility{
	public Printable[] printAll(Printable []p){
		for(int i=0;i<p.length;i++)
			p[i].print();
		return p;
	
	}	



	
	public static void main(String[] args) {
		Utility utility=new Utility();
		Printable p[]={new Shapes(), new Animal()};
		utility.printAll(p);
	}

}
