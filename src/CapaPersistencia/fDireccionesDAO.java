package CapaPersistencia;

import CapaDominio.vCategoria;
import CapaDominio.vPersonaDirecciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 15-oct-2017 Autor: Antonio Aburto Cortez
 */
public class fDireccionesDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static fDireccionesDAO instancia;

    public static fDireccionesDAO getInstancia() {
        if (instancia == null) {
            instancia = new fDireccionesDAO();
        }
        return instancia;
    }
    private conexion mysql = new conexion();
    public Connection cn = mysql.conectar();
    public String sSQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID Direcion", "Direccion ", "Telefono", "Correo", "Id Persona"};
        String[] Registros = new String[5];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from personadireccion where PersonaDireccionTelefono like'%" + buscar + "%' order by idPersonaDireccion";
        /*private String idPersonaDireccion;
         private String PersonaDireccionDireccion;
         private int PersonaDireccionTelefono	;
         private String PersonaDireccionCorreo;*/
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                //	idCategoria	CategoriaNombre	CategoriaDescripcion	CategoriaEsatdo
                Registros[0] = rs.getString("idPersonaDireccion");
                Registros[1] = rs.getString("PersonaDireccionDireccion");
                Registros[2] = rs.getString("PersonaDireccionTelefono");
                Registros[3] = rs.getString("PersonaDireccionCorreo");
                Registros[4] = rs.getString("idPersona");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(Registros);

            }
            return modelo;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR" + e);
            return null;
        }
    }

    public boolean insertar(vPersonaDirecciones dts) {
        sSQL = "insert into personadireccion(idPersonaDireccion,PersonaDireccionDireccion,PersonaDireccionTelefono,PersonaDireccionCorreo, idPersona)"
                + "values(?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdPersonaDireccion());
            pst.setString(2, dts.getPersonaDireccionDireccion());
            pst.setInt(3, dts.getPersonaDireccionTelefono());
            pst.setString(4, dts.getPersonaDireccionCorreo());
            pst.setInt(5, dts.getIdPersona());
            int s = pst.executeUpdate();
            if (s != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR EN INSERTAR " + e);
            return false;
        }

    }

    public boolean editar(vPersonaDirecciones dts) {
        sSQL = "update personadireccion set PersonaDireccionDireccion=?, PersonaDireccionTelefono=?,PersonaDireccionCorreo=?,idPersona"
                + "where idPersonaDireccion=?";
//	idCategoria	CategoriaNombre	CategoriaDescripcion	CategoriaEsatdo
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, dts.getPersonaDireccionDireccion());
            pst.setInt(2, dts.getPersonaDireccionTelefono());
            pst.setString(3, dts.getPersonaDireccionCorreo());
            pst.setInt(4, dts.getIdPersona());
            pst.setInt(5, dts.getIdPersonaDireccion());
            int s = pst.executeUpdate();
            if (s != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL EDITAR");
            return false;
        }
    }

    public boolean eliminar(vPersonaDirecciones dts) {
        sSQL = " delete from personadireccion where idPersonaDireccion=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdPersonaDireccion());
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

    public DefaultTableModel mostrarlISTA(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID Direcion", "Direccion ", "Telefono", "Correo", "ID Persona"};
        String[] Registros = new String[4];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from personadireccion where PersonaDireccionTelefono like'%" + buscar + "%' order by idPersonaDireccion";
        /*private String idPersonaDireccion;
         private String PersonaDireccionDireccion;
         private int PersonaDireccionTelefono	;
         private String PersonaDireccionCorreo;*/
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                //	idCategoria	CategoriaNombre	CategoriaDescripcion	CategoriaEsatdo
                Registros[0] = rs.getString("idPersonaDireccion");
                Registros[1] = rs.getString("PersonaDireccionDireccion");
                Registros[2] = rs.getString("PersonaDireccionTelefono");
                Registros[3] = rs.getString("PersonaDireccionCorreo");
                Registros[4] = rs.getString("idPersona");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(Registros);

            }
            return modelo;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR" + e);
            return null;
        }
    }
}
