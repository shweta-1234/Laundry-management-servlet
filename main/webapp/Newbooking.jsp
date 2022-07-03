<%@page import="com.laundry.service.*"%>
<%@page import="com.laundry.dao.Insertdata"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Booking</title>
</head>
<body>
	<div class="Container">
		<h1 Style="text-align: center;">Laundry Management System</h1>
		<h2>New Booking :</h2>
		<form action="Inserted" method="post">

			<label>Name</label> <input type="text" name="Name"><br>
			<label>Item</label> <input type="text" name="item"><br>
			<label>Quantity</label> <input type="number" name="quantity"><br>
			<label>Category</label> <input type="text" name="category"><br>
			<input type="submit" value="Book"> <br>
			<br>
			<button>
				<a href="index.jsp">Back</a>
			</button>
		</form>
	</div>
</body>
</html>