package com.jspiders.db;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Dao {

	public void intitDb();

	public void closeConnection();
	
	public String[] getAllNames()throws SQLException ;
	
	public ArrayList<String> getAllUserNames()throws SQLException ;

	public void addName(int id, String name) throws SQLException;

	public String getName(int id) throws SQLException;

	public void updateName(int id, String newName) throws SQLException;

	public void deleteName(int id) throws SQLException;
}
