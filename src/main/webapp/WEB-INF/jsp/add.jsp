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
<table align="center" border="1">
	<f:form action="save" method="post">
		<tr>
			<td>Name: </td><td><f:input path="name"/></td>
		</tr>
		<tr>
			<td>Gender: </td>
			<td>Male<f:radiobutton path="gender" value="Male"/>
			Female<f:radiobutton path="gender" value="Female"/>
			</td>
		</tr>
		<tr>
			<td>Category: </td><td><f:select path="category">
			<f:option value="Select">Select</f:option>
			<f:option value="Running">Running</f:option>
			<f:option value="High Jump">High Jump</f:option>
			<f:option value="Hurdles">Hurdles</f:option>
			<f:option value="Relay">Relay</f:option>
			<f:option value="Javelin Throw">Javelin Throw</f:option>
			<f:option value="Shot put">Shot put</f:option>
			</f:select>
			</td>
		</tr>
		<tr>
			<td>Email: </td><td><f:input path="email"/></td>
		</tr>
		<tr>
			<td>Mobile: </td><td><f:input path="mobile"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Add">
			<input type="reset" value="Cancel"></td>
			<td><a href="index.jsp">Home</a></td>
		</tr>
	</f:form>
</table>
</body>
</html>