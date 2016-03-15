<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP AJAX Form</title>
    <script src="javascript/jquery-2.2.1.js"></script>
    <script src="javascript/basic.js"></script>
    <link rel="stylesheet" href="css/basic.css" type="text/css" media="screen" />
</head>
<body>
    <p class="large">How to make AJAX calls using JSP and jQuery</p>
    <form id="updateUserName">
        <label for="userName">What is your name?</label>
        <input type="text" id="userName" name="userName" />
        <input type="submit" />
    </form>

    <p id="displayName" />
    <hr />
    <p class="small">My first full-stack tutorial</p>


    ${textA}
    ${textB}
</body>
</html>
