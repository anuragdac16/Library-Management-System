<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GooseBumps</title>

<%-- <link href="${pageContext.request.contextPath}/assets/CSS/main.css" rel="stylesheet" type="text/css" /> --%>



	<link rel="stylesheet" href="../assets/CSS/main.css">
	<!-- <link rel="stylesheet" href="../assets/CSS/welcomeframe.css"> --> 
</head>

<body background="../assets/Images/B.jpeg" >



       <div class="loginbox">
	 
	   <h1>Login Here</h1>
	   
	   	   <form:form method="post" modelAttribute="user">
	     
	        	<p>Email ID</p>
				<form:input  type="email" path ="emailId" name="email-id" placeholder="Email Id..." />
				<form:errors path="emailId"/>
				
				<p>Password</p>
				<form:input type="password" path ="password" name="password-" placeholder="password..." />
				<form:errors path="password"/>
				<input type="submit" name="user" value="user login">
				<input type="submit" name="admin" value="admin login"><br>
				<a href="registration">New User</a>
	        
	   </form:form>
	   
	   
	   
	   
	   </div>
</body>

</html>