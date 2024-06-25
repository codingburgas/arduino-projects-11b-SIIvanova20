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
      <img src="https://via.placeholder.com/150" alt="Placeholder Image">
      <h2>Heading 1</h2>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nisi est, facilisis ac tellus vitae, egestas hendrerit magna. Sed euismod turpis nec orci consequat, id pharetra risus bibendum.</p>
    </div>
    <div class="bottom-div">
      <img src="https://via.placeholder.com/150" alt="Placeholder Image">
      <h2>Heading 2</h2>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nisi est, facilisis ac tellus vitae, egestas hendrerit magna. Sed euismod turpis nec orci consequat, id pharetra risus bibendum.</p>
    </div>
    <div class="bottom-div">
      <img src="https://via.placeholder.com/150" alt="Placeholder Image">
      <h2>Heading 3</h2>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nisi est, facilisis ac tellus vitae, egestas hendrerit magna. Sed euismod turpis nec orci consequat, id pharetra risus bibendum.</p>
    </div>
  </div>
</div>


<div class="top-div">
  <h3 style="background-color: #c64d65" >Wow, you have walked the distance between the moon and the earth</h3>
</div>

<div class="outer-container">
  <div class="main-container">
    <div class="first-two">
      <div class="first-div">
        <jsp:include page="views/shared/circles.jsp"/>
      </div>
      <div class="second-div">
        <p>Second Div</p>
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

</body>
</html>