package com.org.jasp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup
 */
@WebServlet(name = "signup", urlPatterns = { "/signup" })
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		  System.out.println("test");
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();

		  String n=request.getParameter("name");
		  String c=request.getParameter("city");
		  String co=request.getParameter("country");
		  String p=request.getParameter("password");
		  try{
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Rakesh@1234");
             out.println("genpact");
			  PreparedStatement ps=con.prepareStatement("insert into registration1(name,pass,email,country) values(?,?,?,?)");

			  ps.setString(1,n);
			  ps.setString(2,c);
			  ps.setString(3,co);
			 
			  ps.setString(4,p);

			  int i=ps.executeUpdate();
			  if(i>0)
			  out.print("You are successfully registered...");

			  System.out.println("test");
			  }catch (Exception e2) {System.out.println(e2);}

			  out.close();
			  }

			  }

	


