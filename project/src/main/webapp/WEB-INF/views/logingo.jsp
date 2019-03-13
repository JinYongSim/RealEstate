<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<!-- 
	Code here
	로그인 시 아이디와 비밀번호를 요구에 맞게  입력했는지 검증
	해당 아이디나 비밀번호가 없을 경우 출력메시지
 -->
<script src="resources/jquery-3.1.1.min.js"></script>
<script>
	$(function() {		//온로드
		$("#loginbtn").on("click",formcheck);	//버튼 클릭시 폼체크 함수실행
	});
	
	function formcheck(){
		var id = $("#customer_id").val();//문자열 처리화 후
		var pwd = $("#customer_pw").val();
		
		if(id.length > 10 || id.length<3 || pwd.length>10 || pwd.length<3) {	//길이값 비교
			$("#message").html("로그인을 할 수 없습니다.");
		}
		else{
			$("#loginForm").submit();
		}
		
	}
</script>



<style>
div#message {
	color :red;
}
</style>
</head>
<body>
<h2>[ 로그인 ]</h2>
<div id="message">${message }</div>
<form id="loginForm" action="login" method="post">
<table>
<tr>
	<td>아이디</td>
	<td><input type="text" id="customer_id" name="customer_id" placeholder="3~10 자리 ID 입력" />
	</td>
</tr>
<tr>
	<td>비밀번호</td>
	<td><input type="password" id="customer_pw" name="customer_pw" placeholder="3~10자리 비밀번호 입력"></td>
</tr>
<tr>
	<td colspan="2" >
	<input id="loginbtn" type="button" value="로그인" />
	</td>
</table>
</form>
</body>
</html>
