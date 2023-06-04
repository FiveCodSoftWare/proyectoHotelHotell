package CapaDominio;

import java.util.Objects;

/**
 * Fecha: 12/10/2017 Autor: Antonio Aburto Cortez
 */
public class vPersonaDirecciones {

   private int idPersonaDireccion;
   private String PersonaDireccionDireccion;
   private int PersonaDireccionTelefono	;
   private String PersonaDireccionCorreo;
   private int idPersona;
   


    public vPersonaDirecciones() {
    }

    public vPersonaDirecciones(int idPersonaDireccion, String PersonaDireccionDireccion, int PersonaDireccionTelefono, String PersonaDireccionCorreo, int idPersona) {
        this.idPersonaDireccion = idPersonaDireccion;
        this.PersonaDireccionDireccion = PersonaDireccionDireccion;
        this.PersonaDireccionTelefono = PersonaDireccionTelefono;
        this.PersonaDireccionCorreo = PersonaDireccionCorreo;
        this.idPersona=idPersona;
    }

    public int getIdPersonaDireccion() {
        return idPersonaDireccion;
    }

    public void setIdPersonaDireccion(int idPersonaDireccion) {
        this.idPersonaDireccion = idPersonaDireccion;
    }

    public String getPersonaDireccionDireccion() {
        return PersonaDireccionDireccion;
    }

    public void setPersonaDireccionDireccion(String PersonaDireccionDireccion) {
        this.PersonaDireccionDireccion = PersonaDireccionDireccion;
    }

    public int getPersonaDireccionTelefono() {
        return PersonaDireccionTelefono;
    }

    public void setPersonaDireccionTelefono(int PersonaDireccionTelefono) {
        this.PersonaDireccionTelefono = PersonaDireccionTelefono;
    }

    public String getPersonaDireccionCorreo() {
        return PersonaDireccionCorreo;
    }

    public void setPersonaDireccionCorreo(String PersonaDireccionCorreo) {
        this.PersonaDireccionCorreo = PersonaDireccionCorreo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idPersonaDireccion);
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
        final vPersonaDirecciones other = (vPersonaDirecciones) obj;
        if (!Objects.equals(this.idPersonaDireccion, other.idPersonaDireccion)) {
            return false;
        }
        return true;
    }

   
  

}
