package com.servlet.datasharing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TakeHomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("INside TakeHOmeServlet");

/*		double x = (Double)request.getAttribute("gross");
		System.out.println("Printing the Value of Gross "+x);
		response.sendRedirect("AdditionalServlet"); */ 
		
/*			
		HttpSession session = request.getSession();
		double x = (Double)session.getAttribute("gross");
		System.out.println("Printing the Value of Gross "+x);
	    session.invalidate();
*/		
		RequestDispatcher rd= request.getRequestDispatcher("/AdditionalServlet"); 
		rd.forward(request, response);
	}

}
