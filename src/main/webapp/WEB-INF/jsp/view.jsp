<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">Athletics Registration System</h3>
<table align="center" border="1">
	<tr>
	<td>Athlete Id</td>
	<td>Athlete Name</td>
	<td>Gender</td>
	<td>Category</td>
	<td>Email</td>
	<td>Mobile</td>
	</tr>
<c:forEach var="athlete" items="${athlist}">
	<tr>
	<td>${athlete.id}</td>
	<td>${athlete.name}</td>
	<td>${athlete.gender}</td>
	<td>${athlete.category}</td>
	<td>${athlete.email}</td>
	<td>${athlete.mobile}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>