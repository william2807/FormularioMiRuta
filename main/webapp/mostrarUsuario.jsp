<%@page import="Logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios registrados</h1>
        <% 
            List<Usuario> ListaUSuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int contador = 1;
            for(Usuario usu: ListaUSuarios){
        %>
        
        <p><b> id <%= usu.getId()%> </b></p>
        <p>Nombres: <%= usu.getNombres()%></p>
        <p>Apellidos: <%= usu.getApellidos()%></p>
        <p>Documento: <%= usu.getDocumento()%></p>
        <p>Correo electronico: <%= usu.getCorreo_electronico() %></p>
        <p>Tarjeta sitp: <%= usu.getTarjeta_sitp()  %></p>
        <p>Telefono: <%= usu.getTelefono() %></p>
        <p>------------------------------------------------------------------</p>
        <% contador = contador +1 ;%>
        <%}%>
    </body>
</html>
