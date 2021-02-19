package com.jspiders.db;

import java.sql.SQLException;

public class Mainclass 
{
	public static void main(String[] args) 
	{
        MySqlImp m1 = new MySqlImp();
        
        m1.intitDb();
       
        try 
        {
			//m1.addName(2,"user2");
        	System.out.println("Before update");
        	String s1 = m1.getName(1);
			System.out.println(s1);
			
        	System.out.println("After update");
			m1.updateName(1,"Martin");
			String s2 = m1.getName(1);
			System.out.println(s2);
			
			
		} 
        catch (SQLException e) 
        {
			e.printStackTrace();
		}
        
        m1.closeConnection(); 
	}
}
