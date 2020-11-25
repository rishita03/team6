<%@page import="com.cg.oicrs.service.ClaimServiceImpl"%>
<%@page import="com.cg.oicrs.service.ClaimService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.cg.oicrs.model.Claim"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Claim</title>
</head>
<%!ClaimService cService = new ClaimServiceImpl();%>
<body>
	<%
		// Retrieving the Claim
		List<Claim> claims = new ArrayList<Claim>();
		claims = cService.getAllClaims();
		session.setAttribute("viewClaims", claims);
	%>

	<div class="container" style="margin-top: 50px;">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>Claim Number</th>
					<th>Claim Reason</th>
					<th>Street Name</th>
					<th>City</th>
					<th>State</th>
					<th>Pin Code</th>
					<th>Claim Type</th>
					<th>Policy Number</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${viewClaims }" var="vc">
					<tr>
						<td>${vc.claimNumber }</td>
						<td>${vc.claimReason }</td>
						<td>${vc.incidentLocation }</td>
						<td>${vc.incidentCity }</td>
						<td>${vc.incidentState }</td>
						<td>${vc.incidentZip }</td>
						<td>${vc.claimType }</td>
						<td>${vc.policyNumber }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
