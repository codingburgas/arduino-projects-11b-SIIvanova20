<html>
<head>
    <title>navbar</title>
    <link rel="stylesheet" href="assets/styles/css/navbar.css">
    <link rel="stylesheet" href="../../assets/styles/css/navbar.css">
</head>
<body>

<nav>

    <ul>
        <li><a class="active" href="index.jsp">Home</a></li>
        <li><a href="">Stats</a></li>
        <li><a href="">Contacts</a></li>
        <li><a href="" style="text-align: right">Profile</a></li>
        <%
            String username = (String) session.getAttribute("username");
            if (username != null) {
        %>
        <li><a href="logout">Logout</a></li>
        <%
        } else {
        %>
        <li><a href="register">Sign up</a></li>
        <li><a href="login">Log in</a></li>
        <%
            }
        %>
    </ul>

</nav>


<script src="assets/script/navbar.js"></script>
<script src="../../assets/script/navbar.js"></script>
</body>
</html>