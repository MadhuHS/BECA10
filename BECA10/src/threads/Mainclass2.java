package threads;


class Superclass
{
	
}
//s1
class Task1 extends Superclass implements Runnable 
{
	@Override
	public void run() 
	{
		for (int i = 1; i <= 3; i++) 
		{
			System.out.println("executing taskOne");
		}
	}

}


public class Mainclass2
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts..");
        
		//S3
		Task1 t1 = new Task1();
        
        //S4
		Thread th1 = new Thread(t1);
		
		//S5
        th1.start();
        
		System.out.println("Main ends..");
	}
}






