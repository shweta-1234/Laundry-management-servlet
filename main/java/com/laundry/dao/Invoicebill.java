package com.laundry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.laundry.utility.Connections;
import com.laundry.entity.Customer;
import com.laundry.entity.Category;

public class Invoicebill {

	public static int generatebill(int id) {
		int status=0;
		try {
			Connections c = new Connections();
			Connection conn = c.connect1();

			Statement st = conn.createStatement();
			Statement st1 = conn.createStatement();
			Customer c2 = new Customer();
			String str= "select item,category, quantity from customer where id=" + id;
			PreparedStatement ps = conn.prepareStatement(str);
	        
//			ps.setInt(1,id);		

			ResultSet rs = st.executeQuery(str);
			while (rs.next()) {
				String s1 = rs.getString("item");
				String s2 = rs.getString("category");
				int quantity = rs.getInt("quantity");

				int s3 = 0;
				ResultSet rs2 = st1.executeQuery("select * from category where lower(items)='" + s1 + "'");
				while (rs2.next()) {
					if (s2.equals("washing")) {
						s3 = rs2.getInt("washing_price");
					} else if (s2.equals("ironing")) {
						s3 = rs2.getInt("ironing_price");
					} else if (s2.equals("both")) {
						s3 = rs2.getInt("both_price");
					}
				}
				status= quantity * s3;		
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {

		}
		return status;
	}
}