<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola! Proporciona tus datos:</h1>
        <form action="sv_recibeDatos" method="POST">
            <table cellspacing="3" cellpadding="3" border="1">
                <tr>
                    <td>Id:</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>Nombre:</td>
                    <td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td>Apellido:</td>
                    <td><input type="text" name="apellido"></td>
                </tr>
                <tr>
                    <td>Promedio:</td>
                    <td><input type="text" name="promedio"></td>
                </tr>
            </table>
            <br><input type="submit" value="Enviar" name="enviar">
        </form>
        <a href="muestraDatos.jsp">Segunda página</a>
    </body>
</html>