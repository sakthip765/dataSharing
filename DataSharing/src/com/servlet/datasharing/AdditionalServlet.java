package com.servlet.datasharing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AdditionalServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside AdditionalServlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		double x = (Double)request.getAttribute("gross");
		System.out.println("Printing the Value from AS Request "+x);
		
	/*	ServletContext ctx = getServletContext();
		double x = (Double)ctx.getAttribute("gross");
		*/
/*		HttpSession session = request.getSession();
		double x = (Double)session.getAttribute("gross");
*/		
		double takeHome = x- 25;
		out.println("<html><body bgcolor=cyan>");
		out.println("<b>Take Home Salary Is:</b>"+takeHome);
		out.println("</body></html>");
	}
	
}
