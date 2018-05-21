<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html>
<html>
<body>
	<a href="user.jsp">user</a>
	<a href="admin.jsp">admin</a>
	Welcome: <shiro:principal></shiro:principal>
	<shiro:hasRole name="admin">admin才能看见</shiro:hasRole>
	<h2>
		<a href="shiroLogout.do">logout</a>
	</h2>
</body>
</html>
