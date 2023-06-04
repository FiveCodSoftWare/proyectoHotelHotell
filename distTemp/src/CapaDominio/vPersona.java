package CapaDominio;

import java.sql.*;





public class vPersona {
 private int idPersona;
 private String PersonaAparteno;
 private String PersonaAmaterno;
 private String PersonaNombre;
 private int PersonaEdad;
 private String PersonaSexo;
 private Date PersonaFechaNacimiento;
 private String PersonaDireccion;
 private int PersonaTelefono	;
 private String PersonaCorreo;
 
    

    public vPersona() {
    }

    public vPersona(int idPersona, String PersonaAparteno, 
            String PersonaAmaterno, String PersonaNombre, 
            int PersonaEdad, String PersonaSexo, Date PersonaFechaNacimiento,
            String PersonaDireccion, int PersonaTelefono, String PersonaCorreo) 
    {
        this.idPersona = idPersona;
        this.PersonaAparteno = PersonaAparteno;
        this.PersonaAmaterno = PersonaAmaterno;
        this.PersonaNombre = PersonaNombre;
        this.PersonaEdad = PersonaEdad;
        this.PersonaSexo = PersonaSexo;
        this.PersonaFechaNacimiento = PersonaFechaNacimiento;
        this.PersonaDireccion = PersonaDireccion;
        this.PersonaTelefono = PersonaTelefono;
        this.PersonaCorreo = PersonaCorreo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getPersonaAparteno() {
        return PersonaAparteno;
    }

    public void setPersonaAparteno(String PersonaAparteno) {
        this.PersonaAparteno = PersonaAparteno;
    }

    public String getPersonaAmaterno() {
        return PersonaAmaterno;
    }

    public void setPersonaAmaterno(String PersonaAmaterno) {
        this.PersonaAmaterno = PersonaAmaterno;
    }

    public String getPersonaNombre() {
        return PersonaNombre;
    }

    public void setPersonaNombre(String PersonaNombre) {
        this.PersonaNombre = PersonaNombre;
    }

    public int getPersonaEdad() {
        return PersonaEdad;
    }

    public void setPersonaEdad(int PersonaEdad) {
        this.PersonaEdad = PersonaEdad;
    }

    public String getPersonaSexo() {
        return PersonaSexo;
    }

    public void setPersonaSexo(String PersonaSexo) {
        this.PersonaSexo = PersonaSexo;
    }

    public Date getPersonaFechaNacimiento() {
        return PersonaFechaNacimiento;
    }

    public void setPersonaFechaNacimiento(Date PersonaFechaNacimiento) {
        this.PersonaFechaNacimiento = PersonaFechaNacimiento;
    }

    public String getPersonaDireccion() {
        return PersonaDireccion;
    }

    public void setPersonaDireccion(String PersonaDireccion) {
        this.PersonaDireccion = PersonaDireccion;
    }

    public int getPersonaTelefono() {
        return PersonaTelefono;
    }

    public void setPersonaTelefono(int PersonaTelefono) {
        this.PersonaTelefono = PersonaTelefono;
    }

    public String getPersonaCorreo() {
        return PersonaCorreo;
    }

    public void setPersonaCorreo(String PersonaCorreo) {
        this.PersonaCorreo = PersonaCorreo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idPersona;
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
        final vPersona other = (vPersona) obj;
        if (this.idPersona != other.idPersona) {
            return false;
        }
        return true;
    }

   
   

}