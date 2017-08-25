<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>index</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/loginmvc/login" method="post">
	USERNAME:<input type="text" name="username" value="scott"><br/>
	PASSWORD:<input type="password" name="password" value="tiger"><br/>
	<input type="submit" value="登录"><br/>
	<a href="${pageContext.request.contextPath }/loginmvc/showRegistry">注册</a>

</form>
</body>
</html>