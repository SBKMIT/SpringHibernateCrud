<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EducationDetails</title>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>
<body>
	<div align="center">
		<h1>Educational Details</h1>
		<form:form action="saveEducationDetail" method="post"
			modelAttribute="educationDetails">
			<table>
				
				<tr>
					<td>RollNumber:</td>
					<td><form:input path="rollNumber" />
					
					</td>
				</tr>
				<tr>
					<td>ClassYear:</td>
					<td><form:input path="classYears" />
					
				</tr>
				<tr>
					<td>Department:</td>
					<td><form:input path="department" />
					
				</tr>
				
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
