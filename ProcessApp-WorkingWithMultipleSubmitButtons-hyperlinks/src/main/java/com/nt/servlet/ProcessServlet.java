package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		
		resp.setContentType("text/html");
		
		String s1val = req.getParameter("s1");
		
		int val1 = 0, val2  = 0;
		if (!s1val.equalsIgnoreCase("link1") && !s1val.equalsIgnoreCase("link2")) {
			val1 = Integer.parseInt(req.getParameter("t1"));
			val2 = Integer.parseInt(req.getParameter("t2"));
		}
		
		if (s1val.equalsIgnoreCase("add")) {
			pw.println("<h1>sum of "+val1+" and "+val2+" is : "+(val1+val2)+"</h1>");
		}
		else if (s1val.equalsIgnoreCase("sub")) {
			pw.println("<h1>sub of "+val1+" and "+val2+" is : "+(val1-val2)+"</h1>");
		}
		else if (s1val.equalsIgnoreCase("mul")) {
			pw.println("<h1>mul of "+val1+" and "+val2+" is : "+(val1*val2)+"</h1>");
		}
		else if (s1val.equalsIgnoreCase("div")) {
			pw.println("<h1>div of "+val1+" and "+val2+" is : "+((float)val1/val2)+"</h1>");
		}
		else if (s1val.equalsIgnoreCase("link1")) {
			pw.println("<h1>System properties are : </h1>");
			pw.println("<br>"+System.getProperties()+"<br>");
		}
		else {
			pw.println("<h1>System Date and Time is :"+LocalDateTime.now()+"</h1>");
		}
		
		pw.println("<br><a href='form.html'>Home</a>");
		
		pw.close();
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
		
	}
	
}
