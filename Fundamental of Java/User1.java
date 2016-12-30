

public class User1 {
	
	public double calculation(double i){
		Calc calc=new Calc();
		return calc.findroot(i);
		
	}
	
	
	public static void main(String[] args) {
		User1 user1=new User1();
		System.out.println(user1.calculation(36));
		
		
	}

}
