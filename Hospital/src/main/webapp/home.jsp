<html>
<head>
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

  form {
    max-width: 400px;
    margin: 0 auto;
    padding: 20px;
    background-color: #ffffff;
    border-radius: 5px;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
  }

  input[type="number"],
  input[type="password"],
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
</style>
</head>
<body>
<h2>Welcome</h2>
<form action="adminlogin" method="post">
<input type="number" name="adminphone" placeholder="Enter Admin Phone No"><br>
<input type="password" name="adminpassword" placeholder="Enter Admin Password"><br>
<input type="submit" value="Login" >
</form>
<h2><a href="adminregister.jsp">click here to Register Admin</a></h2>

</body>
</html>
