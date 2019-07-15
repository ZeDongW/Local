<%@ page import="java.util.ResourceBundle" %><%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/7/15
  Time: 7:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        ResourceBundle bundle = ResourceBundle.getBundle("msg", request.getLocale());
    %>
    <title><%=bundle.getString("title")%></title>
</head>
<body>
    <form action="" name="frmLogin" method="post">
        <table align="center" border="1" cellspacing="0" cellpadding="0">
            <tr>
                <td><%=bundle.getString("userName")%></td>
                <td>
                    <input type="text" name="userName"/>
                </td>
            </tr>
            <tr>
                <td><%=bundle.getString("passWord")%></td>
                <td>
                    <input type="password" name="passWord"/>
                </td>
            </tr>
            <tr>
                <td align="center" colspan="2">
                    <input type="submit" value="<%=bundle.getString("login")%>"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
