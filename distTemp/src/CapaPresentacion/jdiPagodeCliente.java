/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDominio.vConsumo;
import CapaDominio.vHabitacion;
import CapaDominio.vPago;
import CapaDominio.vReserva;
import CapaPersistencia.conexion;
import CapaPersistencia.fItemConsumoDAO;
import CapaPersistencia.fHabitacionesDAO;
import CapaPersistencia.fPagoDAO;
import CapaPersistencia.fReservaHDAO;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
public class jdiPagodeCliente extends javax.swing.JDialog {

    /**
     * Creates new form jdiPagodeCliente
     */int x, y;
    public jdiPagodeCliente() {
        super(PrincipalHotel.getInstancia(), true);
        initComponents();
        mostrarr(idreserva);
        txtidReserva.setText(idreserva);
        txtClienteReserva.setText(cliente);
        txthabitacion.setText(habitacion);
        txtidhabitacion.setText(idhabitacion);
        txtTotalReservaHotel.setText(Double.toString(totalreserva));
        fItemConsumoDAO func = new fItemConsumoDAO();
        func.mostrar(idreserva);
        txtTotalPago.setText(Double.toString(totalreserva + func.totalconsumo));

    }
    private String accion = "guardar";
    public static String idreserva;
    public static String cliente;
    public static String idhabitacion;
    public static String habitacion;
    public static Double totalreserva;

    void inhabilitar() {
        txtidPagoCliente.setVisible(true);

        txtidReserva.setVisible(false);
        txtClienteReserva.setEnabled(false);
        txtNumeroComprobante.setEnabled(false);
        cboTipoComprobante.setEnabled(false);
        txtIgv.setEnabled(false);
        txtTotalPago.setEnabled(false);
        txtTotalReservaHotel.setEnabled(false);
        jFechaEmision.setEnabled(false);
        jFechaPago.setEnabled(false);

        txtidhabitacion.setVisible(false);
        txthabitacion.setEnabled(false);

        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btneliminar.setEnabled(false);
        txtidPagoCliente.setText("");
        txtNumeroComprobante.setText("");
        txtIgv.setText("");
        txtTotalPago.setText("");

    }

    void habilitar() {
        txtidPagoCliente.setVisible(false);

        txtidReserva.setVisible(true);
        txtClienteReserva.setEnabled(true);
        txtNumeroComprobante.setEnabled(true);
        cboTipoComprobante.setEnabled(true);
        txtIgv.setEnabled(true);
        txtTotalPago.setEnabled(true);
        txtTotalReservaHotel.setEnabled(true);
        jFechaEmision.setEnabled(true);
        jFechaPago.setEnabled(true);

        txtidhabitacion.setVisible(true);
        txthabitacion.setEnabled(true);

        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btneliminar.setEnabled(true);
        txtidPagoCliente.setText("");
        txtNumeroComprobante.setText("");
        txtIgv.setText("");
        txtTotalPago.setText("");

    }

    void mostrarr(String buscar) {
        try {
            DefaultTableModel modelo;
            fPagoDAO func = new fPagoDAO();
            modelo = func.mostrar(buscar);
            tablalistadoPagos.setModel(modelo);
            lbltotalregistros.setText("Total Pagos " + Integer.toString(func.totalregistros));

            fItemConsumoDAO func2 = new fItemConsumoDAO();
            modelo = func2.mostrar(buscar);
            tablalistadoconsumo.setModel(modelo);

            lbltotalregistrosconsumo.setText("Total Consumos " + func2.totalregistros);
            lbltotalconsumo.setText("Consumo Total: $." + func2.totalconsumo);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtidReserva = new javax.swing.JTextField();
        txtClienteReserva = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTotalReservaHotel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtidhabitacion = new javax.swing.JTextField();
        txthabitacion = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboTipoComprobante = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroComprobante = new javax.swing.JTextField();
        jFechaPago = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jFechaEmision = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        txtTotalPago = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnImprimirPago = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtidPagoCliente = new javax.swing.JTextField();
        cerrar = new principal.MaterialButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablalistadoPagos = new javax.swing.JTable();
        lbltotalregistros = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistadoconsumo = new javax.swing.JTable();
        lbltotalconsumo = new javax.swing.JLabel();
        lbltotalregistrosconsumo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pago");
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(new java.awt.Color(204, 204, 204));
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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Resume_18px.png"))); // NOI18N
        jLabel1.setText("Reserva");

        txtidReserva.setBackground(new java.awt.Color(204, 204, 204));
        txtidReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidReservaActionPerformed(evt);
            }
        });

        txtClienteReserva.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Money_Bag_18px.png"))); // NOI18N
        jLabel2.setText("Total Reserva:");

        txtTotalReservaHotel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Hotel_18px.png"))); // NOI18N
        jLabel6.setText("Habitación:");

        txtidhabitacion.setBackground(new java.awt.Color(204, 204, 204));
        txtidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhabitacionActionPerformed(evt);
            }
        });

        txthabitacion.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(59, 59, 59))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(45, 45, 45)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTotalReservaHotel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(txtidReserva, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtidhabitacion))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txthabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(txtClienteReserva))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalReservaHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txthabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro Reserva y Habitacion", jPanel1);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Print_18px.png"))); // NOI18N
        jLabel3.setText("Tipo Comprobante:");

        cboTipoComprobante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Boleta", "Factura", "Ticket", "Otro" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Numeric_18px.png"))); // NOI18N
        jLabel4.setText("Numero Comprobante:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Today_18px.png"))); // NOI18N
        jLabel11.setText("Fecha Pago:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Calendar_18px.png"))); // NOI18N
        jLabel5.setText("Fecha Emisión:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Right_18px.png"))); // NOI18N
        jLabel12.setText("IGV:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Card_Payment_18px.png"))); // NOI18N
        jLabel13.setText("Total Pago:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(52, 52, 52)
                        .addComponent(cboTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cboTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Registro Pago", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevo.setBackground(new java.awt.Color(153, 153, 153));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newPago.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/saveDinero.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(153, 153, 153));
        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminard.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setBorder(null);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelarDinero.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Botones De Opciones", jPanel3);

        btnImprimirPago.setBackground(new java.awt.Color(255, 255, 255));
        btnImprimirPago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimirPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dinero.png"))); // NOI18N
        btnImprimirPago.setText("Imprimir pago");
        btnImprimirPago.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnImprimirPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPagoActionPerformed(evt);
            }
        });

        jButton1.setText("Reporte Consumo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImprimirPago, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirPago)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Reportes", jPanel6);

        jPanel7.setBackground(new java.awt.Color(51, 204, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Panel de Registro De Pago");

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(txtidPagoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidPagoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setToolTipText("");

        tablalistadoPagos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablalistadoPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoPagosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablalistadoPagos);

        lbltotalregistros.setBackground(new java.awt.Color(0, 153, 153));
        lbltotalregistros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotalregistros.setText("Registros");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltotalregistros)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Lista de Registro de Pagos", jPanel5);

        jPanel4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setToolTipText("");

        tablalistadoconsumo.setModel(new javax.swing.table.DefaultTableModel(
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
        tablalistadoconsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoconsumoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistadoconsumo);

        lbltotalconsumo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotalconsumo.setText("Consumo: ");

        lbltotalregistrosconsumo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotalregistrosconsumo.setText("Registros");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbltotalconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltotalregistrosconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalconsumo)
                    .addComponent(lbltotalregistrosconsumo))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Lista de Consumos", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jTabbedPane1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane4)
                    .addComponent(jTabbedPane5))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane2)
                    .addComponent(jTabbedPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablalistadoconsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoconsumoMouseClicked
//        // TODO add your handling code here:
//        btnGuardar.setText("Editar");
//        habilitar();
//        btneliminar.setEnabled(true);
//        accion = "editar";
//        
//        int fila = tablalistadoconsumo.rowAtPoint(evt.getPoint());
//        txtidconsumo.setText(tablalistadoconsumo.getValueAt(fila, 0).toString());
//        txtidReserva.setText(tablalistadoconsumo.getValueAt(fila, 1).toString());
//        txtProducto.setText(tablalistadoconsumo.getValueAt(fila, 2).toString());
//        txtcantidad.setText(tablalistadoconsumo.getValueAt(fila, 3).toString());
//        txtprecio_venta.setText(tablalistadoconsumo.getValueAt(fila, 4).toString());
//        JcalenFechaConsumo.setDate(Date.valueOf(tablalistadoconsumo.getValueAt(fila, 5).toString()));
//        cboesado.setSelectedItem(tablalistadoconsumo.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_tablalistadoconsumoMouseClicked

    private void tablalistadoPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoPagosMouseClicked
      
        try {
            btnGuardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistadoPagos.rowAtPoint(evt.getPoint());

        txtidPagoCliente.setText(tablalistadoPagos.getValueAt(fila, 0).toString());
        cboTipoComprobante.setSelectedItem(tablalistadoPagos.getValueAt(fila, 2));

        txtNumeroComprobante.setText(tablalistadoPagos.getValueAt(fila, 3).toString());
        jFechaEmision.setDate(Date.valueOf(tablalistadoPagos.getValueAt(fila, 4).toString()));
        jFechaPago.setDate(Date.valueOf(tablalistadoPagos.getValueAt(fila, 5).toString()));

        txtIgv.setText(tablalistadoPagos.getValueAt(fila, 6).toString());
        txtTotalPago.setText(tablalistadoPagos.getValueAt(fila, 7).toString());
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, "Error al hacer Click en la Tabla", "Error Click"+e, JOptionPane.ERROR_MESSAGE);
        }



    }//GEN-LAST:event_tablalistadoPagosMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {

        

            if (!txtidPagoCliente.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Pago?", "Confirmar", 2);

                if (confirmacion == 0) {
                    fPagoDAO func = new fPagoDAO();
                    vPago dts = new vPago();

                    dts.setIdPago(Integer.parseInt(txtidPagoCliente.getText()));
                    func.eliminar(dts);
                    mostrarr(idreserva);
                    inhabilitar();

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al Elimianr: "+e.getMessage());

        }

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
         habilitar();
        btnGuardar.setText("Guardar");
        accion = "guardar";    
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Nuevo:"+e,JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtidReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidReservaActionPerformed

    private void txtidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidhabitacionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            if (txtIgv.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el igv del Comprobante de pago a generar");
            txtIgv.requestFocus();
            return;
        }
        if (txtTotalPago.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el total de pago del comprobante");
            txtTotalPago.requestFocus();
            return;
        }

        if (txtNumeroComprobante.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Número de Comprobante del Pago");
            txtNumeroComprobante.requestFocus();
            return;
        }

        vPago dts = new vPago();
        fPagoDAO func = new fPagoDAO();
        dts.setIdReserva(Integer.parseInt(txtidReserva.getText()));

        int seleccionado = cboTipoComprobante.getSelectedIndex();
        dts.setPagoTipoComprobante((String) cboTipoComprobante.getItemAt(seleccionado));

        dts.setPagoNumerocomprobante(txtNumeroComprobante.getText());
        dts.setPagoIGV(Double.parseDouble(txtIgv.getText()));
        dts.setPagoTotal(Double.parseDouble(txtTotalPago.getText()));

        Calendar cal;
        int d, m, a;

        cal = jFechaPago.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;

        dts.setPagoFechaPago(new Date(a, m, d));

        cal = jFechaEmision.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setPagoFechaEmisioon(new Date(a, m, d));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, " El pago por $. " + txtTotalPago.getText()
                        + " del Sr. " + txtClienteReserva.getText() + " Ha sido realizado con Éxito");
                mostrarr(idreserva);
                inhabilitar();

                //Desocupar la Habitación
                fHabitacionesDAO func2 = new fHabitacionesDAO();
                vHabitacion dts2 = new vHabitacion();

                dts2.setIdHabitacion(Integer.parseInt(txtidhabitacion.getText()));
                func2.desocupar(dts2);

                //Cancelar o pagar la reserva
                fReservaHDAO func3 = new fReservaHDAO();
                vReserva dts3 = new vReserva();

                dts3.setIdReserva(Integer.parseInt(txtidReserva.getText()));
                try {
                    func3.pagar(dts3);
                } catch (SQLException ex) {
                    Logger.getLogger(jdiPagodeCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } else if (accion.equals("editar")) {
            dts.setIdPago(Integer.parseInt(txtidPagoCliente.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El pago del Sr. "
                        + txtClienteReserva.getText() + " Ha sido Modificado Correctamente");
                mostrarr(idreserva);
                inhabilitar();
            }
        }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Guardar:"+e,JOptionPane.ERROR_MESSAGE);
            
        }


    }//GEN-LAST:event_btnGuardarActionPerformed
    private Connection connection = new conexion().conectar();

    private void btnImprimirPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPagoActionPerformed

        try {
           if (!txtidPagoCliente.getText().equals("")) {
            Map p = new HashMap();
            p.put("idPago", txtidPagoCliente.getText());
            JasperReport report;
            JasperPrint print;

            try {
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                        + "/src/ReporteHotel/reporteComprobante.jrxml");
                print = JasperFillManager.fillReport(report, p, connection);
                JasperViewer view = new JasperViewer(print, false);
                view.show();
                view.setTitle("Comprobante");
                view.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
          
        } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No se puede mostrar");
        }

    }//GEN-LAST:event_btnImprimirPagoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!txtidPagoCliente.getText().equals("")) {
            Map p = new HashMap();
            p.put("idpago", txtidPagoCliente.getText());
            JasperReport report;
            JasperPrint print;

            try {
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                        + "/src/ReporteHotel/rptComprobanteConsumo.jrxml");
                print = JasperFillManager.fillReport(report, p, connection);
                JasperViewer view = new JasperViewer(print, false);
                view.show();
                view.setTitle("Comprobante");
                view.setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Eroor" + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Esta a punto de\ncerrar la Ventana\n¿Desea continuar?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/principal/preg2.png"))) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_cerrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();  
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
          this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    // TODO add your handling code here:
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
//            java.util.logging.Logger.getLogger(jdiPagodeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jdiPagodeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jdiPagodeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jdiPagodeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                jdiPagodeCliente dialog = new jdiPagodeCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimirPago;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btneliminar;
    private javax.swing.JComboBox cboTipoComprobante;
    private principal.MaterialButton cerrar;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jFechaEmision;
    private com.toedter.calendar.JDateChooser jFechaPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel lbltotalconsumo;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JLabel lbltotalregistrosconsumo;
    private javax.swing.JTable tablalistadoPagos;
    private javax.swing.JTable tablalistadoconsumo;
    private javax.swing.JTextField txtClienteReserva;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtNumeroComprobante;
    private javax.swing.JTextField txtTotalPago;
    private javax.swing.JTextField txtTotalReservaHotel;
    private javax.swing.JTextField txthabitacion;
    private javax.swing.JTextField txtidPagoCliente;
    private javax.swing.JTextField txtidReserva;
    private javax.swing.JTextField txtidhabitacion;
    // End of variables declaration//GEN-END:variables
}
