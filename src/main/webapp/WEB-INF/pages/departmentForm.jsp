<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <h1>New/Edit Department</h1>
        <form:form action="saveDepartment" method="post" modelAttribute="department">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Department Name:</td>
                <td><form:input path="name" /></td>
            </tr>
               <tr>
                <td colspan="2" align="center"><input type="submit" value="Save department"></td>
            </tr>
            </table>
        </form:form>
    </div>
</body>
</html>