package CapaPersistencia;

import CapaDominio.vTipoHabitacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 16-oct-2017 Autor: Antonio Aburto Cortez
 */
public class fTipoHabitacionesDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static fTipoHabitacionesDAO instancia;

    public static fTipoHabitacionesDAO getInstancia() {
        if (instancia == null) {
            instancia = new fTipoHabitacionesDAO();
        }
        return instancia;
    }

    private conexion mysql = new conexion();

    private Connection cn = mysql.conectar();

    public String sSQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) throws SQLException {
        DefaultTableModel modelo;

        String[] titulos = {"ID Tipo Habitacion", "Tipo Habitacion", "Precio Habitacion", "Descripcion"};
        String[] Registros = new String[4];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from tipohabitacion where idTipoHabitacion like '%" + buscar + "%' order by idTipoHabitacion";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                Registros[0] = rs.getString("idTipoHabitacion");
                Registros[1] = rs.getString("TipoHabitacion");
                Registros[2] = rs.getString("TipoHabitacionPrecio");
                Registros[3] = rs.getString("TipoHabitacionDescripcion");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(Registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);
            return null;
        } finally {
            cn.close();
        }

    }

    public boolean insertar(vTipoHabitacion dts) throws SQLException {
        sSQL = "insert into tipohabitacion( TipoHabitacion,TipoHabitacionPrecio,TipoHabitacionDescripcion)"
                + "values(?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getTipoHabitacion());
            pst.setDouble(2, dts.getTipoHabitacionPrecio());
            pst.setString(3, dts.getTipoHabitacionDescripcion());
            int s = pst.executeUpdate();
            if (s != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);
            return false;
        } finally {
            cn.close();
        }
    }

    public boolean editar(vTipoHabitacion dts) throws SQLException {
        sSQL = "update tipohabitacion set TipoHabitacion=?, TipoHabitacionPrecio=?,TipoHabitacionDescripcion=? "
                + "where idTipoHabitacion=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getTipoHabitacion());
            pst.setDouble(2, dts.getTipoHabitacionPrecio());
            pst.setString(3, dts.getTipoHabitacionDescripcion());
            pst.setInt(4, dts.getIdTipoHabitacion());
            int s = pst.executeUpdate();
            if (s != 0) {
                return true;

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);
            return false;
        } finally {
            cn.close();
        }
    }

    public boolean eliminar(vTipoHabitacion dts) throws SQLException {
        sSQL = "delete from tipohabitacion where idTipoHabitacion=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdTipoHabitacion());
            int s = pst.executeUpdate();
            if (s != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIININAR LA HABITACION" + e.getMessage());
            return false;
        } finally {
            cn.close();
        }
    }
}
