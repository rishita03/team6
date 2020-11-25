<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>

<h1>Login Page</h1>
<form action="login" method="post">

	<table style="width:50%">
	
	<tr>
	<td>User Name</td>
	<td><input type="text" name="user_name" placeholder="Enter your user name" /></td>
	</tr>
	
	<tr>
	<td>Password</td>
	<td><input type="password" placeholder="Enter your password" name="password"/></td>
	</tr>
	
	<tr>
	<td>Role Code</td>
	<td><select name="dropdown">
		
		<option value="Insured">Insured</option>
		<option value="Claim Handler">Claim Handler</option>
		<option value="Claim Adjuster">Claim Adjuster</option>
		</select>
	</tr>
	
	</table>
	
	<input type="submit" value="Register"/>

</form>

</body>
</html>