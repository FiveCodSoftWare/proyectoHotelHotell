/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDominio.vCategoria;
import CapaPersistencia.conexion;
import CapaPersistencia.fCategoriaDAO;
import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import principal.PrincipalHotel;

/**
 *
 * @author Antonio AB
 */
public class jdiCategoria extends javax.swing.JDialog {

  
    
    
    
    int x, y;

    public jdiCategoria() {
        super(PrincipalHotel.getInstancia(), true);
        initComponents();
        mostrar("");
        inhabilitar();
        txtCodigoCategoria.setVisible(false);
        this.setLocationRelativeTo(null);
        
    }

    private String accion = "guardar";

    public void ocultarComlunaID() {

        tablalistaCategoria.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistaCategoria.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistaCategoria.getColumnModel().getColumn(0).setPreferredWidth(0);

    }

    void inhabilitar() {
        txtCodigoCategoria.setEnabled(false);
        txtNombreCategoria.setEnabled(false);
        txtAreaDescripcion.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtCodigoCategoria.setText("");
        txtNombreCategoria.setText("");
        txtAreaDescripcion.setText("");

    }

    void habilitar() {
        txtCodigoCategoria.setEnabled(true);
        txtNombreCategoria.setEnabled(true);
        txtAreaDescripcion.setEnabled(true);

        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtCodigoCategoria.setText("");
        txtNombreCategoria.setText("");
        txtAreaDescripcion.setText("");
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fCategoriaDAO func = new fCategoriaDAO();
            if (cboSelec.getSelectedItem() == "Codigo") {
                modelo = func.mostrarPorCodigo(buscar);
            } else {
                modelo = func.mostrar(buscar);
            }
            tablalistaCategoria.setModel(modelo);
            ///   ocultarComlunaID();
            lbltotal_RegistrosCategoria.setText("Total Registros: " + Integer.toString(func.totalRegistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Error al mostrar" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new org.edisoncor.gui.panel.Panel();
        panel4 = new org.edisoncor.gui.panel.Panel();
        btnNuevo = new rojeru_san.RSButton();
        btnGuardar = new rojeru_san.RSButton();
        btnCancelar = new rojeru_san.RSButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablalistaCategoria = new javax.swing.JTable();
        lbltotal_RegistrosCategoria = new javax.swing.JLabel();
        btnEliminar = new rojeru_san.RSButton();
        btnSalir = new rojeru_san.RSButton();
        panel5 = new org.edisoncor.gui.panel.Panel();
        txtCodigoCategoria = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtNombreCategoria = new org.edisoncor.gui.textField.TextFieldRectBackground();
        idDireciones7 = new com.icm.components.metro.LabelMetroICM();
        cajaa = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        idDireciones9 = new com.icm.components.metro.LabelMetroICM();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cboSelec = new javax.swing.JComboBox<String>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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

        panel3.setColorPrimario(new java.awt.Color(204, 204, 204));
        panel3.setColorSecundario(new java.awt.Color(204, 204, 204));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Add_Tag_32px_2.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Save_as_32px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Clear_Shopping_Cart_32px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablalistaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablalistaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistaCategoriaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablalistaCategoria);

        lbltotal_RegistrosCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltotal_RegistrosCategoria.setText("Registros:");

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Delete_32px.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setColorText(new java.awt.Color(204, 204, 204));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Cancel_32px.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        panel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCodigoCategoria.setDescripcion("Codigo Categoria");

        txtNombreCategoria.setDescripcion("");
        txtNombreCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreCategoriaFocusGained(evt);
            }
        });
        txtNombreCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCategoriaActionPerformed(evt);
            }
        });
        txtNombreCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCategoriaKeyTyped(evt);
            }
        });

        idDireciones7.setForeground(new java.awt.Color(255, 255, 255));
        idDireciones7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Resume_18px.png"))); // NOI18N
        idDireciones7.setText("Descripcion:");
        idDireciones7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        txtAreaDescripcion.setToolTipText("");
        cajaa.setViewportView(txtAreaDescripcion);

        idDireciones9.setForeground(new java.awt.Color(255, 255, 255));
        idDireciones9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Pumpkin_18px.png"))); // NOI18N
        idDireciones9.setText("Nombre:");
        idDireciones9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idDireciones7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(idDireciones9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaa, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idDireciones9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addComponent(idDireciones7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addComponent(cajaa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("GESTION DE CATEGORIAS ASOCIADAS A PRODUCTOS");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cboSelec.setBackground(new java.awt.Color(36, 33, 33));
        cboSelec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboSelec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Codigo" }));
        cboSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSelecActionPerformed(evt);
            }
        });
        jPanel5.add(cboSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 110, -1));

        txtBuscar.setBackground(new java.awt.Color(36, 33, 33));
        txtBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(207, 207, 207));
        txtBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel5.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 210, 40));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Search_32px_1.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 60, 30));

        jInternalFrame1.setVisible(true);

        jMenu1.setText("Reportes");

        jMenuItem1.setText("Categoria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(" Reporte Categorias ", jInternalFrame1);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lbltotal_RegistrosCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lbltotal_RegistrosCategoria)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Esta a punto de\ncerrar la Ventana\n¿Desea continuar?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/principal/preg2.png"))) == JOptionPane.YES_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (txtNombreCategoria.getText().length() == 0) {
                JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar un Nombre de categoria: " + JOptionPane.WARNING_MESSAGE);
                txtNombreCategoria.requestFocus();
                return;
            }
            if (txtAreaDescripcion.getText().length() == 0) {
                JOptionPane.showConfirmDialog(null, "Debes ingresar una Descripcion para la Categoria: " + JOptionPane.WARNING_MESSAGE);
                txtAreaDescripcion.requestFocus();
                return;
            }
            vCategoria dts = new vCategoria();
            fCategoriaDAO func = new fCategoriaDAO();

            dts.setCategoriaNombre(txtNombreCategoria.getText());
            dts.setCategoriaDescripcion(txtAreaDescripcion.getText());
            //int seleccionado = cboEstado.getSelectedIndex();

            if (accion.equals("guardar")) {
                try {
                    if (func.insertar(dts)) {
                        JOptionPane.showMessageDialog(rootPane, "La categoria Fue agregara Satisfactoriamente ");
                        mostrar("");
                        inhabilitar();

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "No se registro categoria");
                        mostrar("");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(jdiCategoria.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (accion.equals("editar")) {

                dts.setCodigoCategoria(Integer.parseInt(txtCodigoCategoria.getText()));
                if (func.editar(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "La Categoria fue Editada Satisfactoriamente");
                    mostrar("");
                    inhabilitar();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se edito la categoria");
                    mostrar("");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Guardar:" + e, JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ingrese lo que dea buscar");
        } else {
            mostrar(txtBuscar.getText());
            txtBuscar.setText("");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        try {

            int i = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar?", "Confirmar Eliminacion", JOptionPane.YES_NO_OPTION);

            if (i == 0) {
                if (!txtCodigoCategoria.getText().equals("")) {

                    fCategoriaDAO func = new fCategoriaDAO();
                    vCategoria dts = new vCategoria();
                    dts.setCodigoCategoria(Integer.parseInt(txtCodigoCategoria.getText()));
                    func.eliminar(dts);
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente la cantegoria");
                    habilitar();
                    mostrar("");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No se elimino La Categoria.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar :" + e.getMessage());
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablalistaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistaCategoriaMouseClicked
        try {
            btnGuardar.setText("Editar");
            habilitar();
            btnEliminar.setEnabled(true);
            accion = "editar";
            int fila = tablalistaCategoria.rowAtPoint(evt.getPoint());
            txtCodigoCategoria.setText(tablalistaCategoria.getValueAt(fila, 0).toString());
            txtNombreCategoria.setText(tablalistaCategoria.getValueAt(fila, 1).toString());
            txtAreaDescripcion.setText(tablalistaCategoria.getValueAt(fila, 2).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al hacer Click en la Tabla", "Error Click" + e, JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_tablalistaCategoriaMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
            habilitar();
            btnGuardar.setText("Guardar");
            accion = "guardar";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Nuevo:" + e, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
//        char c = evt.getKeyChar();
//         if (Character.isDigit(c)) {
//         getToolkit().beep();
//         evt.consume();
//          JOptionPane.showMessageDialog(null, "Ingrese solo letras");
//         }
        if (cboSelec.getSelectedItem() == "Codigo") {

            char c = evt.getKeyChar();
            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
            }

        }


    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtNombreCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCategoriaActionPerformed

        txtNombreCategoria.transferFocus();
    }//GEN-LAST:event_txtNombreCategoriaActionPerformed

    private void txtNombreCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreCategoriaFocusGained
        txtNombreCategoria.setForeground(Color.red);
        txtNombreCategoria.setBackground(Color.yellow);


    }//GEN-LAST:event_txtNombreCategoriaFocusGained

    private void cboSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelecActionPerformed
        if (cboSelec.getSelectedItem() == "Nombre") {

            txtBuscar.setText("");
        } else {
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_cboSelecActionPerformed

    private void txtNombreCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCategoriaKeyTyped
        char a = evt.getKeyChar();
        if (Character.isDigit(a)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese letra no numero", "Error al Digitar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreCategoriaKeyTyped

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged
 private Connection connection = new conexion().conectar();
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       Map p = new HashMap();
        JasperReport report;
        JasperPrint print;
        try {
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/ReporteHotel/reporteCategoriaa.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte de Categoria");
          
            view.toFront();
              view.show();
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
//            java.util.logging.Logger.getLogger(jdiCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jdiCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jdiCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jdiCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                jdiCategoria dialog = new jdiCategoria(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscar;
    private rojeru_san.RSButton btnCancelar;
    private rojeru_san.RSButton btnEliminar;
    private rojeru_san.RSButton btnGuardar;
    private rojeru_san.RSButton btnNuevo;
    private rojeru_san.RSButton btnSalir;
    private javax.swing.JScrollPane cajaa;
    private javax.swing.JComboBox<String> cboSelec;
    private com.icm.components.metro.LabelMetroICM idDireciones7;
    private com.icm.components.metro.LabelMetroICM idDireciones9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbltotal_RegistrosCategoria;
    private org.edisoncor.gui.panel.Panel panel3;
    private org.edisoncor.gui.panel.Panel panel4;
    private org.edisoncor.gui.panel.Panel panel5;
    private javax.swing.JTable tablalistaCategoria;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtBuscar;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtCodigoCategoria;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtNombreCategoria;
    // End of variables declaration//GEN-END:variables
}
