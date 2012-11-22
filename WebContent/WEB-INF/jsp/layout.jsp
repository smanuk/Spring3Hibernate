<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><tiles:insertAttribute name="title" ignore="true" /></title>

<tiles:insertAttribute name="styles" />


</head>
<body>
	<div id="wrap">
		<div class="container">
		
			
			<tiles:insertAttribute name="menu" />
	
	      	<tiles:insertAttribute name="body" />
	
		
			
			
		</div> <!-- container -->
		<div id="push"></div>
		
	</div> <!-- wrap -->
	
	<tiles:insertAttribute name="footer" />
	
	
	
	
	<!-- ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/bootstrap.js"></script>
</body>
</html>