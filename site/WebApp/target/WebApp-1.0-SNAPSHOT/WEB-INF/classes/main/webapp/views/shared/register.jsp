<%--
  Created by IntelliJ IDEA.
  User: ivan
  Date: 18.6.2024 г.
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
</head>
<body>

<jsp:include page="navbar.jsp"/>
<h2>Register</h2>
<form action="register" method="post">
    <label for="username">Username:</label><br>
    <input type="text" id="username" name="username" required><br><br>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email" required><br><br>

    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password" required><br><br>

    <label for="deviceCode">DeviceCode:</label><br>
    <input type="number" id="deviceCode" name="deviceCode" required><br><br>

    <input type="submit" value="Register">
</form>
</body>
</html>

