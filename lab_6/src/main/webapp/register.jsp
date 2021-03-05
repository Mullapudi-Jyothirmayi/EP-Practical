<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "lab_6.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		String firstname=request.getParameter("firstname"); 
		String lastname=request.getParameter("lastname"); 
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Bean eb=new Bean();
		eb.setFirstname(firstname); 
		eb.setLastname(lastname);
		eb.setEmail(email);
		eb.setPassword(password);
		
%>
<%
	  Account dao = new Account();
	  int i=dao.Insert(eb);
	  if(i>0)
	  {
		  	out.print("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<p>Record saved successfully</p>");
		  	
		  	
	  } 
	  else{ 
		  out.print("Record not saved successfully");
		  } 
%> 
<jsp:include page="register.html"></jsp:include> 
</body>
</html>