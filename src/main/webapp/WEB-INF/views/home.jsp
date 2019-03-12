<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<script type="text/javascript"
  src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript" src="http://geoapi.heartrails.com/api/geoapi.js"></script>
<script type="text/javascript"
  src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript" src="http://geoapi.heartrails.com/api/geoapi.js"></script>
<body>
<!-- <select id="geoapi-areas" name="geoapi-areas">
  <option value="エリアを選択してください">エリアを選択してください</option>
</select>
<select id="geoapi-cities" name="geoapi-cities">
  <option value="市区町村名を選択してください">市区町村名を選択してください</option>
</select>
<select id="geoapi-towns" name="geoapi-towns">
  <option value="町域を選択してください">町域を選択してください</option>
</select> -->

<select id="geoapi-prefectures" name="geoapi-prefectures">
  <option value="都道府県を選択してください">都道府県を選択してください</option>
</select>
<select id="geoapi-cities" name="geoapi-cities">
  <option value="市区町村名を選択してください">市区町村名を選択してください</option>
</select>
<select id="geoapi-towns" name="geoapi-towns">
  <option value="町域を選択してください">町域を選択してください</option>
</select>
</body>
</html>
