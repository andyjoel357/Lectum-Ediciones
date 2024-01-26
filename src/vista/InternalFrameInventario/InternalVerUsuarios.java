/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 *//////////Oscar///////////////




package vista.InternalFrameInventario;

import conexion.Conexion;
import controlador.Ctrl_Inventario;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import static vista.FrmMenu.jDesktopPane_menu;

/**
 *
 * @author Oscar
 */
public class InternalVerUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalVerInventario
     */
    public InternalVerUsuarios() {
        initComponents();
        this.setSize(new Dimension(700, 700));
        this.setTitle("Ver Usuarios");
        mostrarUsuario("usuario");

    }
public void mostrarUsuario(String tabla) {
    String sql = "SELECT id_usuario, nombre, direccion, telefono FROM " + tabla;
    Statement st;
    Conexion conexion = new Conexion();

    try (Connection conn = Conexion.conectar()) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");

        visor.setModel(modelo);

        String[] datos = new String[4];

        st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            modelo.addRow(datos);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}


/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        visor.setFont(new java.awt.Font("Bodoni MT", 2, 14)); // NOI18N
        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Telefono ", "Direccion"
            }
        ));
        jScrollPane2.setViewportView(visor);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 2, 48)); // NOI18N
        jLabel1.setText("USUARIOS");

        BtnEditar.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar1.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        BtnEliminar1.setText("Eliminar");
        BtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(BtnEliminar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnEditar)
                .addGap(152, 152, 152))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminar1)
                    .addComponent(BtnEditar))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        InternalActualizarUsuario actualizar = new InternalActualizarUsuario();
        jDesktopPane_menu.add(actualizar);
        actualizar.setVisible(true);


    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminar1ActionPerformed
      
    int selectedRow = visor.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione un usuario para eliminar.");
        return;
    }

    String idUsuario = (String) visor.getValueAt(selectedRow, 0);

    int option = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este usuario?");
    if (option == JOptionPane.YES_OPTION) {

        try (Connection conn = Conexion.conectar();
             Statement st = conn.createStatement()) {

            String deleteSql = "DELETE FROM lectum.usuario WHERE id_usuario = '" + idUsuario + "'";
            int rowsAffected = st.executeUpdate(deleteSql);

            if (rowsAffected > 0) {
                
                DefaultTableModel model = (DefaultTableModel) visor.getModel();
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el usuario.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario: " + e.toString());
        }
    }


    }//GEN-LAST:event_BtnEliminar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables

    
    
    
}
