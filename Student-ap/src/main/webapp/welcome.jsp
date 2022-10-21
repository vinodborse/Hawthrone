<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<form action="user">
				<label>Name:- </label> <input type="text" name="name">
				<input type="submit">
			</form>
			<br>
			Name is :- <% out.println(request.getAttribute("gname")); %> 
		</div>
		<br>
		<div>
			<form action="user" method="post">
				<label>Name:- </label> <input type="text" name="name" />
				<input type="submit" />
			</form>
			<br>
			Name is :- ${pname}
		</div>

		
	</body>
</html>