<%@page import="java.util.List"%>
<%@page import="com.cg.oicrs.model.Policy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<th>Policy Number</th>
		<th>Policy Premium</th>
		<th>Account Number</th>
	</tr>


	<tbody> 
			
			
 			<% List<Policy> policy_list = (List)session.getAttribute("policies"); %>
 
			<% 
				for (Policy policy : policy_list) { 
			%> 
			<tr> 
				<td><%=policy.getPolicyNumber()%></td> 
				<td><%=policy.getPolicyPremium()%></td> 
				<td><%=policy.getAccountNumber()%></td> 
			</tr> 
			<% 
				} 
			%> 
	</tbody> 


</table>
	

</div>
</div>
</div>

</body>
</html>