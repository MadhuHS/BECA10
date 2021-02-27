package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{
	@Override
	public void run() 
	{
	   System.out.println("Task executed");	
	}
	
}
public class Mainclass3 
{
	public static void main(String[] args) 
	{
	   Task t1 = new Task();
	   
	   int cores =  Runtime.getRuntime().availableProcessors();
	   
	   System.out.println("cores : "+cores);
	   
       ExecutorService ftp = Executors.newFixedThreadPool(cores);
       
       for(int i=1; i<=100; i++)
       {
         ftp.submit(t1);
       }
      
       ftp.shutdown();
	}
}






