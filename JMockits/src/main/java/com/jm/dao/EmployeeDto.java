package com.jm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jm.connection.ConnectionManager;

public class EmployeeDto {
	Connection con;
	Statement stmt;
	ResultSet rs;
	List<String> names;

	public List<String> getEmpNames() throws ClassNotFoundException,
			SQLException {
		stmt = ConnectionManager.openConnection().createStatement();
		rs = stmt.executeQuery("Select ename from emp");
		names = new ArrayList<String>();
		while (rs.next()) {
			names.add(rs.getString("ename"));
		}
		System.out.println("I am EmployeeDao Class");
		return names;
	}
}
