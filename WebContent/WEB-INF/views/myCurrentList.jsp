<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
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

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
*, *:before, *:after {
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
}

html {
	overflow-y: scroll;
}

body {
	background: #c1bdba;
	font-family: 'Titillium Web', sans-serif;
}

a {
	text-decoration: none;
	color: #1ab188;
	-webkit-transition: .5s ease;
	transition: .5s ease;
}

a:hover {
	color: #179b77;
}

.form {
	background: rgba(19, 35, 47, 0.9);
	padding-top: 60px;
	padding-bottom: 100%;
	margin: 00px auto;
	border-radius: 4px;
	-webkit-box-shadow: 0 4px 10px 4px rgba(19, 35, 47, 0.3);
	box-shadow: 0 4px 10px 4px rgba(19, 35, 47, 0.3);
}

.tab-group {
	list-style: none;
	padding: 10;
	display: flex;
	margin: 0 0 40px 0;
}

.tab-group:after {
	content: "";
	display: table;
	clear: both;
}

.tab-group li a {
	display: block;
	text-decoration: none;
	padding: 15px;
	background: rgba(160, 179, 176, 0.25);
	color: #a0b3b0;
	font-size: 20px;
	width: 315px;
	text-align: center;
	cursor: pointer;
	-webkit-transition: .5s ease;
	transition: .5s ease;
}

.loginbox {
	width: 300px;
	height: 400px;
	left: 50%;
	top: 50%;
	position: absolute;
	transform: translate(-50%, -50%);
	box-sizing: border-box;
}

.tab-group li a:hover {
	background: #179b77;
	color: #ffffff;
}

.tab-group .active a {
	background: #1ab188;
	color: #ffffff;
}

.tab-content>div:last-child {
	display: flex;
}
</style>
</head>
<body>
	<div class="form">
		<ul class="tab-group">
			<li><a href="/GooseBumps/history/myList">My Book List</a></li>
			<li><a href="/GooseBumps/history/booksearch">Book Search</a></li>
			<li style="background-color: #179B77;"><a href="">My Current Book List</a></li>
			<li><a href="/GooseBumps/history/logout">Logout</a></li>
		</ul>

		<center>
			<form:form method="GET" modelAttribute="user">

				<table class="table table-striped" style="color: green;" border="1;"
					cellpadding="20% ;" bordercolor="grey ;">
					<thead>
						<tr>
							<th>Book Name</th>
							<th>Author Name</th>
							<th>Category</th>
							<th>Issue Date</th>
							<th>Return Date</th>
							<th>Return Book</th>
						</tr>
						<tr></tr>
					</thead>
					<tbody>
						<tr>
							<c:forEach items="${myModel}" var="currentBook">
								<td>${currentBook.book.bookName}</td>
								<td>${currentBook.book.authorName}</td>
								<td>${currentBook.book.category}</td>
								<td>${currentBook.issueDate}</td>


								<td>${currentBook.returnDate}</td>
								<td>
								<%
									Date d = new Date();
								%>
								<c:if test="${currentBook.returnDate  le  d}">
										<a href="/GooseBumps/history/booking?bId=${currentBook.book.bId }">Return Book</a></c:if>
										
								</td>



								<tr></tr>
							</c:forEach>

						</tr>
				</table>
			</form:form>
		</center>
	</div>




	<script>
		$('.form').find('input, textarea').on('keyup blur focus', function(e) {

			var $this = $(this), label = $this.prev('label');

			if (e.type === 'keyup') {
				if ($this.val() === '') {
					label.removeClass('active highlight');
				} else {
					label.addClass('active highlight');
				}
			} else if (e.type === 'blur') {
				if ($this.val() === '') {
					label.removeClass('active highlight');
				} else {
					label.removeClass('highlight');
				}
			} else if (e.type === 'focus') {

				if ($this.val() === '') {
					label.removeClass('highlight');
				} else if ($this.val() !== '') {
					label.addClass('highlight');
				}
			}

		});

		$('.tab a').on('click', function(e) {

			e.preventDefault();

			$(this).parent().addClass('active');
			$(this).parent().siblings().removeClass('active');

			target = $(this).attr('href');

			$('.tab-content > div').not(target).hide();

			$(target).fadeIn(600);

		});

		function gotoDashBoard() {
			//Make a back end call url
			/* $.ajax({
			  url: "/YourServlet",
			  type: "post",
			  data: values,
			  success: function(){
			      alert("success");
			       $("#result").html('submitted successfully');
			  },
			  error:function(){
			      alert("failure");
			      $("#result").html('there is error while submit');
			  }   
			});  */
			//Pass your param
			//get data in list
			//search the table with id
			//Populate data to table
		}
	</script>


</body>
</html>