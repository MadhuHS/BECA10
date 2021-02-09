package exceptionhandling;

public class Mainclass4
{
    public static void test(int n1,int n2)
    {
      System.out.println("test() starts...");
      
      System.out.println("n1 : "+n1);
      System.out.println("n2 : "+n2);
      
      int[] a1 = {10,20,30,40};
      
      try
      {
        int res = n1/n2;
        System.out.println("res : "+res);
        System.out.println("Element at "+res+" is : "+a1[res]);
      }
      catch(Exception ref)
      {
    	System.out.println("Handled Exception");
    	ref.printStackTrace();
      }
      finally
      {
    	System.out.println("finally block executed");
      }
      
      System.out.println("test() ends...");
    }
	public static void main(String[] args) 
	{
      System.out.println("main() starts...");
      test(100,50);
      System.out.println("main() ends...");
	}

}
