package com.jspiders.pkg2;

import com.jspiders.pkg1.Demo;

public class Mainclass extends Demo
{
	public static void main(String[] args) 
	{
       System.out.println("main starts...");
       
       Demo d1 = new Demo();
       System.out.println(d1.v1);
       d1.test1();
       
       Mainclass m1 = new Mainclass();
       System.out.println(m1.v2);
       m1.test2();
                     
       System.out.println("main ends...");
	}
}
