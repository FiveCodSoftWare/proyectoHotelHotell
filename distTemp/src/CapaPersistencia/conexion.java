package CapaPersistencia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Fecha: 25-ago-2017 Autor: Antonio Aburto Cortez
 */
public class conexion {

    private static conexion instancia;

    public static conexion getInstancia()
    {
        if(instancia==null)
            instancia= new conexion();
        return instancia;
    }

    public String db = "dbbasedatoshotel";
    public String url = "jdbc:mysql://127.0.0.1/"+ db;
    public String user = "root";
    public String password = "antonioaburto1234";

    public conexion() {

    }

    public Connection conectar() {
        Connection link = null;
        try {
            
            Class.forName("org.gjt.mm.mysql.Driver");
            link = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
      
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error al Extablecer la conexion a a base datos: "+e.getMessage());
        }
        return link;
    }
  
    
    

}
