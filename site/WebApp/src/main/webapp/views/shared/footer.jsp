<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 25.6.2024 г.
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>footer</title>
    <link rel="stylesheet" href="assets/styles/css/footer.css">
    <link rel="stylesheet" href="../../assets/styles/css/footer.css">
</head>
<body>
<footer>
    <div class="footer-container">
        <div class="footer-section">
            <h3>Authors</h3>
            <ul>
                <li>Author 1</li>
                <li>Author 2</li>
                <li>Author 3</li>
            </ul>
        </div>
        <div class="footer-section">
            <h3>Contacts</h3>
            <ul>
                <li>Email: info@example.com</li>
                <li>Phone: +1234567890</li>
                <li>Address: 123 Street Name, City, Country</li>
            </ul>
        </div>
        <div class="footer-section">
            <h3>Contact Us</h3>
            <form action="mailto:therealpedrometer@gmail.com" method="post" enctype="text/plain">
                <input type="text" placeholder="Your Name" required>
                <br>
                <br>
                <input type="email" placeholder="Your Email" required>
                <br>
                <br>
                <textarea placeholder="Your Message" required></textarea>
                <br>
                <br>
                <button type="submit">Send</button>
            </form>
        </div>
    </div>
</footer>
</body>
</html>
