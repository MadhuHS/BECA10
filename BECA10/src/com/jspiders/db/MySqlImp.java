package com.jspiders.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	public void addName(int id, String name) throws SQLException {
		/*
		 Prepare the Statement(insertQuery)
		 Execute Query
		 Process the result*/
		
		String insertQuery = 
			"insert into users values("+id+","+"'"+name+"'"+");";
		
		String insertQuery2 = 
				"insert into users values(?,?);";
		System.out.println(insertQuery);
		
		/*Statement sm = con.createStatement();
		sm.execute(insertQuery);*/
		
		
		PreparedStatement pm = con.prepareStatement(insertQuery2);
		pm.setInt(1, id);
		pm.setString(2, name);
		
		pm.execute();
		
		
		
		System.out.println("data added to db");
	}

	@Override
	public String getName(int id) throws SQLException {
		/*
		Step2 : Prepare the Statement(SELECTSQL)
		Step3 : Execute Query
		Step4 : Process the result*/
		String name = "";
		System.out.println("getting name");
		System.out.println(id);
		
		String SelectQuery = "select name from users where id = ?";
		
		PreparedStatement pm = con.prepareStatement(SelectQuery);
		pm.setInt(1, id);
		ResultSet rs = pm.executeQuery();
		
		rs.next();//move cursor to first record
		
		name = rs.getString("name");//get the data from ResultSet with columnName
		
		return name;
	}
	
	@Override
	public String[] getAllNames() throws SQLException 
	{
		String selectAll = "select name from users";
	    Statement sm = con.createStatement();
	    ResultSet rs = sm.executeQuery(selectAll);
	    
	    
	    rs.next();
	    String s1 =  rs.getString("name");
	    System.out.println(s1);
	    
	    rs.next();
	    String s2 =  rs.getString("name");
	    System.out.println(s1);
	    
		return null;
	}

	@Override
	public void updateName(int id, String newName) throws SQLException {
		/*
		Step2 : Prepare the Statement(UPDATESQL)
		Step3 : Execute Query
		Step4 : Process the result*/
		System.out.println("updating name");
		System.out.println(id);
		System.out.println(newName);
		
		String UPDATEquery = "update users set name = ? where id = ?";
		
		PreparedStatement pm  = con.prepareStatement(UPDATEquery);
		pm.setString(1, newName);
		pm.setInt(2, id);
		
		int updateCount = pm.executeUpdate();
	
		System.out.println(updateCount +" rows updated");
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



