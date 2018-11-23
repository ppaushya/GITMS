<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form:form action="validateLogin" modelAttribute="login">
<table>
   <tr> 
    <td> username: </td>
    <td> <form:input path="userName"/> </td>
    </tr><tr>
    <td> password: </td>
    <td> <form:input path="password"/> </td>
    </tr>
    <tr> 
    <td> </td>
    
    <td> <form:button name= "submit" value ="submit"> Submit </form:button> </td>
    </tr>
    
   


</table>
</form:form>

</body>
</html>