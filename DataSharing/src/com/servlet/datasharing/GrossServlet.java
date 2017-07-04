package com.servlet.datasharing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class GrossServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int basic = Integer.parseInt(request.getParameter("t1"));
		double gross = basic + 200;
		
		//share the data in request scope
		request.setAttribute("gross", gross);
		request.getRequestDispatcher("/TakeHomeServlet").forward(request, response);
		
	/*	HttpSession session = request.getSession();
		session.setAttribute("gross", gross);
		RequestDispatcher rd= request.getRequestDispatcher("/TakeHomeServlet"); 
		rd.forward(request, response);
*/		
	/*	ServletContext ctx = getServletContext();
		ctx.setAttribute("gross", gross);
		ctx.getRequestDispatcher("/TakeHomeServlet").forward(request, response);*/
		
	}

}
