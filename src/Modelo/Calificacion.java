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
public class Calificacion{
    private Double parcial1;
    private Double parcial2;
    private Double recupercion;
    private Double notafinal;
    private int idestudiante;
    private int idmateria;

    public Calificacion() {
    }

    public Calificacion(Double parcial1, Double parcial2, Double recupercion, Double notafinal, int idestudiante, int idmateria) {
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.recupercion = recupercion;
        this.notafinal = notafinal;
        this.idestudiante = idestudiante;
        this.idmateria = idmateria;
    }

   
    

    public Double getParcial1() {
        return parcial1;
    }

    public void setParcial1(Double parcial1) {
        this.parcial1 = parcial1;
    }

    public Double getParcial2() {
        return parcial2;
    }

    public void setParcial2(Double parcial2) {
        this.parcial2 = parcial2;
    }

    public Double getRecupercion() {
        return recupercion;
    }

    public void setRecupercion(Double recupercion) {
        this.recupercion = recupercion;
    }

    public Double getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(Double notafinal) {
        this.notafinal = notafinal;
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
