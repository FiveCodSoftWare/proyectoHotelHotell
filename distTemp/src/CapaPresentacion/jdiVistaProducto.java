/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaPersistencia.conexion;
import CapaPersistencia.fProductoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.PrincipalHotel;

/**
 *
 * @author Antonio AB
 */
public class jdiVistaProducto extends javax.swing.JDialog {

    /**
     * Creates new form jdiVistaProducto
     */
    public jdiVistaProducto() {
        super(PrincipalHotel.getInstancia(), true);
        initComponents();
        mostrar("");
    }

    private Connection cn = new conexion().conectar();

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fProductoDAO func = new fProductoDAO();
            modelo = func.mostrar(buscar);

            tbprod.setModel(modelo);
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalRegistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    String comparar(String cod) {
        String cant = "";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM producto WHERE codigoProducto='" + cod + "'");
            while (rs.next()) {
                cant = rs.getString(6);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductosVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cant;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EnviarCantidad = new javax.swing.JPopupMenu();
        enviar = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbprod = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtprod = new javax.swing.JTextField();
        btnmostrar = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        enviar.setText("Enviar Cantidad");
        enviar.setToolTipText("");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        EnviarCantidad.add(enviar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane2.setComponentPopupMenu(EnviarCantidad);

        tbprod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbprod.setComponentPopupMenu(EnviarCantidad);
        jScrollPane2.setViewportView(tbprod);

        jLabel1.setText("Buscar Productos");

        txtprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprodKeyReleased(evt);
            }
        });

        btnmostrar.setText("Mostrar todo");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        lbltotalregistros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltotalregistros.setText("Registros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(jLabel1)
                            .addGap(17, 17, 17)
                            .addComponent(txtprod, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(btnmostrar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtprod, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotalregistros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprodKeyReleased
        // TODO add your handling code here:
        mostrar(txtprod.getText());
    }//GEN-LAST:event_txtprodKeyReleased

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        mostrar("");
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        try {

            int fila = tbprod.getSelectedRow();

            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "No  ha seleccionado ningun registro");
            } else {
                String valor1, valor2, Valor3;
                String cod;
                cod = tbprod.getValueAt(fila, 0).toString();
                valor1 = tbprod.getValueAt(fila, 1).toString();
            
                valor2 = tbprod.getValueAt(fila, 4).toString();
                jdiCosumo.txtidproducto.setText(cod);
                jdiCosumo.txtProducto.setText(valor1);
                jdiCosumo.txtprecio_venta.setText(valor2);

                int c = 0;
                int j = 0;
                String cant = JOptionPane.showInputDialog("ingrese cantidad");
                jdiCosumo.txtcantidad.setText(cant);
                
                if ((cant.equals("")) || (cant.equals("0"))) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar algun valor mayor que 0");
                } else {

                    int canting = Integer.parseInt(cant);
                    int comp = Integer.parseInt(comparar(cod));
                    if (canting > comp) {
                        JOptionPane.showMessageDialog(this, "Ud. no cuenta con el stock apropiado");
                    }
//             else
//             {
//                      for(int i=0;i<jdiCosumo.tablalistadoConsumo.getRowCount();i++)
//          {
//            Object com=jdiCosumo.tablalistadoConsumo.getValueAt(i,0);
//            if(cod.equals(com))
//            {
//                j=i;
//                jdiCosumo.tablalistadoConsumo.setValueAt(cant, i, 3);
//                c=c+1;
//       
//            }
//   
//          }
//     
//             }

                }
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_enviarActionPerformed

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
//            java.util.logging.Logger.getLogger(jdiVistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jdiVistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jdiVistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jdiVistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                jdiVistaProducto dialog = new jdiVistaProducto(new javax.swing.JFrame(), true);
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
    private javax.swing.JPopupMenu EnviarCantidad;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JMenuItem enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tbprod;
    private javax.swing.JTextField txtprod;
    // End of variables declaration//GEN-END:variables
}
