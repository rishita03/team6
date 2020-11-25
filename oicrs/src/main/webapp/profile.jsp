<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>User Creation</h1>
<form action="validlogin.jsp" method="post">
<tr>
	<td>User Name </td>
	<td><input type="text" placeholder="Enter user name" name="userName" required></td>
</tr>

<tr>
	<td>Password </td> 
	<td><input type="password" placeholder="Enter pasword" name="password" ></td>

<tr>
	<td>Role Code </td>
	<td><select name="roleCode">
	<option>Insured</option>
	<option>Claim Handler</option>
	<option>Claim Adjuster</option>
	</select>
	</tr></td>

 <input type="submit" value="submit"></td></tr>

</form>
</div>
</body>
</html>
