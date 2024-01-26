
package modelo;

/**
 *
 * @author Des_3
 */
public class Usuario {
    //atrib
    private int idUsuario;
    private String nombre;
    private String contrasena;
    private String direccion;
    private String telefono;

    public Usuario() {
        this.idUsuario = 0;
        this.nombre = "";
        this.contrasena = "";
        this.direccion = "";
        this.telefono = "";
    }

    public Usuario(int idUsuario, String nombre, String contrasena, String direccion, String telefono) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

