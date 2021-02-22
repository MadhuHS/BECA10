package com.jspiders.empdb;

import java.sql.SQLException;

public interface Dao 
{
   public void addEmployee(Employee emp) throws SQLException;
   public void getEmployee(int id) throws SQLException;
   public void updateEmployee(Employee emp) throws SQLException;
   public void deleteEmployee(int id) throws SQLException;
}
