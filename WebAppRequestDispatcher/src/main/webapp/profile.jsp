<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
        String myname = (String)request.getAttribute("name_kay");
    %>
    <h3> Welcome : <%= myname %> </h3>
</body>
</html>