package com.jspiders.empdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		pm.setString(3,emp.getJob());
		pm.setString(4,emp.getHiredate());
		pm.setDouble(5,emp.getSal());
		pm.setDouble(6,emp.getComm());
		pm.setInt(7,emp.getDeptno());
		
		pm.execute();//save data
	}
	@Override
	public Employee getEmployee(int id) throws SQLException 
	{
		String selectEmployee = "SELECT * from emp where empno = ? ";
		PreparedStatement pm = con.prepareStatement(selectEmployee);
		pm.setInt(1, id);
		ResultSet rs = pm.executeQuery();
		
		int eid = rs.getInt("empno");
		String name = rs.getString("empname");
		String job = rs.getString("job");
		String hiredate = rs.getString("hiredate");
		double sal = rs.getDouble("sal");
		double comm = rs.getDouble("comm");
		int deptno = rs.getInt("deptno");
		
		Employee emp = new Employee(eid, name, job, sal, comm, hiredate, deptno);
		
       return emp;		
	}
	@Override
	public void updateEmployeeName(int id,String newName) throws SQLException {
		
		String updateName = "UPDATE emp.ename SET name = ?  where empno = ?";
		PreparedStatement pm = con.prepareStatement(updateName);
		pm.setString(1, newName);
		pm.setInt(2,id);
		int count = pm.executeUpdate();
		System.out.println(count+" rows updated");
	}
	@Override
	public void deleteEmployee(int id) throws SQLException 
	{
		String deleteEmp = "DELETE from emp.ename where empno = ?";
		PreparedStatement pm = con.prepareStatement(deleteEmp);
		pm.setInt(1, id);
		int count = pm.executeUpdate();
		System.out.println(count+" rows delete");
	}
}




