<%-- 
    Document   : registro
    Created on : 12/03/2019, 21:14:34
    Author     : Digital Gate
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuarios</title>
    </head>
    <body>
        <h1>Formulario de Registro</h1>
        <form action="" method="post">
            <label>Usuario</label>
            <input type="text" name="usuario"/><br>
            <label>Nombre</label>
            <input type="text" name="nombre"/><br>
            <label>Apellido</label>
            <input type="text" name="apellido"/><br>
            <label>Contraseña</label>
            <input type="password" name="pass"/><br>
            <input type="submit" value="Guardar Registro"/><br>
        </form>
    </body>
</html>
