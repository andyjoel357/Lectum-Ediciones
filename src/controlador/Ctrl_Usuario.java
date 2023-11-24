package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Des_3
 */

public class Ctrl_Usuario {

    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;

        try (Connection cn = Conexion.conectar();
             PreparedStatement pst = cn.prepareStatement("SELECT nombre, contrasena FROM usuario WHERE nombre = ? AND contrasena = ?")) {

            pst.setString(1, objeto.getNombre());
            pst.setString(2, objeto.getContrasena());

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    respuesta = true;
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }

        return respuesta;
    }
}

