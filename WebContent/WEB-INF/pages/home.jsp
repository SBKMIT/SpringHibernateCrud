<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Management Screen</title>
</head>
<body>
    <div align="center">
        <h1>Student List</h1>
        <h3>
            <a href="newStudent">New Student</a>
             <a href="loginStudent">loginStudent</a>
        </h3>
        <table border="1" bordercolor="brown">
 
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Telephone</th>
            <th>Action</th>
 
            <c:forEach var="student" items="${students}">
                <tr>
 
                    <td>${student.name}</td>
                    <td>${student.email}</td>
                    <td>${student.address}</td>
                    <td>${student.telephone}</td>
                    <td><a href="editStudent?id=${student.id}">Edit</a>
                             <a
                        href="deleteStudent?id=${student.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
