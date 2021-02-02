package com.jspiders.pkg1;

public class Demo 
{
  public    int    v1 = 10;
  protected double v2 = 2.34;
            long   v3 = 990131321313139102l;
  private   String v4 = "hello";
  
  public void test1()
  {
	System.out.println("this public-test1() of Demo class");
  }
  
  protected void test2()
  {
	System.out.println("this protected-test2() of Demo class");
  }
  
  void test3()
  {
	System.out.println("this pkg-level-test3() of Demo class");
  }
  
  private void test4()
  {
	System.out.println("this private-test4() of Demo class");
  }
}







