/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPersistencia;

import CapaDominio.vCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CARLOS
 */
public class fClienteDAO {
   private Connection cnn = null;
    private ResultSet rs=null;

    private static fClienteDAO instancia;

    public static fClienteDAO getInstancia()
    {
        if(instancia==null)
            instancia=new fClienteDAO();
        return instancia;
    }
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID Persona", "Apaterno", "Amaterno", "Nombre", "Edad", "Sexo", "Fecha Nacimiento", "Direccion", "Telefono", "Email", "Codigo Cliente"};

        String[] registro = new String[11];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

      /*  sSQL = "select * from persona p inner join cliente c on p.idPersona=c.idPersona where PersonaAparteno like '%"
                + buscar + "%' order by PersonaAparteno desc";*/

        sSQL = "select p.idPersona,p.PersonaAparteno,p.PersonaAmaterno,p.PersonaNombre,p.PersonaEdad,p.PersonaSexo,"
                + "p.PersonaFechaNacimiento,p.PersonaDireccion,p.PersonaTelefono,p.PersonaCorreo,c.ClienteCodigo from persona p inner join cliente c "
                + "on p.idPersona=c.idPersona where p.PersonaNombre like '%"
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
                registro[10] = rs.getString("ClienteCodigo");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostrar" + e.getMessage());
            return null;
        }

    }

    public boolean insertar(vCliente dts) {
        sSQL = "insert into persona (PersonaAparteno,PersonaAmaterno,PersonaNombre,PersonaEdad,PersonaSexo,PersonaFechaNacimiento,PersonaDireccion,PersonaTelefono,PersonaCorreo)"
                + "values (?,?,?,?,?,?,?,?,?)";

        sSQL2 = "insert into cliente (idPersona,Clientecodigo)"
                + "values ((select idPersona from persona order by idPersona desc limit 1),?)";

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
            pst2.setInt(1, dts.getClientecodigo());
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
            JOptionPane.showConfirmDialog(null, "Error al insertar");
            return false;
        }
    }

    public boolean editar(vCliente dts) {
        sSQL = "update persona set PersonaAparteno=?,PersonaAmaterno=?,PersonaNombre=?,PersonaEdad=?,PersonaSexo=?,PersonaFechaNacimiento=?,"
                + " PersonaDireccion=?,PersonaTelefono=?,PersonaCorreo=? where idPersona=?";

        sSQL2 = "update cliente set Clientecodigo=?"
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

            pst2.setInt(1, dts.getClientecodigo());
            pst2.setInt(2, dts.getIdPersona());

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
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(vCliente dts) {
        sSQL = "delete from cliente where idPersona=?";
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
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
       public DefaultTableModel mostrarrr(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID Persona", "Apaterno", "Amaterno", "Nombre", "Edad", "Sexo", "Fecha Nacimiento", "Direccion", "Telefono", "Email", "Codigo Cliente"};

        String[] registro = new String[11];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

      /*  sSQL = "select * from persona p inner join cliente c on p.idPersona=c.idPersona where PersonaAparteno like '%"
                + buscar + "%' order by PersonaAparteno desc";*/

        sSQL = "select p.idPersona,p.PersonaAparteno,p.PersonaAmaterno,p.PersonaNombre,p.PersonaEdad,p.PersonaSexo,"
                + "p.PersonaFechaNacimiento,p.PersonaDireccion,p.PersonaTelefono,p.PersonaCorreo,c.ClienteCodigo from persona p inner join cliente c "
                + "on p.idPersona=c.idPersona where PersonaEdad like '%"
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
                registro[10] = rs.getString("ClienteCodigo");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostrar" + e.getMessage());
            return null;
        }

    }
       
       
       
           public int ClienteCodigoIgual(int codigo) {

        sSQL = "SELECT ClienteCodigo from cliente where ClienteCodigo = " + codigo;

        try {
            int cod = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                cod = rs.getInt("ClienteCodigo");
            }

            return cod;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }

    }
}
