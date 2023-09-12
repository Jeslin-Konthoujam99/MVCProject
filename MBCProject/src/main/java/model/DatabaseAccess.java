package model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class DatabaseAccess
	

{

	        Connection con=null;
			Statement stmt=null;
			PreparedStatement pstmt=null;
			ResultSet res=null;
			ArrayList al=new ArrayList();
			public ArrayList Connect()
			{
			try
			{
				//load the driver
			DriverManager.registerDriver(new OracleDriver());
			//get the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","system");
			  System.out.println("Succes");
			}
			catch(Exception e)
			{
				System.out.println("Failed connection");
			}
			try 
			{
				//create a statement
				stmt=con.createStatement();
				//pstmt=con.prepareStatement("SELECT * FROM STUDENTDATA ");
			
			//execute the statement and loop over the result set
				res=stmt.executeQuery("SELECT * FROM STUDENTDATA");
				//res=pstmt.executeQuery();
				while(res.next()==true)
				{
					String a=res.getString(1);
					String b=res.getString(2);
					String c=res.getString(3);
					StudentDatabase sd=new StudentDatabase(a,b,c);
					//al.add(sd);
					al.add(sd.getID());
					al.add(sd.getName());
					al.add(sd.getSex());
				}
			
			}
			catch (Exception e)
			{
				System.out.println("Error");
			}
			return al;
		
		}
			
	}




