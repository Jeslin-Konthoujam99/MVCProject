package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.jdbc.driver.OracleDriver;

public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		Statement stmt=null;
		String ID=request.getParameter("UserID");
		ResultSet res=null;
		
		
	try
	{
		DriverManager.registerDriver(new OracleDriver());
		con= DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","system");
		System.out.print("connection success");
	}
catch(Exception e)
	{
	System.out.print("failed");
}
	String id=null,name=null,a=null;
	int b=0,c=0;
	try {
		
	
	pstmt=con.prepareStatement("SELECT * FROM COLLEGE WHERE ID=?");
	pstmt.setString(1,ID);
	res=pstmt.executeQuery();
	while(res.next()==true)
	{
		 id=res.getString(1);
		 name=res.getString(2);
		 a=res.getString(3);
		 b=res.getInt(4);
		 c=res.getInt(5);
		 System.out.print("success");
	}
	HttpSession session=request.getSession();
	session.setAttribute("ID", id);
	session.setAttribute("NAME", name);
	session.setAttribute("A", a);
	session.setAttribute("B", String.valueOf(b));
	session.setAttribute("C",String.valueOf(c));
	request.getRequestDispatcher("2ndpage.jsp").forward(request, response);
	}
	catch(Exception e)
	{
		
	}
	
	
}
}