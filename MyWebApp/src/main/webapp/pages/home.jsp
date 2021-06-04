<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   I lOve java
 <!--    Welcome ${name} --> <!--  usage of jstl expression langue to get the value of attribute name that we set in ctrlor -->
Welcome ${Obj.aname}, ${Obj.aid}, ${Obj.language}
</body>
</html>

<!--  whenever we look for http://localhost:8080/home tis page shpould be redirected to. or open up -->