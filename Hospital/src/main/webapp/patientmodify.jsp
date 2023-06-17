<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

  form {
    max-width: 400px;
    margin: 0 auto;
    padding: 20px;
    background-color: #ffffff;
    border-radius: 5px;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
  }

  input[type="number"],
  input[type="text"],
  input[type="tel"],
  input[type="submit"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 15px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    font-size: 14px;
  }

  input[type="submit"] {
    background-color: #4CAF50;
    color: #ffffff;
    cursor: pointer;
  }

  input[type="submit"]:hover {
    background-color: #45a049;
  }
</style>

</head>
<body>
<form action="update" method="post">
<input type="number" name="id" placeholder="Enter Patient ID"><br>
<input type="text" name="name" placeholder="Enter Patient Name"><br>
<input type="tel" name="phone" placeholder="Enter Patient Phone No"><br>
<input type="number" name="age" placeholder="Enter Patient Age"><br>
<input type="text" name="address" placeholder="Enter Patient Address"><br>
<input type="submit" value="Update">
</body>
</html>