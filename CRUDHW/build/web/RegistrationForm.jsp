<%-- 
    Document   : RegistrationForm
    Created on : Oct 9, 2020, 12:17:07 PM
    Author     : ankur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
    </head>
    <body>
        
        <form action="/CRUDHW/Register" method="POST" name="form">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="2">Registration Form</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="username" required></td>
                    </tr>
                    <tr>
                        <td>E-mail:</td>
                        <td><input type="text" name="email" required onsubmit="return emailValidation()"></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password" required class="password" onkeyup="validatePass()"></td>
                    </tr>
                    <tr>
                        <td>Address:</td>
                        <td><input type="text" name="address" required></td>
                    </tr>
                    <tr>
                        <td>Contact Number:</td>
                        <td><input type="text" name="contact" required></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Submit"></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
