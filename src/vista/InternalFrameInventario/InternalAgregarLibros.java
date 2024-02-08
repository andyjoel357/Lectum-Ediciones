package vista.InternalFrameInventario;

import controlador.Ctrl_Inventario;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Inventario;

/**
 *
 * @author Andy_T
 */
public class InternalAgregarLibros extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalAgregarLibros
     */
    public InternalAgregarLibros() {
        initComponents();
        this.setSize(new Dimension(785, 380));
        this.setTitle("Agregar Libros");
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
        Btn_Guardar = new javax.swing.JButton();
        Txt_ISBN1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Txt_precioU = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 2, 48)); // NOI18N
        jLabel1.setText("Agregar Libros");

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
        jLabel6.setText("Precio Unitario:");

        Txt_paginas.setPreferredSize(new java.awt.Dimension(150, 34));

        Txt_Stock.setPreferredSize(new java.awt.Dimension(150, 34));

        Btn_Guardar.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        Btn_Guardar.setText("Guardar Libro");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Txt_ISBN1.setPreferredSize(new java.awt.Dimension(150, 34));
        Txt_ISBN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ISBN1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel7.setText("Stock:");

        Txt_precioU.setPreferredSize(new java.awt.Dimension(150, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(Txt_paginas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txt_Stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_ISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_precioU, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(Btn_Guardar)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Txt_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Txt_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Txt_ISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_precioU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
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
                        if (controlinventario.guardar(inventario)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al guardar");

                        }
                    }
                }
            }
        }


    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Txt_ISBN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ISBN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ISBN1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Guardar;
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
