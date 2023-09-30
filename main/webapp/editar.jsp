<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar usuario</title>
    </head>
    <body>
        <% Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar"); %>
        <h1>Datos</h1>
        <form action="SvEditar" method="POST">
            
            <p><label>Nombres: </label> <input type="text" name="nombres" value="<%usu.getNombres();%>"</p>
            <p><label>Apellidos: </label> <input type="text" name="apellidos" value="<%usu.getApellidos();%>"</p>
            <p><label>Documento: </label> <input type="text" name="documento" value="<%usu.getDocumento();%>"</p>
            <p><label>Correo electronico: </label> <input type="email" name="correo_electronico" value="<%usu.getCorreo_electronico();%>"></p>
            <p><label>Tarjeta Sitp: </label> <input type="text" name="tarjeta_sitp" value="<%usu.getTarjeta_sitp();%>"</p>
            <p><label>Telefono: </label> <input type="tel" name="telefono" value="<%usu.getTelefono();%>"></p>
            
            <button type="submit" >Guardar</button>
        </form>
    </body>
</html>
