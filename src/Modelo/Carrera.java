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
public class Carrera {
    private int idcarrera;
    private String nom_carrera;

    public Carrera() {
    }

    public Carrera(int idcarrera, String nom_carrera) {
        this.idcarrera = idcarrera;
        this.nom_carrera = nom_carrera;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getNom_carrera() {
        return nom_carrera;
    }

    public void setNom_carrera(String nom_carrera) {
        this.nom_carrera = nom_carrera;
    }
    
}
