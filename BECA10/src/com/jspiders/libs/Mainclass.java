package com.jspiders.libs;

class Demo extends Object
{
	@Override
	public int hashCode() 
	{
	  return 10;	
	}
	
	@Override
	public String toString() 
	{
	  return "toString() is overriden";
	}
}

public class Mainclass 
{
	public static void main(String[] args) 
	{
       Demo d1 = new Demo();
       
       int h1 = d1.hashCode();
      
       System.out.println(h1);
       
       String str = d1.toString();
       System.out.println(str);
       
	}
}






