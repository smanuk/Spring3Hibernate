   <%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
   
    
    
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
              <li><a href="contacts">Contact</a></li>
              <li><a href="#about">About</a></li>
            </ul>
            
            <s:url var="authURL" value="/static/j_spring_security_check" />
            <s:url var="logoutURL" value="/static/j_spring_security_logout" />
            
            <form method="post" class="navbar-form pull-right" action="${authURL}">
              <input id="username_or_email" name="j_username" class="span2" type="text" placeholder="User name">
              <input id="password" name="j_password" class="span2" type="password" placeholder="Password">
              <button type="submit" class="btn">Sign in</button>
              <!-- <small><a href="/account/resend_password">Forgot?</a></small> -->
              <small><a href="/static/j_spring_security_logout">Logout!</a></small>
              
            </form>
            
            
            
          </div><!--/.nav-collapse -->
        </div>
      </div>
      
      <script type="text/javascript">
      	document.getElementById("username_or_email").focus();
      </script>
    </div>