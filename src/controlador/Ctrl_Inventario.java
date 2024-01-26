 package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.Inventario;

public class Ctrl_Inventario {
    //Metodo para registrar libros 

    public boolean guardar(Inventario objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into lista_libros values(?,?,?,?,?,?,?)");
            consulta.setInt(1, objeto.getId_libro());
            consulta.setString(2, objeto.getTitulo());
            consulta.setString(3, objeto.getAutor());
            consulta.setInt(4, objeto.getNumero_paginas());
            consulta.setString(5, objeto.getCodigo());
            consulta.setString(6, objeto.getStock());
            consulta.setInt(7, objeto.getPrecioU());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Libro " + e);
        }

        return respuesta;

    }
    //aqui va  // ,int id
public boolean editar(Inventario objeto, int id) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("update lista_libros set titulo = ?, autor = ?, numero_paginas = ?, codigo = ?, stock = ?, precioU = ? where id_libro ='" + id + "'");
            
            consulta.setString(1, objeto.getTitulo());
            consulta.setString(2, objeto.getAutor());
            consulta.setInt(3, objeto.getNumero_paginas());
            consulta.setString(4, objeto.getCodigo());
            consulta.setString(5, objeto.getStock());
            consulta.setInt(6, objeto.getPrecioU());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Libro " + e);
        }

        return respuesta;


    }

    public boolean eliminar(Inventario objeto, int id) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("delete from lista_libros where id_libro ='" + id + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar Libro " + e);
        }

        return respuesta;

    }

    
    //SI SE REQUIERE CONSULTAR CATEGORIA
    
    //public boolean existeCategoria(String inventario) {
      //  boolean respuesta = false;
       // String sql="select autor from lista_libros where autor ='"+inventario+"';";
       // Statement st;
        
       // try {
         //   Connection cn = Conexion.conectar();
          //  st=cn.createStatement();
          //  ResultSet rs= st.executeQuery(sql);
           // while(rs.next()){
             //   respuesta = true;
          //  }
      //  } catch (SQLException e) {
        //    System.out.println("Error al consultar Libro " + e);
     //   }

      //  return respuesta;

   // }

}
   