<%-- 
    Document   : agecalculator
    Created on : Feb 5, 2021, 2:44:15 PM
    Author     : 834171
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter your age:</label>
            <input type="number" name="age" value="${age}">
            <input type="submit" name="ageCalculator" value="Age next birthday">
            <p>${result}</p>
            <br>
            <a href="arithmetic">Arithmetic Calculator</a>
            
        </form>
    </body>
</html>
