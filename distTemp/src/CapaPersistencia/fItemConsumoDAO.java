package CapaPersistencia;

import CapaDominio.vConsumo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 11-nov-2017 Autor: Antonio Aburto Cortez
 */
public class fItemConsumoDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static fItemConsumoDAO instancia;

    public static fItemConsumoDAO getInstancia() {
        if (instancia == null) {
            instancia = new fItemConsumoDAO();
        }
        return instancia;
    }

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    public Double totalconsumo;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID Consumo", "Id Reserva", "Id Producto", "Nombre producto", "ConsumoCantidad", "ConsumoPrecioVenta", "ConsumoFechaConsumo", "ConsumoEstado"};

        String[] registro = new String[8];

        totalregistros = 0;
        totalconsumo = 0.0;
        modelo = new DefaultTableModel(null, titulos);

        // Textos completos	
/*idConsumo
         idReserva
         idProducto
         ConsumoCantidad
         ConsumoPrecioVenta
         ConsumoFechaConsumo
         ConsumoEstado*/
        sSQL = " select c.idConsumo, c.idReserva, c.idProducto,p.NombreProducto,c.ConsumoCantidad,c.ConsumoPrecioVenta,c.ConsumoFechaConsumo"
                + ",c.ConsumoEstado from consumo c inner join producto p on c.idProducto=p.codigoProducto where c.idReserva =" + buscar + " order by c.idConsumo desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idConsumo");
                registro[1] = rs.getString("idReserva");
                registro[2] = rs.getString("idProducto");
                registro[3] = rs.getString("NombreProducto");
                registro[4] = rs.getString("ConsumoCantidad");
                registro[5] = rs.getString("ConsumoPrecioVenta");
                registro[6] = rs.getString("ConsumoFechaConsumo");
                registro[7] = rs.getString("ConsumoEstado");

                totalregistros = totalregistros + 1;
                totalconsumo = totalconsumo + (rs.getDouble("ConsumoCantidad") * rs.getDouble("ConsumoPrecioVenta"));

                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostrar" + e.getMessage());
            return null;
        }

    }

    public boolean insertar(vConsumo dts) {
        sSQL = "insert into consumo (idReserva, idProducto,ConsumoCantidad,ConsumoPrecioVenta,ConsumoFechaConsumo,ConsumoEstado)"
                + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdReserva());
            pst.setInt(2, dts.getIdProducto());
            pst.setDouble(3, dts.getConsumoCantidad());
            pst.setDouble(4, dts.getConsumoPrecioVenta());
            pst.setDate(5, dts.getConsumoFechaConsumo());
            pst.setString(6, dts.getConsumoEstado());
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

    public boolean editar(vConsumo dts) {
        sSQL = "update consumo set idReserva=?, idProducto=? ,ConsumoCantidad=?,ConsumoPrecioVenta=?,ConsumoFechaConsumo=?,ConsumoEstado=?"
                + " where idConsumo=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdReserva());
            pst.setInt(2, dts.getIdProducto());
            pst.setDouble(3, dts.getConsumoCantidad());
            pst.setDouble(4, dts.getConsumoPrecioVenta());
            pst.setDate(5, dts.getConsumoFechaConsumo());
            pst.setString(6, dts.getConsumoEstado());

            pst.setInt(7, dts.getIdConsumo());

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

    public boolean eliminar(vConsumo dts) {
        sSQL = "delete from consumo where idConsumo=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdConsumo());

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

}
