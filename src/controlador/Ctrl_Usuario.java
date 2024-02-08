package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

/**
 *
 * @author Des_3
 */
public class Ctrl_Usuario {

    public boolean loginUser(Usuario objeto) {
        try {
            //1. Crear objeto de conexión
            Connection conn = Conexion.conectar();
            //2. Crear objeto que prepare la query
            PreparedStatement stmt = conn.prepareStatement("SELECT nombre, contrasena FROM usuario WHERE nombre = ? AND contrasena = ?");
            //3. Agregar los valores en las interrogantes - Reemplazar interrogantes
            stmt.setString(1, objeto.getNombre());
            stmt.setString(2, objeto.getContrasena());
            //4. Ejecutar la query
            ResultSet rs = stmt.executeQuery();
            //rs almacena el registro o registros de la consulta (select)
            if (rs.next()) { //next verifica que el objeto rs tenga registros
                return true;
            }
            //5. Cerrar onjetos de conexión ---- no cierran objetos de conección :(
            //Conexion.close(rs);
            //Conexion.close(stmt);
            //Conexion.close(conn);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        }
        return false;
    }
    public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert usuario values(?,?,?,?,?)");
            consulta.setInt(1, objeto.getIdUsuario());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getContrasena());
            consulta.setString(4, objeto.getDireccion());
            consulta.setString(5, objeto.getTelefono());
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Libro " + e);
        }

        return respuesta;

    }
    //metodo editar
    public boolean editar(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("update usuario set nombre =?, contrasena =?, direccion =?, telefono =? WHERE id_usuario ='"+idUsuario+"'");
            
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getContrasena());
            consulta.setString(3, objeto.getDireccion());
            consulta.setString(4, objeto.getTelefono());
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al editar usuario " + e);
        }

        return respuesta;

    }
     //metodo editar
    public boolean eliminar( int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from usuario WHERE id_usuario ='"+idUsuario+"'");
            consulta.executeUpdate();
            
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario " + e);
        }

        return respuesta;

    }
}

