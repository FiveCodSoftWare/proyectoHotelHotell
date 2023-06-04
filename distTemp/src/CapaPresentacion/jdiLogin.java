/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDominio.vTrabajador;
import CapaPersistencia.fTrabajadorDAO;
import java.awt.SplashScreen;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.CargarPantallaComponestes;
import principal.PrincipalHotel;

/**
 *
 * @author Antonio AB
 */
public class jdiLogin extends javax.swing.JFrame {

    CargarPantallaComponestes inicio;
int x, y;
    public jdiLogin() {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("ACCESO - SISTEMA DE RESERVA DE HABITACION-leaHotel");
   
    }

    public jdiLogin(CargarPantallaComponestes inicio) {
        this.inicio = inicio;
        setProgress(0, "Cargando Componentes del Sistema");
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("ACCESO - SISTEMA DE RESERVA DE HABITACION-leaHotel");
        setProgress(20, "Conectandose a la Base de Datos...");
        setProgress(40, "Cargando Reportes..");
        setProgress(60, "Carga de Reportes Terminada");
        setProgress(80, "Cargando Todas las Interfaces..");
        setProgress(90, "Interfaces Cargadas");
        setProgress(100, "Bienvenido al Sistema - leaHotel");
        this.setLocationRelativeTo(null);
    }

    void setProgress(int percent, String information) {
        inicio.getJLabel().setText(information);
        inicio.getJProgressBar().setValue(percent);

        try {

            Thread.sleep(2000);

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo ejecutar la presentación");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistadoInicio = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtusuario = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpassword = new rojeru_san.RSMPassView();
        jLabel6 = new javax.swing.JLabel();
        btningresar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User_Avatar-31-128.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 148, 193), 2));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 137, 120));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        labelMetric3.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric3.setText("¡¡¡ bienvenido al sistema !!!");
        labelMetric3.setColorDeSombra(new java.awt.Color(255, 255, 255));
        labelMetric3.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N

        tablalistadoInicio.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablalistadoInicio);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMetric3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 470, -1));

        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 379, -1, 60));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusuario.setBackground(new java.awt.Color(34, 102, 145));
        txtusuario.setBorder(null);
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtusuario.setOpaque(false);
        txtusuario.setPlaceholder("USUARIO");
        jPanel4.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usMas.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 58));

        txtpassword.setBackground(new java.awt.Color(34, 102, 145));
        txtpassword.setForeground(new java.awt.Color(0, 0, 0));
        txtpassword.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtpassword.setBotonColor(new java.awt.Color(0, 0, 0));
        txtpassword.setPlaceholder("CONTRASEÑA");
        jPanel4.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 247, 60));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 260, 140));

        btningresar.setBackground(new java.awt.Color(255, 255, 255));
        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        btningresar.setBorder(null);
        btningresar.setBorderPainted(false);
        btningresar.setContentAreaFilled(false);
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jPanel2.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 140, 50));

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir2.png"))); // NOI18N
        btnsalir.setBorder(null);
        btnsalir.setBorderPainted(false);
        btnsalir.setContentAreaFilled(false);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 140, 50));

        jXLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jXLabel1.setText("Introduce tu Usuario y tu Constraseña");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 280, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Manager_18px.png"))); // NOI18N
        jMenu1.setText("Nuevo Trabajador");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Save_32px.png"))); // NOI18N
        jMenuItem1.setText("Registrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        try {
            DefaultTableModel modelo;
            fTrabajadorDAO func = new fTrabajadorDAO();
            vTrabajador dts = new vTrabajador();

            dts.setTabajadorLogin(txtusuario.getText());
            String pas = new String(txtpassword.getPassword());
            dts.setTabajadorPassord(pas);

            modelo = func.login(dts.getTabajadorLogin(), dts.getTabajadorPassord());
            tablalistadoInicio.setModel(modelo);

            if (func.totalregistros > 0) {
                this.dispose();
//                FrmPrincipal v = new FrmPrincipal();
                PrincipalHotel v = new PrincipalHotel();
                v.toFront();
                v.setVisible(true);
//                FrmPrincipal.LblId.setText(tablalistadoInicio.getValueAt(0, 0).toString());
//                FrmPrincipal.lblNombreU.setText(tablalistadoInicio.getValueAt(0, 3).toString());
//                FrmPrincipal.lblPaternoU.setText(tablalistadoInicio.getValueAt(0, 2).toString());
//
//                FrmPrincipal.userConect.setText(tablalistadoInicio.getValueAt(0, 4).toString());
//
//                FrmPrincipal.lblMaternoU.setText(tablalistadoInicio.getValueAt(0, 1).toString());
//                FrmPrincipal.lblAccesoU.setText(tablalistadoInicio.getValueAt(0, 4).toString());

                PrincipalHotel.LblIdPrincipal.setText(tablalistadoInicio.getValueAt(0, 0).toString());
                PrincipalHotel.lblNombreUPrincipal.setText(tablalistadoInicio.getValueAt(0, 3).toString());
                PrincipalHotel.lblPaternoUPrincipal.setText(tablalistadoInicio.getValueAt(0, 2).toString());

                PrincipalHotel.userConect1.setText(tablalistadoInicio.getValueAt(0, 4).toString());

                PrincipalHotel.lblMaternoUPrincipal.setText(tablalistadoInicio.getValueAt(0, 1).toString());
                PrincipalHotel.lblAccesoUPrincipal.setText(tablalistadoInicio.getValueAt(0, 4).toString());
               
                if (!PrincipalHotel.lblAccesoUPrincipal.getText().equals("Administrador")) {
                     PrincipalHotel.btnTrabajadores.setEnabled(false);
                     PrincipalHotel.btnTrbajadoresTodo.setEnabled(false);
              
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Acceso Denegado", "Acceso al Sistema", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btningresarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
     if (JOptionPane.showConfirmDialog(this, "Esta a punto de\ncerrar la Session\n¿Desea continuar?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/principal/preg2.png"))) == JOptionPane.YES_OPTION) {
          System.exit(0);
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      
        try {
            jdiTrabajador trab= new jdiTrabajador();
       trab.toFront();
       trab.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al Abrir la Aplicacion","Acceso al Sistema: ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
 x = evt.getX();
        y = evt.getY();        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jdiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jdiLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private javax.swing.JTable tablalistadoInicio;
    private rojeru_san.RSMPassView txtpassword;
    private app.bolivia.swing.JCTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
