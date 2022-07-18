package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InitParam
 */
public class RequestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RequestParam() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost Called");
		response.setContentType("text/html");//we need give content type
		PrintWriter out = response.getWriter();
		HttpSession ses = request.getSession(true);
		String str_name = (String)request.getParameter("name");//request.getParameter is similar to scanner.readline//request scope
		out.println(str_name);
		String str_company = (String)request.getParameter("company");//it read the key name given in html
		out.println(str_company);
				
		/*Enumeration enu = getInitParameterNames();//Enumeration is like iterator.vector will support
		  while(enu.hasMoreElements())
		    {
		  		String init = (String)enu.nextElement();
		  		out.println(init+" : " +getInitParameter(init)+"<br>");
		  	}*/
		out.println("inside");
	}

}
