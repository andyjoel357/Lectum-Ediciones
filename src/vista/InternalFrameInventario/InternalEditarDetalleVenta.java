package vista.InternalFrameInventario;


import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;



import static vista.InternalFrameInventario.InternalNotaDeVenta.jTableLibros;

/**
 *
 * @author Andy_T
 */
public class InternalEditarDetalleVenta extends javax.swing.JInternalFrame {
   

    
    /**
     * Creates new form InternalActualizarUsuario
     */
    public InternalEditarDetalleVenta() {
        initComponents();
        this.setSize(new Dimension(700, 275));
        this.setTitle("Editar Detalle Venta");
        this.cargarLibros();
        setText();

    }

    public void setText() {
        int selectedRowIndex = jTableLibros.getSelectedRow();
        if (selectedRowIndex != -1) {

            //LLAMAMOS A LA TABLA
            DefaultTableModel model = (DefaultTableModel) jTableLibros.getModel();

            //OBTENEMOS LA SELECCION DE LA TABLA 
            String titulo;
            String cantidad;

            titulo = model.getValueAt(selectedRowIndex, 1).toString();
            cantidad = model.getValueAt(selectedRowIndex, 2).toString();

            jComboBoxLibro.setSelectedItem(titulo);
            jTextCantidad.setText(cantidad);
            
            
            
            

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Btn_Acutalizar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxLibro = new javax.swing.JComboBox<>();
        jTextBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel1.setText("Editar Detalle Venta");

        Btn_Acutalizar.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        Btn_Acutalizar.setText("Editar");
        Btn_Acutalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AcutalizarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Libro:");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jComboBoxLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLibroActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(204, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Cantidad:");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(Btn_Acutalizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBoxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Btn_Acutalizar)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AcutalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AcutalizarActionPerformed
 
      
      
       
       
      


    }//GEN-LAST:event_Btn_AcutalizarActionPerformed

    private void jComboBoxLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLibroActionPerformed
        //cargar libros

    }//GEN-LAST:event_jComboBoxLibroActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        String pBuscar = jTextBuscar.getText().trim();
        Connection cn = conexion.Conexion.conectar();
        String sql = "select titulo from lista_libros where titulo = '" + pBuscar + "'";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                jComboBoxLibro.setSelectedItem(rs.getString("titulo"));

            } else {

                jComboBoxLibro.setSelectedItem("Seleccione Libro:");
                JOptionPane.showMessageDialog(null, "Titulo no encontrado");

            }
            jTextBuscar.setText("");
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al buscar el titulo" + e);
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Acutalizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox<String> jComboBoxLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextCantidad;
    // End of variables declaration//GEN-END:variables
//CARGARLOSPRODICTOS EN EL COMBO BOX
    private void cargarLibros() {
        String sql = "select * from lista_libros";
        Statement st;
        Connection cn = conexion.Conexion.conectar();

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBoxLibro.removeAllItems();
            jComboBoxLibro.addItem("Seleccione Libro:");
            while (rs.next()) {
                jComboBoxLibro.addItem(rs.getString("titulo"));
            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al cargar productos" + e);

        }
    }
}