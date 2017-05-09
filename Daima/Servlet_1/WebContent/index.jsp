<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>first servlet</title>
</head>
<body>
<a href="servlet/HelloServlet">Get请求</a>
<form action="servlet/HelloServlet" method="post">
您的姓名:<input type="text" name="name" value="hint">
<input type="submit" value="发送">
<input type="reset" value="重置">
</form>
</body>
</html>