<%--
  Created by IntelliJ IDEA.
  User: Angel
  Date: 6/12/17
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>Welcome</title>
  </head>
  <body>
  <c:forEach var="messageitem" items="${myWelcomeMessage}">
    <c:out value="${messageitem}"></c:out>
  </c:forEach>
  </body>
</html>
