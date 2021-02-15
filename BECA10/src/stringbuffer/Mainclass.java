package stringbuffer;

public class Mainclass {
	public static void main(String[] args) 
	{
		System.out.println("--------------StringBuffer--------------------");

		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");

		boolean b1 = sb1.equals(sb2);
		System.out.println(b1);

		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());

		System.out.println(sb1.toString());

		sb1.append("world");

		System.out.println("--------------StringBuilder--------------------");
		
		StringBuilder sbd1 = new StringBuilder("hello");
		StringBuilder sbd2 = new StringBuilder("hello");

		boolean b2 = sbd1.equals(sbd2);
		System.out.println(b2);

		System.out.println(sbd1.hashCode());
		System.out.println(sbd2.hashCode());

		System.out.println(sbd1.toString());

		sbd1.append("world");
	}
}
