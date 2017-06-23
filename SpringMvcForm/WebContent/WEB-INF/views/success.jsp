<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Submitted</title>
</head>
<body>
<h2>Submitted Employee Information</h2>
    <table>
        <tr>
            <td>First Name :</td>
            <td>${firstname}</td>
        </tr>
        <tr>
            <td>Last Name :</td>
            <td>${lastname}</td>
        </tr>
       
    </table>	
</body>
</html>