package vista.InternalFrameInventario;

import controlador.Ctrl_Inventario;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Inventario;
import static vista.FrmMenu.jDesktopPane_menu;
import conexion.Conexion;

/**
 *
 * @author Andy_T - @edit AndyJP
 */
public class InternalVerInventario extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalVerInventario
     */
    public InternalVerInventario() {
        initComponents();
        this.setSize(new Dimension(700, 475));
        this.setTitle("Ver Inventario");
        mostrarInventario("lista_libros");

    }

    public void mostrarInventario(String tabla) {
        String sql = "select * from " + tabla;
        Statement st;
        Conexion con = new Conexion();
        Connection cn = conexion.Conexion.conectar();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Titulo");
        model.addColumn("Autor");
        model.addColumn("Numero de Paginas");
        model.addColumn("Codigo");
        model.addColumn("Stock");
        model.addColumn("Precio Unitario");

        visor.setModel(model);

        String[] datos = new String[7];

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                model.addRow(datos);
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error" + e.toString());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        visor.setFont(new java.awt.Font("Bodoni MT", 2, 14)); // NOI18N
        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "ISBN", "Titulo Libro", "Autor", "Número de paginas", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        visor.setToolTipText("");
        visor.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                visorComponentRemoved(evt);
            }
        });
        jScrollPane2.setViewportView(visor);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 2, 48)); // NOI18N
        jLabel1.setText("Inventario");

        jButtonActualizar.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(Btn_Eliminar)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        mostrarInventario("lista_libros");
        JOptionPane.showMessageDialog(null,"Tabla Actualizada");
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int selectedRowIndex = visor.getSelectedRow();
        if (selectedRowIndex != -1) {
            InternalEditarLibros editarlibro = new InternalEditarLibros();
            jDesktopPane_menu.add(editarlibro);
            editarlibro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro para Editar");
        }

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        int selectedRowIndex = visor.getSelectedRow();
        if (selectedRowIndex != -1) {
            int option = JOptionPane.showConfirmDialog(null, "Esta Seguro de Eliminar este Libro?", "!ADVERTENCIA!", JOptionPane.YES_NO_OPTION);

            switch (option) {
                case 0://Si
                    eliminarInventario();
                    break;
                case 1:
                    visor.clearSelection();
                    break;
                default:
                    visor.clearSelection();
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro para Eliminar");
        }


    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void visorComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_visorComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_visorComponentRemoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables

    public boolean eliminarInventario() {
        int selectedRowIndex = visor.getSelectedRow();
        Inventario inventario = new Inventario();
        Ctrl_Inventario controlInventario = new Ctrl_Inventario();

        // If a row is selected
        // Get the DefaultTableModel from the JTable
        DefaultTableModel model = (DefaultTableModel) visor.getModel();

        // Get the ID of the selected book from the first column of the selected row
        int id;
        id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());

        // Remove the selected row from the JTable
        model.removeRow(selectedRowIndex);

        // Set the ID of the inventario object
        inventario.setId_libro(id);

        // Delete the inventario object from the database
        if (controlInventario.eliminar(inventario, id)) {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        } else {
            JOptionPane.showMessageDialog(null, "Libro eliminado");
        }

        return true;
    }

    public boolean editarId() {
        Inventario inventario = new Inventario();
        Ctrl_Inventario controlInventario = new Ctrl_Inventario();

        int selectedRowIndex = visor.getSelectedRow();

        // If a row is selected
        if (selectedRowIndex != -1) {
            // Get the DefaultTableModel from the JTable
            DefaultTableModel model = (DefaultTableModel) visor.getModel();

            // Get the ID of the selected book from the first column of the selected row
            int id;
            id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());

            // Set the ID of the inventario object
            inventario.setId_libro(id);

        }

        return true;
    }
}
