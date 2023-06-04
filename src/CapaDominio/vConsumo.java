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
public class vConsumo {

private int idConsumo;
private int idReserva;
private int idProducto;
private double ConsumoCantidad;
private double ConsumoPrecioVenta;
private Date ConsumoFechaConsumo;
private String ConsumoEstado;




    public vConsumo() {
    }

    public vConsumo(int idConsumo ,int idReserva, int idProducto, double ConsumoCantidad, double ConsumoPrecioVenta, Date ConsumoFechaConsumo, String ConsumoEstado) {
        this.idConsumo = idConsumo;
        this.idReserva=idReserva;
        this.idProducto=idProducto;
        this.ConsumoCantidad = ConsumoCantidad;
        this.ConsumoPrecioVenta = ConsumoPrecioVenta;
        this.ConsumoFechaConsumo = ConsumoFechaConsumo;
        this.ConsumoEstado = ConsumoEstado;
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public double getConsumoCantidad() {
        return ConsumoCantidad;
    }

    public void setConsumoCantidad(double ConsumoCantidad) {
        this.ConsumoCantidad = ConsumoCantidad;
    }

    public double getConsumoPrecioVenta() {
        return ConsumoPrecioVenta;
    }

    public void setConsumoPrecioVenta(double ConsumoPrecioVenta) {
        this.ConsumoPrecioVenta = ConsumoPrecioVenta;
    }

    public Date getConsumoFechaConsumo() {
        return ConsumoFechaConsumo;
    }

    public void setConsumoFechaConsumo(Date ConsumoFechaConsumo) {
        this.ConsumoFechaConsumo = ConsumoFechaConsumo;
    }

    public String getConsumoEstado() {
        return ConsumoEstado;
    }

    public void setConsumoEstado(String ConsumoEstado) {
        this.ConsumoEstado = ConsumoEstado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdRerva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.idConsumo;
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
        final vConsumo other = (vConsumo) obj;
        if (this.idConsumo != other.idConsumo) {
            return false;
        }
        return true;
    }

   
 

}
