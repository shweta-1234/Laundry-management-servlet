package com.laundry.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laundry.dao.Insertdata;
import com.laundry.entity.Customer;

@WebServlet("/Inserted")
public class Displaydata extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name=req.getParameter("Name");  
        String item=req.getParameter("item");  
        int quantity=Integer.parseInt(req.getParameter("quantity"));  
        String category=req.getParameter("category");  
        
        Customer c = new Customer();
        c.setName(name);
        c.setItem(item);
        c.setQuantity(quantity);
        c.setCategory(category);
        
        int status=Insertdata.add(c);
        if(status>0) {
        	out.println("laundry is booked successfully");
        }else {
        	out.println("Please try again");
        }
        
        out.println("<br><br><button>\r\n"
				+ "			<a href=\"index.jsp\">Back</a>\r\n"
				+ "		</button>");
        out.close();
	}
}
