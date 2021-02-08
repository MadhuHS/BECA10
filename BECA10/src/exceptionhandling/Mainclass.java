package exceptionhandling;

public class Mainclass 
{
    public static void test(int n1,int n2)
    {
      System.out.println("test() starts...");
      
      System.out.println("n1 : "+n1);
      System.out.println("n2 : "+n2);
      
      if(n2>0)
      {
        double res = n1/n2;
        System.out.println("res : "+res);
      }
      else
      {
    	System.out.println("INVALID NUMBER FOR DIVISION");
      }
      
      System.out.println("test() ends...");
    }
	public static void main(String[] args) 
	{
      System.out.println("main() starts...");
      test(100,-1);
      System.out.println("main() ends...");
	}

}
