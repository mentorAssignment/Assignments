package assignment5;

public class CommandlineMain
{
		@Override
		protected void finalize() throws Throwable {
			System.out.println("In finalize ");
		}
	
	public static void main(String[] args) {
		
		/*
		//parsing String to int array
		int number[] = new int[args.length];
		for(int i =0; i<args.length; i++){
			number[i] = Integer.parseInt(args[i]);
			System.out.println("Element "+i+1+" : "+number[i]);
		}
		int[] num = sort(number); //call for sort method
		
		//to display array num
		for (int i=0; i< num.length; i++){
	    	System.out.println(num[i]);
	    }*/
		@SuppressWarnings("unused")
		CommandlineMain cm = new CommandlineMain();
		cm= null;
		System.gc(); //garbage collector
		
	}
	
	//method to sort array
	public static int[] sort(int num[]){
		    boolean swapped = true;
		    int j = 0;
		    int tmp;
		    while (swapped) {
		        swapped = false;
		        j++;
		        for (int i = 0; i < num.length - j; i++) {
		            if (num[i] > num[i + 1]) {
		                tmp = num[i];
		                num[i] = num[i + 1];
		                num[i + 1] = tmp;
		                swapped = true;
		            }
		        }
		    }
		    
		  return num;
		    
		}
}
