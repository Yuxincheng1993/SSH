<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>显示所有商品</title>
</head>
<body>
	<h3>Welcome ${sessionScope.username }!</h3>

	<h3>商品列表如下：</h3>

	<table border="1">
		<tr>
			<td>商品ID</td>
			<td>商品名称</td>
			<td>国际编码</td>
			<td>商品价格</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${productListFromServer}" var="product">
		<tr>
			<td>${product.pid }</td>
			<td>${product.pname }</td>
			<td>${product.ean }</td>
			<td>${product.price }</td>
			<td>
			<a href="${pageContext.request.contextPath }/productmvc/delete?pid=${product.pid }" onClick="return confirm('确认删除吗？');">删除</a>
			<a href="${pageContext.request.contextPath }/productmvc/findbyid?pid=${product.pid}">修改</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<br/>
	<br/>
	<a href="${pageContext.request.contextPath }/productmvc/saveinit">增加新商品</a>
	<br/>
	<br/>
	<form method="post" action="${pageContext.request.contextPath }/productmvc/findbyid">
	PID:<input type="number" name="pid" value="1">
	<input type="submit" value="精确查询">
	</form>
	<br/>
	<br/>
	<form method="post" action="${pageContext.request.contextPath }/productmvc/findbyname">
	商品名称:<input type="text" name="pname" value="F">
	<input type="submit" value="模糊查询">
	</form>
</body>
</html>