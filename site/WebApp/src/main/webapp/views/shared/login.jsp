<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="assets/styles/css/register.css">
    <link rel="stylesheet" href="../../assets/styles/css/register.css"><title>Login</title>
</head>
<body>
<video autoplay muted loop>
    <source src="assets/videos/Background.mp4" type="video/mp4">
    Your browser does not support the video tag.
</video>
<div class="login-container">
    <div class="login-form">
        <h2>Log in</h2>
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
            <button type="button" onclick="location.href='index.jsp'">Go back</button>
            <input type="submit" value="Log in" class="btn-login">
            <div class="error">
                <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "" %>
            </div>
        </form>
    </div>
</div>
</body>
</html>