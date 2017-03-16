<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="x" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<x:form>
		<table>
			<tr>
				<td><x:label path="name">用户名</x:label></td>
				<td><x:input path="name"/></td>
			</tr>
			<tr>
				<td><x:label path="age">密码</x:label></td>
				<td><x:password path="age"/></td>
			</tr>
		</table>
	</x:form>
</body>
</html>