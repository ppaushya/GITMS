<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> You are loggedin.</h1>
<form:form action="registerForm"  modelAttribute="register" method="post" >
<table>
	<tr>
		<th colspan="3">Register Form</th>
	</tr>
	
	<tr>
		<td>First Name:</td>
		<td>
			  <form:input path="firstName"/>
			  
		</td>
		<td>
		  <form:errors path="firstName"> </form:errors>
		
	</tr>
	
	<tr>
		<td>Last Name:</td>
		<td>
			 <form:input path="lastName"/>
		</td>
	</tr>
	
	<tr>
		<td>Address:</td>
		<td>
			 <form:input path="address"/>
		</td>
	</tr>
	
	<tr>
		<td>City:</td>
		<td>
			 <form:select path="city">
			 <form:option value="Chennai">Chennai</form:option>
			  <form:option value="Pune">Pune</form:option>
			  </form:select>
		</td>
	</tr>
	
	<tr>
		<td>Gender:</td>
		<td>
			 <form:radiobutton path="gender" value="Female"/>Female
			 <form:radiobutton path="gender" value="Male"/>Male
		</td>
	</tr>
	
	<tr>
		<td>Qualification:</td>
		<td>
			<form:checkbox path="qualification" value="MBA"/>MBA
		</td>
	</tr>
	
	<tr>
		<td>Date of Birth:</td>
		<td>
			<form:input path="dateOfBirth"/>
		</td>
	</tr>
	
	<tr>
		<td>Email Id:</td>
		<td>
			<form:input path="emailId"/>
		</td>
	</tr>
	
	<tr>
		<td>Registration Fee</td>
		<td>
			<form:input path="regFee"/>
		</td>
		
	</tr>
	<tr>
		<td>Password:</td>
		<td>
			<form:password path="password"/>
		</td>
	</tr>
	
	<tr>
		<td>Confirm Password:</td>
		<td>
			<form:password path="confirmPassword"/>
		</td>
	</tr>
	
	<tr>
		<td></td>
		<td>
			<input type="submit" value="register" name="register"/>
		</td>
	</tr>
	
	</table>
	<form:errors path="*"></form:errors>
	</form:form>
</body>
</html>