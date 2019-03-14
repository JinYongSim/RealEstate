<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
</script>
<body>
	<form>
	<a href="goInsertItem">매물등록</a>
	</form>
	
<c:if test="${sessionScope.loginId==null}">
<a href="signupgo">고객 회원가입</a><br><br>
<a href="logingo">고객 로그인</a>
</c:if>

<c:if test="${sessionScope.loginId!=null}">
<a href="logout">고객 로그아웃</a>
</c:if>
	
	
</body>
</html>
