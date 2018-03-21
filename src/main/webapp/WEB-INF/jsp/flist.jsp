<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" >
<tr>
<td>航班号</td>
<td>起飞城市</td>
<td>落地城市</td>
<td>起飞时间</td>
</tr>
<c:forEach items="${list}" var="f">
<tr>
<td>${f.flightID}</td>
<td>${f.startCityID.cityName}</td>
<td>${f.endCityID.cityName}</td>
<td>${f.startTime}</td>
</tr>
</c:forEach>
</table>
</body>
</html>