<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "in.pwskills.entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Output Page</title>
</head>
<body>
    <h1 style ='color:red; text-align: center'>EMPLOYEE DATA</h1>
    <%Employee emp=(Employee) request.getAttribute("employee"); %> 
    <table border='1' align="center">
        <tr>
             <th>ID</th>
             <th>NAME</th>
             <th>AGE</th>
             <th>ADDRESS</th>
        </tr>
        <tr>
            <td> <%=emp.getId() %></td>
            <td> <%=emp.getName() %></td>
            <td> <%=emp.getAge() %></td>
            <td> <%=emp.getAddress() %></td>
        
        </tr>
    </table>
</body>
</html>