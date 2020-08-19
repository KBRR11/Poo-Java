/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import util.Cadena;

/**
 *
 * @author anato
 */
public class Ingresodatos {
    
    private static ArrayList<Carrera> carrera = new ArrayList();
    private static ArrayList<Profesor_Carrera> prof_carr = new ArrayList();
    private static ArrayList<Profesor> profesor = new ArrayList();
    
    private static int contCarrera = 0;
    private static int contPersona = 0;
    
    
    public static void textoLogin(){
        System.out.println("\t\t\033[31mSISTEMA UG - INICIO");
        Cadena.saltolinea(1);
        System.out.println("\t\033[30m[1]. Iniciar Sesión");
        System.out.println("\t[2]. Registrar Usuario");
        System.out.println("\t[3]. Salir del Sistema");
        System.out.print("\tIngresar Opción [1-3]: ");

    }
    
    public static void textoRegisterUser(){
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[34mREGISTRAR USUARIO");
        Cadena.saltolinea(1);
        System.out.println("\t\033[30m[1]. Registrar Estudiante");
        System.out.println("\t[2]. Registrar Profesor");
        System.out.println("\t[3]. Registrar Secretaria");
        System.out.println("\t[4]. Registrar Conserje");
        System.out.println("\t[5]. Volver");
        System.out.print("\tIngresar Opción [1-5]: ");
    }
    
    public static void textoSistemaAdmin(){
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[35mBienvenido Administrador");
        Cadena.saltolinea(1);
        System.out.println("\t\033[30m[1]. Registrar Carrera");
        System.out.println("\t[2]. Registrar Profesor");
        System.out.println("\t[3]. Registrar Materia");
        System.out.println("\t[4]. Registrar Secretaria");
        System.out.println("\t[5]. Registrar Conserje");
        System.out.println("\t[6]. Cerrar Sesión");
        System.out.print("\tIngresar Opción [1-6]: ");
    }
    public static void Login(){
        String cedula;
        String password;
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[34mLOGIN UG");
        Cadena.saltolinea(1);
        System.out.print("\t\033[30mCédula: \033[34m ");
        cedula = Cadena.leercadena();
        System.out.print("\t\033[30mContraseña: \033[34m ");
        password = Cadena.leercadena();
        validacionLogin(cedula,password);
    }
    public static void registerCarrera(){
        String nom_carrera;
        int respuesta;
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[34mREGISTRAR NUEVA CARRERA");
        do {         
            contCarrera++;
            System.out.print("\t\033[30mNombre de la Carrera: \033[34m ");
            nom_carrera = Cadena.leercadena();
            Carrera carreras = new Carrera(contCarrera, nom_carrera);
            carrera.add(carreras);
            Cadena.saltolinea(2);
            System.out.println("\033[31mNro\tCARRERA");
            for (Carrera carrera1 : carrera) {
                System.out.println("\033[30m"+carrera1.getIdcarrera()+"\t"+carrera1.getNom_carrera());
            }
            Cadena.saltolinea(2);
            System.out.print("\t\033[30mDesea agregar otra carrera? [1 Continuar/0 terminar]: ");
            respuesta = Cadena.leerentero();
        } while (respuesta!=0);
        Cadena.saltolinea(3);
    }
    public static void registerEstudent(){
        String nombre;
        String apellido;
        String cedula;
        String edad;
        String fecha_nacimiento;
        String telefono;
        String direccion;
        String password;
        String tipo;
        int idcarrera;
        String semestre;
        String fecha_inicio;
        String fecha_fin;
        Cadena.saltolinea(1);
        
    }//// completar
    
    public static void registerTeacher(){
        String nombre;
        String apellido;
        String cedula;
        String edad;
        String fecha_nacimiento;
        String telefono;
        String direccion;
        String password;
        String pass2;
        String tipo="2";
        int idcarrera, respuesta;
        boolean correcto=false;
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[35mRegistrar Profesor");
        contPersona++;
        Cadena.saltolinea(1);
        System.out.print("\tNombre: ");
        nombre = Cadena.leercadena();
        System.out.print("\tApellido: ");
        apellido = Cadena.leercadena();
        System.out.print("\tCédula: ");
        cedula = Cadena.leercadena();
        System.out.print("\tEdad: ");
        edad = Cadena.leercadena();
        System.out.print("\tF. Nacimiento[dd/mm/yyyy]: ");
        fecha_nacimiento = Cadena.leercadena();
        System.out.print("\tTeléfono: ");
        telefono = Cadena.leercadena();
        System.out.print("\tDirección: ");
        direccion = Cadena.leercadena();
        do {            
          System.out.print("\tContraseña: ");
          password = Cadena.leercadena();
        System.out.print("\tConfirmar Contraseña: ");
          pass2= Cadena.leercadena();
            if (pass2.equals(password)) {
                Cadena.saltolinea(1);
                System.out.println("\t\033[32mPROFESOR CREADO CON EXITO!!");
                Profesor profe = new Profesor(contPersona, nombre, apellido, cedula, edad, fecha_nacimiento, telefono, direccion, password, tipo);
                profesor.add(profe);
                correcto=true;
                Cadena.saltolinea(1);
            }else{
                Cadena.saltolinea(1);
                System.out.println("\t\033[31mlas contraseñas no coinciden!!\n\t\033[31mINTENTALO DE NUEVO!!");
                Cadena.saltolinea(1);
            }
        } while (correcto!=true);
        
        System.out.println("\tIngrese Carreras: ");
        
        do { 
            Cadena.saltolinea(1);
        System.out.println("\033[31mNro\tCARRERA");
        for (Carrera carrera1 : carrera) {
                System.out.println("\033[30m"+carrera1.getIdcarrera()+"\t"+carrera1.getNom_carrera());
            }
          System.out.print("\tSeleccionar Item de Carrera: ");
          idcarrera = Cadena.leerentero();
          Profesor_Carrera pro_carrera = new Profesor_Carrera(contPersona, idcarrera);
          prof_carr.add(pro_carrera);
          Cadena.saltolinea(1);
          System.out.println("\033[31mNOMBRE\tAPELLIDO\tCARRERA");
           for (Profesor_Carrera pro_ca : prof_carr) {
                System.out.println(profesor.get(pro_ca.getIdpersona()-1).nombre+"\t"+profesor.get(pro_ca.getIdpersona()-1).apellido+"\t"+carrera.get(pro_ca.getIdcarrera()-1).getNom_carrera());
            }
           /* for (Profesor profe : profesor) {
                System.out.println("Nombre: "+profe.getNombre()+" Apellido: "+profe.getApellido()+" Id: "+profe.getIdpersona());
            }*/
           /*for (Profesor_Carrera pro_ca : prof_carr) {
                System.out.println("Idcarrera: "+pro_ca.getIdcarrera()+" Idpersona"+pro_ca.getIdpersona());
            }*/
            Cadena.saltolinea(1);
            System.out.print("\t\033[30mDesea agregar otra carrera? [1 Continuar/0 terminar]: ");
            respuesta = Cadena.leerentero();
        } while (respuesta!=0);
        
        
        
        
        
        
    }
    public static void validacionLogin(String cedula, String password){
        String userAdmin = "admin";
        String passAdmin = "admin";
        if (cedula.equals(userAdmin) || password.equals(passAdmin)) {
            
            Logica.iniciarSistemaAdmin();
        } else {
            System.out.println(cedula);
            System.out.println(password);
            System.out.println("no entra");
        }
    }
    
    public static void error() {
        System.out.println("\033[31m--------   -------  ERROR  -------  --------\n\tIntenta Otra vez !!");
        Cadena.saltolinea(2);
    }
    public static void salir() {
        System.out.println("\033[31m .----------------. .----------------. .----------------. .----------------. .----------------. .----------------. .----------------. \r\n"
                + "| .--------------. | .--------------. | .--------------. | .--------------. | .--------------. | .--------------. | .--------------. |\r\n"
                + "| |    ______    | | |  _______     | | |      __      | | |     ______   | | |     _____    | | |      __      | | |    _______   | |\r\n"
                + "| |  .' ___  |   | | | |_   __ \\    | | |     /  \\     | | |   .' ___  |  | | |    |_   _|   | | |     /  \\     | | |   /  ___  |  | |\r\n"
                + "| | / .'   \\_|   | | |   | |__) |   | | |    / /\\ \\    | | |  / .'   \\_|  | | |      | |     | | |    / /\\ \\    | | |  |  (__ \\_|  | |\r\n"
                + "| | | |    ____  | | |   |  __ /    | | |   / ____ \\   | | |  | |         | | |      | |     | | |   / ____ \\   | | |   '.___`-.   | |\r\n"
                + "| | \\ `.___]  _| | | |  _| |  \\ \\_  | | | _/ /    \\ \\_ | | |  \\ `.___.'\\  | | |     _| |_    | | | _/ /    \\ \\_ | | |  |`\\____) |  | |\r\n"
                + "| |  `._____.'   | | | |____| |___| | | ||____|  |____|| | |   `._____.'  | | |    |_____|   | | ||____|  |____|| | |  |_______.'  | |\r\n"
                + "| |              | | |              | | |              | | |              | | |              | | |              | | |              | |\r\n"
                + "| '--------------' | '--------------' | '--------------' | '--------------' | '--------------' | '--------------' | '--------------' |\r\n"
                + " '----------------' '----------------' '----------------' '----------------' '----------------' '----------------' '----------------' ");
    }
}
