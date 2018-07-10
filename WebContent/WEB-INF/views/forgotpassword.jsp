<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="../assets/CSS/main.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GooseBumps</title>

<link href="../assets/CSS/ForgotPassword.css" rel="stylesheet" type="text/css">


</head>
<body background="../assets/Images/s.jpg">
	       <div class="loginbox">
	   
	   <h2>Forgot Password</h2>

			<form:form method="POST" modelAttribute="user">

				<p>Enter Register Email Id :</p>

			

				<form:input type="email" path ="emailId" name="email-Id" placeholder="Email ID ..." />
				<input type="submit" name="user" value="send">
		
				
			</form:form>
		</div>

	

</body>
</html>