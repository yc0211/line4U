package com.cy45.calendarserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
	
	public static Connection con(){
		Connection con = null;
	   	String path = "jdbc:mysql:";
	    String host = "127.0.0.1";
		String port = "3306";
		String db = "calendarDB";
		String user = "root";
		String password = "yc5518";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e+" connecting databases");
		}
		String conStr = path + "//" + host +":" + port + "/" + db +
		"?user=" + user + "&password=" + password;
		 try {
			con = DriverManager.getConnection(conStr);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		 return con;
	}
}
