package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/formurl")
public class FromCompsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		
		String name = req.getParameter("pname");
		
		String addrs = req.getParameter("paddrs");
		
		int age = Integer.parseInt(req.getParameter("page"));
		
		String gender = req.getParameter("gender");
		
		String ms = req.getParameter("ms");
		ms = (ms == null)?"single":ms;
		
		String qlfy = req.getParameter("qlfy");
		
		String languages[] = req.getParameterValues("languages");
		if (languages == null) {
			languages = new String [] {"No language is selected"};
		}
		
		String hobbies[] = req.getParameterValues("hb");
		if (hobbies == null) {
			hobbies = new String [] {"No hobbies are selected."};
		}
		
		String dob = req.getParameter("dob");
		
		String tob = req.getParameter("tob");
		
		String month = req.getParameter("mob");
		
		long mobileNo = Long.parseLong(req.getParameter("mobileNo"));
		
		String mailString = req.getParameter("email");
		
		String favColor = req.getParameter("favColor");
		
		String url = req.getParameter("fbUrl");
		
		String search = req.getParameter("favSearch");
		
		
		if (gender.equalsIgnoreCase("M")) {
			if (age < 5) {
				pw.println("<h1 style='color:blue;text-align:center'>Mr.::"+name+" u r a baby boy</h1>");
			}
			else if (age < 13) {
				pw.println("<h1 style='color:blue;text-align:center'>Mr.::"+name+" u r a small boy</h1>");
			}
			else if (age < 19) {
				pw.println("<h1 style='color:blue;text-align:center'>Mr.::"+name+" u r a teenage boy</h1>");
			}
			else if (age < 35) {
				pw.println("<h1 style='color:blue;text-align:center'>Mr.::"+name+" u r a man</h1>");
			}
			else if (age < 50) {
				pw.println("<h1 style='color:blue;text-align:center'>Mr.::"+name+" u r a middle age man</h1>");
			}
			else {
				pw.println("<h1 style='color:blue;text-align:center'>Mr.::"+name+" u r a old man</h1>");
			}
		}
		else {
			if (age < 5) {
				pw.println("<h1 style='color:blue;text-align:center'>Mrs.::"+name+" u r a baby girl</h1>");
			}
			else if (age < 13) {
				pw.println("<h1 style='color:blue;text-align:center'>Mrs.::"+name+" u r a small girl</h1>");
			}
			else if (age < 19) {
				if (ms.equalsIgnoreCase("married")) {
					pw.println("<h1 style='color:blue;text-align:center'>Mrs.::"+name+" u r a married teenage girl</h1>");
				}
				else
					pw.println("<h1 style='color:blue;text-align:center'>Miss.::"+name+" u r a teenage girl</h1>");
			}
			else if (age < 35) {
				if (ms.equalsIgnoreCase("married")) {
					pw.println("<h1 style='color:blue;text-align:center'>Mrs.::"+name+" u r a married woman</h1>");
				}
				else
					pw.println("<h1 style='color:blue;text-align:center'>Miss.::"+name+" u r a woman</h1>");
			}
			else if (age < 50) {
				if (ms.equalsIgnoreCase("married")) {
					pw.println("<h1 style='color:blue;text-align:center'>Mrs.::"+name+" u r a married middle aged woman</h1>");
				}
				else
					pw.println("<h1 style='color:blue;text-align:center'>Miss.::"+name+" u r a middle aged woman</h1>");
			}
			else {
				if (ms.equalsIgnoreCase("married")) {
					pw.println("<h1 style='color:blue;text-align:center'>Mrs.::"+name+" u r a married old woman</h1>");
				}
				else
					pw.println("<h1 style='color:blue;text-align:center'>Miss.::"+name+" u r a old woman</h1>");
			}
		}
		
		
		pw.println("<br><br><b>Form Data:: </b><br><br>");
		pw.println("<br><b>Name:: </b><br>"+name);
		pw.println("<br><b>age:: </b><br>"+age);
		pw.println("<br><b>Address:: </b><br>"+addrs);
		pw.println("<br><b>Gender:: </b><br>"+gender);
		pw.println("<br><b>Marital Status:: </b><br>"+ms);
		pw.println("<br><b>Qualification:: </b><br>"+qlfy);
		pw.println("<br><b>Languages:: </b><br>"+Arrays.toString(languages));
		pw.println("<br><b>Hobbies:: </b><br>"+Arrays.toString(hobbies));
		pw.println("<br><b>DOB:: </b><br>"+dob);
		pw.println("<br><b>TOB:: </b><br>"+tob);
		pw.println("<br><b>MOB:: </b><br>"+month);
		pw.println("<br><b>Fav Color:: </b><br>"+favColor);
		pw.println("<br><b>Search String:: </b><br>"+search);
		pw.println("<br><b>Mobile Number:: </b><br>"+mobileNo);
		pw.println("<br><b>Email:: </b><br>"+mailString);
		pw.println("<br><b>FB Url:: </b><br>"+url);
		
		pw.println("<br><br><a href='all_comps_form.html'></a>");
		
		pw.close();
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
