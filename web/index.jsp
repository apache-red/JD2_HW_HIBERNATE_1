<%--
  Created by IntelliJ IDEA.
  User: RED
  Date: 19.03.2019
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h3>GENERATE USERS</h3>
  <form action="controller" method="post">
    <input type="hidden" name="command" value="generate_users_command"/>
    <input type="number" name="quantity" value="" placeholder="Number of users" /><br>
    <input type="submit" value="generate"/>
  </form>
  <h3>USE JDBC</h3>
  <form action="controller" method="post">
    <input type="hidden" name="command" value="all_users_command_jdbc"/>
    <input type="submit" value="show all users"/>
  </form>
  <h3>USE HIBERNATE</h3>
  <form action="controller" method="post">
    <input type="hidden" name="command" value="all_users_command_hibernate"/>
    <input type="submit" value="show all users"/>
  </form>

  </body>
</html>
