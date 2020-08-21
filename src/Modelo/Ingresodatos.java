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
    private static ArrayList<Estudiante> estudiante = new ArrayList();
    private static ArrayList<Profesor> profesor = new ArrayList();
    private static ArrayList<Materia> materia = new ArrayList(); 
    
    private static int contCarrera = 0;
    private static int contPersona = 0;
    private static int contMateria = 0;
    
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
    public static void textoSistemaEstudiante(){
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[34mBienvenido Estudiante");
        Cadena.saltolinea(1);
        System.out.println("\t[1]. Ver Notas");
        System.out.println("\t[2]. Cerrar Sesión");
        System.out.print("\tIngresar Opción [1-2]: ");
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
        String password, pass2;
        String tipo="1";
        int idcarrera;
        String semestre;
        String fecha_inicio;
        String fecha_fin;
        boolean correcto=false;
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[36mRegistrar Estudiante");
        contPersona++;
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
                System.out.println("\tPERTENECE A LA CARRERA DE: ");
                Cadena.saltolinea(1);
                System.out.println("\033[31mNro\tCARRERA");
            for (Carrera carrera1 : carrera) {
                System.out.println("\033[30m"+carrera1.getIdcarrera()+"\t"+carrera1.getNom_carrera());
            }
            Cadena.saltolinea(1);
                System.out.print("\tEligir Item: ");
                idcarrera = Cadena.leerentero();
                System.out.print("\tSemestre: ");
                semestre = Cadena.leercadena();
                System.out.print("\tF. inicio [dd/mm/yyyy]: ");
                fecha_inicio = Cadena.leercadena();
                System.out.print("\tF. fin [dd/mm/yyyy]: ");
                fecha_fin = Cadena.leercadena();
                Cadena.saltolinea(2);
                System.out.println("\t\033[32mALUMNO CREADO CON EXITO!!");
                Cadena.saltolinea(1);
                Estudiante est = new Estudiante(idcarrera, semestre, fecha_inicio, fecha_fin, contPersona, nombre, apellido, cedula, edad, fecha_nacimiento, telefono, direccion, password, tipo) ;
                estudiante.add(est);
                correcto=true;
                Cadena.saltolinea(1);
            }else{
                Cadena.saltolinea(1);
                System.out.println("\t\033[31mlas contraseñas no coinciden!!\n\t\033[31mINTENTALO DE NUEVO!!");
                Cadena.saltolinea(1);
            }
        } while (correcto!=true);
        
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
          int numeracion=0;
          System.out.println("\033[31mNro\tPROFESORES\tCARRERA");
           for (Profesor_Carrera pro_ca : prof_carr) {
               numeracion++;
                System.out.println(numeracion+"\t"+profesor.get(pro_ca.getIdpersona()-1).nombre+" "+profesor.get(pro_ca.getIdpersona()-1).apellido+"\t"+carrera.get(pro_ca.getIdcarrera()-1).getNom_carrera());
            }
           
            Cadena.saltolinea(1);
            System.out.print("\t\033[30mDesea agregar otra carrera? [1 Continuar/0 terminar]: ");
            respuesta = Cadena.leerentero();
        } while (respuesta!=0);
        
        
        
        
        
        
    }
    public static void registerMateria(){
    
     String nom_materia;
     String codigo;
     String Semestre;
     int idcarrera;
     int idprofesor;
     int respuesta;
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[34mREGISTRAR NUEVA MATERIA");
        do {        
            contMateria++;
            Cadena.saltolinea(1);
            System.out.print("\tNombre de la Materia: ");
            nom_materia = Cadena.leercadena();
            System.out.print("\tCódigo: ");
            codigo = Cadena.leercadena();
            System.out.print("\tSemestre: ");
            Semestre = Cadena.leercadena();
            System.out.println("\tPERTENECE A LA CARRERA DE: ");
            Cadena.saltolinea(1);
            System.out.println("\033[31mNro\tCARRERA");
            for (Carrera carrera1 : carrera) {
                System.out.println("\033[30m"+carrera1.getIdcarrera()+"\t"+carrera1.getNom_carrera());
            }
            Cadena.saltolinea(1);
            System.out.print("\tEscoger Item: ");
            idcarrera = Cadena.leerentero();
            System.out.println("\tPROFESOR QUE DICTA LA MATERIA: ");
            Cadena.saltolinea(1);
            
          System.out.println("\033[31mNro\tPROFESORES\tCARRERA");
           for (Profesor_Carrera pro_ca : prof_carr) {
               
                System.out.println(profesor.get(pro_ca.getIdpersona()-1).getIdpersona()+"\t"+profesor.get(pro_ca.getIdpersona()-1).nombre+" "+profesor.get(pro_ca.getIdpersona()-1).apellido+"\t"+carrera.get(pro_ca.getIdcarrera()-1).getNom_carrera());
            }
           Cadena.saltolinea(1);
           System.out.print("\tEscoger Item: ");
           idprofesor = Cadena.leerentero();
           Cadena.saltolinea(2);
           Materia mater = new Materia(contMateria, nom_materia, codigo, Semestre, idcarrera, idprofesor);
           materia.add(mater);
            System.out.println("\t\033[32mMATERIA AGREGADA CON EXITO!!");
            Cadena.saltolinea(2);
            int numeracion=0;
            System.out.println("Nro\tMATERIA\tCODIGO\tCARRERA\tPROFESOR");
            for (Materia mate : materia) {
                numeracion++;
                System.out.println(numeracion+"\t"+mate.getNom_materia()+"\t"+mate.getCodigo()+"\t"+carrera.get(mate.getIdcarrera()-1).getNom_carrera()+"\t"+profesor.get(mate.getIdprofesor()-1).getNombre()+" "+profesor.get(mate.getIdprofesor()-1).getApellido());
            }
            Cadena.saltolinea(2);
            System.out.print("\t\033[30mDesea agregar otra Materia? [1 Continuar/0 terminar]: ");
            respuesta = Cadena.leerentero();
        } while (respuesta!=0);
    }
    public static void verNotasEstudiante(int idpersona){
        int idcarrera=estudiante.get(idpersona-1).getIdcarrera();
        String nomcarrera = carrera.get(idcarrera-1).getNom_carrera();
        System.out.println("\t\tVer notas de la Carrera de: "+nomcarrera);
        Cadena.saltolinea(1);
        
    }
    public static void validacionLogin(String cedula, String password){
        String userAdmin = "admin";
        String passAdmin = "admin";
        boolean loginCorrecto=false;
        if (cedula.equals(userAdmin) || password.equals(passAdmin)) {
            
            Logica.iniciarSistemaAdmin();
        } else {
            
            for (int i = 0; i <= estudiante.size(); i++) {
                if (estudiante.get(i).getCedula().contains(cedula) || estudiante.get(i).getPassword().contains(password)) {
                    loginCorrecto=true;
                     System.out.println("El usuario registrado es: "+estudiante.get(i).getCedula()+"\nEl password registrado es : "+estudiante.get(i).getPassword());
                     System.out.println("el user ingresado fue: "+cedula+"\nEl pass ingresado fue: "+password);
                    Logica.iniciarSistemaEstudiante(estudiante.get(i).getIdpersona());
            }else{
                    loginCorrecto=false;
                    System.out.println("no");
                }
            }
            
              
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
