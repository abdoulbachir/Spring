<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Confirmation</title>
</head>
<body>
		
		The student is confirmed: ${student.firstName} ${student.lastName}
		<br>
		Country: ${student.country}
		<br>
		Favorite Programming Language: ${student.favoriteLanguage}
		<br>
		Operating Systems:
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}">
				<li>${temp}</li>
			</c:forEach>
		</ul>
</body>
</html>