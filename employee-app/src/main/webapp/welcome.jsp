<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Hello Employee!!!</h1>
		<form action="employee" method="get"> 
			<label>ID:- </label> 
			<input type="text" name="getEmpName"/>
			<label>password:- </label> 
			<input type="password" name="gpwd"/>
			<input type="submit">
		</form>
		<br>
		<div>
			Entered Name:- ${getName}
		</div>
		
		<br>
		<br>
		
		<form action="employee" method="post"> 
			<label>Name:- </label> 
			<input type="text" name="postEmpName"/>
			<label>password:- </label> 
			<input type="password" name="ppwd"/>
			<input type="submit">
		</form>
		<br>
		<div>
			Entered Name:- ${postName}
		</div>
		
	</body>
</html>