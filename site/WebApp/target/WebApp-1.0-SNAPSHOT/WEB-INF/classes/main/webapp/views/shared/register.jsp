<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="assets/styles/css/signup.css">
    <link rel="stylesheet" href="../../assets/styles/css/signup.css"><title>Login</title>
</head>

<body>
<video autoplay muted loop>
    <source src="assets/videos/Background.mp4" type="video/mp4">
    Your browser does not support the video tag.
</video>
<div class="login-container">
    <div class="login-form">
        <h2>Register</h2>
        <form action="register" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <label for="deviceCode">DeviceCode:</label>
            <input type="text" id="deviceCode" name="deviceCode" required>
            <div class="signup-link">
                <p>or if you have a profile, <a href="login">log in now</a></p>
            </div>
            <br>
            <button type="button" onclick="location.href='index.jsp'">Go back</button>
<%--            <button type="button" onclick="location.href='login.jsp'">Log in</button>--%>
            <input type="submit" value="Register">

            <div class="error">
                <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "" %>
            </div>
        </form>
    </div>
</div>
</body>
</html>