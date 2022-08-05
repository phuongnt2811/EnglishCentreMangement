<%-- 
    Document   : createClass
    Created on : Mar 3, 2022, 1:03:18 AM
    Author     : PHUONG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="CSS/style.css">
        <title>JSP Page</title>
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
    <body>
        <div class="wapper" >
            <h2><a href="adminHome"> home </a></h2>
            <h2>Create account</h2>

            <form action="create-account" method="POST">
                <div class="input-box">
                    <input type="text" placeholder="Enter account" name="loginAccount" required>
                </div>
                <div class="input-box">
                    <input type="text" placeholder="Enter password" name="passwordAccount" value="" required>
                </div>
                <!--                <div class="input-box">
                                    <p>Role</p> 
                                    <input type="text" placeholder="Enter role" name="role" value="" required>
                                </div>-->
                <div class="input-box">
                    <p>Role</p> 
                    <select name="role"> 
                        <option value="ADMIN">ADMIN</option>
                        <option value="TEACHER">TEACHER</option>
                        <option value="STUDENT">STUDENT</option>
                    </select>
                </div>
                <div class="input-box">
                    <p>${error}</p>
                </div>
                <div class="input-box">
                    <input type="submit" name="save" value="submit">
                </div>
            </form>

    </body>
