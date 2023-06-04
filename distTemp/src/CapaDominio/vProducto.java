package CapaDominio;

import com.mysql.jdbc.Blob;
import java.awt.Image;
import java.io.FileInputStream;
import java.util.Objects;

public class vProducto {

    private long codigoProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private String  unidadProducto;

    private double precioProducto;
    private int stockProducto;
    private double precioCompra;

    private String ubicacionLugar;

    public vProducto() {
    }

    public vProducto(long codigoProducto, String nombreProducto, String descripcionProducto, String unidadProducto, double precioProducto, int stockProducto, double precioCompra, String ubicacionLugar) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.unidadProducto = unidadProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.precioCompra = precioCompra;
        this.ubicacionLugar = ubicacionLugar;
    }

    public long getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getUnidadProducto() {
        return unidadProducto;
    }

    public void setUnidadProducto(String unidadProducto) {
        this.unidadProducto = unidadProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getUbicacionLugar() {
        return ubicacionLugar;
    }

    public void setUbicacionLugar(String ubicacionLugar) {
        this.ubicacionLugar = ubicacionLugar;
    }

    
    
    
    
    
}
