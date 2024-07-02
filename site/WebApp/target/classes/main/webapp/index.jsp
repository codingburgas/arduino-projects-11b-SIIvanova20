<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Pedrometer</title>
  <link rel="stylesheet" href="assets/styles/css/styles.css">
  <link rel="stylesheet" href="../assets/styles/css/styles.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Urbanist:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<jsp:include page="views/shared/title.jsp"/>
<jsp:include page="views/shared/navbar.jsp"/>

<div class="container">
  <div class="top-div" >
    <h1>Why use pedrometer?</h1>
  </div>
  <div class="bottom-divs">
    <div class="bottom-div">
      <img src="assets/pictures/movement.png" alt="Placeholder Image">
      <h2>Increased Physical Activity</h2>
      <p>Pedometers provide real-time feedback and goals like 10,000 steps, encouraging more activity and tracking progress to boost motivation.
      </p>
    </div>
    <div class="bottom-div">
      <img src="assets/pictures/health.png" alt="Placeholder Image">
      <h2>Health Benefits</h2>
      <p>
        Walking with a pedometer improves cardiovascular health and aids weight management by lowering blood pressure and improving cholesterol.
      </p>
    </div>
    <div class="bottom-div">
      <img src="assets/pictures/convenience.png" alt="Placeholder Image">
      <h2>Convenience</h2>
      <p>
        Regular walking with a pedometer improves cardiovascular health, reduces heart disease risk, and aids weight management with a balanced diet.
      </p>
    </div>
  </div>
</div>
<%
  String username = (String) session.getAttribute("username");
  if (username != null) {
%>
<div class="milestone-div">
  <h3>Wow, you have walked the distance between the moon and the earth</h3>
</div>

<div class="outer-container">
  <div class="main-container">
    <div class="first-two">
      <div class="first-div">
        <jsp:include page="views/shared/circles.jsp"/>
      </div>
      <div class="second-div">
        <p>Statistics</p>
        <div class="nested-divs">
          <div class="nested-div">
            <img src="https://via.placeholder.com/24" alt="Icon">
            <span>Text 1</span>
          </div>
          <div class="nested-div">
            <img src="https://via.placeholder.com/24" alt="Icon">
            <span>Text 2</span>
          </div>
          <div class="nested-div">
            <img src="https://via.placeholder.com/24" alt="Icon">
            <span>Text 3</span>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<%
} else {
%>
<div class="outer-container">
<div class="div-for-hidden-statistics">
  <jsp:include page="views/shared/hidden-statisc.jsp"/>
</div>
</div>
<%
  }
%>

<jsp:include page="views/shared/footer.jsp"/>

<script src="assets/script/navbar.js"></script>
<script src="assets/script/hide-statistic.js"></script>
</body>
</html>