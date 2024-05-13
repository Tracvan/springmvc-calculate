<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 5/13/2024
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
<h1>Hello</h1>
<form action="calculate">
<p>First Number:</p>
<input name="firstNumber" type="text">
<select name="operation">
    <option value="plus">+</option>
    <option value="minus">-</option>
    <option value="multiplication">*</option>
    <option value="deivide">/</option>
</select>
<p>Second Number:</p>
<input name="secondNumber" type="text">
<button type="submit">Submit</button>
</form>
</body>
</html>
