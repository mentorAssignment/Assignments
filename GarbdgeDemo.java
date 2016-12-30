import org.omg.CORBA.FREE_MEM;
public class GarbdgeDemo
{

public static void main(String args[])
{
Runtime obj =Runtime.getRuntime();
obj.freeMemory();
System.out.println(obj.freeMemory());
System.gc();
obj.freeMemory();
System.out.println(obj.freeMemory());
}
}
