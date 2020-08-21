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
public class Materia {
    private int idmateria;
    private String nom_materia;
    private String codigo;
    private String Semestre;
    private int idcarrera;
    private int idprofesor;

    public Materia() {
    }

    public Materia(int idmateria, String nom_materia, String codigo, String Semestre, int idcarrera, int idprofesor) {
        this.idmateria = idmateria;
        this.nom_materia = nom_materia;
        this.codigo = codigo;
        this.Semestre = Semestre;
        this.idcarrera = idcarrera;
        this.idprofesor = idprofesor;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public String getNom_materia() {
        return nom_materia;
    }

    public void setNom_materia(String nom_materia) {
        this.nom_materia = nom_materia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public int getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    
    
    
}
