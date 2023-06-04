

package CapaDominio;

import java.util.Date;
import java.util.Objects;

/**
 * Fecha: 22-oct-2017
 * Autor: Antonio Aburto Cortez 
 */
public class vItemPedidoProducto {
private int idProducto;
private String ItemPedidoProductoCantidad;
private double ItemPedidoProductoPrecio;
private int idConsumo;
 public vItemPedidoProducto() {
    }


    public vItemPedidoProducto(int idProducto, String ItemPedidoProductoCantidad, double ItemPedidoProductoPrecio,int idConsumo) {
        this.idProducto = idProducto;
        this.ItemPedidoProductoCantidad = ItemPedidoProductoCantidad;
        this.ItemPedidoProductoPrecio = ItemPedidoProductoPrecio;
        this.idConsumo = idConsumo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getItemPedidoProductoCantidad() {
        return ItemPedidoProductoCantidad;
    }

    public void setItemPedidoProductoCantidad(String ItemPedidoProductoCantidad) {
        this.ItemPedidoProductoCantidad = ItemPedidoProductoCantidad;
    }

    public double getItemPedidoProductoPrecio() {
        return ItemPedidoProductoPrecio;
    }

    public void setItemPedidoProductoPrecio(double ItemPedidoProductoPrecio) {
        this.ItemPedidoProductoPrecio = ItemPedidoProductoPrecio;
    }

  
    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idProducto);
        hash = 97 * hash + Objects.hashCode(this.idConsumo);
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
        final vItemPedidoProducto other = (vItemPedidoProducto) obj;
        if (!Objects.equals(this.idProducto, other.idProducto)) {
            return false;
        }
        if (!Objects.equals(this.idConsumo, other.idConsumo)) {
            return false;
        }
        return true;
    }

   
}
