

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="CSS/style.css">
    <title>Document</title>
</head>
<style>
    body{
        background-color: #EEEEF1;
    }
    .wapper{
    position: relative;
    max-width: 1100px;
    height : 600px;
       margin-top: 20px;
    }
</style>
<body  >
    
    <div class="wapper" >
        <h2><a href="adminHome"> home </a></h2>
        <h2>Create student</h2>
  
    <form action="create-student" method="POST">
        <div class="input-box">
            <input type="text" placeholder="Enter full name" name="name" required>
        </div>
        <div class="input-box">
            <input type="text" placeholder="Enter code" name="code" required>
        </div>
        <div class="policy">
           <p> Nam  <input type="radio" name="gender" value="Nam" checked> Nữ <input type="radio" name="gender" value="Nữ"> </p>
        </div>
        <div class="input-box">
            <input type="text" placeholder="Enter phone" name="phone" value="" required>
        </div>
        <div class="input-box">
            <input type="text" placeholder="Enter email" name="email" value="" required>
        </div>
        <div class="input-box">
            <input type="text" placeholder="Enter address" name="address" value="" required>
        </div>
        <div class="input-box">
            <p>Birthday</p>
            <input type="date"  name="bithday" value="" required>
        </div>
        
        <div class="input-box">
            <input type="submit" name="save" value="submit">
        </div>
    </form>
</div>
</body>
</html>