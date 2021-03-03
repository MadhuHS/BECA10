package threads;

class Counter {
	private int v1 = 0;

	public void increment() {
		v1++;
	}

	public void decrement() {
		v1--;
	}

	public void showValue() {
		System.out.println("v1 : "+v1);
	}
}

class ThreadTaskOne implements Runnable 
{
	Counter c1 = null;

	public ThreadTaskOne(Counter c1) 
	{
		this.c1 = c1;
	}

	@Override
	public void run() 
	{
       c1.increment();
       c1.showValue();
	}
}

class ThreadTaskTwo implements Runnable
{
	Counter c2;
	
	public  ThreadTaskTwo(Counter c2)
	{
		this.c2 = c2;
	}
	
	@Override
	public void run()
	{
        c2.decrement();
        c2.showValue();
	}
}

public class Mainclass6 {
	public static void main(String[] args) {

		Counter ctr = new Counter();
		
		ThreadTaskOne t1 = new ThreadTaskOne(ctr);
		ThreadTaskTwo t2 = new ThreadTaskTwo(ctr);

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);

		th1.start();
		th2.start();

	}
}
