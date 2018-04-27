<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Witaj!</title>
	</head>
	<body>
		<h2>Witaj, twój adres IP to: <%=request.getRemoteAddr()%></h2>
		<a href="admin.jsp">Panel admina</a> 	
	</body>
</html>