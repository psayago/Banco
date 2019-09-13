package com.neoris.dao.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MySqlDb {

	private Connection conn;

	public MySqlDb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			this.conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/neoris", "root", "");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return this.conn;
	}

}
