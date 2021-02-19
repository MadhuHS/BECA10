package com.jspiders.db;

import java.sql.SQLException;

public interface Dao {

	public void intitDb();

	public void closeConnection();

	public void addName(int id, String name) throws SQLException;

	public String getName(int id) throws SQLException;

	public void updateName(int id, String newName) throws SQLException;

	public void deleteName(int id) throws SQLException;
}
