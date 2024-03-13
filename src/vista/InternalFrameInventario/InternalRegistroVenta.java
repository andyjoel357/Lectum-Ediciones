package vista.InternalFrameInventario;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import conexion.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Andy_T - @edit AndyJP
 */
public class InternalRegistroVenta extends javax.swing.JInternalFrame {

    private String nombrePDF = "";

    private String fecha = "";

    private String cliente;

    /**
     * Creates new form InternalVerInventario
     */
    public InternalRegistroVenta() {
        initComponents();
        this.setSize(new Dimension(700, 475));
        this.setTitle("Registro Nota de Venta");
        mostrarInventario("cabeceraVenta");

    }

    public void mostrarInventario(String tabla) {
        String sql = "select * from " + tabla;
        Statement st;
        Conexion con = new Conexion();
        Connection cn = conexion.Conexion.conectar();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Institución");
        model.addColumn("Cliente");
        model.addColumn("Fecha");
        model.addColumn("Dirección");
        model.addColumn("Ruc / Ci");
        model.addColumn("Telefono");

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

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        BuscarID = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        Filtro = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
        jLabel1.setText("Registro Nota de venta");

        jButtonEditar.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jButtonEditar.setText("Ver");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        BuscarID.setText("Buscar");
        BuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarIDActionPerformed(evt);
            }
        });

        Filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtro", "Id", "Institucion", "Cliente", "Fecha", "Direccion", "Ruc / Ci", "Telefono" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(285, 285, 285))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarID)
                    .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int selectedRowIndex = visor.getSelectedRow();
        if (selectedRowIndex != -1) {
            DefaultTableModel model = (DefaultTableModel) visor.getModel();

            cliente = model.getValueAt(selectedRowIndex, 2).toString();
            fecha = model.getValueAt(selectedRowIndex, 3).toString();

            String fechaN = "";
            for (int i = 0; i < fecha.length(); i++) {
                if (fecha.charAt(i) == '/') {
                    fechaN = fecha.replace("/", "_");
                }

            }

            nombrePDF = "Venta_" + cliente + "_" + fechaN + ".pdf";

            try {

                File file = new File("src/pdf/" + nombrePDF);
                Desktop.getDesktop().open(file);
            } catch (IOException e) {
                System.out.println("ERROR AL ABRIR NOTA DE VENTA " + e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro para Ver");
        }

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void visorComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_visorComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_visorComponentRemoved

    private void BuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarIDActionPerformed
        String pBuscar = jTextBuscar.getText().trim();
        Connection cn = conexion.Conexion.conectar();
        Statement st;
        String sql = "";

        if (Filtro.getSelectedItem().equals("Id")) {
            sql = "select * from cabeceraVenta where id_detalleCabecera = '" + pBuscar + "'";
        } else if (Filtro.getSelectedItem().equals("Institucion")) {
            sql = "select * from cabeceraVenta where institucion = '" + pBuscar + "'";
        } else if (Filtro.getSelectedItem().equals("Cliente")) {
            sql = "select * from cabeceraVenta where cliente = '" + pBuscar + "'";
        } else if (Filtro.getSelectedItem().equals("Fecha")) {
            sql = "select * from cabeceraVenta where fecha = '" + pBuscar + "'";
        } else if (Filtro.getSelectedItem().equals("Direccion")) {
            sql = "select * from cabeceraVenta where direccion = '" + pBuscar + "'";
        } else if (Filtro.getSelectedItem().equals("Ruc / Ci")) {
            sql = "select * from cabeceraVenta where ruc_ci = '" + pBuscar + "'";
        } else if (Filtro.getSelectedItem().equals("Telefono")) {
            sql = "select * from cabeceraVenta where telefono = '" + pBuscar + "'";
        }

       
            if (!Filtro.getSelectedItem().equals("Filtro")) {
                try {
                    st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    if (rs.next()) {
                        int id = rs.getInt("id_detalleCabecera") - 1;

                        visor.setRowSelectionInterval(id, id);
                        visor.scrollRectToVisible(visor.getCellRect(id, 0, true));

                    } else {

                        JOptionPane.showMessageDialog(null, "Nota de Venta no Encontrada");

                    }
                    jTextBuscar.setText("");
                    cn.close();

                } catch (SQLException e) {
                    System.out.println("Error al Buscar Nota de Venta" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un Filtro para la Busqueda");
            }


    }//GEN-LAST:event_BuscarIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarID;
    private javax.swing.JComboBox<String> Filtro;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextBuscar;
    public static javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables

}
