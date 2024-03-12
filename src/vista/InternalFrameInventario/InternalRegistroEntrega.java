package vista.InternalFrameInventario;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
import conexion.Conexion;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Andy_T - @edit AndyJP
 */
public class InternalRegistroEntrega extends javax.swing.JInternalFrame {
    
    
       private String nombrePDF = "";
      
      private String fecha = "";
      
      private String cliente;

    /**
     * Creates new form InternalVerInventario
     */
    public InternalRegistroEntrega() {
        initComponents();
        this.setSize(new Dimension(700, 475));
        this.setTitle("Registro Nota de Entrega");
        mostrarInventario("cabeceraEntrega");

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

        jScrollPane2 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();

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
        jLabel1.setText("Registro Nota de Entrega");

        jButtonEditar.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jButtonEditar.setText("Ver");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

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
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
             
              nombrePDF = "Entrega_" + cliente + "_" + fechaN + ".pdf";
             
             
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables

}
