<%@page import="java.util.List" %>
<%@page import="com.cg.oicrs.model.Policy"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<div>
<div class="container">
<div class="row">
<div class="col-12">
<div class="col-12">

</div>
<table class="table">
	
		<thead>Policy List</thead>
	<tr>
		
		<th>Policy Number</th>
		<th>Premium Amount</th>
		<th>Account Number</th>
	</tr>
	<%List<Policy> policies= (List<Policy>)session.getAttribute("policy"); 	%>
	<%  for(Policy policy:policies){
           out.println("<tr>");
	     
		  out.println("<td>"+policy.getPolicyNumber()+"</td>");
		  out.println("<td>"+policy.getPolicyPremium()+"</td>");
		  out.println("<td>"+policy.getAccountNumber()+"</td>");
		  out.println("</tr>");
		}%>
    
</table>
</div>
</div>
</div>
</body>
</html>