<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>Home</title>
</head>
<body>


<p align="center"> 메인페이지 </p>

<c:if test="${sessionScope.loginId==null}">
<form action="signupgo">
<input type="submit" value="회원가입"><br>
</form>
<form action="logingo">
<input type="submit" value="로그인">
</form>
</c:if>

<c:if test="${sessionScope.loginId!=null}">
<form action="logout">
<input type="submit" value="로그아웃">
</form>
</c:if>
</body>
</html>
