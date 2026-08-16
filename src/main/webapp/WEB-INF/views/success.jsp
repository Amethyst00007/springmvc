<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page isELIgnored = "false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<h1>${Header }</h1>
<p>${Desc }</p>
<h1 style="color:pink">${msg }</h1>
<hr>
<h1>Welcome, ${user.username }</h1>
<h1>Your email is: ${user.email }</h1>
<h1>Your password is ${user.password }, Try to secure it!</h1>

</body>
</html>