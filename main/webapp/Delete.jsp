<%@page import="com.laundry.dao.Deletedata"%>
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
		<h2>Delete Booking :</h2>
		<form action="Deleted" method="post">

			<label>Id</label> <input type="number" name="id"><br>
			<input type="submit" value="Delete">
		</form>
		</div>
</body>
</html>