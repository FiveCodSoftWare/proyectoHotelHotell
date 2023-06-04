package CapaDominio;

import java.sql.Date;

/**
 * Fecha: 11-nov-2017 Autor: Antonio Aburto Cortez
 */
public class vTrabajador extends vPersona {

    private String TabajadorAccseso;
    private String TabajadorPassord;
    private String  tabajadorLogin;
    private String TabajadorEstado;

    public vTrabajador() {
    }

    
    public vTrabajador(String TabajadorAccseso,String  tabajadorLogin,
            String TabajadorPassord, String TabajadorEstado) {

        this.TabajadorAccseso = TabajadorAccseso;
        this.tabajadorLogin=tabajadorLogin;
        this.TabajadorPassord = TabajadorPassord;
        this.TabajadorEstado = TabajadorEstado;
    }

    public String getTabajadorAccseso() {
        return TabajadorAccseso;
    }

    public String getTabajadorLogin() {
        return tabajadorLogin;
    }

    public void setTabajadorLogin(String tabajadorLogin) {
        this.tabajadorLogin = tabajadorLogin;
    }

    public void setTabajadorAccseso(String TabajadorAccseso) {
        this.TabajadorAccseso = TabajadorAccseso;
    }

    public String getTabajadorPassord() {
        return TabajadorPassord;
    }

    public void setTabajadorPassord(String TabajadorPassord) {
        this.TabajadorPassord = TabajadorPassord;
    }

    public String getTabajadorEstado() {
        return TabajadorEstado;
    }

    public void setTabajadorEstado(String TabajadorEstado) {
        this.TabajadorEstado = TabajadorEstado;
    }

}
