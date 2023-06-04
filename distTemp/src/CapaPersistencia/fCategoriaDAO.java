package CapaPersistencia;

import CapaDominio.vCategoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 22-oct-2017 Autor: Antonio Aburto Cortez
 */
public class fCategoriaDAO {

    private static fCategoriaDAO instancia;

    public static fCategoriaDAO getInstancia() {
        if (instancia == null) {
            instancia = new fCategoriaDAO();
        }
        return instancia;
    }

    private conexion mysql = new conexion();
    public Connection cn = mysql.conectar();
    public String sSQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) throws SQLException {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo ", "Nombre Categoria", "Descripcion Categoria"};
        String[] Registros = new String[3];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from categoria where CategoriaNombre like'%" + buscar + "%' order by CodigoCategoria asc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                //	idCategoria	CategoriaNombre	CategoriaDescripcion	CategoriaEsatdo
                Registros[0] = rs.getString("CodigoCategoria");
                Registros[1] = rs.getString("CategoriaNombre");
                Registros[2] = rs.getString("CategoriaDescripcion");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(Registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LOS DATOS" + e.getMessage());
            return null;
        } finally {
            cn.close();
        }
    }

    public boolean insertar(vCategoria dts) throws SQLException {
        sSQL = "insert into categoria (CategoriaNombre,CategoriaDescripcion) values(?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCategoriaNombre());
            pst.setString(2, dts.getCategoriaDescripcion());
            int s = pst.executeUpdate();
            if (s != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR EN INSERTAR LOS DATOS DE LA CATEGORIA" + e.getMessage());
            return false;
        } finally {
            cn.close();

        }

    }

    public boolean editar(vCategoria dts) {
        sSQL = "update categoria set CategoriaNombre=?, CategoriaDescripcion=? where CodigoCategoria=?";
//	idCategoria	CategoriaNombre	CategoriaDescripcion	CategoriaEsatdo
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCategoriaNombre());
            pst.setString(2, dts.getCategoriaDescripcion());
            pst.setInt(3, dts.getCodigoCategoria());
            int r = pst.executeUpdate();
            if (r != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL ACTUALIZAR LOS DATOS DE LA CATEGORIA" + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(vCategoria dts) throws SQLException {
        sSQL = "delete from categoria where CodigoCategoria=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getCodigoCategoria());
            int s = pst.executeUpdate();
            if (s != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL ELIMINAR LA CATEGORIA" + e.getMessage());
            return false;
        } finally {
            cn.close();
        }
    }

    public DefaultTableModel mostrarPorCodigo(String buscar) throws SQLException {

        DefaultTableModel modelo;

        String[] titulos = {"Codigo ", "Nombre Categoria", "Descripcion Categoria"};

        String[] Registros = new String[4];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from categoria where CodigoCategoria =" + buscar + " order by CodigoCategoria asc ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                Registros[0] = rs.getString("CodigoCategoria");
                Registros[1] = rs.getString("CategoriaNombre");
                Registros[2] = rs.getString("CategoriaDescripcion");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(Registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }finally{
            cn.close();
        }
    }
}
