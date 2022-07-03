package com.laundry.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebFilter("/Inserted")
public class Validationfilter extends HttpFilter {

	Logger logger = LoggerFactory.getLogger(Validationfilter.class);

	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		String name = req.getParameter("Name");
		String item = req.getParameter("item");
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		String category = req.getParameter("category");
		if (Validation.checkname(name) && Validation.checkcategory(item) && Validation.checkquantity(quantity)
				&& Validation.checkcategory(category)) {
			chain.doFilter(req, res);
			logger.debug("request path:{}", ((HttpServletRequest)req).getContextPath());
			
		} else {
			out.println("Please, enter valid input");
			logger.error("logger is called");
		}
	}

	@Override
	public void destroy() {
		logger.error("logger is destroyed");	
	}

}
