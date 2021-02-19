package com.jspiders.db;

import java.sql.SQLException;

public interface Dao {

	public void intitDb();
	public void closeConnection();
	public void addName(int id,String name)throws SQLException;
	public String getName(int id);
	public void updateName(int id,String newName);
	public void deleteName(int id);
}
