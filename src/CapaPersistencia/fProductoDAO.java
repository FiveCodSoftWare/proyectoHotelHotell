package CapaPersistencia;

import CapaDominio.CustomImageIcon;
import CapaDominio.vCategoria;
import CapaDominio.vProducto;
import com.birosoft.liquid.util.Colors;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 23-oct-2017 Autor: Antonio Aburto Cortez
 */
public class fProductoDAO {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    public String sSQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel model;
        String[] titulos
                = {"Codigo", "Nombre ",
                    "Descripcion", "Unidad  ",
                    "Precio Venta", "Stock",
                    "Precio Compra", "Lugar",
                    "Categoria"};

        String[] Registros = new String[9];
        totalRegistros = 0;
        model = new DefaultTableModel(null, titulos);//p.idCategoria
        // sSQL="select  * from producto, categoria where producto.idCategoria=categoria.idCategoria LIKE '%"+buscar+"%'";
        //  sSQL = "select * from producto p inner join categoria t on p.idProducto=t.idCategoria";
        /*sSQL = "select p.idProducto, p.ProductoNombre,p.ProductoDescripcion, p.ProductoStock,p.ProductoPrecio,p.idCategoria, c.CategoriaNombre ,"
         + " p.ProductoEstado from producto p inner join categoria c on p.idProducto=c.idCategoria " + buscar + " order by p.idProducto desc";
         */
        /*  private long codigoProducto;
         private String nombreProducto;
         private String descripcionProducto;
         private double unidadProducto;

         private long precioProducto;
         private int stockProducto;
         private long precioCompra;

         private String ubicacionLugar;
         */
        //CategoriaNombre,CodigoCategoria
        sSQL = "select codigoProducto , nombreProducto , descripcionProducto , unidadProducto, precioProducto as precioProducto , stockProducto ,precioCompra as precioCompra ,ubicacionLugar, (select CategoriaNombre from categoria where CodigoCategoria =CodigoCategoriaFK) as  CategoriaNombre from producto where nombreProducto like '%" + buscar + "%' order by codigoProducto desc";
        //     sSQL = "select cod_producto , nombre_producto , descripcion_producto , unidad_producto, Replace(Format(precio_producto, 0), ',', '.') as precio_producto , stock_producto , Replace(Format(precio_compra, 0), ',', '.') as precio_compra ,ubicacion_bodega,(select nombre_categoria from categoria where  cod_categoria =cod_categoriaFK) as nombre_categoria from producto where nombre_producto like '%" + buscar + "%' order by cod_producto desc";

        /*  sSQL="select c.idconsumo,c.idreserva,c.idproducto,p.nombre,c.cantidad,c.precio_venta "
         + ",c.estado from consumo c inner join producto p on c.idproducto=p.idproducto"
         + " where c.idreserva ="+ buscar + " order by c.idconsumo desc";
         */
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                Registros[0] = rs.getString("codigoProducto");
                Registros[1] = rs.getString("nombreProducto");
                Registros[2] = rs.getString("descripcionProducto");
                Registros[3] = rs.getString("unidadProducto");
                Registros[4] = rs.getString("precioProducto");
                Registros[5] = rs.getString("stockProducto");
                Registros[6] = rs.getString("precioCompra");
                Registros[7] = rs.getString("ubicacionLugar");
                Registros[8] = rs.getString("CategoriaNombre");

                totalRegistros = totalRegistros + 1;
                //  totalConsumos = totalConsumos + (rs.getDouble("ProductoStock") * rs.getDouble("ProductoPrecio"));
                model.addRow(Registros);
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostrar" + e.getMessage());
            return null;
        }

    }

    public boolean insertar(vProducto dts, String nombre) {
        sSQL = "insert into producto(codigoProducto,nombreProducto,descripcionProducto,unidadProducto,precioProducto,stockProducto,precioCompra,ubicacionLugar,CodigoCategoriaFK)"
                + "values (?,?,?,?,?,?,?,?,(select CodigoCategoria from categoria where CategoriaNombre like '%" + nombre + "%'))";
        
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setLong(1, dts.getCodigoProducto());
            pst.setString(2, dts.getNombreProducto());
            pst.setString(3, dts.getDescripcionProducto());
            pst.setString(4, dts.getUnidadProducto());
            pst.setDouble(5, dts.getPrecioProducto());
            pst.setInt(6, dts.getStockProducto());
            pst.setDouble(7, dts.getPrecioCompra());
            pst.setString(8, dts.getUbicacionLugar());
            int s = pst.executeUpdate();
            if (s != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al insertar " + e.getMessage());
            return false;
        }
    }

    public boolean editar(vProducto dts, String nombre) throws SQLException {
        sSQL = "update producto set nombreProducto = ? , descripcionProducto = ? , unidadProducto = ?, precioProducto = ?, stockProducto = ? , precioCompra = ? , ubicacionLugar = ?, CodigoCategoriaFK =(select CodigoCategoria from categoria where CategoriaNombre  like '%" + nombre + "%' limit 1)   where codigoProducto =? ";
     //   sSQL = "update producto set nombre_producto = ? , descripcion_producto = ?  , unidad_producto = ? , precio_producto = ? , stock_producto = ? ,precio_compra= ? , ubicacion_bodega = ? , cod_categoriaFK =(select cod_categoria from categoria where nombre_categoria like '%" + nombre + "%' limit 1)   where cod_producto =? ";

          //idProducto	ProductoNombre	ProductoDescripcion	ProductoStock	ProductoPrecio	idCategoria	ProductoEstado
        //    sSQL = "update producto set nombre_producto = ? , descripcion_producto = ?  , unidad_producto = ? , precio_producto = ? , stock_producto = ? ,precio_compra= ? , ubicacion_bodega = ? , cod_categoriaFK =(select cod_categoria from categoria where nombre_categoria like '%" + nombre + "%' limit 1)   where cod_producto =? ";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
               pst.setString(1, dts.getNombreProducto());
            pst.setString(2, dts.getDescripcionProducto());
            pst.setString(3, dts.getUnidadProducto());
            pst.setDouble(4, dts.getPrecioProducto());
            pst.setInt(5, dts.getStockProducto());
            pst.setDouble(6, dts.getPrecioCompra());

            pst.setString(7, dts.getUbicacionLugar());

            pst.setLong(8, dts.getCodigoProducto());

            int s = pst.executeUpdate();
            if (s != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al editar" + e.getMessage());
            return false;
        } finally {
            cn.close();
        }
    }

    public boolean eliminar(vProducto dts) {
        sSQL = " delete from producto where codigoProducto = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setLong(1, dts.getCodigoProducto());
            int s = pst.executeUpdate();
            if (s != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

        public boolean ModificarStockProductos(vProducto datos) {

        sSQL = "update producto set stockProducto = ? where codigoProducto = ?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, datos.getStockProducto());

            pst.setLong(2, datos.getCodigoProducto());

            int N = pst.executeUpdate();
            if (N != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }
    
    
    
    
    
    public ArrayList<String> llenarComboCategoria() {
        ArrayList<String> lista = new ArrayList<>();
        sSQL = "select CategoriaNombre from categoria";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                lista.add(rs.getString("CategoriaNombre"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el como de categoria" + e.getMessage());
        }
        return lista;
    }

    public DefaultTableModel mostrarPorCodigo(String buscar) {

        DefaultTableModel modelo;

           String[] titulos
                = {"Codigo", "Nombre ",
                    "Descripcion", "Unidad  ",
                    "Precio Venta", "Stock", "Precio Compra", "Lugar"};

        String[] Registros = new String[8];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from producto where codigoProducto =" + buscar + " order by codigoProducto desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                 Registros[0] = rs.getString("codigoProducto");
                Registros[1] = rs.getString("nombreProducto");
                Registros[2] = rs.getString("descripcionProducto");
                Registros[3] = rs.getString("unidadProducto");
                Registros[4] = rs.getString("precioProducto");
                Registros[5] = rs.getString("stockProducto");
                Registros[6] = rs.getString("precioCompra");
                Registros[7] = rs.getString("ubicacionLugar");
                  totalRegistros = totalRegistros + 1;
                modelo.addRow(Registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    public int productoIgual(int codigo) {

        sSQL = "SELECT codigoProducto from producto where codigoProducto = " + codigo;

        try {
            int cod = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                cod = rs.getInt("codigoProducto");
            }

            return cod;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }

    }
}

//    }
// private static Statement st = null;
//    private static PreparedStatement ps = null;    
//    private static ResultSet rs = null;
//    public static CustomImageIcon getFoto(int id)
//    {
//        String sql = "select foto from tbl_cliente where idCliente = "+id;
//        CustomImageIcon ii = null;
//        InputStream is = null;
//           try{
//              
//           st = cn.createStatement();
//           rs = st.executeQuery(sql); 
//           if(rs.next()){
//               is = rs.getBinaryStream(1);
//               if(is != null)
//               {
//                   
//                   BufferedImage bi = ImageIO.read(is);
//                   ii = new CustomImageIcon(bi);
//               }
//               
//           }
//           
//           
//       }catch(SQLException ex){ex.printStackTrace();}
//       catch(IOException ex){ex.printStackTrace();}
//        
//        return ii;
//    }  }
