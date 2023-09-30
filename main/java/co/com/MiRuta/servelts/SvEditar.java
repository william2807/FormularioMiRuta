package co.com.MiRuta.servelts;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {
    
    Controladora control = new Controladora();
            
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        int id_editar = Integer.parseInt(request.getParameter("id_usuarioEdit"));
        Usuario usu = control.traerUsuario(id_editar);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("usuEditar", usu);
        
        response.sendRedirect("editar.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String documento = request.getParameter("documento");
        String correo_electronico = request.getParameter("correo_electronico");
        String tarjeta_sitp = request.getParameter("tarjeta_sitp");
        String telefono = request.getParameter("telefono");
        
        Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar");
        
        usu.setNombres(nombres);
        usu.setApellidos(apellidos);
        usu.setDocumento(documento);
        usu.setCorreo_electronico(correo_electronico);
        usu.setTarjeta_sitp(tarjeta_sitp);
        usu.setTelefono(telefono);
        
        
        control.editarUsuario(usu);
        
        response.sendRedirect("index.jsp");
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
