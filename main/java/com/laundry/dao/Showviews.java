package com.laundry.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.laundry.entity.Customer;
import com.laundry.utility.Connections;

public class Showviews {
	public static List<Customer> shows() throws SQLException {
		String sql = "select * from customer";
		List<Customer> list = new ArrayList<Customer>();
		Customer c2 = null;

		Connections c = new Connections();
		try (Connection d = c.connect1(); Statement st = d.createStatement()) {

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				c2 = new Customer();
				c2.setId(rs.getInt(1));
				c2.setName(rs.getString(2));
				c2.setItem(rs.getString(3));
				c2.setQuantity(rs.getInt(4));
				c2.setCategory(rs.getString(5));
				list.add(c2);
			}
		}
		return list;
	}

}
