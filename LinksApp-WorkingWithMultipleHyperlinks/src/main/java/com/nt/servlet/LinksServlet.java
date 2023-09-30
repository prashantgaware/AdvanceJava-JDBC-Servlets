package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinksServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		
		String pval = req.getParameter("p1");
		
		Locale locals[] = Locale.getAvailableLocales();
		
		if (pval.equalsIgnoreCase("link1")) {
			pw.println("<h1> All Languages are : </h1>");
			for (Locale l : locals) {
				pw.println(l.getDisplayLanguage());
			}
		}
		else if(pval.equalsIgnoreCase("link2")) {
			pw.println("<h1> All countries are : </h1>");
			for (Locale l : locals) {
				pw.println(l.getDisplayCountry());
			}
		}
		else {
			pw.println("<h1>System Date & Time :: "+LocalDateTime.now()+"</h1>");
		}
		
		pw.println("<br><a href='links.html'>Home</a>");
		
		pw.close();
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		super.doPost(req, res);
		
	}
	
}
