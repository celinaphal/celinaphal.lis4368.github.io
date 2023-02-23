<!DOCTYPE html>
<html lang="en">
<head>
<!--
"Time-stamp: <Sat, 01-02-21, 19:40:00 Eastern Standard Time>"
//-->

	<title>LIS4368 - Assignment 3</title>
	<link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon.png">
	<link rel="icon" type="image/png" sizes="32x32" href="/favicon-32x32.png">
	<link rel="icon" type="image/png" sizes="16x16" href="/favicon-16x16.png">
	<link rel="manifest" href="/site.webmanifest">

	<link rel="icon" type="image/x-icon" href="/favicon.ico">

	<%@ include file="/css/include_css.jsp" %>		
	
</head>
<body>

<!-- display application path -->
<% //= request.getContextPath()%>
	
<!-- can also find path like this...<a href="${pageContext.request.contextPath}${'/a5/index.jsp'}">A5</a> -->

	<%@ include file="/global/nav.jsp" %>	

	<div class="container">
		<div class="starter-template">
					<div class="page-header">
						<%@ include file="global/header.jsp" %>
					</div>

					<b>Petstore Database (Entity Relationship Diagram):</b><br />
					<img src="img/erd.png" class="img-responsive center-block" alt="A3 ERD" />


					<b>Pet Table:</b><br />
					<img src="img/img1.png" class="img-responsive center-block" alt="A3 Pet" />


					<b>Customer Table:</b><br />
					<img src="img/img2.png" class="img-responsive center-block" alt="A3 Pet" />


					<b>Petstore Table:</b><br />
					<img src="img/img3.png" class="img-responsive center-block" alt="A3 Pet" />


					<br /> <br />
					<b>MySQL Workbench and SQL Files:</b><br />
					<a href="docs/a3.mwb">Petstore MySQL Workbench File</a>
				<br />
					<a href="docs/A3.sql">Petstore SQL File</a>				

	<%@ include file="/global/footer.jsp" %>

	</div> <!-- end starter-template -->
 </div> <!-- end container -->

 	<%@ include file="/js/include_js.jsp" %>		
 
</body>
</html>
