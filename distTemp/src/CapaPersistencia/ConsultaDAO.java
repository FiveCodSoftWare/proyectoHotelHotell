package CapaPersistencia;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 04/12/2017 Autor: Antonio Aburto Cortez
 */
public class ConsultaDAO {

    private conexion mysql = new conexion();
    public Connection cn = mysql.conectar();
    public String sSQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrarNombreProductos() {
        DefaultTableModel modelo;

        String[] titulo = {"Código", "Producto", "Precio"};
        String[] registro = new String[3];
        modelo = new DefaultTableModel(null, titulo);
        totalRegistros = 0;
        sSQL = "select codigoProducto , nombreProducto,precioProducto  from producto";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("codigoProducto");
                registro[1] = rs.getString("nombreProducto");
                registro[2] = rs.getString("precioProducto");
                totalRegistros++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostarrlos datos" + e.getMessage());
            return null;
        }
    }

    public DefaultTableModel mostrarProductosMenoresA(int cantidad) {
        DefaultTableModel modelo;

        String[] titulo = {"Código", "Producto", "Precio"};
        String[] registro = new String[3];
        modelo = new DefaultTableModel(null, titulo);
        totalRegistros = 0;
        sSQL = "select codigoProducto , nombreProducto,precioProducto  from producto where precioProducto<='" + cantidad + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("codigoProducto");
                registro[1] = rs.getString("nombreProducto");
                registro[2] = rs.getString("precioProducto");
                totalRegistros++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostarrlos datos" + e.getMessage());
            return null;
        }
    }

    public DefaultTableModel mostrarProductosEntre(int inicio, int fin) {
        DefaultTableModel modelo;

        String[] titulo = {"Código", "Producto", "Precio"};
        String[] registro = new String[3];
        modelo = new DefaultTableModel(null, titulo);
        totalRegistros = 0;
        sSQL = "select codigoProducto , nombreProducto,precioProducto  from producto where precioProducto between '" + inicio + "' and '" + fin + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("codigoProducto");
                registro[1] = rs.getString("nombreProducto");
                registro[2] = rs.getString("precioProducto");
                totalRegistros++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostarrlos datos" + e.getMessage());
            return null;
        }
    }

    public DefaultTableModel mostrarPrecioPromedioProductos() {
        DefaultTableModel modelo;

        String[] titulo = {"Precio promedio"};
        String[] registro = new String[3];
        modelo = new DefaultTableModel(null, titulo);
        totalRegistros = 0;
        sSQL = "select AVG(precioProducto) as promedio  from producto  ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            double precioPromedio = 0;
            while (rs.next()) {
                registro[0] = rs.getString("promedio");
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostarrlos datos" + e.getMessage());
            return null;
        }
    }

    public DefaultTableModel mostrarListaGanancias() {
        DefaultTableModel modelo;

        String[] titulo = {"Reserva", "habitacion", "cliente", "Fecha", ""};
        String[] registro = new String[3];
        modelo = new DefaultTableModel(null, titulo);
        totalRegistros = 0;
        sSQL = "select AVG(precioProducto) as promedio  from producto  ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            double precioPromedio = 0;
            while (rs.next()) {
                registro[0] = rs.getString("promedio");
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostarrlos datos" + e.getMessage());
            return null;
        }
    }

    public ArrayList<String> listaFechas() {
        ArrayList<String> listaFechas = new ArrayList<>();
        sSQL = "select ReservaFechaRerva from reserva ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                listaFechas.add(rs.getString("ReservaFechaRerva"));
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostarrlos datos" + e.getMessage());
            return null;
        }
        return listaFechas;
    }
}
