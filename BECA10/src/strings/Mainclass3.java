package strings;

public class Mainclass3 
{
	public static String test1(String str)
	{
		String res = "";
		int mid = (str.length()-1)/2;
		int lb = 0;
		
		for(int i=lb; i<=mid; i++)
		{
		  char c1 = str.charAt(i);
		  res = res + c1;
		}
		return res;
	}
	
	public static String test2(String str)
	{
		String res = "";
		StringBuilder sb1 = new StringBuilder();
		int mid = (str.length()-1)/2;
		int lb = 0;
		
		for(int i=lb; i<=mid; i++)
		{
		  char c1 = str.charAt(i);
		  sb1 = sb1.append(c1);
		}
		res = sb1.toString();//get the string value from StringBuffer
		
		return res;
	}
	public static void main(String[] args) 
	{
         
	}
}





