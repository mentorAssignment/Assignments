class StudentDetail{
	int roll,age,marks;
	
	StudentDetail(){
		roll=4;
		age=10;
		marks=95;
		System.out.println("default const");
	}
	
	
	public void set(){
		System.out.println("normal function ");
	}

	StudentDetail(int r, int a){
		this();
		this.set();
		roll=r;
		age=a;
		System.out.println("param const");
	}
	
	StudentDetail(int ro,int ag,int mark){
		this(6,10);
		roll=ro;
		age=ag;
		marks=mark;
		System.out.println("3 param const");
	}
	
}

public class StudentDemo {
	public static void main(String[] args) {
		StudentDetail sd=new StudentDetail(5,10,98);
		System.out.println("roll="+sd.roll);
	}

}
