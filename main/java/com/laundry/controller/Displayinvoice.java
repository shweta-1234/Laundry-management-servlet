package com.laundry.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laundry.dao.Deletedata;
import com.laundry.dao.Invoicebill;

@WebServlet("/Invoiced")
public class Displayinvoice extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		int id = Integer.parseInt(req.getParameter("id"));
		int status = Invoicebill.generatebill(id);
		if (status > 0) {
			out.println("Invoice is:" + status);
		} else {
			out.println("Please try again");
		}
        
		out.println("<br><br><button>\r\n"
				+ "			<a href=\"index.jsp\">Back</a>\r\n"
				+ "		</button>");
		out.close();
	}
}
