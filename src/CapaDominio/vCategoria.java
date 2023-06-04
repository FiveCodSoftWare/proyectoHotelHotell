package CapaDominio;

import java.util.Objects;

/**
 * Fecha: 12/10/2017 Autor: Antonio Aburto Cortez
 */
public class vCategoria {

   private int CodigoCategoria;
   private String CategoriaNombre;
   private String CategoriaDescripcion;
   

    public vCategoria() {
    }

    public vCategoria(int CodigoCategoria, String CategoriaNombre, String CategoriaDescripcion) {
        this.CodigoCategoria = CodigoCategoria;
        this.CategoriaNombre = CategoriaNombre;
        this.CategoriaDescripcion = CategoriaDescripcion;
        
    }

    public int getCodigoCategoria() {
        return CodigoCategoria;
    }

    public void setCodigoCategoria(int CodigoCategoria) {
        this.CodigoCategoria = CodigoCategoria;
    }

   

    public String getCategoriaNombre() {
        return CategoriaNombre;
    }

    public void setCategoriaNombre(String CategoriaNombre) {
        this.CategoriaNombre = CategoriaNombre;
    }

    public String getCategoriaDescripcion() {
        return CategoriaDescripcion;
    }

    public void setCategoriaDescripcion(String CategoriaDescripcion) {
        this.CategoriaDescripcion = CategoriaDescripcion;
    }

  
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.CodigoCategoria);
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
        final vCategoria other = (vCategoria) obj;
        if (!Objects.equals(this.CodigoCategoria, other.CodigoCategoria)) {
            return false;
        }
        return true;
    }

  
    
        
        
        
}
