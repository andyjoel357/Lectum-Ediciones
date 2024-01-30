
package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import modelo.DetalleCabecera;
import modelo.DetalleVenta;
import java.sql.ResultSet;


public class Ctrl_RegistrarVenta {
    
    public static int idCabeceraRegistrada;
    java.math.BigDecimal idColVar;
    
    
    //METODO PARA GUARDAR LA VENTA
    
     public boolean guardarCabezera(DetalleCabecera objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into cabeceraVenta values(?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getInstitucion());
            consulta.setString(3, objeto.getCliente());
            consulta.setString(4, objeto.getFecha());
            consulta.setString(5, objeto.getDireccion());
            consulta.setString(6, objeto.getRuc_ci());
            consulta.setInt(7, objeto.getTelefono());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
            ResultSet rs=consulta.getGeneratedKeys();
            while(rs.next()){
            idColVar = rs.getBigDecimal(1);
            idCabeceraRegistrada = idColVar.intValue();
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al registrar cabecera " + e);
        }

        return respuesta;

    }
     
     
     //GuardarDETLLA
      public boolean guardarDetalle(DetalleVenta objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert detalleVenta values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, idCabeceraRegistrada);
            consulta.setInt(3, objeto.getId_libro());
            consulta.setInt(4, objeto.getCantidad());
            consulta.setInt(5, objeto.getPrecioU());
            consulta.setInt(6, objeto.getSubtotal());
            consulta.setInt(7, objeto.getDescuento());
            consulta.setInt(8, objeto.getTotal());
            
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al gaurdar detalle de venta " + e);
        }

        return respuesta;

    }
    
}
