/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDominio;

import java.sql.*;
import java.util.Objects;

/**
 *
 * @author levi
 */
public class vCliente extends vPersona {
  private int Clientecodigo;

    public vCliente() {
    }

public vCliente( int idPersona, String PersonaAparteno, String PersonaAmaterno,
            String PersonaNombre, int PersonaEdad, String PersonaSexo, 
            Date PersonaFechaNacimiento, String PersonaDireccion, 
            int PersonaTelefono, String PersonaCorreo,int Clientecodigo) {
        super(idPersona, PersonaAparteno, PersonaAmaterno, PersonaNombre,
           PersonaEdad, PersonaSexo, PersonaFechaNacimiento, PersonaDireccion,
                PersonaTelefono, PersonaCorreo);
        this.Clientecodigo = Clientecodigo;
    }

   

   

    public int getClientecodigo() {
        return Clientecodigo;
    }

    public void setClientecodigo(int Clientecodigo) {
        this.Clientecodigo = Clientecodigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final vCliente other = (vCliente) obj;
        return true;
    }

   

   



}
