<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
ALIEN INFORMATION
<form action = "updateAlien2">
		ID == <input type = "text" name = "aid" value = ${alien.aid} ><br>
		NAME == <input type = "text" name = "aname" value = ${alien.aname} ><br>
		LANGUAGE == <input type = "text" name = "lang" value = ${alien.lang} ><br>
		<input type = "submit"><br>
	</form>
</body>
</html>