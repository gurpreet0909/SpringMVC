<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<body>
    <link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css"/>
    
    <p><a href ="/StudentRegistration/admissionForm.html?siteTheme=green">Green</a> |
    <a href ="/StudentRegistration/admissionForm.html?siteTheme=red">Red</a></p>
    
	<a href="/StudentRegistration/admissionForm.html?siteLanguage=en">English</a>
	|
	<a href="/StudentRegistration/admissionForm.html?siteLanguage=fr">français
	</a>
	<h1>${msg}</h1>
	<h3>
		<spring:message code="label.admissionForm" />
	</h3>

	<form:errors path="student.*" />

	<form action="/StudentRegistration/submitAdmissionForm.html"
		method="post">
		<table>
			<tr>
				<td><spring:message code="label.studentName" /></td>
				<td><input type="text" name="studentName" /></td>
			</tr>

			<tr>
				<td><spring:message code="label.studentHobby" /></td>
				<td><input type="text" name="studentHobby" /></td>
			</tr>

			<tr>
				<td><spring:message code="label.studentMobile" /></td>
				<td><input type="text" name="studentMobile" /></td>
			</tr>

			<tr>
				<td><spring:message code="label.studentDOB" /></td>
				<td><input type="text" name="studentDOB" /></td>
			</tr>

			<tr>
				<td><spring:message code="label.studentSkills" /></td>
				<td><select name="studentSkills" multiple>
						<option value="Core Java">Core Java</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
				</select></td>
			</tr>

			<tr>
				<td><spring:message code="label.studentAddress"/></td>
			</tr>
			<tr>
				<td><spring:message code="label.city"/><input type="text"
					name="address.city"/></td>
				<td><spring:message code="label.country"/><input type="text"
					name="address.country"/></td>
				<td><spring:message code="label.street"/><input type="text"
					name="address.street"/></td>
				<td><spring:message code="label.pincode"/><input type="text"
					name="address.pincode"/></td>
			</tr>
		</table>
		<br></br>
		<spring:message code="label.submit" var="submit" />
		<input type="submit" value="${submit}" />
	</form>
</body>
</html>