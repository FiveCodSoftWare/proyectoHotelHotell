package CapaDominio;

import java.util.Date;
import java.util.Objects;

/**
 * Fecha: 15-oct-2017 Autor: Antonio Aburto Cortez
 */
public class vComprobante {

 private int  idPago;
 private double ComprobanteCostoReserva	;
 private double ComprobanteIGV	;
 private double ComprobanteTotalPago;
 private Date ComprobanteFechaEmision	;
 private Date ComprobanteFechaPago;
 


    public vComprobante() {
    }

    public vComprobante(int idPago, double ComprobanteCostoReserva, double ComprobanteIGV, double ComprobanteTotalPago, Date ComprobanteFechaEmision, Date ComprobanteFechaPago) {
        this.idPago = idPago;
        this.ComprobanteCostoReserva = ComprobanteCostoReserva;
        this.ComprobanteIGV = ComprobanteIGV;
        this.ComprobanteTotalPago = ComprobanteTotalPago;
        this.ComprobanteFechaEmision = ComprobanteFechaEmision;
        this.ComprobanteFechaPago = ComprobanteFechaPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getComprobanteCostoReserva() {
        return ComprobanteCostoReserva;
    }

    public void setComprobanteCostoReserva(double ComprobanteCostoReserva) {
        this.ComprobanteCostoReserva = ComprobanteCostoReserva;
    }

    public double getComprobanteIGV() {
        return ComprobanteIGV;
    }

    public void setComprobanteIGV(double ComprobanteIGV) {
        this.ComprobanteIGV = ComprobanteIGV;
    }

    public double getComprobanteTotalPago() {
        return ComprobanteTotalPago;
    }

    public void setComprobanteTotalPago(double ComprobanteTotalPago) {
        this.ComprobanteTotalPago = ComprobanteTotalPago;
    }

    public Date getComprobanteFechaEmision() {
        return ComprobanteFechaEmision;
    }

    public void setComprobanteFechaEmision(Date ComprobanteFechaEmision) {
        this.ComprobanteFechaEmision = ComprobanteFechaEmision;
    }

    public Date getComprobanteFechaPago() {
        return ComprobanteFechaPago;
    }

    public void setComprobanteFechaPago(Date ComprobanteFechaPago) {
        this.ComprobanteFechaPago = ComprobanteFechaPago;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.idPago);
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
        final vComprobante other = (vComprobante) obj;
        if (!Objects.equals(this.idPago, other.idPago)) {
            return false;
        }
        return true;
    }

   
 
   
    
}
