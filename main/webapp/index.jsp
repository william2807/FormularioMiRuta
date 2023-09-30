
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>Datos</h1>
        <form action="SvUsuario" method="POST">
            
            <p><label>Nombres: </label> <input type="text" name="nombres"></p>
            <p><label>Apellidos: </label> <input type="text" name="apellidos"></p>
            <p><label>Documento: </label> <input type="text" name="documento"></p>
            <p><label>Correo electronico: </label> <input type="email" name="correo_electronico"></p>
            <p><label>Tarjeta Sitp: </label> <input type="text" name="tarjeta_sitp"></p>
            <p><label>Telefono: </label> <input type="tel" name="telefono"></p>
            
            <button type="submit" >Enviar</button>
        </form>
        
        <h1>Ver lista de usuarios</h1>
        <p>para ver los datos de los ussuarios cargados haga click en el siguiente boton</p>
        <form action="SvUsuario" method="GET">
            <button type="submit"> mostrar usuarios</button>
        </form>
        
        <h1>Eliminar usuario</h1>
        <p>ingrese el id del usuario que quiere eliminar</p>
        <form action="SvEliminar" method="POST">
            <p><label>Id: </label> <input type="text" name="id_usuario"></p>
            <button type="submit"> Eliminar usuario</button>
        </form>
        
         <h1>Modificar usuario</h1>
        <p>ingrese el id del usuario que quiere eliminar</p>
        <form action="SvEditar" method="GET">
            <p><label>Id: </label> <input type="text" name="id_usuarioEdit"></p>
            <button type="submit"> Editar usuario</button>
        </form>
        
        
    </body>
</html>