package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //conexion de tipo local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/lectum", "root", "root");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local" + e);
        }
        return null;
    }
}
