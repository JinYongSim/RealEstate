<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 모드</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.css">
<script src="//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.min.js"></script>

<style type="text/css">
	#topLeft{
		height: 20%;
		width: 50%;
		float: left;
	} 
	#topRight{
		height: 20%;
		width: 50%;
		float: right;
	} 
	#midLeft{
		height: 50%;
		width : 20%;
		float: left;
	}
	#midRight{
		height: 50%;
		width: 80%;
		float: right;
		text-align: center;
	}
	#bottom {
		height: 30%;
		clear:both;
	}
	#admin_ID{
		vertical-align: 10px;
	}
	
	.table{
		float : right;
		text-align: left;
	}
	
	.menu a{
		cursor:pointer;
	}
    .menu .hide{
    	display:none;
    }

	
</style>
<script>
 $(function(){
	 $("#loginButton").on("click", function(){
		 loginCheck();
	 }); 
	 
	 $(".menu>a").click(function(){
         $(this).next("ul").toggleClass("hide");
     });
	 
	 $(".menu>a>a").click(function(){
         $(this).next("ul").toggleClass("hide2");
     });
	
	 $("#customer1").on("click", function(){
		 customerGenderStats();
	 })
 })
 
 function loginCheck(){
	 var id = $("#admin_ID").val();
	 var pw = $("#admin_PW").val();
	 //var date = new Date();
	 if (id.length ==0) {
		alert("ID가 입력되지 않았습니다.");
		$("#admin_ID").focus();
		return;
	}
 	if (pw.length ==0) {
		alert("pw가 입력되지 않았습니다.");
		$("#admin_PW").focus();
		return;
	}
 	
	$.ajax({
		url: "adminLogin"
		,data: {admin_ID : id
				, admin_PW: pw}
		,type : "post"
		,success: function(data){
			alert(data);
			location.reload();
		}
	}) //ajax
 }
 
function customerGenderStats(){
	$("#midRight").empty();
	$("#midRight").html("고객성별통계");
	$.ajax({
		url: "customerGenderStats"
		,data:{}
		,type:"post"
		,success: function(cList){
			var data = [];
			$.each(cList, function(index,item){
				data.push( {label: item.customer_Gender, value: item.stats_Count});
			})
			  new Morris.Donut({
		            element: 'midRight',
		            data: data
		        });
		}
	})
}
</script>
</head>
<body>
<div id = "topLeft"></div>
<div id = "topRight">
	<c:if test="${sessionScope.admin == null}">
		<table id = "loginTable">
			<tr>
				<td>
					아이디: 
				</td>
				<td>
					<input type = "text" id = "admin_ID" name = "admin_ID"> 
				</td>
			</tr>
			<tr>
				<td>
					비밀번호: 
				</td>
				<td>
					<input type = "password" id = "admin_PW" name = "admin_PW">
				</td>
				<td>
					<input type = "button" id = "loginButton" value = "확인"> 
				</td>
			</tr>
		</table>
	</c:if>
	<c:if test="${sessionScope.admin != null }">
		<table>
			<tr>
				<td>
					관리자 이름:
				</td>
				<td>
					${sessionScope.admin.admin_Name}
				</td>
			</tr>	
			<tr>	
				<td>
					관리자 부서:
				</td>
				<td>
					${sessionScope.admin.admin_Department}
				</td>
				<td>
					<a href = "adminLogout">로그아웃</a>
				</td>
			</tr>
		</table>
	</c:if>
</div> 
<div id = "midLeft">
	 <ul>
        <li class="menu">
           <a href = "#">회원관리메뉴</a>
            <ul class="hide">
                <li>
                	<a href = "#">회원통계</a>
                		<ul class = "hide2">
                			<li><a href = "#" id = "customer1">성별통계</a></li>
                		</ul>
                </li>
                <li>메뉴1-2</li>
                <li>메뉴1-3</li>
                <li>메뉴1-4</li>
                <li>메뉴1-5</li>
                <li>메뉴1-6</li>
            </ul>
        </li>
 
        <li class="menu">
            <a href = "#">기업관리메뉴</a>
            <ul class="hide">
                <li>메뉴2-1</li>
                <li>메뉴2-2</li>
                <li>메뉴2-3</li>
                <li>메뉴2-4</li>
                <li>메뉴2-5</li>
                <li>메뉴2-6</li>
            </ul>
        </li>
   </ul>
 </div>
<div id = "midRight"></div>
<div id = "bottom"></div>


</body>
</html>