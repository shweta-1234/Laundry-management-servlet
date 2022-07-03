package com.laundry.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.laundry.entity.Category;
import com.laundry.utility.Connections;

public class Showcategory {

	public static List<Category> views() throws SQLException {
		String sql = "select * from category";
		List<Category> list = new ArrayList<Category>();
		Category c2 = null;

		Connections c = new Connections();
		try (Connection d = c.connect1(); Statement st = d.createStatement()) {

			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				c2=new Category();
				c2.setId(rs.getInt(1));
				c2.setItems(rs.getString(2));
			    c2.setWashing_price(rs.getInt(3));
				c2.setIroning_price(rs.getInt(4));
				c2.setBoth_price(rs.getInt(5));
				list.add(c2);
			}

		}
		return list;

	}

}
