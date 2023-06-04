/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDominio.vTipoHabitacion;
import CapaPersistencia.fTipoHabitacionesDAO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.PrincipalHotel;

/**
 *
 * @author Antonio AB
 */
public class jdiTipoHabitacion extends javax.swing.JDialog {

    /**
     * Creates new form jdiTipoHabitacion
     */int x, y;
    public jdiTipoHabitacion() {
        super(PrincipalHotel.getInstancia(), true);
        initComponents();
        mostrar("");
        inhabilitar();
   this.setLocationRelativeTo(null);
    }
    private String accion = "guardar";

    void inhabilitar() {
        txtIdTipoHabaitacion.setVisible(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        cbotipo_habitacion.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtPrecio.setText("");
        txtDescripcion.setText("");

    }

    void habilitar() {
        txtIdTipoHabaitacion.setVisible(false);
        txtDescripcion.setEnabled(true);
        txtPrecio.setEnabled(true);

        cbotipo_habitacion.setEnabled(true);

        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtPrecio.setText("");
        txtDescripcion.setText("");
    }
    public void ocultarColumasProdcuto() {
        tablaRegistroTipoHabitaciones.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaRegistroTipoHabitaciones.getColumnModel().getColumn(0).setMinWidth(0);
        tablaRegistroTipoHabitaciones.getColumnModel().getColumn(0).setPreferredWidth(0);
     
    }
    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fTipoHabitacionesDAO func = new fTipoHabitacionesDAO();
            modelo = func.mostrar(buscar);
            tablaRegistroTipoHabitaciones.setModel(modelo);
            ocultarColumasProdcuto();
            lbltotal_RegistrosTipoHabitacion.setText("Total Registros" + Integer.toString(func.totalRegistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Error al mostrar" + e);
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

        panel1 = new org.edisoncor.gui.panel.Panel();
        idDireciones2 = new com.icm.components.metro.LabelMetroICM();
        idDireciones3 = new com.icm.components.metro.LabelMetroICM();
        txtIdTipoHabaitacion = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtPrecio = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistroTipoHabitaciones = new javax.swing.JTable();
        lbltotal_RegistrosTipoHabitacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        cbotipo_habitacion = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        idDireciones = new com.icm.components.metro.LabelMetroICM();
        txtBuscar = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new org.edisoncor.gui.button.ButtonTask();
        btnGuardar = new org.edisoncor.gui.button.ButtonTask();
        btnEliminar = new org.edisoncor.gui.button.ButtonTask();
        btnCancelar = new org.edisoncor.gui.button.ButtonTask();
        btnSalir = new org.edisoncor.gui.button.ButtonTask();

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

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(204, 204, 204));

        idDireciones2.setText("Descripcion:");
        idDireciones2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        idDireciones3.setText("Precio:");
        idDireciones3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtIdTipoHabaitacion.setDescripcion("ID");

        txtPrecio.setDescripcion("");
        txtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioFocusLost(evt);
            }
        });
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        tablaRegistroTipoHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaRegistroTipoHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRegistroTipoHabitacionesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaRegistroTipoHabitacionesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRegistroTipoHabitaciones);

        lbltotal_RegistrosTipoHabitacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbltotal_RegistrosTipoHabitacion.setText("Registros:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescripcion);

        jXLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jXLabel8.setText("Tipo Habitacion:");
        jXLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        cbotipo_habitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Individual", "Matrimonial", "Familiar", "Presidencial" }));
        cbotipo_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipo_habitacionActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GESTION DE TIPO DE HABITACIÓN");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        idDireciones.setText("Buscar:");
        idDireciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel5.add(idDireciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, 20));
        jPanel5.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 160, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Search_32px_1.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevo.setForeground(new java.awt.Color(153, 153, 153));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setColorDeSegundoBorde(new java.awt.Color(153, 153, 153));
        btnNuevo.setDescription(".");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Save_32px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setDescription(".");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Minus_32px.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setColorDeBorde(new java.awt.Color(153, 153, 153));
        btnEliminar.setColorDeSegundoBorde(new java.awt.Color(204, 204, 204));
        btnEliminar.setDescription(".");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Unavailable_32px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setDescription(".");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Shutdown_32px.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setDescription(".");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addComponent(idDireciones3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(idDireciones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbltotal_RegistrosTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbotipo_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdTipoHabaitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(txtIdTipoHabaitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idDireciones3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(cbotipo_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(idDireciones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltotal_RegistrosTipoHabitacion))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbotipo_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_habitacionActionPerformed
        // TODO add your handling code here:
        transferFocus();
    }//GEN-LAST:event_cbotipo_habitacionActionPerformed

    private void tablaRegistroTipoHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRegistroTipoHabitacionesMouseClicked
        btnGuardar.setText("Editar");
        habilitar();
        btnEliminar.setEnabled(true);
        accion = "editar";
        int fila = tablaRegistroTipoHabitaciones.rowAtPoint(evt.getPoint());
        txtIdTipoHabaitacion.setText(tablaRegistroTipoHabitaciones.getValueAt(fila, 0).toString());
        cbotipo_habitacion.setSelectedItem(tablaRegistroTipoHabitaciones.getValueAt(fila, 1).toString());
        txtPrecio.setText(tablaRegistroTipoHabitaciones.getValueAt(fila, 2).toString());
        txtDescripcion.setText(tablaRegistroTipoHabitaciones.getValueAt(fila, 3).toString());

    }//GEN-LAST:event_tablaRegistroTipoHabitacionesMouseClicked

    private void tablaRegistroTipoHabitacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRegistroTipoHabitacionesMousePressed
        if (evt.getClickCount() == 2) {
            int fila = tablaRegistroTipoHabitaciones.getSelectedRow();
            String cod, valor1, valor2, valor3;
            cod = tablaRegistroTipoHabitaciones.getValueAt(fila, 0).toString();
            valor1 = tablaRegistroTipoHabitaciones.getValueAt(fila, 1).toString();
            valor2 = tablaRegistroTipoHabitaciones.getValueAt(fila, 2).toString();
            valor3 = tablaRegistroTipoHabitaciones.getValueAt(fila, 3).toString();

            jdialogRegistroHabitaciones.txtIdTidpoHabitacion.setText(cod);
            jdialogRegistroHabitaciones.cbotipo_habitacion.addItem(valor1);
            jdialogRegistroHabitaciones.txtPrecio.setText(valor2);
            jdialogRegistroHabitaciones.txtDescripcion.setText(valor3);

            this.setVisible(false);
        }
    }//GEN-LAST:event_tablaRegistroTipoHabitacionesMousePressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        try {
            habilitar();

        btnGuardar.setText("Guardar");
        accion = "guardar";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Nuevo:"+e,JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       if (JOptionPane.showConfirmDialog(this, "Esta a punto de\ncerrar la Ventana\n¿Desea continuar?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/principal/preg2.png"))) == JOptionPane.YES_OPTION) {
            this.dispose();
       }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
                if (txtPrecio.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar un Nombre de categoria" + JOptionPane.ERROR);
            txtPrecio.requestFocus();
            return;
        }

        vTipoHabitacion dts = new vTipoHabitacion();
        fTipoHabitacionesDAO func = new fTipoHabitacionesDAO();
        int seleccionado = cbotipo_habitacion.getSelectedIndex();
        dts.setTipoHabitacion((String) cbotipo_habitacion.getItemAt(seleccionado));
        dts.setTipoHabitacionPrecio(Double.parseDouble(txtPrecio.getText()));
        dts.setTipoHabitacionDescripcion(txtDescripcion.getText());
        if (accion.equals("guardar")) {
            try {
                if (func.insertar(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "La Tipo de habitacion fue agregara Satisfactoriamente ");
                    mostrar("");
                    inhabilitar();
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(jdiTipoHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (accion.equals("editar")) {
            dts.setIdTipoHabitacion(Integer.parseInt(txtIdTipoHabaitacion.getText()));
            try {
                if (func.editar(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "La habitacion fue Editada Satisfactoriamente");
                    mostrar("");
                    inhabilitar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(jdiTipoHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        } catch (Exception e) {
            
            
                        JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Guardar:"+e,JOptionPane.ERROR_MESSAGE);
        }
    

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
              if (!txtIdTipoHabaitacion.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Tipo de Habitacion?", "Confirmar", 2);

            if (confirmacion == 0) {
                fTipoHabitacionesDAO func = new fTipoHabitacionesDAO();
                vTipoHabitacion dts = new vTipoHabitacion();

                dts.setIdTipoHabitacion(Integer.parseInt(txtIdTipoHabaitacion.getText()));
                try {
                    func.eliminar(dts);
                } catch (SQLException ex) {
                    Logger.getLogger(jdiTipoHabitacion.class.getName()).log(Level.SEVERE, null, ex);
                }
                mostrar("");
                inhabilitar();

            }
        }
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Error al Eliminar :"+e.getMessage());
        }
        
      
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrar(txtBuscar.getText());
        txtBuscar.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
          txtPrecio.transferFocus();
       
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusGained
        txtPrecio.setForeground(Color.red);
        txtPrecio.setBackground(Color.yellow);
    }//GEN-LAST:event_txtPrecioFocusGained

    private void txtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusLost
       txtPrecio.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtPrecioFocusLost

    private void txtDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusGained
        txtDescripcion.setForeground(Color.red);
        txtDescripcion.setBackground(Color.yellow);
    }//GEN-LAST:event_txtDescripcionFocusGained

    private void txtDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusLost
       txtDescripcion.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtDescripcionFocusLost

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
           char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)
                && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);           // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
x = evt.getX();
        y = evt.getY();         // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

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
//            java.util.logging.Logger.getLogger(jdiTipoHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jdiTipoHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jdiTipoHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jdiTipoHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                jdiTipoHabitacion dialog = new jdiTipoHabitacion(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonTask btnCancelar;
    private org.edisoncor.gui.button.ButtonTask btnEliminar;
    private org.edisoncor.gui.button.ButtonTask btnGuardar;
    private org.edisoncor.gui.button.ButtonTask btnNuevo;
    private org.edisoncor.gui.button.ButtonTask btnSalir;
    private javax.swing.JComboBox cbotipo_habitacion;
    private com.icm.components.metro.LabelMetroICM idDireciones;
    private com.icm.components.metro.LabelMetroICM idDireciones2;
    private com.icm.components.metro.LabelMetroICM idDireciones3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private javax.swing.JLabel lbltotal_RegistrosTipoHabitacion;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JTable tablaRegistroTipoHabitaciones;
    private org.edisoncor.gui.textField.TextFieldRoundBackground txtBuscar;
    private javax.swing.JTextArea txtDescripcion;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtIdTipoHabaitacion;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtPrecio;
    // End of variables declaration//GEN-END:variables
}