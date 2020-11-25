<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <style type ="text/css" >
        .footer{ 
            position: fixed;     
            text-align: center;    
            bottom: 0px; 
            width: 100%;
        }  
     </style>
     
     
     <div class="footer">Online Claim Registration System</div>


<meta charset="ISO-8859-1">
<title>Claim Report</title>

</head>

<jsp:include page="navbar.jsp"></jsp:include>

<marquee behavior="scroll" direction="up" scrollamount="1">Welcome to the Claim Report Page</marquee>

  


<body>
  
    <center>
	
	<h2>Report for the Requested Claim</h2>
	
	<form action="report" method="get">
	
		Enter Claim Number : <input type="text" name="claimNumber"> <br><br>
		

 		<button type="submit">Get Report</button>

	</form>

	</center>
	<div class="footer">
		<marquee behavior="scroll" direction="left" scrollamount="15"><h4>Get the Report for your Claim...</h4></marquee>
	</div>
    
</body>
</html>