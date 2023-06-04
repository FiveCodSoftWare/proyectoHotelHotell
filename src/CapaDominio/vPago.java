/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDominio;


import java.sql.Date;
/**
 *
 * @author levi
 */
public class vPago {

    private int idPago;
    private int idReserva;
    private String PagoTipoComprobante;
    private String PagoNumerocomprobante;
    private Date PagoFechaEmisioon;
    private Date PagoFechaPago;
    private double PagoIGV;
    private double PagoTotal;
   

    public vPago() {
    }

    public vPago(int idPago, int idReserva, String PagoTipoComprobante, String PagoNumerocomprobante, Date PagoFechaEmisioon, Date PagoFechaPago, double PagoIGV, double PagoTotal) {
        this.idPago = idPago;
        this.idReserva = idReserva;
        this.PagoTipoComprobante = PagoTipoComprobante;
        this.PagoNumerocomprobante = PagoNumerocomprobante;
        this.PagoFechaEmisioon = PagoFechaEmisioon;
        this.PagoFechaPago = PagoFechaPago;
        this.PagoIGV = PagoIGV;
        this.PagoTotal = PagoTotal;
    
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getPagoTipoComprobante() {
        return PagoTipoComprobante;
    }

    public void setPagoTipoComprobante(String PagoTipoComprobante) {
        this.PagoTipoComprobante = PagoTipoComprobante;
    }

    public String getPagoNumerocomprobante() {
        return PagoNumerocomprobante;
    }

    public void setPagoNumerocomprobante(String PagoNumerocomprobante) {
        this.PagoNumerocomprobante = PagoNumerocomprobante;
    }

    public Date getPagoFechaEmisioon() {
        return PagoFechaEmisioon;
    }

    public void setPagoFechaEmisioon(Date PagoFechaEmisioon) {
        this.PagoFechaEmisioon = PagoFechaEmisioon;
    }

    public Date getPagoFechaPago() {
        return PagoFechaPago;
    }

    public void setPagoFechaPago(Date PagoFechaPago) {
        this.PagoFechaPago = PagoFechaPago;
    }

    public double getPagoIGV() {
        return PagoIGV;
    }

    public void setPagoIGV(double PagoIGV) {
        this.PagoIGV = PagoIGV;
    }

    public double getPagoTotal() {
        return PagoTotal;
    }

    public void setPagoTotal(double PagoTotal) {
        this.PagoTotal = PagoTotal;
    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.idPago;
        hash = 41 * hash + this.idReserva;
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
        final vPago other = (vPago) obj;
        if (this.idPago != other.idPago) {
            return false;
        }
        if (this.idReserva != other.idReserva) {
            return false;
        }
        return true;
    }

 
}
