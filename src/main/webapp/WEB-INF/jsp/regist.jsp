<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
<script type="text/javascript" src="js/news.js"></script>
</head>

<body>
	<div id="mess" style="color: red;"></div>
	<!-- <form name="form1" method="post" action="control_regist.jsp"> -->
	<form name="form1" method="post" action="control.jsp">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userName" id="userName"
					value=''></td>
			</tr>
			<tr>
				<td>输入登录密码：</td>
				<td><input type="password" name="pwd" id="pwd"
					value=''></td>
			</tr>
			<tr>
				<td>再次输入密码：</td>
				<td><input type="password" name="validatepwd" id="validatepwd"
					value=''></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="注册"></td>
			</tr>
		</table>
	</form>
</body>
</html>