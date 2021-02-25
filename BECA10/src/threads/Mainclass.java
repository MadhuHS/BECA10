package threads;

//s1
class TaskOne extends Thread 
{
	//s2
	@Override
	public void run() 
	{
		for (int i = 1; i <= 3; i++) 
		{
			System.out.println("executing taskOne");
		}
	}
}

class TaskTwo extends Thread 
{
	@Override
	public void run() 
	{
		for (int j = 1; j <= 3; j++) 
		{
			System.out.println("executing taskTwo");
		}
	}
}

public class Mainclass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts..");
        
		//S3
		TaskOne t1 = new TaskOne();
        TaskTwo t2 = new TaskTwo();
        
        //S4
        t1.start();
        t2.start();
        
		System.out.println("Main ends..");
	}
}






