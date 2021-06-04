<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "addAlien">
		ID == <input type = "text" name = "aid" ><br>
		NAME == <input type = "text" name = "aname"><br>
		LANGUAGE == <input type = "text" name = "lang"><br>
		<input type = "submit"><br>
	</form>
	<br><br>
	********************************************************
	FIND AN ALIEN <br><br>
	<form action = "getAlien">
		ID == <input type = "text" name = "aid"><br>
		<input type = "submit" ><br>
	</form>
	<br>
	*********************************************************
	<br>
	DELETE AN ALIEN <br>
	<form action = "deleteAlien">
	 ENTER ID === <input type = "text" name = "aid"><br>
	 <input type = "submit"><br>
	</form><br><br>
	
	**********************************************************
	<br>
	UPDATE AN ALIEN<br>
	<form action = "updateAlien1">
	 ENTER ID === <input type = "text" name = "aid">
	 <br>
	 <input type = "submit"><br>
	</form><br><br>
	**********************************************************
	FIND BY LANGUAGE
	
	<form action = "findByLang">
	 ENTER Language === <input type = "text" name = "lang">
	 <br>
	 <input type = "submit"><br>
	</form><br><br>
</body>
</html>