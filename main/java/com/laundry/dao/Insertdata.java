package com.laundry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.laundry.utility.Connections;
import com.laundry.entity.Customer;

public class Insertdata{
	
	public static int add(Customer c2) {
		int status=0;
	try{
		Connections c = new Connections();
		Connection conn = c.connect1();
	    PreparedStatement ps = conn.prepareStatement("insert into customer(name, item, quantity,category) values(?,?,?,?)");
	
		ps.setString(1,c2.getName());
		ps.setString(2,c2.getItem());
		ps.setInt(3, c2.getQuantity());
		ps.setString(4,c2.getCategory());

		status=ps.executeUpdate();
		
		conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
}
}