package exceptionhandling;

public class Mainclass5 
{
	public static void test(int n1, int n2) throws InterruptedException
	{
		System.out.println("test() starts...");

		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);

		Thread.sleep(n1);

		System.out.println("test() ends...");
	}

	public static void main(String[] args) {

		System.out.println("main() starts...");

		try
		{
			test(100, 0);
		} 
		catch(Exception ref)
		{
			System.out.println("Exception handled in main()");
			ref.printStackTrace();
		}

		System.out.println("main() ends...");
	}
}
