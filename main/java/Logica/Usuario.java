package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private int id;
    private String nombres;
    private String apellidos;
    private String documento;
    private String Correo_electronico;
    private String tarjeta_sitp;
    private String telefono;

    public Usuario() {
    }
    
    public Usuario(int id, String nombres, String apellidos, String documento, String Correo_electronico, String tarjeta_sitp, String telefono) {
        
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.Correo_electronico = Correo_electronico;
        this.tarjeta_sitp = tarjeta_sitp;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo_electronico() {
        return Correo_electronico;
    }

    public void setCorreo_electronico(String Correo_electronico) {
        this.Correo_electronico = Correo_electronico;
    }

    public String getTarjeta_sitp() {
        return tarjeta_sitp;
    }

    public void setTarjeta_sitp(String tarjeta_sitp) {
        this.tarjeta_sitp = tarjeta_sitp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
