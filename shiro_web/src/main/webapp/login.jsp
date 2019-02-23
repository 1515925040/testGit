<%--
  Created by IntelliJ IDEA.
  User: 丁艳青
  Date: 2019/2/8
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录测试</title>
</head>
<body>
丁艳青
<form action="${pageContext.request.contextPath}/user/userlogin" method="post" >
    用户名：<input type="text" name="username"><br/>

    密码：<<input type="text" name="password"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
