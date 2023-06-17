<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      margin: 0;
      padding: 20px;
    }

    h2 {
      color: #333333;
      text-align:center;
      margin-top: 30px;
    }

    a {
      color: #0066cc;
      text-decoration: none;
      margin-top: 10px;
      display: inline-block;
      padding: 5px 10px;
      background-color: #ffffff;
      border: 1px solid #0066cc;
      border-radius: 4px;
    }

    a:hover {
      background-color: #0066cc;
      color: #ffffff;
    }
  </style>
</head>
<body>
<h2>${msg}</h2>
<h2><a href="home.jsp">Click here to Login</a></h2>
</body>
</html>