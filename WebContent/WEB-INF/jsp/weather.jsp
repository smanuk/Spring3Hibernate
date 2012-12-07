<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="container-fluid">

	<h3>Five Day forecast for London</h3>
	
	<div class="row-fluid">
	
		<c:if  test="${!empty forcasts}">
			<c:forEach items="${forcasts}" var="forecast">
			
				<div class="span2">
				
					<table class="table" border="0" align="center">
						<tr>
							<th>
								${forecast.getDay()}
							</th>
						</tr>
						<tr>
							<th>
								${forecast.getWeatherDate()}
							</th>
						</tr>
						<tr>
							<td>
								<img src="${forecast.getWeatherIconURL()}" alt="${forecast.getWeatherDescription()}" />
							</td>
						</tr>
						<tr>
							<td>
								${forecast.getWeatherDescription()}
							</td>
						</tr>
						<tr>
							<td>
								Max Temp: ${forecast.getTempMaxC()}
							</td>
						</tr>
						<tr>
							<td>
								Min Temp: ${forecast.getTempMinC()}
							</td>
						</tr>
					</table>
				</div> <!-- span2 -->
				
			</c:forEach>
		</c:if>
		
	</div> <!-- row-fluid -->
	
	This page is powered by <a href="http://www.worldweatheronline.com"><img src="https://cfd2805775078872f9b1-312816f18de5dccbb0e2e69afeea4a4f.ssl.cf1.rackcdn.com/img/logo.png"  width="125" alt="www.worldweatheronline.com Logo" /></a>

</div> <!-- container-fluid -->