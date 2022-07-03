package com.laundry.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laundry.dao.Showviews;
import com.laundry.entity.Customer;

@WebServlet("/Viewcustomer")
public class Displayviews extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		List<Customer> list = null;
		try {
			list = Showviews.shows();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        out.println("List of customer:");
		out.println(
				"<html><body><table border='1'><tr><td>id</td><td>name</td><td>item</td><td>quantity</td><td>category</td>");

		for (Customer a : list) {
			out.println("<tr><td>" + a.getId() + "</td><td>" + a.getName() + "</td><td>" + a.getItem() + "</td><td>"
					+ a.getQuantity() + "</td><td>" + a.getCategory() + "</td></tr>");
		}
		out.println("<br><br><button>\r\n"
				+ "			<a href=\"index.jsp\">Back</a>\r\n"
				+ "		</button>");
	}
}
