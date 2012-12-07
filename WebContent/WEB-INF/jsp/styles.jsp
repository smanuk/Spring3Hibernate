<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

	<s:url var="styleMin" value="/resources/css/bootstrap.min.css" />
	<s:url var="styleResp" value="resources/css/bootstrap-responsive.css" />
	

	<link href="${styleMin}" rel="stylesheet" media="screen">
	

    <style type="text/css">
    	body {
    		padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
        	padding-bottom: 40px;
        }
        
       .container {
        width: auto;
        max-width: 1680px;
      }
      .container .credit {
        margin: 20px 0;
      }
	  
     </style>
     
    <link href="${styleResp}" rel="stylesheet">
    
    <!-- Fav and touch icons -->
    <link rel="shortcut icon" href="/assets/ico/favicon.ico">
