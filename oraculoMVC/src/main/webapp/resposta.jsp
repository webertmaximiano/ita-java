<%-- 
    Document   : resposta
    Created on : Jul 1, 2023, 11:42:22 AM
    Author     : webert
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resposta dos Melhores Produtos</title>
    </head>
    <body>
        <h1>The Best products the type # ${param.produto} # the are:</h1>
        <ul>
            <c:forEach var="item" items="${produtos}">
                <li>${item}</li>
            </c:forEach>
        </ul>
    </body>
</html>
