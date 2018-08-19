<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import = "nissan_web.add" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import = "nissan_web.add" %>
<% if(request.getParameter("val1")=="" || request.getParameter("val2")==""  ){ %>
   <h2>Please enter both the text boxes with numbers</h2>
   <% } else{  add a = new add();
	   String result= a.addn(request.getParameter("val1"),request.getParameter("val2"));%>
     <%="<h1> The sum is "+(result)+"</h1>"%>
  <%} %>

</body>
</html>