<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>新增商品</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/productmvc/save"
		method="post">
		<table>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="pname" value="WWW"></td>
			</tr>
			<tr>
				<td>国际编号</td>
				<td><input type="text" name="ean" value="www"></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input type="text" name="price" value="15.05"></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存"></td>
				<td><input type="reset" value="重置" /></td>
			</tr>
		</table>

	</form>
</body>
</html>