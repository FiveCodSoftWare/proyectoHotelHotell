package CapaPersistencia;

import CapaDominio.vTrabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 06-nov-2017 Autor: Antonio Aburto Cortez
 */
public class fTrabajadorDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static fTrabajadorDAO instancia;

    public static fTrabajadorDAO getInstancia() {
        if (instancia == null) {
            instancia = new fTrabajadorDAO();
        }
        return instancia;
    }

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) throws SQLException {
        DefaultTableModel modelo;  /*private String TabajadorAccseso;
         private String TabajadorPassord;
         private String TabajadorEstado;*/

        String[] titulos = {"ID Persona", "Apaterno", "Amaterno", "Nombre", "Edad", "Sexo", "Fecha Nacimiento", "Direccion", "Telefono", "Email", "Acceso", "Login", "Password", "Estado"};

        String[] registro = new String[14];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idPersona,p.PersonaAparteno,p.PersonaAmaterno,p.PersonaNombre,p.PersonaEdad,p.PersonaSexo,"
                + "p.PersonaFechaNacimiento,p.PersonaDireccion,p.PersonaTelefono,PersonaCorreo,t.TabajadorAccseso,t.tabajadorLogin,t.TabajadorPassord,t.TabajadorEstado from persona p inner join tabajador t "
                + "on p.idPersona=t.idPersona where PersonaNombre like '%"
                + buscar + "%' order by idPersona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idPersona");
                registro[1] = rs.getString("PersonaAparteno");
                registro[2] = rs.getString("PersonaAmaterno");
                registro[3] = rs.getString("PersonaNombre");
                registro[4] = rs.getString("PersonaEdad");
                registro[5] = rs.getString("PersonaSexo");
                registro[6] = rs.getString("PersonaFechaNacimiento");
                registro[7] = rs.getString("PersonaDireccion");
                registro[8] = rs.getString("PersonaTelefono");
                registro[9] = rs.getString("PersonaCorreo");
                registro[10] = rs.getString("TabajadorAccseso");
                registro[11] = rs.getString("tabajadorLogin");
                registro[12] = rs.getString("TabajadorPassord");
                registro[13] = rs.getString("TabajadorEstado");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL CARGAR LOS DATOS DEL TRABAJOR" + e.getMessage());
            return null;
        } finally {
            cn.close();
        }

    }
    //idPersona	TabajadorAccseso	TabajadorPassord	TabajadorEstado
       /*  Textos completos	
     idPersona
     PersonaAparteno
     PersonaAmaterno
     PersonaNombre
     PersonaEdad
     PersonaFechaNacimiento
     idPersonaDireccion*/

    public boolean insertar(vTrabajador dts) throws SQLException {
        sSQL = "insert into persona (PersonaAparteno,PersonaAmaterno,PersonaNombre,PersonaEdad,PersonaSexo,PersonaFechaNacimiento,PersonaDireccion,PersonaTelefono,PersonaCorreo)"
                + "values (?,?,?,?,?,?,?,?,?)";

        sSQL2 = "insert into tabajador (idPersona,TabajadorAccseso,tabajadorLogin,TabajadorPassord,TabajadorEstado)"
                + "values ((select idPersona from persona order by idPersona desc limit 1),?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst.setString(1, dts.getPersonaAparteno());
            pst.setString(2, dts.getPersonaAmaterno());
            pst.setString(3, dts.getPersonaNombre());
            pst.setInt(4, dts.getPersonaEdad());
            pst.setString(5, dts.getPersonaSexo());
            pst.setDate(6, dts.getPersonaFechaNacimiento());
            pst.setString(7, dts.getPersonaDireccion());
            pst.setInt(8, dts.getPersonaTelefono());
            pst.setString(9, dts.getPersonaCorreo());
            pst2.setString(1, dts.getTabajadorAccseso());
            pst2.setString(2, dts.getTabajadorLogin());
            pst2.setString(3, dts.getTabajadorPassord());
            pst2.setString(4, dts.getTabajadorEstado());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al intentar insertar: " + e.getMessage() + "Error: " + JOptionPane.ERROR);
            return false;
        } finally {
            cn.close();
        }
    }

    public boolean editar(vTrabajador dts) throws SQLException {
        //idPersona	TabajadorAccseso	TabajadorPassord	TabajadorEstado
       /*  Textos completos	
         idPersona
         PersonaAparteno
         PersonaAmaterno
         PersonaNombre
         PersonaEdad
         PersonaFechaNacimiento
         idPersonaDireccion*/

        sSQL = "update persona set PersonaAparteno=?,PersonaAmaterno=?,PersonaNombre=?,PersonaEdad=?,PersonaSexo=?,PersonaFechaNacimiento=?,"
                + " PersonaDireccion=?,PersonaTelefono=?,PersonaCorreo=? where idPersona=?";

        sSQL2 = "update tabajador set TabajadorAccseso=?,tabajadorLogin=?,TabajadorPassord=?,TabajadorEstado=?"
                + " where idPersona=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getPersonaAparteno());
            pst.setString(2, dts.getPersonaAmaterno());
            pst.setString(3, dts.getPersonaNombre());
            pst.setInt(4, dts.getPersonaEdad());
            pst.setString(5, dts.getPersonaSexo());
            pst.setDate(6, dts.getPersonaFechaNacimiento());
            pst.setString(7, dts.getPersonaDireccion());
            pst.setInt(8, dts.getPersonaTelefono());
            pst.setString(9, dts.getPersonaCorreo());
            pst.setInt(10, dts.getIdPersona());

            pst2.setString(1, dts.getTabajadorAccseso());
            pst2.setString(2, dts.getTabajadorLogin());
            pst2.setString(3, dts.getTabajadorPassord());
            pst2.setString(4, dts.getTabajadorEstado());
            pst2.setInt(5, dts.getIdPersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL ACTUALIZAR LOS DATOS DEL TRABAJADOR: "+e.getMessage());
            return false;
        }finally{
            cn.close();
        }
    }

    public boolean eliminar(vTrabajador dts) {
        sSQL = "delete from tabajador where idPersona=?";
        sSQL2 = "delete from persona where idPersona=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setInt(1, dts.getIdPersona());

            pst2.setInt(1, dts.getIdPersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL ELIMINAR EL TRABAJADOR: "+e.getMessage());
            return false;
        }
    }

    //idPersona	TabajadorAccseso	TabajadorPassord	TabajadorEstado
       /*  Textos completos	
     idPersona
     PersonaAparteno
     PersonaAmaterno
     PersonaNombre
     PersonaEdad
     PersonaFechaNacimiento
     idPersonaDireccion*/
    public DefaultTableModel login(String login, String password) throws SQLException {
        DefaultTableModel modelo;

        String[] titulos = {"ID Persona", "Apellido paterno", "apellido materno", "Nombre", "Acceso", "Login", "Password", "Estado"};

        String[] registro = new String[8];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idPersona,p.PersonaAparteno,p.PersonaAmaterno,p.PersonaNombre,"
                + "t.TabajadorAccseso,t.tabajadorLogin,t.TabajadorPassord,t.TabajadorEstado from persona p inner join tabajador t "
                + "on p.idPersona=t.idPersona where t.tabajadorLogin='"
                + login + "' and t.TabajadorPassord='" + password + "' and t.TabajadorEstado='A'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idPersona");
                registro[1] = rs.getString("PersonaAparteno");
                registro[2] = rs.getString("PersonaAmaterno");
                registro[3] = rs.getString("PersonaNombre");
                registro[4] = rs.getString("TabajadorAccseso");
                registro[5] = rs.getString("tabajadorLogin");
                registro[6] = rs.getString("TabajadorPassord");
                registro[7] = rs.getString("TabajadorEstado");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al Al querer ingresar" + e.getMessage());
            return null;
        }
        finally{
            cn.close();
        }
    }
}
