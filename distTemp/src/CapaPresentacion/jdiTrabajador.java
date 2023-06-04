/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDominio.vTrabajador;
import CapaPersistencia.fTrabajadorDAO;
import java.awt.Color;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
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
public class jdiTrabajador extends javax.swing.JDialog {

    /**
     * Creates new form jdiTrabajador
     */int x, y;
    public jdiTrabajador() {
        super(PrincipalHotel.getInstancia(), true);
        initComponents();
        mostrar("");
        inhabilitar();
           this.setLocationRelativeTo(null);
    }
    private String accion = "guardar";

    void inhabilitar() {
        txtidpersona.setVisible(false);

        txtnombre.setEnabled(false);
        txtapaterno.setEnabled(false);
        txtamaterno.setEnabled(false);
        txtEdad.setEnabled(false);

        txtdireccion.setEnabled(false);
        txttelefono.setEnabled(false);
        txtemail.setEnabled(false);
        txtlogin.setEnabled(false);
        cboacceso.setEnabled(false);
        txtpassword.setEnabled(false);
        cboestado.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btneliminar.setEnabled(false);
        JcalenFechaNacimiento.setDate(null);
        txtidpersona.setText("");
        txtnombre.setText("");
        txtapaterno.setText("");
        txtamaterno.setText("");
        txtEdad.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtemail.setText("");
        txtlogin.setText("");
        txtpassword.setText("");
        cboestado.setSelectedIndex(0);
        cboacceso.setSelectedIndex(0);

    }

    void habilitar() {
        txtidpersona.setVisible(false);
        txtlogin.setEnabled(true);
        txtnombre.setEnabled(true);
        txtapaterno.setEnabled(true);
        txtamaterno.setEnabled(true);
        txtEdad.setEnabled(true);
        txtdireccion.setEnabled(true);
        txttelefono.setEnabled(true);
        txtemail.setEnabled(true);
        cboacceso.setEnabled(true);
        txtpassword.setEnabled(true);
        cboestado.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btneliminar.setEnabled(true);
        JcalenFechaNacimiento.setDate(null);
        cboestado.setSelectedIndex(0);
        cboacceso.setSelectedIndex(0);
        txtidpersona.setText("");
        txtnombre.setText("");
        txtapaterno.setText("");
        txtamaterno.setText("");
        txtEdad.setText("");
        txtlogin.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtemail.setText("");

        txtpassword.setText("");

    }

    public void ocultarComlunaID() {

        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fTrabajadorDAO func = new fTrabajadorDAO();
            modelo = func.mostrar(buscar);
            tablalistado.setModel(modelo);
            ocultarComlunaID();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtidpersona = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtapaterno = new javax.swing.JTextField();
        txtamaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cboacceso = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtpassword = new rojeru_san.RSMPassView();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JcalenFechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtEdad = new org.jdesktop.swingx.JXTextField();
        jLabel13 = new javax.swing.JLabel();
        cdboSexo = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        mensaje1 = new javax.swing.JLabel();
        mensaje05 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        lbltotalregistros = new javax.swing.JLabel();
        btnNuevo = new org.edisoncor.gui.button.ButtonIpod();
        btnGuardar = new org.edisoncor.gui.button.ButtonIpod();
        btnCancelar = new org.edisoncor.gui.button.ButtonIpod();
        btneliminar = new org.edisoncor.gui.button.ButtonIpod();
        btnsalir = new org.edisoncor.gui.button.ButtonIpod();
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

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lista de Registro de Trabajadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
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
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Trabajador", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreFocusLost(evt);
            }
        });
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellido Paterno");

        txtapaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtapaternoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtapaternoFocusLost(evt);
            }
        });
        txtapaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapaternoActionPerformed(evt);
            }
        });

        txtamaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtamaternoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtamaternoFocusLost(evt);
            }
        });
        txtamaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamaternoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Dirección:");

        txtdireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdireccionFocusLost(evt);
            }
        });
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Teléfono:");

        txttelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttelefonoFocusLost(evt);
            }
        });
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Email:");

        cboacceso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleciones...", "Administrador", "Empleado" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Acceso:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Password:");

        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Escoger>", "A", "D" }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Estado:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Edad: ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Fecha Nacimiento:");

        txtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEdadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEdadFocusLost(evt);
            }
        });
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Sexo:");

        cdboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciones..", "Masculino", "Femenino", " " }));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Login:");
        jLabel16.setToolTipText("");

        txtlogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtloginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtloginFocusLost(evt);
            }
        });
        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });

        mensaje1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        mensaje1.setForeground(new java.awt.Color(255, 51, 51));
        mensaje1.setText("El telefono tiene 9 digitos");

        mensaje05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/not.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(39, 39, 39)
                            .addComponent(JcalenFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(39, 39, 39)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cdboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtamaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtapaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(39, 39, 39)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(mensaje05, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtamaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cdboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JcalenFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboacceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addComponent(mensaje05, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GESTION DE TRABAJADORES ASOCIADAS A PERSONA");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        btnbuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarConsumo.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newPago.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setColorDeSombra(new java.awt.Color(204, 204, 204));
        btnNuevo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualiza.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setColorDeSombra(new java.awt.Color(204, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Add_Tag_32px_2.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setColorDeSombra(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(255, 255, 255));
        btneliminar.setForeground(new java.awt.Color(0, 0, 0));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/remove.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setColorDeSombra(new java.awt.Color(204, 204, 204));
        btneliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(255, 255, 255));
        btnsalir.setForeground(new java.awt.Color(0, 0, 0));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        jMenu1.setText("Trabajadores");

        jMenuItem1.setText("Reporte");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reporte Trabajadores", jInternalFrame1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscar)
                        .addGap(109, 109, 109))))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbltotalregistros)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
        btnGuardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());
        txtidpersona.setText(tablalistado.getValueAt(fila, 0).toString());
        txtapaterno.setText(tablalistado.getValueAt(fila, 1).toString());
        txtamaterno.setText(tablalistado.getValueAt(fila, 2).toString());
        txtnombre.setText(tablalistado.getValueAt(fila, 3).toString());
        txtEdad.setText(tablalistado.getValueAt(fila, 4).toString());
        cdboSexo.setSelectedItem(tablalistado.getValueAt(fila, 5).toString());
        JcalenFechaNacimiento.setDate(Date.valueOf(tablalistado.getValueAt(fila, 6).toString()));
        txtdireccion.setText(tablalistado.getValueAt(fila, 7).toString());
        txttelefono.setText(tablalistado.getValueAt(fila, 8).toString());
        txtemail.setText(tablalistado.getValueAt(fila, 9).toString());
        cboacceso.setSelectedItem(tablalistado.getValueAt(fila, 10).toString());
        txtlogin.setText(tablalistado.getValueAt(fila, 11).toString());
        txtpassword.setText(tablalistado.getValueAt(fila, 12).toString());
        cboestado.setSelectedItem(tablalistado.getValueAt(fila, 13).toString());
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
        txtnombre.transferFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapaternoActionPerformed
        // TODO add your handling code here:
        txtapaterno.transferFocus();
        txtamaterno.requestFocus();
    }//GEN-LAST:event_txtapaternoActionPerformed

    private void txtamaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamaternoActionPerformed
        // TODO add your handling code here:
        txtamaterno.transferFocus();
        txtnombre.requestFocus();
    }//GEN-LAST:event_txtamaternoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
        txtdireccion.transferFocus();
        txttelefono.requestFocus();
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
        txttelefono.transferFocus();
        txtemail.requestFocus();
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
        txtemail.transferFocus();
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        txtEdad.transferFocus();
        txtdireccion.requestFocus();
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginActionPerformed

    private void txtapaternoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapaternoFocusGained
        txtapaterno.setForeground(Color.red);
        txtapaterno.setBackground(Color.yellow);
    }//GEN-LAST:event_txtapaternoFocusGained

    private void txtapaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapaternoFocusLost
        txtapaterno.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtapaternoFocusLost

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        try {
            habilitar();
            btnGuardar.setText("Guardar");
            accion = "guardar";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Nuevo:" + e, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (txtnombre.getText().length() == 0) {
                JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Nombre para el Trabajador");
                txtnombre.requestFocus();
                return;
            }
            if (txtapaterno.getText().length() == 0) {
                JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un apellido para el Trabajador");
                txtapaterno.requestFocus();
                return;
            }
            if (txtamaterno.getText().length() == 0) {
                JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un apellido para el Trabajador");
                txtamaterno.requestFocus();
                return;
            }

            if (txtEdad.getText().length() == 0) {
                JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una edad  para el Trabajador");
                txtEdad.requestFocus();
                return;
            }

            if (txtpassword.getText().length() == 0) {
                JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un password para el trabajador");
                txtpassword.requestFocus();
                return;
            }

            Calendar cal;
            int d, m, a;
            vTrabajador dts = new vTrabajador();
            fTrabajadorDAO func = new fTrabajadorDAO();
            dts.setPersonaAparteno(txtapaterno.getText());
            dts.setPersonaAmaterno(txtamaterno.getText());
            dts.setPersonaNombre(txtnombre.getText());
            dts.setPersonaEdad(Integer.parseInt(txtEdad.getText()));
            int seleccionado = cdboSexo.getSelectedIndex();
            dts.setPersonaSexo((String) cdboSexo.getItemAt(seleccionado));
            cal = JcalenFechaNacimiento.getCalendar();
            d = cal.get(Calendar.DAY_OF_MONTH);
            m = cal.get(Calendar.MONTH);
            a = cal.get(Calendar.YEAR) - 1900;
            dts.setPersonaFechaNacimiento(new Date(a, m, d));
            dts.setPersonaDireccion(txtdireccion.getText());
            dts.setPersonaTelefono(Integer.parseInt(txttelefono.getText()));
            dts.setPersonaCorreo(txtemail.getText());

            seleccionado = cboacceso.getSelectedIndex();
            dts.setTabajadorAccseso((String) cboacceso.getItemAt(seleccionado));
            dts.setTabajadorLogin(txtlogin.getText());
            String pas = new String(txtpassword.getPassword());
            dts.setTabajadorPassord(pas);
            seleccionado = cboestado.getSelectedIndex();
            dts.setTabajadorEstado((String) cboestado.getItemAt(seleccionado));

            if (accion.equals("guardar")) {
                try {
                    if (func.insertar(dts)) {
                        JOptionPane.showMessageDialog(rootPane, "el trabajador fue registrado satisfactoriamente");
                        mostrar("");
                        inhabilitar();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(jdiTrabajador.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (accion.equals("editar")) {
                dts.setIdPersona(Integer.parseInt(txtidpersona.getText()));
                try {
                    if (func.editar(dts)) {
                        JOptionPane.showMessageDialog(rootPane, "El Trabajador fue Editado satisfactoriamente");
                        mostrar("");
                        inhabilitar();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(jdiTrabajador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Guardar:" + e, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            if (!txtidpersona.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Trabajador?", "Confirmar", 2);

                if (confirmacion == 0) {
                    fTrabajadorDAO func = new fTrabajadorDAO();
                    vTrabajador dts = new vTrabajador();

                    dts.setIdPersona(Integer.parseInt(txtidpersona.getText()));
                    func.eliminar(dts);
                    mostrar("");
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtamaternoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtamaternoFocusGained
        txtamaterno.setForeground(Color.red);
        txtamaterno.setBackground(Color.yellow);
    }//GEN-LAST:event_txtamaternoFocusGained

    private void txtamaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtamaternoFocusLost
        txtamaterno.setBackground(Color.white);
    }//GEN-LAST:event_txtamaternoFocusLost

    private void txtnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusGained
        txtnombre.setForeground(Color.red);
        txtnombre.setBackground(Color.yellow);
    }//GEN-LAST:event_txtnombreFocusGained

    private void txtnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusLost
        txtnombre.setBackground(Color.white);
    }//GEN-LAST:event_txtnombreFocusLost

    private void txtEdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusGained
        txtEdad.setForeground(Color.red);
        txtEdad.setBackground(Color.yellow);
    }//GEN-LAST:event_txtEdadFocusGained

    private void txtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusLost
        txtEdad.setBackground(Color.white);
    }//GEN-LAST:event_txtEdadFocusLost

    private void txtdireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdireccionFocusGained
        txtdireccion.setForeground(Color.red);
        txtdireccion.setBackground(Color.yellow);
    }//GEN-LAST:event_txtdireccionFocusGained

    private void txtdireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdireccionFocusLost
        txtdireccion.setBackground(Color.white);
    }//GEN-LAST:event_txtdireccionFocusLost

    private void txttelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttelefonoFocusGained
        txttelefono.setForeground(Color.red);
        txttelefono.setBackground(Color.yellow);
    }//GEN-LAST:event_txttelefonoFocusGained

    private void txttelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttelefonoFocusLost
        txttelefono.setBackground(Color.white);
    }//GEN-LAST:event_txttelefonoFocusLost

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        txtemail.setForeground(Color.red);
        txtemail.setBackground(Color.yellow);
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        txtemail.setBackground(Color.white);
    }//GEN-LAST:event_txtemailFocusLost

    private void txtloginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtloginFocusGained
        txtlogin.setForeground(Color.red);
        txtlogin.setBackground(Color.yellow);
    }//GEN-LAST:event_txtloginFocusGained

    private void txtloginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtloginFocusLost
        txtlogin.setBackground(Color.white);
    }//GEN-LAST:event_txtloginFocusLost

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       x = evt.getX();
        y = evt.getY();  
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);           // TODO add your handling code here:
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
//            java.util.logging.Logger.getLogger(jdiTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jdiTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jdiTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jdiTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                jdiTrabajador dialog = new jdiTrabajador(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser JcalenFechaNacimiento;
    private org.edisoncor.gui.button.ButtonIpod btnCancelar;
    private org.edisoncor.gui.button.ButtonIpod btnGuardar;
    private org.edisoncor.gui.button.ButtonIpod btnNuevo;
    private javax.swing.JButton btnbuscar;
    private org.edisoncor.gui.button.ButtonIpod btneliminar;
    private org.edisoncor.gui.button.ButtonIpod btnsalir;
    private javax.swing.JComboBox cboacceso;
    private javax.swing.JComboBox cboestado;
    private javax.swing.JComboBox cdboSexo;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JLabel mensaje05;
    private javax.swing.JLabel mensaje1;
    private javax.swing.JTable tablalistado;
    private org.jdesktop.swingx.JXTextField txtEdad;
    private javax.swing.JTextField txtamaterno;
    private javax.swing.JTextField txtapaterno;
    private javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtdireccion;
    public static javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtidpersona;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtnombre;
    private rojeru_san.RSMPassView txtpassword;
    public static javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
