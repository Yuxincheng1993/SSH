<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>产品数据更新</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath }/productmvc/update"
		method="post">
		<table>
			<tr>
				<td>商品id</td>
				<td>${productFromServer.pid}
				<!-- 隐藏域 -->
				<input type="hidden" name="pid" value="${productFromServer.pid}"></td>
			</tr>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="pname" value="${productFromServer.pname}"></td>
			</tr>
			<tr>
				<td>国际编号</td>
				<td><input type="text" name="ean" value="${productFromServer.ean}"></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input type="text" name="price" value="${productFromServer.price}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="更新"></td>
				<td><input type="reset" value="重置" /></td>
			</tr>
		</table>

	</form>
</body>
</html>