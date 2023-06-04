package CapaDominio;

import java.util.Objects;

/**
 * Fecha: 12/10/2017 Autor: Antonio Aburto Cortez
 */
public class vTipoHabitacion {

    private int idTipoHabitacion;
    private String TipoHabitacion;
    private double TipoHabitacionPrecio;
    private String TipoHabitacionDescripcion;
    

    public vTipoHabitacion() {
    }

    public vTipoHabitacion(int idTipoHabitacion,String TipoHabitacion, double TipoHabitacionPrecio, String TipoHabitacionDescripcion) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.TipoHabitacion=TipoHabitacion;
        this.TipoHabitacionPrecio = TipoHabitacionPrecio;
        this.TipoHabitacionDescripcion = TipoHabitacionDescripcion;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public double getTipoHabitacionPrecio() {
        return TipoHabitacionPrecio;
    }

    public void setTipoHabitacionPrecio(double TipoHabitacionPrecio) {
        this.TipoHabitacionPrecio = TipoHabitacionPrecio;
    }

    public String getTipoHabitacionDescripcion() {
        return TipoHabitacionDescripcion;
    }

    public void setTipoHabitacionDescripcion(String TipoHabitacionDescripcion) {
        this.TipoHabitacionDescripcion = TipoHabitacionDescripcion;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.idTipoHabitacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final vTipoHabitacion other = (vTipoHabitacion) obj;
        if (!Objects.equals(this.idTipoHabitacion, other.idTipoHabitacion)) {
            return false;
        }
        return true;
    }

 

   
}
