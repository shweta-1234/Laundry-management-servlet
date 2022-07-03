<%@page import="com.laundry.dao.Updatedata"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="Container">
		<h1 Style="text-align: center;">Laundry Management System</h1>
		<h2>Update Booking :</h2>
		<form action="Updated" method="post">
			<label>Id</label> <input type="number" name="id"><br>
			 <label>Name</label>
			<input type="text" name="Name"><br> <label>Item</label>
			<input type="text" name="item"><br> <label>Quantity</label>
			<input type="number" name="quantity"><br> <label>Category</label>
			<input type="text" name="category"><br> <input
				type="submit" value="Update">
		</form>
	</div>
</body>
</html>