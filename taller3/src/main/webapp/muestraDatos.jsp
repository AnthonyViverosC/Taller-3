<%-- 
    Document   : muestraDatos
    Created on : 21/03/2024, 1:52:48 p. m.
    Author     : AnthonyBrr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Muestra Datos</title>
    </head>
    <body>
        <%@ page import="umariana.taller3.Alumno"%>
        <%
            Alumno alumno = (Alumno) request.getAttribute("atribAlumn");
        %>
        <h1>MuestraDatos.jsp</h1>
        <h2>Aquí se despliegan los datos de los servlets</h2>
        <form action = "sv_recibeDatos.java">
    
     
            <p>Tus datos son los siguientes:</p>
            <table cellspacing="3" cellpadding="3" border="1">
                <tr>
                    <td align="right">Id:</td>
                    <td><%=alumno.getId() %></td>
                </tr>
                <tr>
                    <td align="right">Nombre:</td>
                    <td><%=alumno.getNombre() %></td>
                </tr> 
                <tr> 
                    <td align="right">Apellido:</td> 
                    <td><%=alumno.getApellido() %></td> 
                </tr> 
                <tr> 
                    <td align="right">Promedio:</td> 
                    <td><%=alumno.getPromedio() %></td> 
                </tr> 
            </table>
       
        </form>
        <form action="index.jsp" method="post">
            <input type="submit" value="Regresar">
        </form>
    </body>
</html>
