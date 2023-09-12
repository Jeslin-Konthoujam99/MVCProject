
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
            <center><h1> WELCOME TO OUR CLASS</h1></center>
           <center> <%=request.getAttribute("al") %></center>
           
          <center> <table bgcolor="cyan" border="1" cellpadd="30x">
                <tr bgcolor="lightgrey" align="center">
                <th width="100px">ID</th>
                <th width="100px">NAME</th>
                <th width="100px">SEX</th>
             
                  </tr>
           
            	
           <c:forEach var="items" items="$(al)">
         <tr>
          	<td> ${items.ID }</td>
          	 	<td>${items.Name }</td>
          	 	<td>${items.Sex }</td>
          </tr>
           </c:forEach>
           </table></center>
           
</body>
</html>