package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Inventario;
import modelo.Notas_Entrega;

public class Ctrl_Notas_Entrega {
    //Metodo para registrar libros 

    public boolean guardar(Notas_Entrega objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into lista_libros values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, objeto.getId_notaEntrega());
            consulta.setInt(2, objeto.getId_libros());
            consulta.setString(3, objeto.getNombre_cliente());
            consulta.setDate(4, objeto.getFecha());
            consulta.setString(5, objeto.getDireccion());
            consulta.setString(6, objeto.getTelefono());
            consulta.setString(7, objeto.getRuc());
            consulta.setString(8, objeto.getDetalle());
            consulta.setInt(9, objeto.getCantidad());
            consulta.setDouble(10, objeto.getPrecio_unitario());
            consulta.setDouble(11, objeto.getValor());
            consulta.setDouble(12, objeto.getDescuento());
            consulta.setDouble(13, objeto.getValor_total());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Nota de Entrega " + e);
        }

        return respuesta;

    }
}