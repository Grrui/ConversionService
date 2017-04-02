<%--
  Created by IntelliJ IDEA.
  User: Black
  Date: 2017/4/2
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <h3>注册页面</h3>
    <form action="register" method="post">
        <table>
            <tr>
                <td><label>登录名：</label></td>
                <td><input type="text" id="loginName" name="loginName"></td>
            </tr>
            <tr>
                <td><label>生日：</label></td>
                <td><input type="text" id="birthday" name="birthday"></td>
            </tr>
            <tr>
                <td><input type="submit" id="submit" value="登录"></td>
            </tr>
        </table>
    </form>
</body>
</html>
