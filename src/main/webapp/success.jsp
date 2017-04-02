<%--
  Created by IntelliJ IDEA.
  ustc.gr.InterController.User: Black
  Date: 2017/4/2
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
    this is success.jsp!!
    登录名：${requestScope.user.loginName}<br>
    生日：<fmt:formatDate value="${requestScope.user.birthday}" pattern="yyyy年MM月dd日"/><br>
</body>
</html>
