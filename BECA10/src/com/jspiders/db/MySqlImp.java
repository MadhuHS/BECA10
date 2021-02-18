package com.jspiders.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlImp implements Dao {

	private String url = "jdbc:mysql://localhost:3306/usersdb";
	private String username = "root";
	private String password = "root@123";
	private Connection con;
	
	@Override
	public void intitDb() 
  	{
      /*Step1 : Register the Driver to DriverManager
		        and get the DB connection*/ 
		try 
		{
		 con = DriverManager.getConnection(url, username, password);
		 System.out.println("connection successful");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		              
	  
	}

	@Override
	public void addName(int id, String name) {
		/*
		 Prepare the Statement(InsertSQL)
		 Execute Query
		 Process the result*/
		
		System.out.println("adding name");
		System.out.println(id);
		System.out.println(name);
	}

	@Override
	public String getName(int id) {
		/*
		Step2 : Prepare the Statement(SELECTSQL)
		Step3 : Execute Query
		Step4 : Process the result*/
		String name = "";
		System.out.println("getting name");
		System.out.println(id);
		return name;
	}

	@Override
	public void updateName(int id, String newName) {
		/*
		Step2 : Prepare the Statement(UPDATESQL)
		Step3 : Execute Query
		Step4 : Process the result*/
		System.out.println("updating name");
		System.out.println(id);
		System.out.println(newName);

	}

	@Override
	public void deleteName(int id) {
		/*
		Step2 : Prepare the Statement(DELETESQL)
		Step3 : Execute Query
		Step4 : Process the result*/
		System.out.println("deleting name");
		System.out.println(id);

	}

	@Override
	public void closeConnection() {
		//Step5 : Close the connection  
		try 
		{
			con.close();
			System.out.println("connection closed");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



