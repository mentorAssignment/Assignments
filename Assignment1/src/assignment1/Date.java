package assignment1;

public class Date{
    int day,month,year;
    
    //Non-parameterized constructor 
    public Date(){
        day = 25;
        month = 01;
        year = 1994;
        display();
    }
    
  //Parameterized constructor 
    public Date(int d, int m,int y){
        day = d;
        month = m;
        year = y;
        display();
    }
    void display(){
        System.out.println("Day : "+day+" Month : "+month+" Year : "+year);
        
    }
}


