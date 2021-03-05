<%@page import="lab_6.*"%>  
<jsp:useBean id="obj" class="lab_6.Bean"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
boolean status=Account.Login(obj);  
if(status){  
out.println("You are successfully logged in ....!!!!\n");
out.println(" ");
out.println("Welcome "+obj.getEmail());
session.setAttribute("session","TRUE");  

}  
else  
{  
out.print("Sorry, email or password error"); 
}
%>  
 
 