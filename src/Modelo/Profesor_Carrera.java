/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author anato
 */
public class Profesor_Carrera {
    private int idpersona;
    private int idcarrera;

    public Profesor_Carrera() {
    }

    public Profesor_Carrera(int idpersona, int idcarrera) {
        this.idpersona = idpersona;
        this.idcarrera = idcarrera;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }
    
    
}
