<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>
<video autoplay muted loop id="myVideo">
    <source src="../../assets/videos/Background.mp4" type="video/mp4">
</video>
<div class="login-form">
    <h2>Login</h2>
    <form action="login" method="post">
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" id="username" name="username" placeholder="Your Username" required>
        </div>
        <br>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholder="Your Password" required>
        </div>
        <br>
        <input type="submit" value="Login" class="btn-login">
        <div class="error">
            <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "" %>
        </div>
    </form>
</div>
</body>
</html>
