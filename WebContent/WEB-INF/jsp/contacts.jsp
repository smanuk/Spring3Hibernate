<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Spring 3 MVC Series - Contact Manager</title>
</head>
<body>
	<h2>Contact Manager</h2>
	<form:form method="post" action="addContact" commandName="contact">
	 
	    <table>
		    <tr>
		        <td><form:label path="firstname">First Name</form:label></td>
		        <td><form:input path="firstname" /></td>
		    </tr>
		    <tr>
		        <td><form:label path="lastname">Last Name</form:label></td>
		        <td><form:input path="lastname" /></td>
		    </tr>
		    <tr>
		        <td><form:label path="email">Email</form:label></td>
		        <td><form:input path="email" /></td>
		    </tr>
		    <tr>
		        <td><form:label path="telephone">Telephone</form:label></td>
		        <td><form:input path="telephone" /></td>
		    </tr>
		    <tr>
		        <td colspan="2">
		            <input type="submit" value="Add Contact"/>
		        </td>
		    </tr>
		</table> 
	</form:form>

	<h3>Contacts</h3>
		<c:if  test="${!empty contactList}">
	<table class="data">
	<tr>
	    <th>Name</th>
	    <th>Email</th>
	    <th>Telephone</th>
	    <th>&nbsp;</th>
	</tr>
	
	<c:forEach items="${contactList}" var="contact">
	    <tr>
	        <td>${contact.lastname}, ${contact.firstname} </td>
	        <td>${contact.email}</td>
	        <td>${contact.telephone}</td>
	        <td><a href="deleteContact/${contact.id}">delete</a></td>
	    </tr>
	</c:forEach>
	</table>
	</c:if>

</body>
</html>