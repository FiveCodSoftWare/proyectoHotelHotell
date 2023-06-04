package CapaPersistencia;

import CapaDominio.vPago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 13-nov-2017 Autor: Antonio Aburto Cortez
 */
public class fPagoDAO {

    
     private Connection cnn = null;
    private ResultSet rs=null;

    private static fPagoDAO instancia;

    public static fPagoDAO getInstancia()
    {
        if(instancia==null)
            instancia=new fPagoDAO();
        return instancia;
    }
    
    
    
    
    
    
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID Pago ", "ID Reserva", "Tipo Comprobante", "Número Comprobante", "Fecha Emisión", "Fecha Pago", "Igv", "Total"};

        String[] registro = new String[8];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from pago where idReserva=" + buscar + " order by idPago desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
//idPago	idReserva	PagoTipoComprobante	PagoNumerocomprobante	PagoFechaEmision	PagoFechaPago	PagoIGV	PagoTotal	PagoEstado
            while (rs.next()) {
                registro[0] = rs.getString("idPago");
                registro[1] = rs.getString("idReserva");
                registro[2] = rs.getString("PagoTipoComprobante");
                registro[3] = rs.getString("PagoNumerocomprobante");
                registro[4] = rs.getString("PagoFechaEmision");
                registro[5] = rs.getString("PagoFechaPago");
                registro[6] = rs.getString("PagoIGV");
                registro[7] = rs.getString("PagoTotal");
          

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(vPago dts) {
        sSQL = "insert into pago (idReserva,PagoTipoComprobante,PagoNumerocomprobante,PagoFechaEmision,PagoFechaPago,PagoIGV,PagoTotal)"
                + "values (?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdReserva());
            pst.setString(2, dts.getPagoTipoComprobante());
            pst.setString(3, dts.getPagoNumerocomprobante());
            pst.setDate(4, dts.getPagoFechaEmisioon());
            pst.setDate(5, dts.getPagoFechaPago());
            pst.setDouble(6, dts.getPagoIGV());
            pst.setDouble(7, dts.getPagoTotal());
     
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

    public boolean editar(vPago dts) {
        sSQL = "update pago set idReserva=?,PagoTipoComprobante=?,PagoNumerocomprobante=?,PagoFechaEmision=?,PagoFechaPago=?,PagoIGV=?,PagoTotal=?"
                + " where idPago=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
          pst.setInt(1, dts.getIdReserva());
            pst.setString(2, dts.getPagoTipoComprobante());
            pst.setString(3, dts.getPagoNumerocomprobante());
            pst.setDate(4, dts.getPagoFechaEmisioon());
            pst.setDate(5, dts.getPagoFechaPago());
            pst.setDouble(6, dts.getPagoIGV());
            pst.setDouble(7, dts.getPagoTotal());
   
            pst.setInt(9, dts.getIdPago());

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

    public boolean eliminar(vPago dts) {
        sSQL = "delete from pago where idPago=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdPago());

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
