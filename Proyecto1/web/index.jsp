<%-- 
    Document   : index
    Created on : 12/03/2019, 20:59:11
    Author     : Digital Gate
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log in</title>
    </head>
    <body>
        <h1>Fill the boxes to registrer.</h1>
        <form action="Iniciar" method="post">
            <label>User</label>
            <input type="text" name="usuario"/><br>
            <label>Password</label>
            <input type="password" name="pass"/>
            <input type="submit" value="iniciar sesión"/><br>

        </form><br>
        <p>Si no tienes una cuenta haz click aquí</p>
        <a href="registro.jsp">REGISTRARME!</a>
    </body>
</html>
