package com.org.jasp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");



		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("connection ready");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Rakesh@1234");

		//pw.println(con);

		PreparedStatement ps=con.prepareStatement(
		"select * from Registration where email=? and pass=?");
		ps.setString(1,email);
		ps.setString(2,pass);
		//pw.println(ps);
		ResultSet rs=ps.executeQuery();
		//pw.println(rs);
		boolean i=rs.next();
		//pw.println(i);
		if(i==true)
		{
		pw.print("you are successfully login");
		}
		else
		{
		pw.print("you are not successfully login");
		}

		}catch(Exception e){

		pw.println(e);}

		}
		}


