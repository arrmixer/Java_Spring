<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>@ModelAttribute test</title>
<style>
h1, h2 {
	color: #08298A;
	text-align: center
}
</style>
</head>
<body>
	<h1>@ModelAttribute Test Results</h1>
	<hr />
	<div align="center">
		<c:if test="${testData5A !=null && testData5B != null}">
			<h3 style="">City: ${testData5A}</h3>
			<h3 style="">Zip Code: ${testData5B}</h3>
		</c:if>

		<c:if test="${testData6 != null}">
			Address relocated to: <h3 style="color: #DF0101">${testData6.city},
				${testData6.zipcode}</h3>
		</c:if>
	</div>
</body>
</html>