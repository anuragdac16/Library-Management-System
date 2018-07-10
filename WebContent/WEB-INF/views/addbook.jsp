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
	<link rel="stylesheet" href="../assets/CSS/mainReg.css">
	<!-- <link rel="stylesheet" href="../assets/CSS/welcomeframe.css"> -->
	<link rel="stylesheet" href="../assets/CSS/BookSearch.css">
</head>


<body background="../assets/Images/reg1.jpg">
          <div class="registerbox">
	
	   <h1>Add Book</h1>
	   <form:form method="post" modelAttribute="book">
	   
	   <div class="../form-group"></div>
	        
	        <div>
	        	<p>Book Name</p>
				<form:input style="width: 300px" type="text" path ="bookName" name="book-name" placeholder="Book name..." />
				<form:errors style="width:100px" path="bookName"/>
			</div>
	        
	        <div>
	        	<p>Author Name</p>
				<form:input style="width: 300px" type="text" path ="authorName" name="author-name" placeholder="Author name..." />
				<form:errors style="width:100px" path="authorName"/>
			</div>
	        
	        <div>
	        	<p>Quantity</p>
				<form:input style="width: 300px" type="number" min="1" max="20" path ="quantity" name="Book-Quantity" placeholder="Quantity..." />
				<form:errors style="width:100px" path="quantity"/>
			</div>
	        
	        <div>
	        <p>Category</p>
	        
	        <form:select style="width:300px"  type="" path="category">
			            <option value="">----select----</option>
                        <option value="Fiction">Fiction</option>
                        <option value="Non-Fiction">Non-Fiction</option>
			    		<option value="Academic">Academic</option>
			</form:select>
			
	        
	        <form:errors style="width:100px" path="category"/>
	        </div>
	        
	   
	          
	      	 <div>
	         	<input type="submit" name="add-book" value="Add Book"><br>
			 </div>
			 
	   </form:form>
	   
	   </div>
	   

	   
</body>

</html>