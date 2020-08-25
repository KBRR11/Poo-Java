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
public class Secretaria extends Persona{
    private int idcarrera;
    private String fecha_ingreso;
    private String service_time;
    private String turno;

    public Secretaria() {
    }

    public Secretaria(int idcarrera, String fecha_ingreso, String service_time, String turno, int idpersona, String nombre, String apellido, String cedula, String edad, String fecha_nacimiento, String telefono, String direccion, String password, String tipo) {
        super(idpersona, nombre, apellido, cedula, edad, fecha_nacimiento, telefono, direccion, password, tipo);
        this.idcarrera = idcarrera;
        this.fecha_ingreso = fecha_ingreso;
        this.service_time = service_time;
        this.turno = turno;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getService_time() {
        return service_time;
    }

    public void setService_time(String service_time) {
        this.service_time = service_time;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
