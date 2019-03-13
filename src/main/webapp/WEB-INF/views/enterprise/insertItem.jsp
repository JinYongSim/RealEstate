<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./resources/ckeditor/ckeditor.js"></script>

</head>
<body>
	<h1>매물 등록</h1>
	<table>
		<tr>
			<th>매물주소</th>
			<td><input type="text" id="forSale_Address"></td>
		</tr>
		<tr>
			<th>집세</th>
			<td><input type="text" id="forSale_Rent"></td>
		</tr>
		<tr>
			<th>시키킹</th>
			<td><input type="text" id="forSale_Deposit"></td>
		</tr>
		<tr>
			<th>레이킹</th>
			<td><input type="text" id="forSale_Reward"></td>
		</tr>
		<tr>
			<th>옵션</th>
			<td>
				<input type="checkbox" class="forSale_Address" value="승강기">
				<input type="checkbox" class="forSale_Address" value="베란다">
			</td>
		</tr>
	</table>
</body>
</html>