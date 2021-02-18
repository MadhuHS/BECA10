package com.jspiders.db;

public class Mainclass 
{
	public static void main(String[] args) 
	{
        MySqlImp m1 = new MySqlImp();
        m1.intitDb();
        m1.closeConnection();
	}
}
