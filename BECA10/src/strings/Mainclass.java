package strings;

public class Mainclass 
{
	public static void main(String[] args) 
	{
       String s1 = new String("hello");
       String s2 = "hello";
       String s3 = new String("hello");
       String s4 = "hello";
       String s5 = "world";
       String s6 = s1 + s5;
       String s7 = s1 + "world";
       String s8 = "hello" + "world";
       String s9 = "helloworld";
       
       System.out.println("----------compare by == optr--------------------");

       System.out.println(s1 == s2);
       System.out.println(s1 == s3);
       System.out.println(s2 == s4);
       System.out.println(s6 == s7);
       System.out.println(s8 == s9);
       
       System.out.println("----------compare by equals()--------------------");
       
       System.out.println(s1.equals(s2));
       System.out.println(s1.equals(s3));
       System.out.println(s2.equals(s4));
       System.out.println(s6.equals(s7));
       System.out.println(s8.equals(s9));
	}
}
