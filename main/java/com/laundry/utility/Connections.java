package com.laundry.utility;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Connections {
	public Connection connect1() {
		Connection conn = null;
		try (FileInputStream file = new FileInputStream(
				"C:/Users/admin/Documents/workspace-spring-tool-suite-4-4.13.1.RELEASE/laundry-management1/src/main/java/com/laundry/utility/Files.property");) {
			Properties prop = new Properties();
			prop.load(file);
			Class.forName(prop.getProperty("driver"));
//			System.out.println("connection is successfull");
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
