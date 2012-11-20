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
	<div class="container-narrow">
	
		<tiles:insertAttribute name="menu" />
		
		<table border="1" cellpadding="2" cellspacing="2" align="center">
		    <tr>
		        <td height="30" colspan="2"><tiles:insertAttribute name="header" />
		        </td>
		    </tr>
		    <tr>
		        <td height="600"></td>
		        <td width="600"><tiles:insertAttribute name="body" /></td>
		    </tr>
		    <tr>
		        <td height="30" colspan="2"><tiles:insertAttribute name="footer" />
		        </td>
		    </tr>
		</table>
	</div>
	
	<!-- ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/bootstrap.js"></script>
</body>
</html>