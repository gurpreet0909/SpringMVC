<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admission Success</title>
</head>
<body>
	<h1>${msg}</h1>
	
	<h3>Congratulations you applied successfully</h3>

	<table>
		<tr>
			<td>Student name :</td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby :</td>
			<td>${student.studentHobby}</td>
		</tr>
		<tr>
			<td>Student mobile :</td>
			<td>${student.studentMobile}</td>
		</tr>
		<tr>
			<td>Student DOB :</td>
			<td>${student.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills :</td>
			<td>${student.studentSkills}</td>
		</tr>
		<tr>
			<td>city :    ${student.address.city} 
			    country : ${student.address.country} 
			    street :  ${student.address.street}
				pinCode : ${student.address.pincode}</td>
		</tr>

	</table>


</body>
</html>