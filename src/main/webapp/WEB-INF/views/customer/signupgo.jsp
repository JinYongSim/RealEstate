<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(function(){
		
	$("#customer_id").on("keyup",idcheck);//아이디 중복체크 및 글자 길이
	$("#customer_pw").on("keyup",length);//비밀번호 길이
	$("#customer_name").on("keyup",hangl);//한글 유효성검사
	$("#signup").on("click",btn);//회원가입버튼시 유효성검사
	
	});
		
    function idcheck(){//아이디 유효성검사
	var id = $("#customer_id").val();
		$.ajax({
		  url:"idcheck",
		  type:"get",
		  data:{customer_id:id},
		  success:function(data1){
			  if(id.length<=10 && id.length>=3){
				  
				if(data1=="duplicated"){
					$("#duplicatemessage").html("ID중복");
				}else{
					$("#duplicatemessage").html("등록가능");
				}					
			  }else{
				  
				  $("#duplicatemessage").html("3이상10이하를 적어주세요");
			  }
			  
			  
		   }
			  
	    });
		
     }
    
    
    
    function length(){//pw의 길이 유효성검사
    	var pw=$("#customer_pw").val();
        if(pw.length>10 || pw.length<3){
        	$("#li").html("3이상10이하를 적어주세요");
        }
        else{
        	$("#li").html("");
        }
    }
    
    function hangl(){//한글 유효성검사
    	var name=$("#customer_name").val();
    	var han=/[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
    	if(han.test(name)==false){
    		$("#lu").html("한글을 적어주세요");
    		return false;
    	}else{
    		$("#lu").html("");
    	}
    }
 
    function btn(){    //회원가입 버튼을 누를시 널값 이메일형식 전화번호 형식의 유효성을 보여준다. 
    	
    	var id = $("#customer_id").val();
    	var pw = $("#customer_pw").val();
    	var name = $("#customer_name").val();
    	var address = $("#customer_address").val();
    	var birthdate= $("#customer_birthdate").val();
    	var nickname = $("#customer_nickname").val();
    	var phone = $("#customer_phone").val();
    	var gender =$('input[name="customer_gender"]:checked').val();

    	var email = $("#customer_email").val();
        var regEmail = /([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;//정규식이메일 
        var regPhone = /^(?:(010-\d{4})|(01[1|6|7|8|9]-\d{3,4}))-(\d{4})$/;//정규식 비밀번호

      
        
    	
    	
    	if(id==""){
    		alert("아이디를 입력하세요");
    		
    	}else if(pw==""){
    		alert("비밀번호를 입력하세요");
    		
    	}else if(name==""){
    		alert("이름을 입력하세요");
    		
    	}else if(address==""){
    		alert("주소를 입력하세요");
    		
    	}else if(birthdate==""){
    		alert("생일을 입력하세요");
    		
    	}else if(nickname==""){
    		alert("닉네임을 입력하세요");
    		
    	}else if(phone==""){
    		alert("핸드폰을 입력하세요");
    	
    	}else if(regPhone.test(phone)==false){
    		alert("잘못된 핸드폰 양식입니다");
    		return false;
    			
    	}else if(gender==""){
    		alert("성별을 입력하세요");
    		
    	}else if(email==""){
    		alert("이메일을 입력하세요");
    		
    	}else if(regEmail.test(email)==false){
    		alert("잘못된 이메일 형식입니다");
    		return false;
    		
    	}else{
    		$("#signupForm").submit();
    		
    	}  
    	
    	
    }
	
	
	
	/* $(function() {		//온로드
		$("#signup").on("click",formcheck);	//버튼 클릭시 폼체크 함수실행
	});
	
	function formcheck(){
		var id = ""+$("#customer_id").val();//문자열 처리화 후
		var pw = ""+$("#customer_pw").val();
	
		
		if(id.length > 10 || id.length < 3 || pw.length > 10 || pw.length < 3 ){
			$("#message").html("3~10자 사이를 입력하시오.");	
		    }
			else{
			$("#signupForm").submit();
		}
		
	} */
</script> 
<style>
div#message {
	color :red;
}
</style>
</head>
<body>
<h2>[ 회원가입 ]</h2>
<div id="message">${message}</div>
<form id="signupForm" action="signup" method="post">     <!--  onsubmit="return formcheck()" -->
	<table>
	<tr>
		<td>희망아이디</td>
		<td><input type="text" id="customer_id" name="customer_ID" placeholder="3~10 자리 ID 입력" /><b id="duplicatemessage"></b>
		</td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" id="customer_pw" name="customer_PW" placeholder="3~10자리 비밀번호 입력" /><b id="li"></b></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" id="customer_name" name="customer_Name" /><b id="lu"></b>
		</td>
	</tr>
	<tr>
		<td>주소</td>
		<td><input type="text" id="customer_address" name="customer_Address" />
		</td>
	</tr>
	<tr>
		<td>생년월일</td>
		<td><input type="date" id="customer_birthdate" name="customer_Birthdate"/>
		</td>
	</tr>
	<tr>
		<td>닉네임</td>
		<td><input type="text" id="customer_nickname" name="customer_Nickname"/>
		</td>
	</tr>
	<tr>
		<td>핸드폰번호</td>
		<td><input type="text" id="customer_phone" name="customer_Phone" >
		</td>
	</tr>
	<tr>
		<td>성별</td>
		<td><input type="radio" id="customer_gender" name="customer_Gender" value="남" checked/>남자
		    <input type="radio" id="customer_gender" name="customer_Gender" value="여" />여자
		</td>
	</tr>
	<tr>
		<td>이메일</td>
		<td>
			<input type="text" id="customer_email" name="customer_Email" >
		</td>
	</tr>
	
		<tr>
			<td colspan="2" >
				<input id="signup" type="button" value="회원가입" >
			</td>
		</tr>
	</table>
</form>
</body>
</html>