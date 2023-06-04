/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaPersistencia.ConsultaDAO;
import CapaPersistencia.fItemConsumoDAO;
import CapaPersistencia.fReservaHDAO;
import static CapaPresentacion.jdiCosumo.tablalistadoConsumo;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.PrincipalHotel;

public class FrmConcultas extends javax.swing.JDialog {

    DefaultTableModel modelo;
    ConsultaDAO consulta = new ConsultaDAO();

    public FrmConcultas() {
        super(PrincipalHotel.getInstancia(), true);
        initComponents();
       
    }

//    void cargarListaFechas(String buscar) {
//           try {
//            DefaultTableModel modelo;
//            fReservaHDAO func = new fReservaHDAO();
//            modelo = func.mostrarFecha(buscar);
//      
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, "Error al cargar los datos" + e.getMessage());
//        }
//      fReservaHDAO func = new fReservaHDAO();
//        cbxFechas.removeAllItems();
//        ArrayList<String> lista = new ArrayList<String>();
//        lista = func.llenarBusquedaporFecha();
//        for (int i = 0; i < lista.size(); i++) {
//            cbxFechas.addItem(lista.get(i));
//        }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        btnMenoresA = new com.icm.components.metro.ButtonMetroICM();
        btnPreciosEntre = new com.icm.components.metro.ButtonMetroICM();
        buttonMetroICM3 = new com.icm.components.metro.ButtonMetroICM();
        btnPrecioPromedio = new com.icm.components.metro.ButtonMetroICM();
        txtMenorA = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtFin = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtInicio = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrincipal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(102, 153, 255));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnMenoresA.setForeground(new java.awt.Color(0, 0, 0));
        btnMenoresA.setText("Precios menores a");
        btnMenoresA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoresAActionPerformed(evt);
            }
        });

        btnPreciosEntre.setForeground(new java.awt.Color(0, 0, 0));
        btnPreciosEntre.setText("Precios entre");
        btnPreciosEntre.setActionCommand("Precios entre");
        btnPreciosEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreciosEntreActionPerformed(evt);
            }
        });

        buttonMetroICM3.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM3.setText("Productos");
        buttonMetroICM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM3ActionPerformed(evt);
            }
        });

        btnPrecioPromedio.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));
        btnPrecioPromedio.setForeground(new java.awt.Color(0, 0, 0));
        btnPrecioPromedio.setText("Precio promedio");
        btnPrecioPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioPromedioActionPerformed(evt);
            }
        });

        txtMenorA.setDescripcion("menor a ");
        txtMenorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMenorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMenorAFocusLost(evt);
            }
        });
        txtMenorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenorAActionPerformed(evt);
            }
        });
        txtMenorA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMenorAKeyTyped(evt);
            }
        });

        txtFin.setDescripcion("....");
        txtFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFinFocusLost(evt);
            }
        });
        txtFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinActionPerformed(evt);
            }
        });
        txtFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFinKeyTyped(evt);
            }
        });

        txtInicio.setDescripcion("....");
        txtInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtInicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInicioFocusLost(evt);
            }
        });
        txtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicioActionPerformed(evt);
            }
        });
        txtInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInicioKeyTyped(evt);
            }
        });

        jLabel1.setText("y");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buttonMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnPrecioPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMenoresA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMenorA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPreciosEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenoresA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMenorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreciosEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnPrecioPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        tblPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreciosEntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreciosEntreActionPerformed

        try {
            txtMenorA.setText("");
            if (txtFin.getText() != "" && txtFin.getText() != "") {
                modelo = consulta.mostrarProductosEntre(Integer.parseInt(txtInicio.getText()), Integer.parseInt(txtFin.getText()));
                this.tblPrincipal.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "llene los campos para poder hacer la consulta correctamente");
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnPreciosEntreActionPerformed


    private void buttonMetroICM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM3ActionPerformed
        txtInicio.setText("");
        txtFin.setText("");
        txtMenorA.setText("");
        try {

            modelo = consulta.mostrarNombreProductos();
            this.tblPrincipal.setModel(modelo);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_buttonMetroICM3ActionPerformed

    private void btnPrecioPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioPromedioActionPerformed
        try {
            modelo = consulta.mostrarPrecioPromedioProductos();
            this.tblPrincipal.setModel(modelo);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnPrecioPromedioActionPerformed

    private void btnMenoresAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoresAActionPerformed
        txtFin.setText("");
        txtInicio.setText("");
        int cantidad = Integer.parseInt(txtMenorA.getText());
        modelo = consulta.mostrarProductosMenoresA(cantidad);
        this.tblPrincipal.setModel(modelo);
    }//GEN-LAST:event_btnMenoresAActionPerformed

    private void txtMenorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMenorAFocusGained
        txtMenorA.setForeground(Color.red);
        txtMenorA.setBackground(Color.yellow);
    }//GEN-LAST:event_txtMenorAFocusGained

    private void txtMenorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMenorAFocusLost
        txtMenorA.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtMenorAFocusLost

    private void txtMenorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenorAActionPerformed
        txtMenorA.transferFocus();

    }//GEN-LAST:event_txtMenorAActionPerformed

    private void txtMenorAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenorAKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMenorAKeyTyped

    private void txtFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFinFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinFocusGained

    private void txtFinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFinFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinFocusLost

    private void txtFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinActionPerformed

    private void txtFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinKeyTyped

    private void txtInicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInicioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioFocusGained

    private void txtInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInicioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioFocusLost

    private void txtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioActionPerformed

    private void txtInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInicioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioKeyTyped

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmConcultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmConcultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmConcultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmConcultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FrmConcultas dialog = new FrmConcultas(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM btnMenoresA;
    private com.icm.components.metro.ButtonMetroICM btnPrecioPromedio;
    private com.icm.components.metro.ButtonMetroICM btnPreciosEntre;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private javax.swing.JTable tblPrincipal;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtFin;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtInicio;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtMenorA;
    // End of variables declaration//GEN-END:variables
}
