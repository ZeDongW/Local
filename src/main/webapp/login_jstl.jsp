<%@ page import="java.util.ResourceBundle" %><%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/7/15
  Time: 8:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="msg" var="bundle"></fmt:setBundle>
<fmt:setLocale value="${pageContext.request.locale}"></fmt:setLocale>
<html>
<head>
    <title><fmt:message key="title" bundle="${bundle}"/> </title>
</head>
<body>
<form action="" name="frmLogin" method="post">
    <table align="center" border="1" cellspacing="0" cellpadding="0">
        <tr>
            <td><fmt:message key="userName" bundle="${bundle}"/> </td>
            <td>
                <input type="text" name="userName"/>
            </td>
        </tr>
        <tr>
            <td><fmt:message key="passWord" bundle="${bundle}"/> </td>
            <td>
                <input type="password" name="passWord"/>
            </td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <input type="submit" value="<fmt:message key="login" bundle="${bundle}"/> "/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
