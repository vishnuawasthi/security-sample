<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form  action="login"  method="POST" >
		<table align="center">
		
		<tr> <td colspan="3"> Please enter your details to login  :  </td> </tr>
		<tr> <td colspan="3"> ${error } </td> </tr>
		<tr> <td colspan="3">${logout}  </td> </tr>
			<tr>
				<td>User name :</td>
				<td><input type="text" name="username" /></td>
				<td></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"></td>
				<td> <%--  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> --%></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="login" /></td>
				<td></td>
			</tr>

		</table>

	</form>


</body>
</html>