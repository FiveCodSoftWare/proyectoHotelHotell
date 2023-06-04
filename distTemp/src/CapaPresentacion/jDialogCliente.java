/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDominio.vCliente;
import CapaDominio.vPersona;
import CapaDominio.vPersonaDirecciones;
import CapaPersistencia.conexion;
import CapaPersistencia.fClienteDAO;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.edisoncor.gui.button.ButtonAqua;
import principal.PrincipalHotel;

/**
 *
 * @author levi
 */
public class jDialogCliente extends javax.swing.JDialog {

    /**
     * Creates new form FrmPedido
     */int x, y;
    public jDialogCliente() {
        super(PrincipalHotel.getInstancia(), true);
        initComponents();
        mostrar("");
        inhabilitar();
           this.setLocationRelativeTo(null);
    }

    private String accion = "guardar";

    public void habilitar() {
        txtIdPersona.setVisible(false);
        txtCorreo.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtIdPersona.setEnabled(true);
        txtMaterno.setEnabled(true);
        txtNombre.setEnabled(true);
        txtEdad.setEnabled(true);
        txtCodigoCliente.setEnabled(true);

        txtPaterno.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtIdPersona.setText("");
        txtMaterno.setText("");
        txtNombre.setText("");
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtPaterno.setText("");
        txtTelefono.setText("");

    }

    public void inhabilitar() {
        txtIdPersona.setVisible(false);
        txtCorreo.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtIdPersona.setEnabled(false);
        txtMaterno.setEnabled(false);
        txtNombre.setEnabled(false);
        txtEdad.setEnabled(false);
        txtCodigoCliente.setEnabled(false);
        txtPaterno.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtIdPersona.setText("");
        txtMaterno.setText("");
        txtNombre.setText("");
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtPaterno.setText("");
        txtTelefono.setText("");

    }

    public void oculartColuma() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fClienteDAO func = new fClienteDAO();
            modelo = func.mostrar(buscar);
            tablalistado.setModel(modelo);
            oculartColuma();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        lbltotalregistros = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cerrar = new principal.MaterialButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdPersona = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        txtPaterno = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        txtMaterno = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelMetroICM4 = new com.icm.components.metro.LabelMetroICM();
        txtNombre = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelMetroICM6 = new com.icm.components.metro.LabelMetroICM();
        txtEdad = new org.jdesktop.swingx.JXTextField();
        jLabel13 = new javax.swing.JLabel();
        cdboSexo = new javax.swing.JComboBox();
        labelMetroICM14 = new com.icm.components.metro.LabelMetroICM();
        jdatFechaNacimiento = new com.toedter.calendar.JDateChooser();
        labelMetroICM7 = new com.icm.components.metro.LabelMetroICM();
        txtDireccion = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelMetroICM8 = new com.icm.components.metro.LabelMetroICM();
        txtTelefono = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelMetroICM9 = new com.icm.components.metro.LabelMetroICM();
        txtCorreo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelMetroICM11 = new com.icm.components.metro.LabelMetroICM();
        txtCodigoCliente = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtBuscarNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new org.edisoncor.gui.button.ButtonIpod();
        btnCancelar = new org.edisoncor.gui.button.ButtonIpod();
        btnGuardar = new org.edisoncor.gui.button.ButtonIpod();
        btnEliminar = new org.edisoncor.gui.button.ButtonIpod();
        jPanel4 = new javax.swing.JPanel();
        rSButton1 = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(204, 204, 255));
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

        tablalistado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
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
        });
        jScrollPane3.setViewportView(tablalistado);

        lbltotalregistros.setText("Registros");

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
        jPanel3.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 35, 29));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro Clientes");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        txtIdPersona.setEnabled(false);
        jPanel3.add(txtIdPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 57, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        labelMetroICM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Resume_18px.png"))); // NOI18N
        labelMetroICM2.setText("Apellido Paterno:");

        txtPaterno.setDescripcion("");
        txtPaterno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaternoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPaternoFocusLost(evt);
            }
        });
        txtPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaternoActionPerformed(evt);
            }
        });
        txtPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaternoKeyTyped(evt);
            }
        });

        labelMetroICM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Transaction_List_18px.png"))); // NOI18N
        labelMetroICM3.setText("Apellido Materno:");

        txtMaterno.setDescripcion("");
        txtMaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaternoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaternoFocusLost(evt);
            }
        });
        txtMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaternoActionPerformed(evt);
            }
        });
        txtMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaternoKeyTyped(evt);
            }
        });

        labelMetroICM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Category_18px.png"))); // NOI18N
        labelMetroICM4.setText("Nombre:");

        txtNombre.setDescripcion("");
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        labelMetroICM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Birthday_18px.png"))); // NOI18N
        labelMetroICM6.setText("Edad:");

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
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Gender_18px.png"))); // NOI18N
        jLabel13.setText("Sexo:");

        cdboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciones..", "Masculino", "Femenino", " " }));

        labelMetroICM14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Schedule_18px.png"))); // NOI18N
        labelMetroICM14.setText("Fecha Nacimiento: ");

        labelMetroICM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Street_View_18px.png"))); // NOI18N
        labelMetroICM7.setText("Direccion:");

        txtDireccion.setDescripcion("");
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });

        labelMetroICM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Number_Pad_18px.png"))); // NOI18N
        labelMetroICM8.setText("Teléfono:");

        txtTelefono.setDescripcion("");
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        labelMetroICM9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Microsoft_Outlook_18px.png"))); // NOI18N
        labelMetroICM9.setText("Correo: ");
        labelMetroICM9.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N

        txtCorreo.setDescripcion("ejemplo@gmail.com");
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        labelMetroICM11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Admin_18px.png"))); // NOI18N
        labelMetroICM11.setText("Codigo Cliente:");

        txtCodigoCliente.setDescripcion("");
        txtCodigoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoClienteFocusLost(evt);
            }
        });
        txtCodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(labelMetroICM14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdatFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelMetroICM11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMetroICM9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetroICM6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetroICM14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdatFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro ", jPanel1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Search_32px_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnNuevo.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevo.setBorder(null);
        btnNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regis1.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setBorder(null);
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Cancel_Subscription_40px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setBorder(null);
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Edit_Property_40px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setBorder(null);
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Trash_40px.png"))); // NOI18N
        btnEliminar.setText("Eliminar ");
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane2.addTab("Opciones", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        rSButton1.setText("Reporte Clientes");
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Reporte", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1)))
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbltotalregistros))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        txtDireccion.setText(txtDireccion.getText().toUpperCase());
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased

    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char a = evt.getKeyChar();
        if (Character.isLetter(a)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese un valor numerico", "Error al digitar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoKeyTyped
        char a = evt.getKeyChar();
        if (Character.isDigit(a)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese letra no numero", "Error al digitar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPaternoKeyTyped

    private void txtMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoKeyTyped
        char a = evt.getKeyChar();
        if (Character.isDigit(a)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese letra no numero", "Error al digitar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtMaternoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char a = evt.getKeyChar();
        if (Character.isDigit(a)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese letra no numero", "Error al digitar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
              habilitar();
        btnGuardar.setText("Guardar");
        accion = "guardar";
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Nuevo:"+e,JOptionPane.ERROR_MESSAGE);
        }
      

    }//GEN-LAST:event_btnNuevoActionPerformed


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if (!txtIdPersona.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Cliente?","Confirmar",2);

            if (confirmacion==0) {
                fClienteDAO func = new fClienteDAO();
                vCliente dts= new vCliente();

                dts.setIdPersona(Integer.parseInt(txtIdPersona.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Error al Eliminar :"+e.getMessage());
        }
  

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
        txtPaterno.transferFocus();


    }//GEN-LAST:event_txtPaternoActionPerformed

    private void txtMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaternoActionPerformed
txtMaterno.transferFocus();    }//GEN-LAST:event_txtMaternoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        txtDireccion.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        txtTelefono.transferFocus(); // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        txtCorreo.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitar();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
             if (txtNombre.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Nombre para el Trabajador");
            txtNombre.requestFocus();
            return;
        }
        if (txtPaterno.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un apellido para el Trabajador");
            txtPaterno.requestFocus();
            return;
        }
        if (txtMaterno.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un apellido para el Trabajador");
            txtMaterno.requestFocus();
            return;
        }

        if (txtEdad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una edad  para el Trabajador");
            txtEdad.requestFocus();
            return;
        }

        Calendar cal;
        int d, m, a;
        vCliente dts = new vCliente();
        fClienteDAO func = new fClienteDAO();

        int verificarCodigo = Integer.parseInt(txtCodigoCliente.getText());
        int cod_producto = func.ClienteCodigoIgual(verificarCodigo);

        if (cod_producto == verificarCodigo) {
            JOptionPane.showMessageDialog(null, "YA EXISTE UN CLIENTE CON EL MISMO CODIGO");
            txtCodigoCliente.requestFocus();
            return;
        }

        dts.setPersonaAparteno(txtPaterno.getText());
        dts.setPersonaAmaterno(txtMaterno.getText());
        dts.setPersonaNombre(txtNombre.getText());
        dts.setPersonaEdad(Integer.parseInt(txtEdad.getText()));
        int seleccionado = cdboSexo.getSelectedIndex();
        dts.setPersonaSexo((String) cdboSexo.getItemAt(seleccionado));
        cal = jdatFechaNacimiento.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setPersonaFechaNacimiento(new Date(a, m, d));
        dts.setPersonaDireccion(txtDireccion.getText());
        dts.setPersonaTelefono(Integer.parseInt(txtTelefono.getText()));
        dts.setPersonaCorreo(txtCorreo.getText());
        dts.setClientecodigo(Integer.parseInt(txtCodigoCliente.getText()));
        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "el Cliente fue agregado satisfactoriamnete fue registrado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            dts.setIdPersona(Integer.parseInt(txtIdPersona.getText()));
            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El Cliente fue Editado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(rootPane, "Error En la Aplicacion", "Error en Boton Guardar:"+e,JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
        btnGuardar.setText("Editar");
        habilitar();
        btnEliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());

        txtIdPersona.setText(tablalistado.getValueAt(fila, 0).toString());
        txtNombre.setText(tablalistado.getValueAt(fila, 1).toString());
        txtPaterno.setText(tablalistado.getValueAt(fila, 2).toString());
        txtMaterno.setText(tablalistado.getValueAt(fila, 3).toString());
        txtEdad.setText(tablalistado.getValueAt(fila, 4).toString());
        cdboSexo.setSelectedItem(tablalistado.getValueAt(fila, 5).toString());
        jdatFechaNacimiento.setDate(Date.valueOf(tablalistado.getValueAt(fila, 6).toString()));
        txtDireccion.setText(tablalistado.getValueAt(fila, 7).toString());
        txtTelefono.setText(tablalistado.getValueAt(fila, 8).toString());
        txtCorreo.setText(tablalistado.getValueAt(fila, 9).toString());
        txtCodigoCliente.setText(tablalistado.getValueAt(fila, 10).toString());
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        txtEdad.transferFocus();
    }//GEN-LAST:event_txtEdadActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
      if (JOptionPane.showConfirmDialog(this, "Esta a punto de\ncerrar la Ventana\n¿Desea continuar?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/principal/preg2.png"))) == JOptionPane.YES_OPTION) {
            this.dispose();}
    }//GEN-LAST:event_cerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrar(txtBuscarNombre.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char a = evt.getKeyChar();
        if (Character.isLetter(a)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese numero no letra ", "Error al digitar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtCodigoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoClienteKeyTyped
        char a = evt.getKeyChar();
        if (Character.isLetter(a)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese numero no letra ", "Error al digitar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoClienteKeyTyped

    private void txtPaternoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaternoFocusGained
        txtPaterno.setForeground(Color.red);
        txtPaterno.setBackground(Color.yellow);
    }//GEN-LAST:event_txtPaternoFocusGained

    private void txtPaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaternoFocusLost
        txtPaterno.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtPaternoFocusLost

    private void txtMaternoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaternoFocusGained
        txtMaterno.setForeground(Color.red);
        txtMaterno.setBackground(Color.yellow);
    }//GEN-LAST:event_txtMaternoFocusGained

    private void txtMaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaternoFocusLost
        txtMaterno.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtMaternoFocusLost

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
        txtNombre.setForeground(Color.red);
        txtNombre.setBackground(Color.yellow);
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        txtNombre.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtEdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusGained
        txtEdad.setForeground(Color.red);
        txtEdad.setBackground(Color.yellow);
    }//GEN-LAST:event_txtEdadFocusGained

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        txtDireccion.setForeground(Color.red);
        txtDireccion.setBackground(Color.yellow);
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusLost
        txtEdad.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtEdadFocusLost

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        txtDireccion.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        txtTelefono.setForeground(Color.red);
        txtTelefono.setBackground(Color.yellow);
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        txtTelefono.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        txtCorreo.setForeground(Color.red);
        txtCorreo.setBackground(Color.yellow);
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        txtCorreo.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtCodigoClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoClienteFocusGained
        txtCodigoCliente.setForeground(Color.red);
        txtCodigoCliente.setBackground(Color.yellow);
    }//GEN-LAST:event_txtCodigoClienteFocusGained

    private void txtCodigoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoClienteFocusLost
        txtCodigoCliente.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtCodigoClienteFocusLost

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
 x = evt.getX();
        y = evt.getY();         // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged
 private Connection connection = new conexion().conectar();
    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;
        try {
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/ReporteHotel/reporteCliente.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte de Clientes");
          
            view.toFront();
              view.show();
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_rSButton1ActionPerformed

    /*   public static void main(String args[]) {
     /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    /*    try {
     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
     if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
     }
     }
     } catch (ClassNotFoundException ex) {
     java.util.logging.Logger.getLogger(jDialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
     java.util.logging.Logger.getLogger(jDialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
     java.util.logging.Logger.getLogger(jDialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     java.util.logging.Logger.getLogger(jDialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     //</editor-fold>

     /* Create and display the dialog */
    /*   java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
     jDialogCliente dialog = new jDialogCliente(new javax.swing.JFrame(), true);
     dialog.addWindowListener(new java.awt.event.WindowAdapter() {
     @Override
     public void windowClosing(java.awt.event.WindowEvent e) {
     System.exit(0);
     }
     });
     dialog.setVisible(true);
     }
     });*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod btnCancelar;
    private org.edisoncor.gui.button.ButtonIpod btnEliminar;
    private org.edisoncor.gui.button.ButtonIpod btnGuardar;
    private org.edisoncor.gui.button.ButtonIpod btnNuevo;
    private javax.swing.JComboBox cdboSexo;
    private principal.MaterialButton cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private com.toedter.calendar.JDateChooser jdatFechaNacimiento;
    private com.icm.components.metro.LabelMetroICM labelMetroICM11;
    private com.icm.components.metro.LabelMetroICM labelMetroICM14;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private com.icm.components.metro.LabelMetroICM labelMetroICM4;
    private com.icm.components.metro.LabelMetroICM labelMetroICM6;
    private com.icm.components.metro.LabelMetroICM labelMetroICM7;
    private com.icm.components.metro.LabelMetroICM labelMetroICM8;
    private com.icm.components.metro.LabelMetroICM labelMetroICM9;
    private javax.swing.JLabel lbltotalregistros;
    private rojeru_san.RSButton rSButton1;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtBuscarNombre;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtCodigoCliente;
    public static org.edisoncor.gui.textField.TextFieldRectBackground txtCorreo;
    public static org.edisoncor.gui.textField.TextFieldRectBackground txtDireccion;
    private org.jdesktop.swingx.JXTextField txtEdad;
    private javax.swing.JTextField txtIdPersona;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtMaterno;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtNombre;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtPaterno;
    public static org.edisoncor.gui.textField.TextFieldRectBackground txtTelefono;
    // End of variables declaration//GEN-END:variables
}
