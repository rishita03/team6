<%@page import="java.util.List" %>
<%@page import="com.cg.oicrs.model.Claim" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Claim Registration Form</title>
</head>
<body>

<form action="ClaimCreationController" method="post">
			<table style="with: 50%">
				
				<tr>
					<td>Claim Reason</td>
					<td>input type="text" name="claimReason"</td>
				</tr>
				
				<tr>
					<td>Accident Location Street</td>
					<td>input type="text" name="accidentLocationStreet"</td>
				</tr>
				
				<tr>
					<td>Accident City</td>
					<td>input type="text" name="accidentCity"</td>
				</tr>
				
				<tr>
					<td>Accident State</td>
					<td>input type="text" name="accidentSate"</td>				
				</tr>
				
				<tr>
					<td>Accident Zip</td>
					<td>input type="text" name="accidentZip"</td>
				</tr>
				
				<tr>
					<td>Claim Type</td>
					<td>input type="text" name="claimType"</td>
				</tr>
				
			</table>
		<input type="submit" value="NEXT"/>
	</form>
</body>
</html>