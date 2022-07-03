package com.laundry.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laundry.entity.Category;
import com.laundry.dao.Showcategory;

@WebServlet("/Viewcategory")
public class Displaycategory extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		List<Category> list=null;
		try {
			list = Showcategory.views();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.println(
				"<html><body><table border='1'><tr><td>id</td><td>items</td><td>washing_price</td><td>ironing_price</td><td>both_price</td>");

		for (Category a : list) {
			out.println("<tr><td>" + a.getId() + "</td><td>" +a.getItems() + "</td><td>" + a.getWashing_price()
					+ "</td><td>" + a.getIroning_price() + "</td><td>" + a.getBoth_price() + "</td></tr>");
		}
		
		out.println("<br><br><button>\r\n"
				+ "			<a href=\"index.jsp\">Back</a>\r\n"
				+ "		</button>");

	}
}
