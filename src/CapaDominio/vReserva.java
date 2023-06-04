package CapaDominio;

import java.sql.Date;



public class vReserva {

    private int idReserva;
    private int idHabitacion;
    private int idCliente;
    private int idTrabajador;
    private String ReservaTipo;
    private Date fechaReserva;
    private Date fechaIngreso;
    private Date FechaSalida;
    private double cosotoAlojamiento;
    private String estado;
    public vReserva() {
    }

    public vReserva(int idReserva, int idHabitacion, int idCliente, int idTrabajador,String ReservaTipo, Date fechaReserva, Date fechaIngreso, Date FechaSalida, double cosotoAlojamiento,String estado) {
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.idCliente = idCliente;
        this.idTrabajador = idTrabajador;
        this.ReservaTipo=ReservaTipo;
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.FechaSalida = FechaSalida;
        this.cosotoAlojamiento = cosotoAlojamiento;
    
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCleinte) {
        this.idCliente = idCleinte;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getReservaTipo() {
        return ReservaTipo;
    }

    public void setReservaTipo(String ReservaTipo) {
        this.ReservaTipo = ReservaTipo;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public double getCosotoAlojamiento() {
        return cosotoAlojamiento;
    }

    public void setCosotoAlojamiento(double cosotoAlojamiento) {
        this.cosotoAlojamiento = cosotoAlojamiento;
    }

 

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idReserva;
        hash = 67 * hash + this.idHabitacion;
        hash = 67 * hash + this.idCliente;
        hash = 67 * hash + this.idTrabajador;
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
        final vReserva other = (vReserva) obj;
        if (this.idReserva != other.idReserva) {
            return false;
        }
        if (this.idHabitacion != other.idHabitacion) {
            return false;
        }
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (this.idTrabajador != other.idTrabajador) {
            return false;
        }
        return true;
    }


}
