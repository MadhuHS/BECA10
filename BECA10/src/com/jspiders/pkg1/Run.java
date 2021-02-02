package com.jspiders.pkg1;

public class Run 
{
    public static void main(String[] args) 
    {
		System.out.println("main() of Run starts...");
		
		Demo d1 = new Demo();
		
		System.out.println(d1.v1);
		d1.test1();
		
		System.out.println("main() of Run ends...");
	}
}
