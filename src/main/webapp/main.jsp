<%--
  Created by IntelliJ IDEA.
  User: Beloved
  Date: 2019/12/24
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="0" align="centre">
    <s:iterator value="list" var="u">
        <tr>
            <td>${u.uid}</td>
            <td>${u.uname}</td>
            <td>${u.pwd}</td>
        </tr>

    </s:iterator>
</table>
</body>
</html>
