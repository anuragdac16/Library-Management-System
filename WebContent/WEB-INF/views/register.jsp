<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GooseBumps</title>

<link rel="stylesheet" href="../assets/CSS/mainReg.css">
</head>
<body background="assets/Images/reg1.jpg">
          <div class="loginbox">
	
	   <h1>Register Here</h1>
	   <form>
	         <p>First Name</p>
			 <input type="text" name="fname" placeholder="Enter Name">
			 <p>Lat Name</p>
			 <input type="text" name="lname" required placeholder="Enter Username">
			 <p>Email Id</p>
			 <input type="email" name="email" required placeholder="Enter Email Id">
			 <p>Phone Number</p>
			 <input type="number" maxlength="13" name="phone" placeholder="Enter Phone Number">
	         <p>User Name</p>
			 <input type="text" name="user" required placeholder="Enter Username">
	         <p>Password</p>
			 <input type="password" name="password" required placeholder="Enter Password">
	         <input type="submit" name="register" value="register"><br>
			 <a href="TimePass.html">Back to Login page</a>
	   </form>
	   </div>
</body>
</html>