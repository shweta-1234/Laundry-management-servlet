package com.laundry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.laundry.entity.Customer;
import com.laundry.utility.Connections;

public class Deletedata {
	public static int delete(int id) {
		int status=0;
		try {
			Connections c = new Connections();
			Connection conn = c.connect1();
			PreparedStatement ps = conn.prepareStatement("delete from customer where id = ?");
			
			ps.setInt(1, id);

			status=ps.executeUpdate();

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;

	}

}
