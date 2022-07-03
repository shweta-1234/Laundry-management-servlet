<%@page import="com.laundry.dao.Invoicebill"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill generate</title>
</head>
<body>
	<div class="Container">
		<h1 Style="text-align: center;">Laundry Management System</h1>
		<h2>Generate bill: :</h2>
		<form action="Invoiced" method="post">
			<label>Id</label> <input type="number" name="id"><br> <input
				type="submit" value="Bill">
		</form>
	</div>
</body>
</html>