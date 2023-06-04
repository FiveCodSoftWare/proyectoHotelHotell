/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaPersistencia.fHabitacionesDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.PrincipalHotel;

/**
 *
 * @author Antonio AB
 */
public class jdiVistaHabitaciones extends javax.swing.JDialog {

    /**
     * Creates new form jdiVistaHabitaciones
     */ int x, y;
    public jdiVistaHabitaciones() {
           super(PrincipalHotel.getInstancia(), true);
        initComponents();
        mostrar("");
        this.setLocationRelativeTo(null);
      
    }

     void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fHabitacionesDAO func = new fHabitacionesDAO();
            modelo = func.mostrarvista(buscar);
            tablalistado.setModel(modelo);
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalRegistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    public void transparenciabotones(){
        btnbuscar.setOpaque(false);
        btnbuscar.setContentAreaFilled(false);
        btnbuscar.setBorderPainted(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel3 = new javax.swing.JPanel();
        cerrar = new principal.MaterialButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        lbltotalregistros = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new app.bolivia.swing.JCTextField();
        btnbuscar = new rojeru_san.RSButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnRegistrarCliente = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        rSPanelShadow1.setBackground(new java.awt.Color(102, 102, 102));
        rSPanelShadow1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setForeground(new java.awt.Color(255, 0, 51));
        cerrar.setText("X");
        cerrar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Cerrar</h4> </body> </html>");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel3.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 35, 29));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Habitaciones");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        rSPanelShadow1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 790, 50));

        tablalistado.setBackground(new java.awt.Color(204, 204, 204));
        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablalistadoMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistado);

        rSPanelShadow1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 760, 246));

        lbltotalregistros.setText("Registros");
        rSPanelShadow1.add(lbltotalregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 140, 20));
        rSPanelShadow1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 189, 210, -1));

        txtBuscar.setBorder(null);
        txtBuscar.setForeground(new java.awt.Color(58, 159, 171));
        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscar.setPlaceholder("Buscar por N° Habitación");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        rSPanelShadow1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 77, 190, 30));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Search_32px_1.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        rSPanelShadow1.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 46, 50));

        btnRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Bed_32px.png"))); // NOI18N
        btnRegistrarCliente.setText(" Habitaciones");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Registrar", btnRegistrarCliente);

        rSPanelShadow1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 230, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked

    }//GEN-LAST:event_tablalistadoMouseClicked

    private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMousePressed
        if (evt.getClickCount() == 2) {
            int fila= tablalistado.getSelectedRow();
            String cod;
            String valor;

            cod=tablalistado.getValueAt(fila, 0).toString();
            valor=tablalistado.getValueAt(fila, 1).toString();

            jdiaRegistrarReserva.txtIdHabitacionReserva.setText(cod);
            jdiaRegistrarReserva.txtNumeroHabitacionReserva.setText(valor);
            this.dispose();

        }
    }//GEN-LAST:event_tablalistadoMousePressed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char letras = evt.getKeyChar();

        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
     mostrar(txtBuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
       try {
            jDialogRestroHabitaciones ingcli= new jDialogRestroHabitaciones();
            ingcli.toFront();
            ingcli.setVisible(true);
              } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
 x = evt.getX();
        y = evt.getY();        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);         // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

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
//            java.util.logging.Logger.getLogger(jdiVistaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jdiVistaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jdiVistaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jdiVistaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                jdiVistaHabitaciones dialog = new jdiVistaHabitaciones(new javax.swing.JFrame(), true);
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
    private rojeru_san.RSButton btnRegistrarCliente;
    private rojeru_san.RSButton btnbuscar;
    private principal.MaterialButton cerrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbltotalregistros;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private javax.swing.JTable tablalistado;
    public static app.bolivia.swing.JCTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
