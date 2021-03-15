<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function validate()
{
	var email = document.f1.email.value;
	var password = document.f1.password.value;
	var npassword = document.f1.npassword.value;
	if(password!=npassword)
	{
		alert("Confirm-Password doesn't match with Password");
		return false;
		
	}
	else
		{
		return true;
		}
	
}
</script>
<style>
* {
  box-sizing: border-box;
}
h1 {
  color: orange;
}
table {
  width: 600px;
  padding: 40px;  
  border: 10px double yellowgreen;
}
</style>
</head>
<body>
	<%
	String id = (request.getParameter("email"));	
	
	%>
			<body style="background-color:#FBECDB;">
			<form name='f1' onsubmit="return validate()"  action="password.html" method="post">
			<br><br><br><br>
			<h1 align="center">Reset Password</h1>
			<table class="bordered" align="center">				
				<tr>
					<td>Email Address&nbsp;&nbsp;&nbsp;</td>
					<td>: &nbsp;&nbsp;<input type="text" name="email" value=<%=id%>><br></td>
				</tr>
				<tr>
					<td>New Password&nbsp;&nbsp;&nbsp;</td>
					<td>: &nbsp;&nbsp;<input type="password" name="password" required><br></td>
				</tr>
				<tr>
					<td>Confirm New Password&nbsp;&nbsp;&nbsp;</td>
					<td>: &nbsp;&nbsp;<input type="password" name="npassword" required><br><br></td>
				</tr>
				<tr>
					<td><input type="submit" style='position: relative; left: 200px;' value="Reset"></td>
				</tr>
			</table>
			</form>
	
</body>
</html>