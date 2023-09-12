package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DatabaseAccess;

public class StudentDetails extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			
		
		DatabaseAccess da=new DatabaseAccess();//constructor
		ArrayList al=da.Connect();
	
		request.setAttribute("al",al);
		request.getRequestDispatcher("StudentDetails.jsp").forward(request,response);
				}
		catch(Exception e)
		{
			
		}
	}
}