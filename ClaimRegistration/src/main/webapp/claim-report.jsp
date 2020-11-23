<%@page import="java.util.List"%>
<%@page import="com.cg.oicrs.model.Claim"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Claim Report</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
<div class="container">
<div class="row">
<div class="col-12">
<div class="col-12">
</div>
<table class="table">
	<tr>
		<th>ClaimNumber</th>
		<th>ClaimReason</th>
		<th>Accident Location Street</th>
		<th>Accident City</th>
		<th>Accident State</th>
		<th>Accident ZIP</th>
		<th>Claim Type</th>
		<th>Policy Number</th>
	</tr>
	
	
<% Claim claim = (Claim)session.getAttribute("claim"); %>

<tbody>
	<tr>
		<td><%=claim.getClaimNumber() %></td>
		<td><%=claim.getClaimReason() %></td>
		<td><%= claim.getAccidentLocationStreet() %></td>
		<td><%=claim.getAccidentCity() %></td>
		<td><%= claim.getAccidentState() %></td>
		<td><%= claim.getAccidentZip() %></td>
		<td><%= claim.getClaimType() %></td>
		<td><%= claim.getPolicyNumber() %></td>		
	</tr>
</tbody>
	
	
		
</table>
	
</div>
</div>
</div>


</body>
</html>
