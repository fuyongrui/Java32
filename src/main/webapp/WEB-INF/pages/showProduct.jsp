<%--
  Created by IntelliJ IDEA.
  User: Windows
  Date: 2019/10/16
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示所有Product</title>
</head>
<body>

<table width="500" height="400" border="1" cellspacing="0">

    <tr>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>商品生产日期</th>
        <th colspan="2">操作</th>

    </tr>
    <c:forEach items="${list}" var="p">
        <tr>
            <td>${p.pid}</td>
            <td>${p.pname}</td>
            <td>${p.price}</td>
            <td>${p.createDate}</td>
            <td><a href="delete?pid=${p.pid}">删除</a></td>
            <td><a>修改</a></td>
        </tr>

    </c:forEach>


</table>

</body>
</html>
