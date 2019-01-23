<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>view users</title>
<style>
body{
background-color:pink
}
</style>
</head>
<body>
<%@page import="Dao.UserDao,Bean.*,java.util.*"%>
<div class="container">
<h1>Users List</h1>  
<%
String address=request.getParameter("Address");
User u=UserDao.getRecordById(address);
%>
<table border="1" width="90%" class="table"> 
	<tr class="info">
		<th>Calling Address</th>
		<th>Called Address</th>
		<th>Start Date</th>
		<th>End Date</th>
		<th>No of Bytes Transferred</th>
		<th>State</th>
		<th>City</th>
		<th>Street name</th>
		<th>Zip code</th>
	</tr>
	<tr class="success">
		<td><%=u.getCalling_address()%></td>
		<td><%=u.getCalled_address()%></td>
		<td><%=u.getStart_date()%></td>
		<td><%= u.getEnd_date()%></td>
		<td><%= u.getData_sent()%></td>
		<td><%= u.getState()%></td>
		<td><%= u.getCity()%></td>
		<td><%= u.getStreet_name()%></td>
		<td><%= u.getZip_code()%></td>
	</tr>
</table>
<h2>This month's bill amount is <%= u.getData_sent() / 2%> Rs</h2>  
</div>  
</body>
</html>