package com.jspiders.empdb;

import java.sql.SQLException;

public interface Dao 
{
   public void addEmployee(Employee emp) throws SQLException;
   public Employee getEmployee(int id) throws SQLException;
   public void updateEmployeeName(int id,String newName) throws SQLException;
   public void deleteEmployee(int id) throws SQLException;
}
