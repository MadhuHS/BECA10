package com.jspiders.pkg3;

class Sample
{
	protected void test()
	{
	  System.out.println("test() of Sample");
	}
}

class Demo extends Sample
{
	@Override
	public void test()
	{
	  System.out.println("Overriding test() of Sample in Demo class");
	}
}


public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
