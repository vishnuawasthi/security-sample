<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>I 18 N - Example</title>
</head>
<body>
	<span style="float: right"> <a href="?language=en">English</a> | <a
		href="?language=fr">France</a>
	</span>

	<hr>
	<spring:message code="label.title"></spring:message>

</body>
</html>