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
			m1.addName(2,"user2");
		} 
        catch (SQLException e) 
        {
			e.printStackTrace();
		}
        
        m1.closeConnection(); 
	}
}
