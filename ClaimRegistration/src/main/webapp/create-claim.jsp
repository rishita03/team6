<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Claim</title>
</head>
<body>
<form action="createclaim" method="post">

Enter Claim Number : <input type="text" name="claimNumber"> <br>
Enter Claim Reason : <input type="text" name="claimReason"> <br>
Enter Accident Location Street : <input type="text" name="accidentLocationStreet"> <br>
Enter Accident City: <input type="text" name="accidentCity"> <br>
Enter Accident State: <input type="text" name="accidentState"> <br>
Enter Accident ZipCode: <input type="text" name="accidentZip"> <br>
Enter Claim Type: <input type="text" name="claimType">
Enter Policy Number: <input type="text" name="policyNumber">

<br>
<button type="submit">Submit</button>

</form>

</body>
</html>
