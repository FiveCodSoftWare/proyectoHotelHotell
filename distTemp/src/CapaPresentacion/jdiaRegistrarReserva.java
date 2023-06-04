/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDominio.vHabitacion;
import CapaDominio.vReserva;
import CapaPersistencia.fHabitacionesDAO;
import CapaPersistencia.fReservaHDAO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antonio AB
 */
public class jdiaRegistrarReserva extends javax.swing.JFrame {

    /**
     * Creates new form jdiaRegistrarReserva
     */
    int x, y;

    public jdiaRegistrarReserva() {
        initComponents();
        mostrar("");
        mostrarFecha("");
        inhabiliatr();
        this.setLocationRelativeTo(null);
       
    }

    private String accion = "guardar";
    public static int idusuarioReserva;

    void inhabiliatr() {
        txtIdReserva.setVisible(false);
        txtIdHabitacionReserva.setVisible(false);
        txtIDClienteReserva.setVisible(false);
        txtidTrabajadorReserva.setVisible(false);

        txtIdHabitacionReserva.setEnabled(false);
        txtIDClienteReserva.setEnabled(false);
        txtidTrabajadorReserva.setEnabled(false);

        txtNumeroHabitacionReserva.setEnabled(false);
        txtNombreClienteReserva.setEnabled(false);
        txtNombreTRabajdorReserva.setEnabled(false);
        cboTipoReserva.setEnabled(false);
        cboEstadoReserva.setEnabled(false);
        jdateFechaReserva.setEnabled(false);
        jdateFecahIngreso.setEnabled(false);
        jdateFechaSalida.setEnabled(false);
        cboEstadoReserva.setSelectedIndex(0);
        cboTipoReserva.setSelectedIndex(0);
        txtCosto.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnHabitacionBuscar.setEnabled(false);
        btnClienteBuscar.setEnabled(false);

        txtIdReserva.setText("");
        txtIDClienteReserva.setText("");
        txtNumeroHabitacionReserva.setText("");
        txtNombreClienteReserva.setText("");
        txtCosto.setText("");
        txtIdHabitacionReserva.setText("");

    }

    void habiliatr() {
        txtIdReserva.setVisible(false);
        txtIdHabitacionReserva.setVisible(false);
        txtIDClienteReserva.setVisible(false);
        txtidTrabajadorReserva.setVisible(false);

        txtIdHabitacionReserva.setEnabled(true);
        txtIDClienteReserva.setEnabled(true);
        txtidTrabajadorReserva.setEnabled(true);
        cboEstadoReserva.setSelectedIndex(0);
        cboTipoReserva.setSelectedIndex(0);
        txtNumeroHabitacionReserva.setEnabled(true);
        txtNombreClienteReserva.setEnabled(true);
        txtNombreTRabajdorReserva.setEnabled(true);
        cboTipoReserva.setEnabled(true);
        cboEstadoReserva.setEnabled(true);
        jdateFechaReserva.setEnabled(true);
        jdateFecahIngreso.setEnabled(true);
        jdateFechaSalida.setEnabled(true);

        txtCosto.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnHabitacionBuscar.setEnabled(true);
        btnClienteBuscar.setEnabled(true);

        txtIdReserva.setText("");
        txtIDClienteReserva.setText("");
        txtNumeroHabitacionReserva.setText("");
        txtNombreClienteReserva.setText("");
        txtCosto.setText("");
        txtIdHabitacionReserva.setText("");

        jdateFechaReserva.setDate(null);
        jdateFecahIngreso.setDate(null);
        jdateFechaSalida.setDate(null);
    }

    public void ocultarComlunaID() {

        tablaReserva.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaReserva.getColumnModel().getColumn(0).setMinWidth(0);
        tablaReserva.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablaReserva.getColumnModel().getColumn(1).setMaxWidth(0);
        tablaReserva.getColumnModel().getColumn(1).setMinWidth(0);
        tablaReserva.getColumnModel().getColumn(1).setPreferredWidth(0);

        tablaReserva.getColumnModel().getColumn(3).setMaxWidth(0);
        tablaReserva.getColumnModel().getColumn(3).setMinWidth(0);
        tablaReserva.getColumnModel().getColumn(3).setPreferredWidth(0);

        tablaReserva.getColumnModel().getColumn(5).setMaxWidth(0);
        tablaReserva.getColumnModel().getColumn(5).setMinWidth(0);
        tablaReserva.getColumnModel().getColumn(5).setPreferredWidth(0);

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fReservaHDAO func = new fReservaHDAO();
            modelo = func.mostrar(buscar);
            tablaReserva.setModel(modelo);
            totalRegistros.setText("Total Registros: " + Integer.toString(func.totalRegistros));
            ocultarComlunaID();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al cargar los datos" + e.getMessage());
        }
    }

    void mostrarFecha(String buscar) {
        try {
            DefaultTableModel modelo;
            fReservaHDAO func = new fReservaHDAO();
            modelo = func.mostrarFecha(buscar);
            tablaReserva.setModel(modelo);
            totalRegistros.setText("Total Registros: " + Integer.toString(func.totalRegistros));
            ocultarComlunaID();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al cargar los datos" + e.getMessage());
        }

        fReservaHDAO func = new fReservaHDAO();
        cboFecha.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = func.llenarBusquedaporFecha();
        for (int i = 0; i < lista.size(); i++) {
            cboFecha.addItem(lista.get(i));
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

        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtIdReserva = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdHabitacionReserva = new javax.swing.JTextField();
        txtNombreClienteReserva = new javax.swing.JTextField();
        txtIDClienteReserva = new javax.swing.JTextField();
        txtNumeroHabitacionReserva = new javax.swing.JTextField();
        txtidTrabajadorReserva = new javax.swing.JTextField();
        btnHabitacionBuscar = new javax.swing.JButton();
        btnClienteBuscar = new javax.swing.JButton();
        labelMetroICM1 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        txtNombreTRabajdorReserva = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        rSPanelsSlider1 = new rojeru_san.RSPanelsSlider();
        cboTipoReserva = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdateFechaReserva = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jdateFecahIngreso = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jdateFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        cboEstadoReserva = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnConsumo = new javax.swing.JButton();
        btnRealizarPago = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReserva = new com.icm.components.metro.TableMetroICM();
        jLabel12 = new javax.swing.JLabel();
        cboFecha = new javax.swing.JComboBox();
        btnBuscar = new org.edisoncor.gui.button.ButtonIpod();
        btnRecorder = new javax.swing.JButton();
        btnEliminar = new org.edisoncor.gui.button.ButtonIpod();
        totalRegistros = new javax.swing.JLabel();

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

        jPanel5.setBackground(new java.awt.Color(51, 204, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("GESTION DE RESERVA DE HABITACIONES ");

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 465, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(btnSalir)
                    .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Corridor_18px.png"))); // NOI18N
        jLabel1.setText("Habitacion: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 21, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Admin_18px.png"))); // NOI18N
        jLabel2.setText("Cliente: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 77, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Manager_18px.png"))); // NOI18N
        jLabel3.setText("Trabajador: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 127, -1, -1));

        txtIdHabitacionReserva.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtIdHabitacionReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 21, 40, -1));

        txtNombreClienteReserva.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtNombreClienteReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 77, 190, -1));

        txtIDClienteReserva.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtIDClienteReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 77, 40, -1));

        txtNumeroHabitacionReserva.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtNumeroHabitacionReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 21, 190, -1));

        txtidTrabajadorReserva.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtidTrabajadorReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 127, 40, -1));

        btnHabitacionBuscar.setText("...");
        btnHabitacionBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacionBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 20, -1, -1));

        btnClienteBuscar.setText("...");
        btnClienteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnClienteBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 76, -1, -1));

        labelMetroICM1.setForeground(new java.awt.Color(255, 0, 0));
        labelMetroICM1.setText("Nombre Trabajador * ");
        labelMetroICM1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jPanel1.add(labelMetroICM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 105, -1, -1));

        labelMetroICM2.setForeground(new java.awt.Color(255, 0, 51));
        labelMetroICM2.setText("Piso *");
        labelMetroICM2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jPanel1.add(labelMetroICM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 2, -1, -1));

        labelMetroICM3.setForeground(new java.awt.Color(255, 0, 0));
        labelMetroICM3.setText("Nombre Cliente * ");
        labelMetroICM3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jPanel1.add(labelMetroICM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 49, -1, -1));

        txtNombreTRabajdorReserva.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtNombreTRabajdorReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, -1));

        jTabbedPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        cboTipoReserva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Reserva", "Alquiler" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Ticket_Purchase_18px.png"))); // NOI18N
        jLabel4.setText("Tipo Reserva:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Calendar_18px.png"))); // NOI18N
        jLabel5.setText("Fecha Reserva:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Schedule_18px.png"))); // NOI18N
        jLabel6.setText("Fecha Ingreso:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Today_18px.png"))); // NOI18N
        jLabel7.setText("Fecha Salida:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Stack_of_Money_18px.png"))); // NOI18N
        jLabel8.setText("Costo:");

        cboEstadoReserva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Alquiler", "Pagada", "Anulada" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Refresh_18px.png"))); // NOI18N
        jLabel9.setText("Estado:");

        javax.swing.GroupLayout rSPanelsSlider1Layout = new javax.swing.GroupLayout(rSPanelsSlider1);
        rSPanelsSlider1.setLayout(rSPanelsSlider1Layout);
        rSPanelsSlider1Layout.setHorizontalGroup(
            rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelsSlider1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(41, 41, 41)
                .addGroup(rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateFecahIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdateFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        rSPanelsSlider1Layout.setVerticalGroup(
            rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelsSlider1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelsSlider1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelsSlider1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jdateFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdateFecahIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Registro Reserva", rSPanelsSlider1);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarConsumo.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Report_Card_32px.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Unavailable_32px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Botones De Opciones", jPanel2);

        btnConsumo.setBackground(new java.awt.Color(255, 255, 255));
        btnConsumo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PagoMoneyNuevo.png"))); // NOI18N
        btnConsumo.setText("Consumo");
        btnConsumo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsumoActionPerformed(evt);
            }
        });

        btnRealizarPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRealizarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dinero.png"))); // NOI18N
        btnRealizarPago.setText("Pago Del Cliente");
        btnRealizarPago.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRealizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRealizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRealizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Reportes", jPanel3);

        tablaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaReserva);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Buscar Fecha:");

        cboFecha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", " " }));

        btnBuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Search_32px_1.png"))); // NOI18N
        btnBuscar.setText("Buscar ");
        btnBuscar.setColorDeSombra(new java.awt.Color(102, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRecorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar_1.png"))); // NOI18N
        btnRecorder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorderActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Delete_32px.png"))); // NOI18N
        btnEliminar.setText("Eliminar ");
        btnEliminar.setColorDeSombra(new java.awt.Color(102, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        totalRegistros.setText("Registros: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12)
                        .addGap(39, 39, 39)
                        .addComponent(cboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnRecorder, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(cboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnRecorder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Esta a punto de\ncerrar la Ventana\n¿Desea continuar?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/principal/preg2.png"))) == JOptionPane.YES_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnHabitacionBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionBuscarActionPerformed
        jdiVistaHabitaciones d = new jdiVistaHabitaciones();
        d.toFront();
        d.setVisible(true);
    }//GEN-LAST:event_btnHabitacionBuscarActionPerformed

    private void btnClienteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteBuscarActionPerformed
        jdiVistaCliente u = new jdiVistaCliente();
        u.toFront();
        u.setVisible(true);
    }//GEN-LAST:event_btnClienteBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtIdHabitacionReserva.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes selecionar una habitacion");
            txtIdHabitacionReserva.requestFocus();
            return;
        }

        vReserva dts = new vReserva();
        fReservaHDAO func = new fReservaHDAO();

        dts.setIdHabitacion(Integer.parseInt(txtIdHabitacionReserva.getText()));
        dts.setIdCliente(Integer.parseInt(txtIDClienteReserva.getText()));
        dts.setIdTrabajador(idusuarioReserva);
        int selecionar = cboTipoReserva.getSelectedIndex();
        dts.setReservaTipo((String) cboTipoReserva.getItemAt(selecionar));
        Calendar cal;
        int d, m, a;
        cal = jdateFechaReserva.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFechaReserva(new Date(a, m, d));

        cal = jdateFecahIngreso.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFechaIngreso(new Date(a, m, d));

        cal = jdateFechaSalida.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFechaSalida(new Date(a, m, d));

        dts.setCosotoAlojamiento(Double.parseDouble(txtCosto.getText()));
        selecionar = cboEstadoReserva.getSelectedIndex();

        dts.setEstado((String) cboEstadoReserva.getItemAt(selecionar));

        if (accion.equals("guardar")) {

            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "Reserva Agregada Correctamente");
                mostrar("");
                inhabiliatr();

                fHabitacionesDAO func3 = new fHabitacionesDAO();
                vHabitacion dts3 = new vHabitacion();
                dts3.setIdHabitacion(Integer.parseInt(txtIdHabitacionReserva.getText()));
                func3.ocupar(dts3);
            }

        } else if (accion.equals("editar")) {
            dts.setIdReserva(Integer.parseInt(txtIdReserva.getText()));
            dts.setIdTrabajador(Integer.parseInt(txtidTrabajadorReserva.getText()));
            try {
                if (func.editar(dts)) {
                    JOptionPane.showMessageDialog(null, "reserva Ediatada");
                    mostrar("");
                    inhabiliatr();
                }
            } catch (SQLException ex) {
                Logger.getLogger(jdiaRegistrarReserva.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
            habiliatr();
            btnGuardar.setText("Guardar");
            accion = "guardar";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Nuevo:" + e, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabiliatr();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsumoActionPerformed

        try {
            int fila = tablaReserva.getSelectedRow();
            jdiCosumo.idReserva = tablaReserva.getValueAt(fila, 0).toString();
            jdiCosumo.Cliente = tablaReserva.getValueAt(fila, 4).toString();
            jdiCosumo form = new jdiCosumo();
            form.toFront();
            form.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Acceso Denegado", "Debe selecionar una fila: " + e, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsumoActionPerformed

    private void btnRealizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPagoActionPerformed

        try {
            int fila = tablaReserva.getSelectedRow();
            jdiPagodeCliente.idreserva = tablaReserva.getValueAt(fila, 0).toString();
            jdiPagodeCliente.cliente = tablaReserva.getValueAt(fila, 4).toString();
            jdiPagodeCliente.totalreserva = Double.parseDouble(tablaReserva.getValueAt(fila, 11).toString());

            jdiPagodeCliente.idhabitacion = tablaReserva.getValueAt(fila, 1).toString();
            jdiPagodeCliente.habitacion = tablaReserva.getValueAt(fila, 2).toString();

            jdiPagodeCliente fomr = new jdiPagodeCliente();
            fomr.toFront();
            fomr.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Acceso Denegado", "Debe selecionar una fila: " + e, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRealizarPagoActionPerformed

    private void tablaReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservaMouseClicked
        try {
            btnGuardar.setText("Editar");
            habiliatr();
            btnEliminar.setEnabled(true);
            accion = "editar";

            int fila = tablaReserva.rowAtPoint(evt.getPoint());

            txtIdReserva.setText(tablaReserva.getValueAt(fila, 0).toString());
            txtIdHabitacionReserva.setText(tablaReserva.getValueAt(fila, 1).toString());
            txtNumeroHabitacionReserva.setText(tablaReserva.getValueAt(fila, 2).toString());
            txtIDClienteReserva.setText(tablaReserva.getValueAt(fila, 3).toString());
            txtNombreClienteReserva.setText(tablaReserva.getValueAt(fila, 4).toString());
            txtidTrabajadorReserva.setText(tablaReserva.getValueAt(fila, 5).toString());
            txtNombreTRabajdorReserva.setText(tablaReserva.getValueAt(fila, 6).toString());

            cboTipoReserva.setSelectedItem(tablaReserva.getValueAt(fila, 7).toString());
            jdateFechaReserva.setDate(Date.valueOf(tablaReserva.getValueAt(fila, 8).toString()));
            jdateFecahIngreso.setDate(Date.valueOf(tablaReserva.getValueAt(fila, 9).toString()));
            jdateFechaSalida.setDate(Date.valueOf(tablaReserva.getValueAt(fila, 10).toString()));
            txtCosto.setText(tablaReserva.getValueAt(fila, 11).toString());
            cboEstadoReserva.setSelectedItem(tablaReserva.getValueAt(fila, 12).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al hacer Click en la Tabla", "Error Click" + e, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tablaReservaMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (cboFecha.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione Status", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            mostrarFecha(cboFecha.getSelectedItem().toString());

        }
        int fila = tablaReserva.getRowCount();
        if (fila <= 0) {
            JOptionPane.showMessageDialog(null, "Fallo la Busqueda No Se Encontro!", "ERROR", JOptionPane.ERROR_MESSAGE);
            //        } else {
            //            mostrar(txtBuscar.getText());
            //            txtBuscar.setText("");
            //        }

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRecorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorderActionPerformed
        // TODO add your handling code here:
        mostrar("");
    }//GEN-LAST:event_btnRecorderActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if (!txtIdReserva.getText().equals("")) {
                int confimarcio = JOptionPane.showConfirmDialog(rootPane, "Desea eliminarlo?", "Confimar", 2);
                if (confimarcio == 0) {
                    fReservaHDAO func = new fReservaHDAO();
                    vReserva dts = new vReserva();
                    dts.setIdReserva(Integer.parseInt(txtIdReserva.getText()));
                    try {
                        func.eliminar(dts);
                    } catch (SQLException ex) {
                        Logger.getLogger(jdiaRegistrarReserva.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    mostrar("");
                    inhabiliatr();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla primero", "Error al Eliminar: " + e, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

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
//            java.util.logging.Logger.getLogger(jdiaRegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jdiaRegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jdiaRegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jdiaRegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new jdiaRegistrarReserva().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnClienteBuscar;
    private javax.swing.JButton btnConsumo;
    private org.edisoncor.gui.button.ButtonIpod btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHabitacionBuscar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRealizarPago;
    private javax.swing.JButton btnRecorder;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboEstadoReserva;
    private javax.swing.JComboBox cboFecha;
    private javax.swing.JComboBox cboTipoReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private com.toedter.calendar.JDateChooser jdateFecahIngreso;
    private com.toedter.calendar.JDateChooser jdateFechaReserva;
    private com.toedter.calendar.JDateChooser jdateFechaSalida;
    private com.icm.components.metro.LabelMetroICM labelMetroICM1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private rojeru_san.RSPanelsSlider rSPanelsSlider1;
    private com.icm.components.metro.TableMetroICM tablaReserva;
    private javax.swing.JLabel totalRegistros;
    private javax.swing.JTextField txtCosto;
    public static javax.swing.JTextField txtIDClienteReserva;
    public static javax.swing.JTextField txtIdHabitacionReserva;
    private javax.swing.JTextField txtIdReserva;
    public static javax.swing.JTextField txtNombreClienteReserva;
    public static javax.swing.JTextField txtNombreTRabajdorReserva;
    public static javax.swing.JTextField txtNumeroHabitacionReserva;
    public static javax.swing.JTextField txtidTrabajadorReserva;
    // End of variables declaration//GEN-END:variables
}
