<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>用户登录</title>
</head>
<body>

<form action="shiroLogin.do" method="post">
	username:<input type="text" name="username">
	<br><br>
	password:<input type="password" name="password">
	<br><br>
	<input type="submit" value="submit">
</form>
</body>
</html>