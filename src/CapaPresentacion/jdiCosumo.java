/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDominio.vConsumo;
import CapaPersistencia.conexion;
import CapaPersistencia.fItemConsumoDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.PrincipalHotel;

/**
 *
 * @author Antonio AB
 */
public class jdiCosumo extends javax.swing.JDialog {

    public static String idReserva;
    public static String Cliente;
    int x, y;

    public jdiCosumo() {
        super(PrincipalHotel.getInstancia(), true);
        initComponents();
        mostrar(idReserva);
        txtCliente.setText(Cliente);
        txtidReserva.setText(idReserva);
        inhabilitar();
        this.setLocationRelativeTo(null);
    }
    private String accion = "guardar";

    void inhabilitar() {
        txtidconsumo.setVisible(false);
        txtidReserva.setVisible(false);
        txtidproducto.setVisible(false);
        txtcantidad.setEnabled(false);

        txtprecio_venta.setEnabled(false);
        cboesado.setEnabled(false);

        JcalenFechaConsumo.setEnabled(false);
        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btneliminar.setEnabled(false);

        txtidconsumo.setText("");
        txtprecio_venta.setText("");
        txtcantidad.setText("");

    }

    void habilitar() {
        txtidconsumo.setVisible(false);
        txtidReserva.setVisible(false);
        txtidproducto.setVisible(false);

        txtcantidad.setEnabled(true);

        txtprecio_venta.setEnabled(true);
        cboesado.setEnabled(true);

        JcalenFechaConsumo.setEnabled(true);
        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btneliminar.setEnabled(true);

        txtidconsumo.setText("");
        txtprecio_venta.setText("");

        txtcantidad.setText("");

    }

    private Connection cn = new conexion().conectar();

    void descontarstock(String codi, String can) {
        int des = Integer.parseInt(can);
        int cap = 0;
        int desfinal;
        String consul = "SELECT * FROM producto WHERE  codigoProducto='" + codi + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consul);
            while (rs.next()) {
                cap = Integer.parseInt(rs.getString(6));
            }

        } catch (Exception e) {
        }
        desfinal = cap - des;
        String modi = "UPDATE producto SET stockProducto='" + desfinal + "' WHERE codigoProducto = '" + codi + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(modi);
            pst.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void ocultarColumasProdcuto() {
        tablalistadoConsumo.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadoConsumo.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadoConsumo.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablalistadoConsumo.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistadoConsumo.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistadoConsumo.getColumnModel().getColumn(1).setPreferredWidth(0);
        tablalistadoConsumo.getColumnModel().getColumn(2).setMaxWidth(0);
        tablalistadoConsumo.getColumnModel().getColumn(2).setMinWidth(0);
        tablalistadoConsumo.getColumnModel().getColumn(2).setPreferredWidth(0);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fItemConsumoDAO func = new fItemConsumoDAO();
            modelo = func.mostrar(buscar);
            tablalistadoConsumo.setModel(modelo);
            ocultarColumasProdcuto();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalregistros));
            lblconsumo.setText("Consumo Total $. " + func.totalconsumo);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistadoConsumo = new javax.swing.JTable();
        lbltotalregistros = new javax.swing.JLabel();
        lblconsumo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtidconsumo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidReserva = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        btnbuscarproducto = new javax.swing.JButton();
        rSPanelsSlider1 = new rojeru_san.RSPanelsSlider();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        jLabel6 = new javax.swing.JLabel();
        txtprecio_venta = new javax.swing.JTextField();
        JcalenFechaConsumo = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        cboesado = new javax.swing.JComboBox();
        rSPanelsSlider2 = new rojeru_san.RSPanelsSlider();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Panel de Registro de Consumos");
        jLabel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Consumos Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tablalistadoConsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablalistadoConsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoConsumoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistadoConsumo);

        lbltotalregistros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltotalregistros.setText("Registros");

        lblconsumo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblconsumo.setText("Consumo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalregistros)
                    .addComponent(lblconsumo))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtidconsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 124, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 98, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Reserva:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtidReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidReservaActionPerformed(evt);
            }
        });
        jPanel1.add(txtidReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 56, 74, -1));
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 56, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Producto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 74, -1));
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, -1));

        btnbuscarproducto.setText("...");
        btnbuscarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarproductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 39, -1));

        rSPanelsSlider1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rSPanelsSlider1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel12.setText("Fecha Consumo: ");
        jXLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rSPanelsSlider1.add(jXLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Precio Venta:");
        rSPanelsSlider1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtprecio_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecio_ventaActionPerformed(evt);
            }
        });
        rSPanelsSlider1.add(txtprecio_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 98, -1));
        rSPanelsSlider1.add(JcalenFechaConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 113, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Estado:");
        rSPanelsSlider1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        cboesado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aceptado", "Cancelado" }));
        cboesado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboesadoActionPerformed(evt);
            }
        });
        rSPanelsSlider1.add(cboesado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 148, -1));

        rSPanelsSlider2.setBackground(new java.awt.Color(0, 102, 102));
        rSPanelsSlider2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rSPanelsSlider2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarConsumo.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        rSPanelsSlider2.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 120, -1));

        btneliminar.setBackground(new java.awt.Color(255, 255, 255));
        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarConsumo.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        rSPanelsSlider2.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        btnsalir.setBackground(new java.awt.Color(255, 255, 255));
        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salirConsumo.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        rSPanelsSlider2.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));
        rSPanelsSlider2.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 169, -1));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fruits-157966_640.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnnuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newCosumo.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        btnguardar.setBackground(new java.awt.Color(255, 255, 255));
        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarConsumo.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, -1));

        btncancelar.setBackground(new java.awt.Color(255, 255, 255));
        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelConsumo.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, -1));

        jTabbedPane1.addTab("Botones de opciones", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(348, 348, 348)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablalistadoConsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoConsumoMouseClicked
        // TODO add your handling code here:
        try {
            btnguardar.setText("Editar");
            habilitar();
            btneliminar.setEnabled(true);
            accion = "editar";

            int fila = tablalistadoConsumo.rowAtPoint(evt.getPoint());
            txtidconsumo.setText(tablalistadoConsumo.getValueAt(fila, 0).toString());
            txtidReserva.setText(tablalistadoConsumo.getValueAt(fila, 1).toString());
            txtidproducto.setText(tablalistadoConsumo.getValueAt(fila, 2).toString());

            txtProducto.setText(tablalistadoConsumo.getValueAt(fila, 3).toString());
            txtcantidad.setText(tablalistadoConsumo.getValueAt(fila, 4).toString());
            txtprecio_venta.setText(tablalistadoConsumo.getValueAt(fila, 5).toString());
            JcalenFechaConsumo.setDate(Date.valueOf(tablalistadoConsumo.getValueAt(fila, 6).toString()));
            cboesado.setSelectedItem(tablalistadoConsumo.getValueAt(fila, 7).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al hacer Click en la Tabla", "Error Click" + e, JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_tablalistadoConsumoMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {

            if (!txtidconsumo.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Producto?", "Confirmar", 2);

                if (confirmacion == 0) {
                    fItemConsumoDAO func = new fItemConsumoDAO();
                    vConsumo dts = new vConsumo();

                    dts.setIdConsumo(Integer.parseInt(txtidconsumo.getText()));
                    func.eliminar(dts);
                    mostrar(idReserva);
                    inhabilitar();

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar :" + e.getMessage());
        }

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Esta a punto de\ncerrar la Ventana\n¿Desea continuar?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/principal/preg2.png"))) == JOptionPane.YES_OPTION) {
            this.dispose();
        }

    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtprecio_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecio_ventaActionPerformed
        // TODO add your handling code here:
        txtprecio_venta.transferFocus();
    }//GEN-LAST:event_txtprecio_ventaActionPerformed

    private void cboesadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboesadoActionPerformed
        // TODO add your handling code here:
        cboesado.transferFocus();
    }//GEN-LAST:event_cboesadoActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        try {
            habilitar();
            btnguardar.setText("Guardar");
            accion = "guardar";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Nuevo:" + e, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (txtcantidad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una cantidad de consumo");
            txtcantidad.requestFocus();
            return;
        } else {
            String capcod = "", capcan = "";
            for (int i = 0; i < jdiCosumo.tablalistadoConsumo.getColumnCount(); i++) {
                capcod = txtidconsumo.getText();
                capcan = txtcantidad.getText();
//                    capcod = Integer.parseInt(jdiCosumo.tablalistadoConsumo.getValueAt(i, 0).toString());
//                    capcan = Integer.parseInt(jdiCosumo.tablalistadoConsumo.getValueAt(i, 6).toString());
                descontarstock(capcod, capcan);
            }

            if (txtprecio_venta.getText().length() == 0) {
                JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un precio de venta del producto");
                txtprecio_venta.requestFocus();
                return;
            }

            vConsumo dts = new vConsumo();
            fItemConsumoDAO func = new fItemConsumoDAO();
            dts.setIdRerva(Integer.parseInt(txtidReserva.getText()));
            dts.setIdProducto(Integer.parseInt(txtidproducto.getText()));
            dts.setConsumoCantidad(Double.parseDouble(txtcantidad.getText()));
            dts.setConsumoPrecioVenta(Double.parseDouble(txtprecio_venta.getText()));
            int seleccionado = cboesado.getSelectedIndex();
            Calendar cal;
            int d, m, a;
            cal = JcalenFechaConsumo.getCalendar();
            d = cal.get(Calendar.DAY_OF_MONTH);
            m = cal.get(Calendar.MONTH);
            a = cal.get(Calendar.YEAR) - 1900;
            dts.setConsumoFechaConsumo(new Date(a, m, d));
            dts.setConsumoEstado((String) cboesado.getItemAt(seleccionado));

            if (accion.equals("guardar")) {
                if (func.insertar(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "el consumo " + txtProducto.getText() + " del cliente "
                            + txtCliente.getText() + " Ha sido registrado correctamente");
                    mostrar(idReserva);
                    inhabilitar();
                }
            } else if (accion.equals("editar")) {
                dts.setIdConsumo(Integer.parseInt(txtidconsumo.getText()));

                if (func.editar(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "El consumo ha sido modificado");
                    mostrar(idReserva);
                    inhabilitar();
                }
            }
        }


    }//GEN-LAST:event_btnguardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtidReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidReservaActionPerformed
        // TODO add your handling code here:
        txtidReserva.transferFocus();
    }//GEN-LAST:event_txtidReservaActionPerformed

    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void btnbuscarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarproductoActionPerformed
        // TODO add your handling code here:
        try {
            jdiVistaProducto form = new jdiVistaProducto();
            form.toFront();
            form.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la vista: " + e.getMessage());
        }


    }//GEN-LAST:event_btnbuscarproductoActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);        // TODO add your handling code here:
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
//            java.util.logging.Logger.getLogger(jdiCosumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jdiCosumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jdiCosumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jdiCosumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                jdiCosumo dialog = new jdiCosumo(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser JcalenFechaConsumo;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscarproducto;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox cboesado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private javax.swing.JLabel lblconsumo;
    private javax.swing.JLabel lbltotalregistros;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private rojeru_san.RSPanelsSlider rSPanelsSlider1;
    private rojeru_san.RSPanelsSlider rSPanelsSlider2;
    public static javax.swing.JTable tablalistadoConsumo;
    private javax.swing.JTextField txtCliente;
    public static javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtidReserva;
    private javax.swing.JTextField txtidconsumo;
    public static javax.swing.JTextField txtidproducto;
    public static javax.swing.JTextField txtprecio_venta;
    // End of variables declaration//GEN-END:variables
}
