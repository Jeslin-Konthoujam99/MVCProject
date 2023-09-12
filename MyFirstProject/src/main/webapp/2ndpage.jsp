<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	 <% 
  response.setHeader("Cache-control","no-cache,no-store,must-revalidate");//not to go back to previous page
  if(session.getAttribute("ID")==null) 
  {
  response.sendRedirect("index.html");
  }%>
	 WELCOME TO JAVA CLASS
           <br>
           ID :${ID }<br>
           Name: ${NAME }<br>
           Dept: ${A }<br>
           Roll: ${B }<br>
           Phn :${C }<br>
           
           //<a href="youtube.jsp">click here to go Youtube</a>
           


</body>
</html>