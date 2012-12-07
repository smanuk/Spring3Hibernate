<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
   
	<div class="navbar navbar-inverse navbar-fixed-top">
    	<div class="navbar-inner">
        	<div class="container">
          		<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
          		</a>
          		
          		<a class="brand" href="home">Spring3 Hibernate4</a>
          		<div class="nav-collapse collapse">
          			
          			<ul class="nav">
              			<li class="active"><a href="home">Home</a></li>
              			<sec:authorize access="isAuthenticated() and hasRole('ROLE_MEMBER')">
              				<li><a href="contacts">Contact</a></li>
              			</sec:authorize>
              			<li><a href="weather">Weather</a></li>
              			<li><a href="#about">About</a></li>
            		</ul>
            
            		<s:url var="authURL" value="/static/j_spring_security_check" />
            		<s:url var="logoutURL" value="/static/j_spring_security_logout" />
            
            		<form method="post" class="navbar-form pull-right" action="${authURL}">
            		
		            	<sec:authorize access="not isAuthenticated()">
		              		<input id="username_or_email" name="j_username" class="span2" type="text" placeholder="User name">
		              		<input id="password" name="j_password" class="span2" type="password" placeholder="Password">
		              		<button  type="submit" class="btn">Sign in</button>
		              		<button  type="submit" formaction="/account/resend_password" class="btn">Forgot?</button>
		              	</sec:authorize>
              
             			<!--   <input id="remember_me" name="_spring_sejurity_remember_me" type="checkbox" class="span2" />
              			<label for="remember_me" class="span2">Remember me</label> -->
             
             			<sec:authorize access="isAuthenticated()">              
	             			<p class="navbar-text pull-right">
	            				<sec:authentication property="principal.username" var="loginID" />
	            				Logged in as <c:out value="${loginID}" />
	            				<button  type="submit" formaction="${logoutURL}" class="btn">Logout</button>
	            			</p>
   						</sec:authorize>
   					        
              			<!-- <small><a href="/account/resend_password">Forgot?</a></small> -->
					</form>
					
          		</div><!--/.nav-collapse -->
        	</div>
      	</div>
      
      	<script type="text/javascript">
      		document.getElementById("username_or_email").focus();
      	</script>
    </div>