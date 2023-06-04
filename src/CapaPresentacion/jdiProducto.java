/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDominio.CustomImageIcon;
import CapaDominio.vProducto;
import CapaPersistencia.conexion;
import CapaPersistencia.fProductoDAO;

import com.mysql.jdbc.Blob;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
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
public class jdiProducto extends javax.swing.JDialog {

    //String rutaimagen;
    /**
     * Creates new form jdiProducto
     */
    int x, y;

    public jdiProducto() {
        super(PrincipalHotel.getInstancia(), true);
        initComponents();
        inhabilitar();
        mostrar("");
        this.setLocationRelativeTo(null);
        //rutaimagen = "";

    }

    public void ocultarColumasProdcuto() {
        tableListaProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tableListaProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tableListaProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tableListaProductos.getColumnModel().getColumn(3).setMaxWidth(0);
        tableListaProductos.getColumnModel().getColumn(3).setMinWidth(0);
        tableListaProductos.getColumnModel().getColumn(3).setPreferredWidth(0);
    }

    void inhabilitar() {
        txtCodigoProducto.setEditable(false);
        txtNombreProducto.setEditable(false);
        txtDescripcionProducto.setEditable(false);
        txtPrecioProducto.setEditable(false);
        txtPrecioCompra.setEditable(false);
        txtStockProducto.setEnabled(false);
        cboUnidad_producto.setSelectedIndex(0);
        txtBuscar.setEditable(true);

        btnBuscar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);

        btnCancelar.setEnabled(false);

        txtCodigoProducto.setText("");
        txtNombreProducto.setText("");
        txtDescripcionProducto.setText("");
        txtPrecioProducto.setText("");
        txtPrecioCompra.setText("");
        txtStockProducto.setText("");
        txtBuscar.setText("");
        txtUbicacion_bodega.setText("");

    }

    void habilitar() {
        txtCodigoProducto.setEditable(true);
        txtNombreProducto.setEditable(true);
        txtDescripcionProducto.setEditable(true);
        txtPrecioProducto.setEditable(true);
        txtPrecioCompra.setEditable(true);
        txtStockProducto.setEnabled(true);

        txtBuscar.setEditable(true);

        btnBuscar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(false);
        cboUnidad_producto.setSelectedIndex(0);
        btnCancelar.setEnabled(true);

        txtCodigoProducto.setText("");
        txtNombreProducto.setText("");
        txtDescripcionProducto.setText("");
        txtPrecioProducto.setText("");
        txtPrecioCompra.setText("");
        txtStockProducto.setText("");
        txtBuscar.setText("");
        txtUbicacion_bodega.setText("");
        txtUbicacion_bodega.setEnabled(true);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fProductoDAO func = new fProductoDAO();

            if (cboSelec.getSelectedItem() == "Codigo") {
                modelo = func.mostrarPorCodigo(buscar);
            } else {
                modelo = func.mostrar(buscar);
            }

            tableListaProductos.setModel(modelo);
            //  ocultarColumasProdcuto();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalRegistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Error Al intentar Mostrar la tabla" + e.getMessage());
        }

        fProductoDAO funcion = new fProductoDAO();
        cbNombrecategoria.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = funcion.llenarComboCategoria();
        for (int i = 0; i < lista.size(); i++) {
            cbNombrecategoria.addItem(lista.get(i));
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

        SeleccionaImagen = new javax.swing.JFileChooser();
        rSPanelsSlider1 = new rojeru_san.RSPanelsSlider();
        cboSelec = new javax.swing.JComboBox<String>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        rSPanelsSlider2 = new rojeru_san.RSPanelsSlider();
        cerrar = new principal.MaterialButton();
        rSPanelsSlider3 = new rojeru_san.RSPanelsSlider();
        txtCodigoProducto = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        txtPrecioProducto = new org.jdesktop.swingx.JXTextField();
        txtNombreProducto = new org.jdesktop.swingx.JXTextField();
        txtStockProducto = new org.jdesktop.swingx.JXTextField();
        txtDescripcionProducto = new org.jdesktop.swingx.JXTextField();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        cbNombrecategoria = new javax.swing.JComboBox();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        txtPrecioCompra = new org.jdesktop.swingx.JXTextField();
        jLabel5 = new javax.swing.JLabel();
        cboUnidad_producto = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        txtUbicacion_bodega = new javax.swing.JTextField();
        lbltotalregistros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaProductos = new com.icm.components.metro.TableMetroICM();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new rojeru_san.RSButton();
        btnGuardar = new rojeru_san.RSButton();
        btnEditar = new rojeru_san.RSButton();
        btnEliminar = new rojeru_san.RSButton();
        btnCancelar = new rojeru_san.RSButton();
        jPanel2 = new javax.swing.JPanel();
        btnReporte = new rojeru_san.RSButton();

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

        rSPanelsSlider1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboSelec.setBackground(new java.awt.Color(36, 33, 33));
        cboSelec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboSelec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Codigo" }));
        cboSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSelecActionPerformed(evt);
            }
        });
        rSPanelsSlider1.add(cboSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 110, -1));

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
        rSPanelsSlider1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 210, 40));

        btnBuscar.setBackground(new java.awt.Color(36, 33, 33));
        btnBuscar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(207, 207, 207));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Search_32px_1.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        rSPanelsSlider1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 60, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" GESTION DE PRODUCTOS PARA VENTA");
        rSPanelsSlider1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

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

        javax.swing.GroupLayout rSPanelsSlider2Layout = new javax.swing.GroupLayout(rSPanelsSlider2);
        rSPanelsSlider2.setLayout(rSPanelsSlider2Layout);
        rSPanelsSlider2Layout.setHorizontalGroup(
            rSPanelsSlider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelsSlider2Layout.createSequentialGroup()
                .addGap(0, 943, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rSPanelsSlider2Layout.setVerticalGroup(
            rSPanelsSlider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelsSlider2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rSPanelsSlider3.setBackground(new java.awt.Color(204, 204, 204));
        rSPanelsSlider3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtCodigoProducto.setDescripcion("Codigo Producto");
        txtCodigoProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoProductoFocusLost(evt);
            }
        });
        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });
        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyTyped(evt);
            }
        });

        jXLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Field_18px.png"))); // NOI18N
        jXLabel3.setText("Nombre:");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jXLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Transaction_List_18px.png"))); // NOI18N
        jXLabel4.setText("Descripcion:");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jXLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Deposit_18px.png"))); // NOI18N
        jXLabel5.setText("Stock:");
        jXLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jXLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Currency_Exchange_18px.png"))); // NOI18N
        jXLabel6.setText("Precio Venta:");
        jXLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jXLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_CodePen_18px.png"))); // NOI18N
        jXLabel1.setText("Codigo:");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtPrecioProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioProductoFocusLost(evt);
            }
        });
        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });
        txtPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProductoKeyTyped(evt);
            }
        });

        txtNombreProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreProductoFocusLost(evt);
            }
        });
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });
        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyTyped(evt);
            }
        });

        txtStockProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStockProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStockProductoFocusLost(evt);
            }
        });
        txtStockProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockProductoActionPerformed(evt);
            }
        });
        txtStockProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockProductoKeyTyped(evt);
            }
        });

        txtDescripcionProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcionProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionProductoFocusLost(evt);
            }
        });
        txtDescripcionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionProductoActionPerformed(evt);
            }
        });

        jXLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Category_18px.png"))); // NOI18N
        jXLabel7.setText("Categoria:");
        jXLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cbNombrecategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jXLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_US_Dollar_18px.png"))); // NOI18N
        jXLabel9.setText("Precio Compra:");
        jXLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtPrecioCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioCompraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioCompraFocusLost(evt);
            }
        });
        txtPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCompraActionPerformed(evt);
            }
        });
        txtPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCompraKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Product_18px.png"))); // NOI18N
        jLabel5.setText("Unidad :");

        cboUnidad_producto.setBackground(new java.awt.Color(36, 33, 33));
        cboUnidad_producto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboUnidad_producto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unidad", "Kg", "Gr", "Litro", "Envase", "", "" }));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Shop_18px.png"))); // NOI18N
        jLabel9.setText("Lugar:");

        txtUbicacion_bodega.setBackground(new java.awt.Color(36, 33, 33));
        txtUbicacion_bodega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtUbicacion_bodega.setForeground(new java.awt.Color(207, 207, 207));
        txtUbicacion_bodega.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtUbicacion_bodega.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUbicacion_bodega.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUbicacion_bodega.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUbicacion_bodegaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUbicacion_bodegaFocusLost(evt);
            }
        });
        txtUbicacion_bodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacion_bodegaActionPerformed(evt);
            }
        });
        txtUbicacion_bodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUbicacion_bodegaKeyTyped(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        javax.swing.GroupLayout rSPanelsSlider3Layout = new javax.swing.GroupLayout(rSPanelsSlider3);
        rSPanelsSlider3.setLayout(rSPanelsSlider3Layout);
        rSPanelsSlider3Layout.setHorizontalGroup(
            rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cboUnidad_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel9)
                                .addGap(47, 47, 47)
                                .addComponent(txtUbicacion_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(cbNombrecategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rSPanelsSlider3Layout.setVerticalGroup(
            rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5))
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(cboUnidad_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUbicacion_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbNombrecategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(rSPanelsSlider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rSPanelsSlider3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelsSlider3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltotalregistros)
                        .addContainerGap())))
        );

        tableListaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableListaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListaProductos);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria/icons8_Add_Tag_32px_2.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
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

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newPago.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deleteHabitacion.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Minus_32px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Botones de Opciones", jPanel1);

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Reportes", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSPanelsSlider3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSPanelsSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtCodigoProducto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Codigo.");
            txtCodigoProducto.requestFocus();
            return;
        }
        if (txtNombreProducto.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Desbes Ingresar un Nombre al producto");
            txtNombreProducto.requestFocus();
            return;
        }
        if (txtStockProducto.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un stock de consumo");
            txtStockProducto.requestFocus();
            return;
        }
        if (txtPrecioProducto.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un precio de venta del producto");
            txtPrecioProducto.requestFocus();
            return;
        }
        if (cbNombrecategoria.getSelectedItem() == null) {
            JOptionPane.showConfirmDialog(rootPane, "DEBES IR A CATEGORIAS EN EL MENU E INGRESAR UNA", "Ingresar Categoria", JOptionPane.ERROR_MESSAGE);
            PrincipalHotel.btnCateogria.requestFocus();
            PrincipalHotel.btnClientes.setEnabled(false);
            PrincipalHotel.btnRserva.setEnabled(false);
            PrincipalHotel.btnTrabajadores.setEnabled(false);
            PrincipalHotel.btnHabitaciones.setEnabled(false);
            this.dispose();
            return;
        }

        vProducto dts = new vProducto();
        fProductoDAO funcion = new fProductoDAO();

        int verificarCodigo = Integer.parseInt(txtCodigoProducto.getText());
        int cod_producto = funcion.productoIgual(verificarCodigo);

        if (cod_producto == verificarCodigo) {
            JOptionPane.showMessageDialog(null, "YA EXISTE UN PRODUCTO CON EL MISMO CODIGO");
            txtCodigoProducto.requestFocus();
            return;
        }

        dts.setCodigoProducto(Long.valueOf(txtCodigoProducto.getText()));
        dts.setNombreProducto(txtNombreProducto.getText());
        dts.setDescripcionProducto(txtDescripcionProducto.getText());
        dts.setStockProducto(Integer.parseInt(txtStockProducto.getText()));

        dts.setPrecioProducto(Double.parseDouble(txtPrecioProducto.getText()));

        dts.setPrecioCompra(Double.parseDouble(txtPrecioCompra.getText()));

        int unidad = cboUnidad_producto.getSelectedIndex();
        dts.setUnidadProducto((String) cboUnidad_producto.getItemAt(unidad));

        dts.setUbicacionLugar(txtUbicacion_bodega.getText());
        int categoria = cbNombrecategoria.getSelectedIndex();
        String categoria2 = ((String) cbNombrecategoria.getItemAt(categoria));

        if (funcion.insertar(dts, categoria2)) {
            JOptionPane.showMessageDialog(null, "El producto " + txtNombreProducto.getText() + " ha sido agregado correctamente");
            mostrar("");
            inhabilitar();

            PrincipalHotel.btnClientes.setEnabled(true);
            PrincipalHotel.btnRserva.setEnabled(true);
            PrincipalHotel.btnTrabajadores.setEnabled(true);
            PrincipalHotel.btnHabitaciones.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Producto no Ingresado");
            mostrar("");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tableListaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListaProductosMouseClicked

        habilitar();
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnNuevo.setEnabled(true);
        txtCodigoProducto.setEditable(false);

        int fila = tableListaProductos.rowAtPoint(evt.getPoint());

        txtCodigoProducto.setText(tableListaProductos.getValueAt(fila, 0).toString());
        txtNombreProducto.setText(tableListaProductos.getValueAt(fila, 1).toString());
        txtDescripcionProducto.setText(tableListaProductos.getValueAt(fila, 2).toString());
        cboUnidad_producto.setSelectedItem(tableListaProductos.getValueAt(fila, 3).toString());
        txtPrecioProducto.setText(tableListaProductos.getValueAt(fila, 4).toString());
        txtStockProducto.setText(tableListaProductos.getValueAt(fila, 5).toString());
        txtPrecioCompra.setText(tableListaProductos.getValueAt(fila, 6).toString());
        txtUbicacion_bodega.setText(tableListaProductos.getValueAt(fila, 7).toString());
        cbNombrecategoria.setSelectedItem(tableListaProductos.getValueAt(fila, 8).toString());

    }//GEN-LAST:event_tableListaProductosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        try {
            int i = JOptionPane.showConfirmDialog(null, "Si elimina el Producto de las ventas asociadas a el ¿Desea Eliminar?", "Confirmar Eliminacion", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                if (!txtCodigoProducto.getText().equals("")) {
                    vProducto dts = new vProducto();
                    fProductoDAO func = new fProductoDAO();
                    dts.setCodigoProducto(Long.valueOf(txtCodigoProducto.getText()));
                    func.eliminar(dts);
                    mostrar("");
                    inhabilitar();

                } else {
                    JOptionPane.showMessageDialog(null, "No se elimino el producto.");

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar :" + e.getMessage());
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed


    private void cboSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelecActionPerformed
        if (cboSelec.getSelectedItem() == "Nombre") {

            txtBuscar.setText("");
        } else {
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_cboSelecActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        try {
            if (cboSelec.getSelectedItem() == "Codigo") {

                char c = evt.getKeyChar();
                if (Character.isLetter(c)) {
                    getToolkit().beep();
                    evt.consume();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error en la busqueda con el codigo", "Error de busqueda", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese lo que desa buscar", "Error De Busqueda", JOptionPane.ERROR_MESSAGE);
        } else {
            mostrar(txtBuscar.getText());
            txtBuscar.setText("");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        vProducto datos = new vProducto();
        fProductoDAO funcion = new fProductoDAO();
        datos.setCodigoProducto(Long.valueOf(txtCodigoProducto.getText()));
        datos.setNombreProducto(txtNombreProducto.getText());
        datos.setDescripcionProducto(txtDescripcionProducto.getText());

        datos.setStockProducto(Integer.parseInt(txtStockProducto.getText()));

        String precioProducto = txtPrecioProducto.getText();
        String precioProducto2 = precioProducto.replaceAll("\\.", "");
        datos.setPrecioProducto(Long.valueOf(precioProducto2));

        String precioCompraProd = txtPrecioCompra.getText();
        String precioCompraProd2 = precioCompraProd.replaceAll("\\.", "");
        datos.setPrecioCompra(Long.valueOf(precioCompraProd2));

        int unidad = cboUnidad_producto.getSelectedIndex();
        datos.setUnidadProducto((String) cboUnidad_producto.getItemAt(unidad));

        datos.setUbicacionLugar(txtUbicacion_bodega.getText());
        int categoria = cbNombrecategoria.getSelectedIndex();
        String categoria2 = ((String) cbNombrecategoria.getItemAt(categoria));

        try {
            if (funcion.editar(datos, categoria2)) {
                JOptionPane.showMessageDialog(null, "Producto Editado.");
                mostrar("");
                inhabilitar();
            } else {
                JOptionPane.showMessageDialog(null, "Producto no Editado.");
                mostrar("");

            }
        } catch (SQLException ex) {
            Logger.getLogger(jdiProducto.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtUbicacion_bodegaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbicacion_bodegaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacion_bodegaKeyTyped

    private void txtUbicacion_bodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacion_bodegaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacion_bodegaActionPerformed

    private void txtCodigoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtCodigoProductoKeyTyped

    private void txtPrecioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProductoKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)
                && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioProductoKeyTyped

    private void txtStockProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockProductoKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtStockProductoKeyTyped

    private void txtPrecioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCompraKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)
                && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioCompraKeyTyped
    private Connection connectionn = new conexion().conectar();

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed

        try {
            if (!txtCodigoProducto.getText().equals("")) {
                Map p = new HashMap();
                p.put("CodigoProducto", txtCodigoProducto.getText());
                JasperReport report;
                JasperPrint print;

                try {
                    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                            + "/src/ReporteHotel/ReporteProductos1.jrxml");
                    print = JasperFillManager.fillReport(report, p, connectionn);
                    JasperViewer view = new JasperViewer(print, false);

                    view.toFront();
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
    }//GEN-LAST:event_btnReporteActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Esta a punto de\ncerrar la Ventana\n¿Desea continuar?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/principal/preg2.png"))) == JOptionPane.YES_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_cerrarActionPerformed

    private void txtCodigoProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoProductoFocusGained
        txtCodigoProducto.setForeground(Color.red);
        txtCodigoProducto.setBackground(Color.yellow);
    }//GEN-LAST:event_txtCodigoProductoFocusGained

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        txtCodigoProducto.transferFocus();
        txtNombreProducto.requestFocus();
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        txtNombreProducto.transferFocus();
        txtDescripcionProducto.requestFocus();
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void txtNombreProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreProductoFocusGained
        txtNombreProducto.setForeground(Color.red);
        txtNombreProducto.setBackground(Color.yellow);
    }//GEN-LAST:event_txtNombreProductoFocusGained

    private void txtDescripcionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionProductoActionPerformed
        txtDescripcionProducto.transferFocus();
        cboUnidad_producto.requestFocus();
    }//GEN-LAST:event_txtDescripcionProductoActionPerformed

    private void txtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProductoActionPerformed
        txtPrecioProducto.transferFocus();
        txtPrecioCompra.requestFocus();
    }//GEN-LAST:event_txtPrecioProductoActionPerformed

    private void txtPrecioProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioProductoFocusGained
        txtPrecioProducto.setForeground(Color.red);
        txtPrecioProducto.setBackground(Color.yellow);
    }//GEN-LAST:event_txtPrecioProductoFocusGained

    private void txtPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraActionPerformed
        txtPrecioCompra.transferFocus();
        txtStockProducto.requestFocus();
    }//GEN-LAST:event_txtPrecioCompraActionPerformed

    private void txtPrecioCompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioCompraFocusGained
        txtPrecioCompra.setForeground(Color.red);
        txtPrecioCompra.setBackground(Color.yellow);
    }//GEN-LAST:event_txtPrecioCompraFocusGained

    private void txtStockProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockProductoActionPerformed
        txtStockProducto.transferFocus();
        txtUbicacion_bodega.requestFocus();
    }//GEN-LAST:event_txtStockProductoActionPerformed

    private void txtUbicacion_bodegaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUbicacion_bodegaFocusGained
        txtUbicacion_bodega.setForeground(Color.red);
        txtUbicacion_bodega.setBackground(Color.yellow);
    }//GEN-LAST:event_txtUbicacion_bodegaFocusGained

    private void txtCodigoProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoProductoFocusLost
        txtCodigoProducto.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtCodigoProductoFocusLost

    private void txtNombreProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreProductoFocusLost
        txtNombreProducto.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtNombreProductoFocusLost

    private void txtDescripcionProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionProductoFocusGained
        txtDescripcionProducto.setForeground(Color.red);
        txtDescripcionProducto.setBackground(Color.yellow);
    }//GEN-LAST:event_txtDescripcionProductoFocusGained

    private void txtDescripcionProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionProductoFocusLost
        txtDescripcionProducto.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtDescripcionProductoFocusLost

    private void txtPrecioProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioProductoFocusLost
        txtPrecioProducto.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtPrecioProductoFocusLost

    private void txtPrecioCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioCompraFocusLost
        // TODO add your handling code here:
        txtPrecioCompra.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtPrecioCompraFocusLost

    private void txtStockProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStockProductoFocusGained
        txtStockProducto.setForeground(Color.red);
        txtStockProducto.setBackground(Color.yellow);
    }//GEN-LAST:event_txtStockProductoFocusGained

    private void txtStockProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStockProductoFocusLost
        txtStockProducto.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtStockProductoFocusLost

    private void txtUbicacion_bodegaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUbicacion_bodegaFocusLost
        txtUbicacion_bodega.setBackground(Color.BLACK);
    }//GEN-LAST:event_txtUbicacion_bodegaFocusLost

    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
        char a = evt.getKeyChar();
        if (Character.isDigit(a)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese letra no numero", "Error al digitar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
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
//            java.util.logging.Logger.getLogger(jdiProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jdiProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jdiProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jdiProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                jdiProducto dialog = new jdiProducto(new javax.swing.JFrame(), true);
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
    private javax.swing.JFileChooser SeleccionaImagen;
    private javax.swing.JButton btnBuscar;
    private rojeru_san.RSButton btnCancelar;
    private rojeru_san.RSButton btnEditar;
    private rojeru_san.RSButton btnEliminar;
    private rojeru_san.RSButton btnGuardar;
    private rojeru_san.RSButton btnNuevo;
    private rojeru_san.RSButton btnReporte;
    private javax.swing.JComboBox cbNombrecategoria;
    private javax.swing.JComboBox<String> cboSelec;
    private javax.swing.JComboBox<String> cboUnidad_producto;
    private principal.MaterialButton cerrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private javax.swing.JLabel lbltotalregistros;
    private rojeru_san.RSPanelsSlider rSPanelsSlider1;
    private rojeru_san.RSPanelsSlider rSPanelsSlider2;
    private rojeru_san.RSPanelsSlider rSPanelsSlider3;
    private com.icm.components.metro.TableMetroICM tableListaProductos;
    private javax.swing.JTextField txtBuscar;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtCodigoProducto;
    private org.jdesktop.swingx.JXTextField txtDescripcionProducto;
    private org.jdesktop.swingx.JXTextField txtNombreProducto;
    private org.jdesktop.swingx.JXTextField txtPrecioCompra;
    private org.jdesktop.swingx.JXTextField txtPrecioProducto;
    private org.jdesktop.swingx.JXTextField txtStockProducto;
    private javax.swing.JTextField txtUbicacion_bodega;
    // End of variables declaration//GEN-END:variables

}
