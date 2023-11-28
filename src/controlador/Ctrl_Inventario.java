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
            PreparedStatement consulta = cn.prepareStatement("insert into lista_libros values(?,?,?,?,?,?)");
            consulta.setInt(1, objeto.getId_libro());
            consulta.setString(2, objeto.getTitulo());
            consulta.setString(3, objeto.getAutor());
            consulta.setInt(4, objeto.getNumero_paginas());
            consulta.setString(5, objeto.getCodigo());
            consulta.setString(6, objeto.getStock());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Libro " + e);
        }

        return respuesta;

    }

   

}
//    // Metodo para consultar libro
//    public boolean existeLibro(String libro) {
//        boolean respuesta = false;
//        String sql = "select titulo from lista_libros where titulo = '" + libro + "';";
//        Statement st;
//
//        try {
//            Connection cn = Conexion.Conectar();
//            st = cn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                respuesta = true;
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Error al consultar Libro " + e);
//        }
//
//        return respuesta;
//
//    }
//}
