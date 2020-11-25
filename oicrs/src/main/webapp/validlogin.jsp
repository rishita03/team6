<%@page import="com.cg.oicrs.model.UserRole"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>After a valid Login</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
%>
<a href="logout">Logout</a>

<%
String roleCode=(String)session.getAttribute("roleCode");
%>
<div class="container">
<button onclick="location.href='create-claim.jsp'" id=btnCreateClaim disabled>Create Claim</button>
<button onclick="location.href='page.jsp'" id="btnViewClaim" disabled>View Claim</button>
<button onclick="location.href='profile.jsp'" id="btnCreateUser" disabled>Create User</button>
<button onclick="location.href='page.jsp'" id="btnGenerateReport" disabled>Generate Report</button>
</div>


<script type="text/javascript">
var roleCode= '<%= roleCode%>' ;
switch(roleCode){
	case 'Insured':
		document.getElementById('btnCreateClaim').disabled=false;
		document.getElementById('btnViewClaim').disabled=false;
		break;
	case 'Claim Handler':
		document.getElementById('btnCreateClaim').disabled=false;
		document.getElementById('btnViewClaim').disabled=false;
		break;
	case 'Claim Adjuster':
		document.getElementById('btnCreateClaim').disabled=false;
		document.getElementById('btnViewClaim').disabled=false;
		document.getElementById('btnCreateUser').disabled=false;
		document.getElementById('btnGenerateReport').disabled=false;
		break;
}
</script>
</body>
</html>