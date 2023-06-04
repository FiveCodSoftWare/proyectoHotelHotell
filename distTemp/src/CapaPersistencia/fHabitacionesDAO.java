package CapaPersistencia;

import CapaDominio.vHabitacion;
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
public class fHabitacionesDAO {

     private Connection cnn = null;
    private ResultSet rs=null;

    private static fHabitacionesDAO instancia;

    public static fHabitacionesDAO getInstancia()
    {
        if(instancia==null)
            instancia=new fHabitacionesDAO();
        return instancia;
    }
    
    
    
    
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    public String sSQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) throws SQLException {
        DefaultTableModel modelo;
        String[] titulo = {" ID Habitacion", "	Numero Habitacion", " Piso Habitacion ", " ID Tipo Habitacion", "Tipo Habitacion", "Precio", "Descripción", " Estado Habitacion "};
        String[] registro = new String[8];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulo);

          sSQL = "select h.idHabitacion, h.HabitacionNumero, h.HabitacionPiso, t.idTipoHabitacion,t.TipoHabitacion, "
                + "t.TipoHabitacionPrecio, t.TipoHabitacionDescripcion, h.HabitacionEsatdo"
                + " from habitacion h inner join tipohabitacion t on h.idTipoHabitacion=t.idTipoHabitacion "
                + " where HabitacionNumero like '%" + buscar + "%' order by idHabitacion";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idHabitacion");
                registro[1] = rs.getString("HabitacionNumero");
                registro[2] = rs.getString("HabitacionPiso");
                registro[3] = rs.getString("idTipoHabitacion");
                registro[4] = rs.getString("TipoHabitacion");
                registro[5] = rs.getString("TipoHabitacionPrecio");
                registro[6] = rs.getString("TipoHabitacionDescripcion");
                registro[7] = rs.getString("HabitacionEsatdo");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostrar la tabla"+e.getMessage());
            return null;
        }finally{
            cn.close();
        }
    }

    public DefaultTableModel mostrarvista(String buscar) {
        DefaultTableModel modelo;

        String[] titulo = {" ID Habitacion", "	Numero Habitacion", " Piso Habitacion ", " ID Tipo Habitacion", "Tipo Habitacion", "Precio", "Descripción", " Estado Habitacion "};

        String[] registro = new String[8];

        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulo);

        sSQL = "select h.idHabitacion, h.HabitacionNumero, h.HabitacionPiso, t.idTipoHabitacion,t.TipoHabitacion, "
                + "t.TipoHabitacionPrecio, t.TipoHabitacionDescripcion, h.HabitacionEsatdo"
                + " from habitacion h inner join tipohabitacion t on h.idTipoHabitacion=t.idTipoHabitacion "
                + " where HabitacionNumero like '%" + buscar + "%' and h.HabitacionEsatdo='Disponible' order by idHabitacion";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idHabitacion");
                registro[1] = rs.getString("HabitacionNumero");
                registro[2] = rs.getString("HabitacionPiso");
                registro[3] = rs.getString("idTipoHabitacion");
                registro[4] = rs.getString("TipoHabitacion");
                registro[5] = rs.getString("TipoHabitacionPrecio");
                registro[6] = rs.getString("TipoHabitacionDescripcion");
                registro[7] = rs.getString("HabitacionEsatdo");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostrar la tabla"+e.getMessage());
            return null;
        }

    }

    public boolean insertar(vHabitacion dts) {
        sSQL = "insert into habitacion (HabitacionNumero,HabitacionPiso,idTipoHabitacion,HabitacionEsatdo)"
                + "values (?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getHabitacionNumero());
            pst.setString(2, dts.getHabitacionPiso());
            pst.setInt(3, dts.getIdTipoHabitacion());
            pst.setString(4, dts.getHabitacionEsatdo());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al insertar tabla"+e.getMessage());
            return false;
        }
    }

    public boolean editar(vHabitacion dts) {
        sSQL = "update habitacion set HabitacionNumero=?,HabitacionPiso=?,idTipoHabitacion=?,HabitacionEsatdo=?"
                + " where idHabitacion=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getHabitacionNumero());
            pst.setString(2, dts.getHabitacionPiso());
            pst.setInt(3, dts.getIdTipoHabitacion());
            pst.setString(4, dts.getHabitacionEsatdo());
            pst.setInt(5, dts.getIdHabitacion());
            

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean desocupar(vHabitacion dts) {
        sSQL = "update habitacion set HabitacionEsatdo='Disponible'"
                + " where idHabitacion=?";
           //alt + 39

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdHabitacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean ocupar(vHabitacion dts) {
        sSQL = "update habitacion set HabitacionEsatdo='Ocupado'"
                + " where idHabitacion=?";
           //alt + 39

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdHabitacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(vHabitacion dts) {
        sSQL = "delete from habitacion where idHabitacion=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdHabitacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public int numerohabitacionIgual(int codigo) {

        sSQL = "SELECT HabitacionNumero from habitacion where HabitacionNumero = " + codigo;

        try {
            int cod = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                cod = rs.getInt("HabitacionNumero");
            }

            return cod;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }

    }
}
