<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>@ModelAttribute Test Bed</title>
<style>
input[type=text] {
	padding: 10px;
	margin: 10px;
	font-size: 20px
}

input[type=submit] {
	border: none;
	background-color: #4CAF50;
	color: white;
	padding: 16px;
	margin: 16px;
	cursor: pointer;
	font-size: 20px;
	color: white;
	padding: 16px;
	margin: 16px;
	cursor: pointer;
}

h1, h2 {
	color: #08298A;
	text-align: center
}
</style>
</head>
<body>
	<div align="Left">
		<h1>${testData1A}</h1>
		<div align="center">
			<b>Corporate office: ${testData3.city} ${testData3.zipcode},</b> <b>
				Registered office: ${address.city} ${address.zipcode}</b>
		</div>
		<hr />

		${testData1B} ${testData2}
		<hr />
		<form:form action="test5" modelAttribute="anAddress">
			<h3>Test 5: @ModelAttribute annotation with 'value' attribute
				and default binding</h3>
			<table>
				<tr>
					<td><form:label path="city">City Name</form:label></td>
					<td><form:input path="city" /></td>
				</tr>
				<tr>
					<td><form:label path="zipcode">Postal Code</form:label></td>
					<td><form:input path="zipcode" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Display Address" /></td>
				</tr>
			</table>
		</form:form>
		<br> <br>
		<form:form action="modelAttributeTest">
			<h3>Test 6: Testing @ModelAttribute with no explicit logical
				view name</h3>
			<table>
				<tr>
					<td><input type="submit" value="Relocate" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>