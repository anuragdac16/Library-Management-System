<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GooseBumps</title>

<%-- <link href="${pageContext.request.contextPath}/assets/CSS/main.css" rel="stylesheet" type="text/css" /> --%>



	<link rel="stylesheet" href="../assets/CSS/mainReg.css">

</head>


<body background="../assets/Images/reg1.jpg">
          <div class="loginbox">
	
	   <h1>Register Here</h1>
	   <form:form method="post" modelAttribute="user">
	   
	     
	        <div>
	        	<p>First Name</p>
				<form:input style="width: 300px" type="text" path ="firstName" name="first-name" placeholder="First name..." />
				<form:errors style="width:100px" path="firstName"/>
			</div>
	        
	        <div>
	        	<p>Last Name</p>
				<form:input style="width: 300px" type="text" path ="lastName" name="last-name" placeholder="Last name..." />
				<form:errors style="width:100px" path="lastName"/>
			</div>
	        
	        <div>
	        	<p>Email Id</p>
				<form:input style="width: 300px" type="email" path ="emailId" name="email-id" placeholder="Email Id..." />
				<form:errors style="width:100px" path="emailId"/>
			</div>
	        
	        <div>
	        	<p>Password</p>
				<form:input style="width: 300px" type="password" path ="password" name="form-password" placeholder="Password..." />
				<form:errors style="width:100px" path="password"/>
			</div>
	         
	        <div>
	        	<p>Phone Number</p>
				<form:input style="width: 300px" type="number" path ="phoneNumber" name="phone-number" placeholder="Phone Number..." />
				<form:errors style="width:100px" path="phoneNumber"/>
			</div>
	          
	      	 
	         <input type="submit" name="register" value="register"><br>
			 <a href="/GooseBumps/user/login">Back to Login page</a>
	   </form:form>
	   
	   </div>
	   

	   
</body>

</html>