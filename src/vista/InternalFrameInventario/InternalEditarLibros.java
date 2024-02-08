package vista.InternalFrameInventario;

import controlador.Ctrl_Inventario;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Inventario;
import static vista.InternalFrameInventario.InternalVerInventario.visor;

/**
 *
 * @author Andy_T
 */
public class InternalEditarLibros extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalAgregarLibros
     */
    public InternalEditarLibros() {
        initComponents();
        this.setSize(new Dimension(785, 380));
        this.setTitle("Editar Libros");
        setText();

    }

    public void setText() {
        int selectedRowIndex = visor.getSelectedRow();
        if (selectedRowIndex != -1) {

            //LLAMAMOS A LA TABLA
            DefaultTableModel model = (DefaultTableModel) visor.getModel();

            //OBTENEMOS LA SELECCION DE LA TABLA 
            String titulo;
            String autor;
            String paginas;
            String isbn;
            String stock;
            String precioU;

            titulo = model.getValueAt(selectedRowIndex, 1).toString();
            autor = model.getValueAt(selectedRowIndex, 2).toString();
            paginas = model.getValueAt(selectedRowIndex, 3).toString();
            isbn = model.getValueAt(selectedRowIndex, 4).toString();
            stock = model.getValueAt(selectedRowIndex, 5).toString();
            precioU = model.getValueAt(selectedRowIndex, 6).toString();

            //LLENAR DATOS EN LOS TXT
            Txt_titulo.setText(titulo);
            Txt_Autor.setText(autor);
            Txt_paginas.setText(paginas);
            Txt_ISBN1.setText(isbn);
            Txt_Stock.setText(stock);
            Txt_precioU.setText(precioU);

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_Autor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Txt_paginas = new javax.swing.JTextField();
        Txt_Stock = new javax.swing.JTextField();
        Btn_Editar = new javax.swing.JButton();
        Txt_ISBN1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Txt_precioU = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 2, 48)); // NOI18N
        jLabel1.setText("Editar Libros");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel2.setText("Titulo del libro:");

        Txt_titulo.setPreferredSize(new java.awt.Dimension(150, 34));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel3.setText("Autor del libro:");

        Txt_Autor.setPreferredSize(new java.awt.Dimension(150, 34));

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel4.setText("Número de paginas:");

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel5.setText("ISBN:");

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel6.setText("Stock:");

        Txt_paginas.setPreferredSize(new java.awt.Dimension(150, 34));

        Txt_Stock.setPreferredSize(new java.awt.Dimension(150, 34));
        Txt_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_StockActionPerformed(evt);
            }
        });

        Btn_Editar.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        Btn_Editar.setText("Editar Libro");
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });

        Txt_ISBN1.setPreferredSize(new java.awt.Dimension(150, 34));
        Txt_ISBN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ISBN1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel7.setText("Precio Unitario:");

        Txt_precioU.setPreferredSize(new java.awt.Dimension(150, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Autor, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(Txt_ISBN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txt_precioU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(Btn_Editar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Txt_ISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_precioU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(Btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed
        // TODO add your handling code here:

        Inventario inventario = new Inventario();
        Ctrl_Inventario controlinventario = new Ctrl_Inventario();
        // Validar Campos vacios

        if (Txt_titulo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene el campo Titulo");
        } else if (Txt_Autor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene el campo Autor");
        } else if (Txt_paginas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene el campo Número de Paginas");
        } else {
            // VALIDAR QUE NO INGRESE CARACTERES
            boolean validacion = validar(Txt_paginas.getText());
            if (validacion == false) {
                JOptionPane.showMessageDialog(null, "El campo Número de Paginas solo acepta números");
            } else if (Txt_ISBN1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene el campo ISBN");
            } else if (Txt_Stock.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene el campo Stock");
            } else {
                // VALIDAR QUE NO INGRESE CARACTERES
                boolean validacionStock = validar(Txt_Stock.getText());
                if (validacionStock == false) {
                    JOptionPane.showMessageDialog(null, "El campo Stock solo acepta números");
                } else if (Txt_precioU.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Llene el campo Precio Unitario");
                } else {
                    // VALIDAR QUE NO INGRESE CARACTERES
                    boolean validacionPrecio = validarPrecio(Txt_precioU.getText());
                    if (validacionPrecio == false) {
                        JOptionPane.showMessageDialog(null, "El campo Precio Unitario solo acepta números y \".\"");
                    } else {

                        inventario.setTitulo(Txt_titulo.getText().trim());
                        inventario.setAutor(Txt_Autor.getText().trim());
                        inventario.setNumero_paginas(Integer.parseInt(Txt_paginas.getText().trim()));
                        inventario.setCodigo(Txt_ISBN1.getText().trim());
                        inventario.setStock(Txt_Stock.getText().trim());
                        inventario.setPrecioU(Double.parseDouble(Txt_precioU.getText().trim()));

                        int selectedRowIndex = visor.getSelectedRow();

                        // SELECCCIONAR FILA DE LA TABLA
                        if (selectedRowIndex != -1) {

                            //LLAMAMOS A LA TABLA
                            DefaultTableModel model = (DefaultTableModel) visor.getModel();

                            //OBTENEMOS LA SELECCION DE LA TABLA 
                            int id;
                            id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());

                            //SETIAMOS EL ID OBTENIDO
                            inventario.setId_libro(id);

                            //LLAMAMOS AL CONTROLADOR
                            if (controlinventario.editar(inventario, id)) {
                                JOptionPane.showMessageDialog(null, "Libro Editado");
                                this.dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al editar");

                            }
                        }
                    }}}}

    }//GEN-LAST:event_Btn_EditarActionPerformed

    private void Txt_ISBN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ISBN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ISBN1ActionPerformed

    private void Txt_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_StockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_StockActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JTextField Txt_Autor;
    private javax.swing.JTextField Txt_ISBN1;
    private javax.swing.JTextField Txt_Stock;
    private javax.swing.JTextField Txt_paginas;
    private javax.swing.JTextField Txt_precioU;
    private javax.swing.JTextField Txt_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
//METODO VALIDAR NO CARACTERES 
    private boolean validar(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean validarPrecio(String valor) {
        try {
            double num = Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
