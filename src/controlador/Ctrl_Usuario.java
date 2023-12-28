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
}

