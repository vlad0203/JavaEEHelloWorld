<%--
  Created by IntelliJ IDEA.
  User: Влад
  Date: 9/12/2016
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JavaEE FirstApp</title>
  </head>
  <body>
  <h1>First Java EE Application!</h1>

  <p>Register Form</p>

  <form action="/RegistrationServlet" method="post">
    First name:<br>
    <input type="text" name="userName">
    <br>
    Last name:<br>
    <input type="text" name="userPass" >
    <br><br>
    <input type="submit" value="OK">
  </form>

  <p>To invoke the java register servlet click <a href="RegistrationServlet">here</a></p>




  <p>To invoke the java servlet click <a href="MyServlet">here</a></p>
  </body>
</html>
