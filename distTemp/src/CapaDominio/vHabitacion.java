

package CapaDominio;

/**
 * Fecha: 12-nov-2017
 * Autor: Antonio Aburto Cortez 
 */
public class vHabitacion {
 private int idHabitacion;
 private int HabitacionNumero;
 private String HabitacionPiso;
 private int idTipoHabitacion;
 private String HabitacionEsatdo;

    public vHabitacion() {
    }

    public vHabitacion(int idHabitacion, int HabitacionNumero, String HabitacionPiso, int idTipoHabitacion, String HabitacionEsatdo) {
        this.idHabitacion = idHabitacion;
        this.HabitacionNumero = HabitacionNumero;
        this.HabitacionPiso = HabitacionPiso;
        this.idTipoHabitacion = idTipoHabitacion;
        this.HabitacionEsatdo = HabitacionEsatdo;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getHabitacionNumero() {
        return HabitacionNumero;
    }

    public void setHabitacionNumero(int HabitacionNumero) {
        this.HabitacionNumero = HabitacionNumero;
    }

    public String getHabitacionPiso() {
        return HabitacionPiso;
    }

    public void setHabitacionPiso(String HabitacionPiso) {
        this.HabitacionPiso = HabitacionPiso;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public String getHabitacionEsatdo() {
        return HabitacionEsatdo;
    }

    public void setHabitacionEsatdo(String HabitacionEsatdo) {
        this.HabitacionEsatdo = HabitacionEsatdo;
    }
 
 
 
 
}
