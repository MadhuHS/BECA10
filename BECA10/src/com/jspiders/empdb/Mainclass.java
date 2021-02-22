package com.jspiders.empdb;

import java.sql.SQLException;

public class Mainclass {

	public static void main(String[] args) {
		MySqlimpl m1 = new MySqlimpl();
		
		Employee emp = new Employee();
		emp.setName("Smith");
		emp.setId(100);
		emp.setJob("salesman");
		emp.setSal(12345.1);
		emp.setComm(12);
		emp.setHiredate("12-MAR-2020");
		emp.setDeptno(5);
		
		try 
		{
			m1.addEmployee(emp);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
