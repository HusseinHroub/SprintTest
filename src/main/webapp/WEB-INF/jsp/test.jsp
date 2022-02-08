<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.alhroub.demo.Helper,java.util.Locale"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
   Locale locale = request.getLocale();
   String language = locale.getLanguage();
   String country = locale.getCountry();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact List - Spring Boot Web Application Example</title>
</head>
<body>
    <div>
          <%if(Helper.isRTLDirection(request)) {%>
          <p> Right to left css must be providdded!</p>
          <%} else {%>
          <p> Left to rigt css must be providded!</p>
          <% } %>

                   <%
                      out.println("Language : " + language  + "<br />");
                      out.println("Country  : " + country   + "<br />");
                   %>
    </div>
</body>
</html>