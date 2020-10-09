<%-- 
    Document   : LoginForm
    Created on : Oct 9, 2020, 10:35:41 AM
    Author     : ankur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <form action="/CRUDHW/Login" method="POST">
        <table border="1">
            <thead>
                <tr>
                    <th colspan="2">Login Form</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username" required>"</td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" required></td>
                </tr>
                <input type="hidden" name="sessionid" value="1">
                <tr>
                    <td colspan="2"><input type="submit" value="Submit"></td>
                </tr>
                <tr>
                    <td><a href="RegistrationForm.jsp" target="_blank">Register Here</td>
                </tr>
            </tbody>
        </table>

    </form>
</html>
