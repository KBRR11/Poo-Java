/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Ingresodatos;
import util.Cadena;

/**
 *
 * @author anato
 */
public class Logica {
    
    public static void Inicio(){
        int opcion;
        int opcRegistro;
        do {            
            Ingresodatos.textoLogin();
            opcion = Cadena.leerentero();
            Cadena.saltolinea(3);
            switch(opcion){
                case 1: Ingresodatos.Login();
                    break;
                case 2: do {     
                    Cadena.saltolinea(2);
                        Ingresodatos.textoRegisterUser();
                        opcRegistro = Cadena.leerentero();
                        Cadena.saltolinea(1);
                        switch(opcRegistro){
                            case 1: Ingresodatos.registerEstudent();
                                break;
                            case 2:// Ingresodatos.registerTeacher();
                                break;
                            case 3: //Ingresodatos.registerSecretary();
                                break;
                            case 4: //Ingresodatos.registerJanitor();
                                break;   
                            case 5:
                                break;
                            default: Ingresodatos.error();    
                        }
                    } while (opcRegistro!=5);
                Cadena.saltolinea(2);
                    break;
                case 3: Ingresodatos.salir();
                    break;
                default: Ingresodatos.error();    
            }
        } while (opcion!=3);
        Cadena.saltolinea(3);
    }
    
    public static void iniciarSistemaAdmin(){
        int opcion;
        do {     
            Ingresodatos.textoSistemaAdmin();
            opcion = Cadena.leerentero();
            Cadena.saltolinea(1);
            switch(opcion){
                            case 1: Ingresodatos.registerCarrera();
                                break;
                            case 2: Ingresodatos.registerTeacher();
                                break;
                            case 3: Ingresodatos.registerMateria();
                                break;
                            case 4: //Ingresodatos.registerSecretary();
                                break; 
                            case 5: // Ingresodatos.registerJanitor();
                                break;
                                case 6:
                                    Cadena.saltolinea(3);
                                    System.out.println("\t\033[31mSESION CERRARA!!");
                                    Cadena.saltolinea(3);
                                    break;
                            default: Ingresodatos.error();    
                        }
        } while (opcion!=6);
        Cadena.saltolinea(2);
    }
    public static void iniciarSistemaProfesor(){
        int opcion;
        do {            
            //validacion login
        } while (true);
    }
    
    public static void iniciarSistemaEstudiante(int idestudiante){
        //System.out.println("el id del estudiante: "+idestudiante);
        int opcion;
        Ingresodatos.textoSistemaEstudiante();
        opcion = Cadena.leerentero();
        Cadena.saltolinea(1);
        do {            
             switch(opcion){
                            case 1: Ingresodatos.verNotasEstudiante(idestudiante);
                                break;
                            case 2: Cadena.saltolinea(3);
                                    System.out.println("\t\033[31mSESION CERRARA!!");
                                    Cadena.saltolinea(3);
                                    break;
                            default: Ingresodatos.error();    
                        }
        } while (opcion!=2);
    }
    
}
