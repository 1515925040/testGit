<%@page pageEncoding="utf-8" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<body>
<h2>Hello World!</h2>
<shiro:authenticated>
    <shiro:principal></shiro:principal>//取出用户信息
</shiro:authenticated>
<shiro:notAuthenticated>
    您未登录，请登录
</shiro:notAuthenticated>
</body>
</html>
