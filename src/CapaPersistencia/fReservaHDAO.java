package CapaPersistencia;

import CapaDominio.vReserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 12-nov-2017 Autor: Antonio Aburto Cortez
 */
public class fReservaHDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static fReservaHDAO instancia;

    public static fReservaHDAO getInstancia() {
        if (instancia == null) {
            instancia = new fReservaHDAO();
        }
        return instancia;
    }
    private conexion mysql = new conexion();
    public Connection cn = mysql.conectar();
    public String sSQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
 //	idReserva	idHabitacion	idCliente	
        //idTrabajdor	ReservaFechaRerva	ReservaFechaIngreso	
        //ReservaFechaSalida	ReservaCosto	ReservaEsatdo   

        ///   idReserva	idHabitacion	idCliente	idTrabajdor	ReservaFechaRerva	ReservaFechaIngreso	ReservaFechaSalida	ReservaCosto	ReservaEsatdo
        String[] titulos = {"ID Reserva", "ID habitacion", "Numero Habitacion", "ID Cliente", "Cliente", "ID Trabajador", "Trabajador", "Tipo Reserva", "Fecha Reserva", "Fecha Ingreso", "Fecha Salida", "Costo Alojamiento", "Estado"};

        String[] registro = new String[13];

        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

//HabitacionNumero
        sSQL = "select  r.idReserva, r.idHabitacion,"
                + "h.HabitacionNumero,r.idCliente,"
                + "(select PersonaNombre from persona where idPersona=r.idCliente )as clienten,"
                + "(select PersonaAparteno from persona where idPersona=r.idCliente )as clienteap,"
                + "r.idTrabajador,(select PersonaNombre from persona where idPersona=r.idTrabajador)as tabajadorn,"
                + "(select PersonaAparteno from persona where idPersona=r.idTrabajador)as tabajadorap,"
                + "r.ReservaTipo,r.ReservaFechaRerva,r.ReservaFechaIngreso,r.ReservaFechaSalida,"
                + "r.ReservaCosto,r.ReservaEsatdo from reserva r inner join habitacion h on r.idHabitacion=h.idHabitacion where r.idReserva like '%" + buscar + "%' order by idReserva desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idReserva");
                registro[1] = rs.getString("idHabitacion");
                registro[2] = rs.getString("HabitacionNumero");
                registro[3] = rs.getString("idCliente");
                registro[4] = rs.getString("clienten") + " " + rs.getString("clienteap");
                registro[5] = rs.getString("idTrabajador");
                registro[6] = rs.getString("tabajadorn") + " " + rs.getString("tabajadorap");
                registro[7] = rs.getString("ReservaTipo");
                registro[8] = rs.getString("ReservaFechaRerva");
                registro[9] = rs.getString("ReservaFechaIngreso");
                registro[10] = rs.getString("ReservaFechaSalida");
                registro[11] = rs.getString("ReservaCosto");
                registro[12] = rs.getString("ReservaEsatdo");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostarrlos datos" + e.getMessage());
            return null;
        }

    }

    public boolean insertar(vReserva dts)  {
        sSQL = "insert into reserva (idHabitacion,"
                + "idCliente,idTrabajador,"
                + "ReservaTipo,ReservaFechaRerva,"
                + "ReservaFechaIngreso,"
                + "ReservaFechaSalida,"
                + "ReservaCosto,"
                + "ReservaEsatdo)"
                + "values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdHabitacion());
            pst.setInt(2, dts.getIdCliente());
            pst.setInt(3, dts.getIdTrabajador());
            pst.setString(4, dts.getReservaTipo());
            pst.setDate(5, dts.getFechaReserva());
            pst.setDate(6, dts.getFechaIngreso());
            pst.setDate(7, dts.getFechaSalida());
            pst.setDouble(8, dts.getCosotoAlojamiento());
            pst.setString(9, dts.getEstado());
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL INSERTAR LOS DATOS DE LA SESERVA: " + e.getMessage());
            return false;
        }
        
    }

    public boolean editar(vReserva dts) throws SQLException {
        sSQL = "update reserva set idHabitacion=?,"
                + "idCliente=?,idTrabajador=?,"
                + "ReservaTipo=?,ReservaFechaRerva=?,"
                + "ReservaFechaIngreso=?,"
                + "ReservaFechaSalida=?,"
                + "ReservaCosto=?,"
                + "ReservaEsatdo=?"
                + " where idReserva=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdHabitacion());
            pst.setInt(2, dts.getIdCliente());
            pst.setInt(3, dts.getIdTrabajador());
            pst.setString(4, dts.getReservaTipo());
            pst.setDate(5, dts.getFechaReserva());
            pst.setDate(6, dts.getFechaIngreso());
            pst.setDate(7, dts.getFechaSalida());
            pst.setDouble(8, dts.getCosotoAlojamiento());
            pst.setString(9, dts.getEstado());

            pst.setInt(10, dts.getIdReserva());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL ACTUALIZAR LOS DATOS DE LA SERVA: " + e.getMessage());
            return false;
        } finally {
            cn.close();
        }
    }

    public boolean pagar(vReserva dts) throws SQLException {
        sSQL = "update reserva set ReservaEsatdo='Pagada'"
                + " where idReserva=?";
        //alt + 39

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdReserva());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL PAGAR LA CUENTA: " + e.getMessage());
            return false;
        } finally {
            cn.close();
        }
    }

    public boolean eliminar(vReserva dts) throws SQLException {
        sSQL = "delete from reserva where idReserva=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdReserva());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL ELIMINAR LA RESERVA: "+e.getMessage());
            return false;
        }finally{
            cn.close();
        }
    }
public ArrayList<String> llenarBusquedaporFecha() {
        ArrayList<String> lista = new ArrayList<>();
        sSQL = "select ReservaFechaRerva from reserva";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                lista.add(rs.getString("ReservaFechaRerva"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el como de categoria" + e.getMessage());
        }
        return lista;
    }

      public DefaultTableModel mostrarFecha(String buscar) {
        DefaultTableModel modelo;
 //	idReserva	idHabitacion	idCliente	
        //idTrabajdor	ReservaFechaRerva	ReservaFechaIngreso	
        //ReservaFechaSalida	ReservaCosto	ReservaEsatdo   

        ///   idReserva	idHabitacion	idCliente	idTrabajdor	ReservaFechaRerva	ReservaFechaIngreso	ReservaFechaSalida	ReservaCosto	ReservaEsatdo
        String[] titulos = {"ID Reserva", "ID habitacion", "Numero Habitacion", "ID Cliente", "Cliente", "ID Trabajador", "Trabajador", "Tipo Reserva", "Fecha Reserva", "Fecha Ingreso", "Fecha Salida", "Costo Alojamiento", "Estado"};

        String[] registro = new String[13];

        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

//HabitacionNumero
        sSQL = "select  r.idReserva, r.idHabitacion,"
                + "h.HabitacionNumero,r.idCliente,"
                + "(select PersonaNombre from persona where idPersona=r.idCliente )as clienten,"
                + "(select PersonaAparteno from persona where idPersona=r.idCliente )as clienteap,"
                + "r.idTrabajador,(select PersonaNombre from persona where idPersona=r.idTrabajador)as tabajadorn,"
                + "(select PersonaAparteno from persona where idPersona=r.idTrabajador)as tabajadorap,"
                + "r.ReservaTipo,r.ReservaFechaRerva,r.ReservaFechaIngreso,r.ReservaFechaSalida,"
                + "r.ReservaCosto,r.ReservaEsatdo from reserva r inner join habitacion h on r.idHabitacion=h.idHabitacion where r.ReservaFechaRerva like '%" + buscar + "%' order by idReserva desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idReserva");
                registro[1] = rs.getString("idHabitacion");
                registro[2] = rs.getString("HabitacionNumero");
                registro[3] = rs.getString("idCliente");
                registro[4] = rs.getString("clienten") + " " + rs.getString("clienteap");
                registro[5] = rs.getString("idTrabajador");
                registro[6] = rs.getString("tabajadorn") + " " + rs.getString("tabajadorap");
                registro[7] = rs.getString("ReservaTipo");
                registro[8] = rs.getString("ReservaFechaRerva");
                registro[9] = rs.getString("ReservaFechaIngreso");
                registro[10] = rs.getString("ReservaFechaSalida");
                registro[11] = rs.getString("ReservaCosto");
                registro[12] = rs.getString("ReservaEsatdo");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostarrlos datos" + e.getMessage());
            return null;
        }

    }
}
