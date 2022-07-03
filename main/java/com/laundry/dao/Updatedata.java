package com.laundry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.laundry.entity.Customer;
import com.laundry.utility.Connections;

public class Updatedata {

	public static int update(Customer c2) {
		int status = 0;
		try {
			Connections c = new Connections();
			Connection conn = c.connect1();
			PreparedStatement ps = conn.prepareStatement(
					"update customer set name = ? , item = ? , quantity = ? , category = ?  where id =?");
            
			ps.setString(1, c2.getName());
			ps.setString(2, c2.getItem());
			ps.setInt(3, c2.getQuantity());
			ps.setString(4, c2.getCategory());
			ps.setInt(5, c2.getId());
			
			status = ps.executeUpdate();

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;

	}

}
