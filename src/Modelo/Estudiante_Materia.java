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
public class Estudiante_Materia {
    private int idestudiante;
    private int idmateria;

    public Estudiante_Materia() {
    }

    public Estudiante_Materia(int idestudiante, int idmateria) {
        this.idestudiante = idestudiante;
        this.idmateria = idmateria;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }
    
    
}
