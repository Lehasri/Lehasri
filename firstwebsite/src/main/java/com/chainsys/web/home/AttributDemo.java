package com.chainsys.web.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributDemo
 */
public class AttributDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttributDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	public String salary=null;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String submitvalue=request.getParameter("submit");
		System.out.println("value;"+submitvalue);
		String salaryInput=request.getParameter("salary");
		salary=salaryInput;
		System.out.println("Salary input"+salaryInput);
		//System.out.println("Deposit called");
        PrintWriter out =response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><title>HelloWorld</title></head><body>");
        out.println("<h1>Post Called </h1>");
        out.println("</body></html>");
	}*/
	
	//System.out.println("Deposit called");
    PrintWriter out =response.getWriter();
    response.setContentType("text/html");
    out.println("<html><head><title>HelloWorld</title></head><body>");
    String submitvalue=request.getParameter("submit");
    if(submitvalue.equals("set"))
    {
    	String salaryInput=request.getParameter("salary");
    	salary=salaryInput;//storing data in global variable
    	out.println("<h1>Value Set</h1>"+salary);
    }
    else if(submitvalue.equals("fetch"))
    {
    	out.println("<h1>Value fetched</h1>"+salary);//returning value from global variable
    }
    out.println("</body></html>");
	}

  }
