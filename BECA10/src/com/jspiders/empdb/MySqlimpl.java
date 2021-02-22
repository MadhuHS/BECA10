package com.jspiders.empdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlimpl implements Dao
{
	Connection con;
	@Override
	public void addEmployee(Employee emp) throws SQLException 
	{
		System.out.println(emp.getName());
		String insert = "insert into emp values(?,?,?,?,?,?,?)";
		PreparedStatement pm = con.prepareStatement(insert);
		pm.setInt(1,emp.getId());
		pm.setString(2,emp.getName());
		
		pm.execute();
	}
	@Override
	public void getEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateEmployee(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
