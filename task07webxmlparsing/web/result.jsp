<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    table, th, td {
        border:1px solid black;
    }
</style>
<head>
    <title>Results</title>
</head>
<p>
<h1>Users table</h1>
<h2>Parsed using: ${parser} parser</h2>
<table style="width:100%">
    <tr>
        <th>User ID</th>
        <th>Username</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Role</th>
        <th>Active</th>
        <th>Registration date</th>

    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <th><c:out value="${user.getUserId()}"/></th>
            <th><c:out value=" ${user.getUsername()}"/></th>
            <th><c:out value=" ${user.getName()}"/></th>
            <th><c:out value=" ${user.getSurname()}"/></th>
            <th><c:out value=" ${user.getPhone()}"/></th>
            <th><c:out value=" ${user.getEmail()}"/></th>
            <th><c:out value=" ${user.getRole()}"/></th>
            <th><c:out value=" ${user.getIsActive()}"/></th>
            <th><c:out value=" ${user.getRegDate()}"/></th>
        </tr>
    </c:forEach>
</table>
<p><form action="/xml">
    <input type="submit" value="Parse another xml file" />
</form>
</p>
</body>
</html>
