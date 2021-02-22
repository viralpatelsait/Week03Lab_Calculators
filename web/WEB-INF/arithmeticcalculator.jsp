<%-- 
    Document   : arithmeticcalculator
    Created on : Feb 6, 2021, 10:47:57 PM
    Author     : 834171
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
        <label>First:</label>
        <input type="number" name="first" value="">
        <label>Second:</label>
        <input type="number" name="second" value="">
        <input type="submit" name="calculate" value="+">
        <input type="submit" name="calculate" value="-">
        <input type="submit" name="calculate" value="*">
        <input type="submit" name="calculate" value="%">
        <p>result:${ans}</p>
        <br>
        <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
