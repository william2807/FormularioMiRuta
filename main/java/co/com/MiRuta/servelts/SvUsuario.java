package co.com.MiRuta.servelts;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {
Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        }
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Usuario>listaUsuarios = new ArrayList<>();
        listaUsuarios = control.traerUsuarios();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        response.sendRedirect("mostrarUsuario.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String documento = request.getParameter("documento");
        String correo_electronico = request.getParameter("correo_electronico");
        String tarjeta_sitp = request.getParameter("tarjeta_sitp");
        String telefono = request.getParameter("telefono");
        
        Usuario usu = new Usuario();
        
        usu.setNombres(nombres);
        usu.setApellidos(apellidos);
        usu.setDocumento(documento);
        usu.setCorreo_electronico(correo_electronico);
        usu.setTarjeta_sitp(tarjeta_sitp);
        usu.setTelefono(telefono);
        
        
        control.crearUsuario(usu);
        
        response.sendRedirect("index.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
