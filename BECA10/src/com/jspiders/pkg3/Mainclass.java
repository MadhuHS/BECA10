package com.jspiders.pkg3;

import com.jspiders.pkg1.Sample;

public class Mainclass 
{
	public static void main(String[] args) 
	{
	   Sample.test();	
	   
	   Sample s1 = new Sample();
	   s1.display();
	   
	   com.jspiders.pkg2.Sample.test();
	   
	   com.jspiders.pkg2.Sample s2 = new com.jspiders.pkg2.Sample();
	   s2.display();
	}
}
