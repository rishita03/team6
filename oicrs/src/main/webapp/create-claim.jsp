<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Claim</title>
</head>
<body>
<center>
<jsp:include page="navbar.jsp"></jsp:include>

<br><br><br>

<h3>Create Claim..</h3>


<form action="createclaim" method="post">
<br>
Enter Claim Number : <input type="text" name="claimNumber"> <br>
Enter Claim Reason : <input type="text" name="claimReason"> <br>
Enter Accident Location Street : <input type="text" name="accidentLocationStreet"> <br>
Enter Accident City: <input type="text" name="accidentCity"> <br>
Enter Accident State: <input type="text" name="accidentState"> <br>
Enter Accident Zipcode: <input type="text" name="accidentZip"> <br>
Enter Claim Type: <input type="text" name="claimType"> <br>
Enter Policy Number: <input type="text" name="policyNumber">

<br><br><br>

<button type="submit">Submit</button>

</form>
</center>
</body>
</html>