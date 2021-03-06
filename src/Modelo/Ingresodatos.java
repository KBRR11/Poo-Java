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
    private static ArrayList<Secretaria> secretaria = new ArrayList<>();
    private static ArrayList<Materia> materia = new ArrayList(); 
    private static ArrayList<Estudiante_Materia> estud_mater = new ArrayList();
    private static ArrayList<Calificacion> calificacion = new ArrayList<>();
    
    private static int contCarrera = 0;
    private static int contProfesor = 0;
    private static int contSecretaria = 0;
    private static int contEstudiante = 0;
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
        ////////////////////borrar
        Carrera car = new Carrera(1, "Nutricion");
        carrera.add(car);
        Carrera car1 = new Carrera(2, "Medicina");
        carrera.add(car1);
        Carrera car2 = new Carrera(3, "Psicologia");
        carrera.add(car2);
        ////////////////////
        Profesor pro = new Profesor(1, "Angie", "Diaz", "1", "1", "1", "1", "1", "1", "2");
        profesor.add(pro);
        Profesor pro1 = new Profesor(2, "Isaac", "Newton", "2", "2", "2", "2", "2", "2", "2");
        profesor.add(pro1);
        Profesor pro2 = new Profesor(3, "Benito", "Juarez", "3", "3", "3", "3", "3", "3", "2");
        profesor.add(pro2);
        /////////////////////
        Profesor_Carrera proca = new Profesor_Carrera(1, 3);
        prof_carr.add(proca);
        Profesor_Carrera proca4 = new Profesor_Carrera(1, 2);
        prof_carr.add(proca4);
         Profesor_Carrera proca1 = new Profesor_Carrera(2, 2);
        prof_carr.add(proca1);
         Profesor_Carrera proca2 = new Profesor_Carrera(3, 1);
        prof_carr.add(proca2);
        Profesor_Carrera proca3 = new Profesor_Carrera(3, 2);
        prof_carr.add(proca3);
        ////////////////////
        Materia mate = new Materia(1, "Patologia", "001", "1", 3, 1);
        materia.add(mate);
        Materia mate1 = new Materia(2, "Microbiologia", "002", "1", 2, 2);
        materia.add(mate1);
        Materia mate2 = new Materia(3, "Quimica", "003", "1", 1, 3);
        materia.add(mate2);
        Materia mate3 = new Materia(4, "Comida Sal", "004", "1", 1, 3);
        materia.add(mate3);
        ////////////////////
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[35mBienvenido Administrador");
        Cadena.saltolinea(1);
        System.out.println("\t\033[30m[1]. Registrar Carrera");
        System.out.println("\t[2]. Registrar Profesor");
        System.out.println("\t[3]. Registrar Materia");
        System.out.println("\t[4]. Registrar Estudiante");
        System.out.println("\t[5]. Registrar Secretaria");
        System.out.println("\t[6]. Registrar Conserje");
        System.out.println("\t[7]. Cerrar Sesión");
        System.out.print("\tIngresar Opción [1-7]: ");
    }
    public static void textoSistemaEstudiante(){
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[34mBienvenido Estudiante");
        Cadena.saltolinea(1);
        System.out.println("\t[1]. Ver Notas");
        System.out.println("\t[2]. Cerrar Sesión");
        System.out.print("\tIngresar Opción [1-2]: ");
    }
    public static void textoSistemaProfesor(){
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[34mBienvenido Profesor");
        Cadena.saltolinea(1);
        System.out.println("\t[1]. Calificar estudiantes");
        System.out.println("\t[2]. Corregir Calificación");
        System.out.println("\t[3]. Ver Calificaciónes");
        System.out.println("\t[4]. Cerrar Sesión");
        System.out.print("\tIngresar Opción [1-4]: ");
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
        int idcarrera,idmateria, respuesta;
        String semestre;
        String fecha_inicio;
        String fecha_fin;
        boolean correcto=false;
        Cadena.saltolinea(3);
        System.out.println("\t\t\033[36mRegistrar Estudiante");
        contEstudiante++;
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
                //// agregamos los datos del estudiante al ArrayList
                Estudiante est = new Estudiante(idcarrera, semestre, fecha_inicio, fecha_fin, contEstudiante, nombre, apellido, cedula, edad, fecha_nacimiento, telefono, direccion, password, tipo) ;
                estudiante.add(est);
                Cadena.saltolinea(1);
                System.out.println("\tSELECCIONAR MATERIAS: ");
                do {            
           Cadena.saltolinea(1); 
           System.out.println("\033[31mNro	MATERIA		CARRERA		PROFESOR");
           
            for (Materia mate : materia) {
                if (mate.getIdcarrera()==carrera.get(idcarrera-1).getIdcarrera() ) {
                    System.out.println("\033[30m"+mate.getIdmateria()+"\t"+mate.getNom_materia()+"\t"+carrera.get(idcarrera-1).getNom_carrera()+"\t"+profesor.get(mate.getIdprofesor()-1).getNombre()+" "+profesor.get(mate.getIdprofesor()-1).getApellido());
                }
            }
            Cadena.saltolinea(1);
                    System.out.print("\tSeleccione Item de Materia: ");
                    idmateria= Cadena.leerentero();
                    Estudiante_Materia estu_mat = new Estudiante_Materia(contEstudiante, idmateria);
                    estud_mater.add(estu_mat);
                    Cadena.saltolinea(1);
                    System.out.println("\tNro\tEstudiante\tMateria\tCarrera\tProfesor");
                    int num=0;
                    for (Estudiante_Materia estumat : estud_mater) {
                        if (estumat.getIdestudiante()==estudiante.get(contEstudiante-1).getIdpersona() /*|| estumat.getIdmateria()==materia.get(estumat.getIdmateria()-1).getIdmateria()*/) {
                            num++;
                            System.out.println("\t"+num+"\t"+estudiante.get(contEstudiante-1).getNombre()+" "+estudiante.get(contEstudiante-1).getApellido()+"\t"
                                    +materia.get(estumat.getIdmateria()-1).getNom_materia()+"\t"+carrera.get(materia.get(estumat.getIdmateria()-1).getIdcarrera()-1).getNom_carrera()+
                                    "\t"+profesor.get(materia.get(estumat.getIdmateria()-1).getIdprofesor()-1).getNombre()+" "+profesor.get(materia.get(estumat.getIdmateria()-1).getIdprofesor()-1).getApellido());
                            //System.out.println("exite");
                        }
                           //System.out.println("\t"+num+"\t"+estudiante.get(estumat.getIdestudiante()-1).getNombre()+" "+estudiante.get(estumat.getIdestudiante()-1).getApellido()+"\t"+materia.get(estumat.getIdmateria()-1).getNom_materia());
                    }
                    Cadena.saltolinea(1);
                    System.out.print("\tDesea agregar otra Materia ? [1] Si/ [0] NO: ");
                    respuesta = Cadena.leerentero();
        } while (respuesta!=0);
                
                correcto=true;
                Cadena.saltolinea(1);
            }else{
                Cadena.saltolinea(1);
                System.out.println("\t\033[31mlas contraseñas no coinciden!!\n\t\033[31mINTENTALO DE NUEVO!!");
                Cadena.saltolinea(1);
            }
            Cadena.saltolinea(2);
                System.out.println("\t\033[32mALUMNO CREADO CON EXITO!!");
                Cadena.saltolinea(1);
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
        contProfesor++;
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
                Profesor profe = new Profesor(contProfesor, nombre, apellido, cedula, edad, fecha_nacimiento, telefono, direccion, password, tipo);
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
          Profesor_Carrera pro_carrera = new Profesor_Carrera(contProfesor, idcarrera);
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
    
    public static void registerSecretary(){
        String nombre;
        String apellido;
        String cedula;
        String edad;
        String fecha_nacimiento;
        String telefono;
        String direccion;
        String password;
        String pass2,fecha_ingreso,service_time;
        String turno ="";
        String tipo="3";
        boolean correcto=false;
        int idcarrera,opc_turno;
        contSecretaria++;       
        Cadena.saltolinea(2);
        System.out.println("\t\t\033[34mREGISTRO DE SECRETARIA");
        Cadena.saltolinea(1);
        System.out.print("\tNombre: ");
        nombre = Cadena.leercadena();
        System.out.print("\tApellido: ");
        apellido = Cadena.leercadena();
        System.out.print("\tCédula: ");
        cedula = Cadena.leercadena();
        System.out.print("\tEdad: ");
        edad = Cadena.leercadena();
        System.out.print("\tFecha de Nacimiento: ");
        fecha_nacimiento = Cadena.leercadena();
        System.out.print("\tTelefono: ");
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
                System.out.println("\tPertenece a la Carrera de: ");
                Cadena.saltolinea(1);
                System.out.println("\033[31mNro\tCARRERA");
        for (Carrera carrera1 : carrera) {
                System.out.println("\033[30m"+carrera1.getIdcarrera()+"\t"+carrera1.getNom_carrera());
            }
          System.out.print("\tSeleccionar Item de Carrera: ");
          idcarrera = Cadena.leerentero();
                System.out.print("\tFecha de Ingreso: ");
                fecha_ingreso = Cadena.leercadena();
                System.out.print("\tTiempo de Servicio: ");
                service_time = Cadena.leercadena();
                
                
                do { 
                    System.out.print("\tTURNO: ");
                    System.out.print("\t[1] MAÑANA: ");
                    System.out.println("\t[2] TARDE: ");
                    System.out.print("\tSeleccione Item: ");
                    opc_turno = Cadena.leerentero();
                    switch(opc_turno){
                    case 1: turno = "Mañana";
                    System.out.println("\t\033[32mSECRETARIA/O CREADA/O CON EXITO!!");
                Secretaria secre1 = new Secretaria(idcarrera, fecha_ingreso, service_time, turno, contSecretaria, nombre, apellido, cedula, edad, fecha_nacimiento, telefono, direccion, password, tipo);
                secretaria.add(secre1);
                correcto=true;
                        break;
                    case 2: turno = "Tarde";
                    System.out.println("\t\033[32mSECRETARIA/O CREADA/O CON EXITO!!");
                Secretaria secre2 = new Secretaria(idcarrera, fecha_ingreso, service_time, turno, contSecretaria, nombre, apellido, cedula, edad, fecha_nacimiento, telefono, direccion, password, tipo);
                secretaria.add(secre2);
                correcto=true;
                          break;
                      default: error();
                }        
                        } while (opc_turno!=1 || opc_turno!=2);
                
                Cadena.saltolinea(1);
            }else{
                Cadena.saltolinea(1);
                System.out.println("\t\033[31mlas contraseñas no coinciden!!\n\t\033[31mINTENTALO DE NUEVO!!");
                Cadena.saltolinea(1);
            }
        } while (correcto!=true);
        
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
    public static void verNotasMateria(int idprofesor){
        int idcarrera;
        int idmateria;
        int respuesta;
        Cadena.saltolinea(2);
        System.out.println("\tVer Calificaciones de Estudiantes de la Carrera de: ?");
        Cadena.saltolinea(1);
        System.out.println("\tItem\tCARRERA");
        for (Profesor_Carrera procar : prof_carr) {
            if (procar.getIdpersona()==profesor.get(idprofesor-1).getIdpersona()) {
                System.out.println("\t["+carrera.get(procar.getIdcarrera()-1).getIdcarrera()+"]\t"+carrera.get(procar.getIdcarrera()-1).getNom_carrera());
            }
        }
        Cadena.saltolinea(1);
        System.out.print("\tIngrese item de Carrera: ");
        idcarrera = Cadena.leerentero();
        
        do {            
            Cadena.saltolinea(1);
        System.out.println("\t\033[31mDE LA MATERIA");
        System.out.println("\tItem\tMATERIA");
        for (Materia maters : materia) {
            if (maters.getIdcarrera()==carrera.get(idcarrera-1).getIdcarrera() && maters.getIdprofesor()==profesor.get(idprofesor-1).getIdpersona()) {
                System.out.println("\t["+maters.getIdmateria()+"]\t"+maters.getNom_materia());
            }
        }
        Cadena.saltolinea(1);
        System.out.print("\t: Ingrese item de Carrera: ");
        idmateria = Cadena.leerentero();
        Cadena.saltolinea(2);
        int pos=0;
        System.out.println("\t\033[34mAlumno     Parcial 1    Parcial 2    Recuperación    Nota Final");
            for (Calificacion cali : calificacion) {
                pos++;
                if (calificacion.size()!=0 ) {
                    System.out.println("\t"+estudiante.get(cali.getIdestudiante()-1).getNombre()+" "+estudiante.get(cali.getIdestudiante()-1).getApellido()
                    +"     "+cali.getParcial1()+"    "+cali.getParcial2()+"    "+cali.getRecupercion()+"    "+cali.getNotafinal());
                }else{
                    System.out.println("\t\033[31mAún no hay Calificaciones");
                }
            }
        Cadena.saltolinea(2);
            System.out.print("\tDesea ver Calificaciones de otra Materia? [1] SI/[0] NO: ");
            respuesta = Cadena.leerentero();
        } while (respuesta!=0);
    }
    
    public static void calificar(int idpersona){
        int idcarrera;
        int idmateria;
        int idestudiante;
        Cadena.saltolinea(2);
        System.out.println("\tCalificar Estudiantes de la Carrera de: ?");
        Cadena.saltolinea(1);
        System.out.println("\tItem\tCARRERA");
        for (Profesor_Carrera procar : prof_carr) {
            if (procar.getIdpersona()==profesor.get(idpersona-1).getIdpersona()) {
                System.out.println("\t["+carrera.get(procar.getIdcarrera()-1).getIdcarrera()+"]\t"+carrera.get(procar.getIdcarrera()-1).getNom_carrera());
            }
        }
        Cadena.saltolinea(1);
        System.out.print("\tIngrese item de Carrera: ");
        idcarrera = Cadena.leerentero();
        Cadena.saltolinea(1);
        System.out.println("\t\033[31mCALIFICAR MATERIA");
        System.out.println("\tItem\tMATERIA");
        for (Materia maters : materia) {
            if (maters.getIdcarrera()==carrera.get(idcarrera-1).getIdcarrera() && maters.getIdprofesor()==profesor.get(idpersona-1).getIdpersona()) {
                System.out.println("\t["+maters.getIdmateria()+"]\t"+maters.getNom_materia());
            }
        }
        Cadena.saltolinea(1);
        System.out.print("\tCalificar la Materia de: ");
        idmateria = Cadena.leerentero();
        int respuesta;
        do {            
          Cadena.saltolinea(1);
        System.out.println("\t\033[31mLISTA DE ESTUDIANTES DE ESTA MATERIA:");
        System.out.println("\tItem\tALUMNO");
        for (Estudiante_Materia estudentmat : estud_mater) {
            if (estudentmat.getIdmateria()==materia.get(idmateria-1).getIdmateria()) {
                System.out.println("\t["+estudiante.get(estudentmat.getIdestudiante()-1).getIdpersona()+"]\t"+estudiante.get(estudentmat.getIdestudiante()-1).getNombre()+" "+estudiante.get(estudentmat.getIdestudiante()-1).getApellido());
            }
        }
        Cadena.saltolinea(1);
            System.out.print("\t Elejir Item de Estudiante: ");
        idestudiante = Cadena.leerentero();
        int opcion;
        
            do {                
                Cadena.saltolinea(1);
            System.out.println("\t\033[34mCalificar a "+estudiante.get(idestudiante-1).getNombre()+" "+estudiante.get(idestudiante-1).getApellido());
            System.out.println("\t[1]. Ver Notas del Estudiante");
            System.out.println("\t[2]. 1er Parcial");
            System.out.println("\t[3]. 2do Parcial");
            System.out.println("\t[4]. Recuperación");
            System.out.println("\t[5]. Nota Final");
            System.out.println("\t[6]. SALIR");
            System.out.print("\tSeleccione Item: ");
            opcion = Cadena.leerentero();
            switch(opcion){
                case 1:verNotasEst(idestudiante, idmateria);
                    break;
                case 2: parcial1(idestudiante,idmateria);
                    break;
                case 3: parcial2(idestudiante,idmateria);
                    break;
                case 4: recuperacion(idestudiante,idmateria);
                    break;
                case 5: notafinal(idestudiante,idmateria);
                    break;   
                case 6: 
                    break;
                 default: error();
            }
            } while (opcion!=6);
            System.out.print("\n\tDESEA SEGUIR CALIFICANDO ? [1 SI/0 NO]: ");
            respuesta = Cadena.leerentero();
        } while (respuesta!=0);
        
    }
    public static void verNotasEst(int idestudiante, int idmateria){
        Cadena.saltolinea(1);
             System.out.println("\tParcial 1    Parcial 2    Recuperación    Nota Final");
        for (Calificacion cal : calificacion) {
            if (calificacion.size()!=0) {
              if (cal.getIdestudiante()==estudiante.get(idestudiante-1).getIdpersona() && cal.getIdmateria()==materia.get(idmateria-1).getIdmateria()) {
                System.out.println("\t  "+cal.getParcial1()+"         "+cal.getParcial2()+"         "+cal.getRecupercion()+"            "+cal.getNotafinal());
                break;
            }  
            }else{
                System.out.println("\tNo Hay Notas Aún....");
            }
            
        }
    }
    public static void parcial1(int idestudiante, int idmateria){
        Double parcial1;
        Cadena.saltolinea(1);
        System.out.println("\t\033[34mINGRESE NOTA: ");
        System.out.print("\tParcial 1: ");
        parcial1 = Cadena.leerdecimal();
        Calificacion calif = new Calificacion(parcial1, 0.0, 0.0, 0.0, idestudiante, idmateria);
        calificacion.add(calif);
        Cadena.saltolinea(1);
             System.out.println("\tParcial 1    Parcial 2    Recuperación    Nota Final");
        for (Calificacion cal : calificacion) {
            
            if (cal.getIdestudiante()==estudiante.get(idestudiante-1).getIdpersona() && cal.getIdmateria()==materia.get(idmateria-1).getIdmateria()) {
                System.out.println("\t  "+cal.getParcial1()+"         "+cal.getParcial2()+"         "+cal.getRecupercion()+"            "+cal.getNotafinal());
            }
        }
        Cadena.saltolinea(1);
        System.out.println("\t\033[32mCALIFICADO CON EXITO");
        Cadena.saltolinea(1);
    }
    public static int obtenerPosicion(int idestudiante, int idmateria) {
        int pos = -1;
        for (Calificacion ca : calificacion) {
            pos++;
            if (ca.getIdestudiante() == (idestudiante-1) && ca.getIdmateria() == (idmateria-1)) {
                break;
            }
        }
        return pos;
    }
    public static void parcial2(int idestudiante, int idmateria){
        Double parcial2;
        Cadena.saltolinea(1);
        System.out.println("\t\033[34mINGRESE NOTA: ");
        System.out.print("\tParcial 2: ");
        parcial2 = Cadena.leerdecimal();
        calificacion.get(obtenerPosicion(idestudiante, idmateria)).setParcial2(parcial2);
        Cadena.saltolinea(1);
             System.out.println("\tParcial 1    Parcial 2    Recuperación    Nota Final");
        for (Calificacion cal : calificacion) {
            
            if (cal.getIdestudiante()==estudiante.get(idestudiante-1).getIdpersona() && cal.getIdmateria()==materia.get(idmateria-1).getIdmateria()) {
                System.out.println("\t  "+cal.getParcial1()+"         "+cal.getParcial2()+"         "+cal.getRecupercion()+"            "+cal.getNotafinal());
            }
        }
        Cadena.saltolinea(1);
        System.out.println("\t\033[32mCALIFICADO CON EXITO");
        Cadena.saltolinea(1);
    }
    public static void recuperacion(int idestudiante, int idmateria){
        Double recuperacion;
        Cadena.saltolinea(1);
        System.out.println("\t\033[34mINGRESE NOTA: ");
        System.out.print("\tRecuperación: ");
        recuperacion = Cadena.leerdecimal();
        calificacion.get(obtenerPosicion(idestudiante, idmateria)).setRecupercion(recuperacion);
        Cadena.saltolinea(1);
             System.out.println("\tParcial 1    Parcial 2    Recuperación    Nota Final");
        for (Calificacion cal : calificacion) {
            
            if (cal.getIdestudiante()==estudiante.get(idestudiante-1).getIdpersona() && cal.getIdmateria()==materia.get(idmateria-1).getIdmateria()) {
                System.out.println("\t  "+cal.getParcial1()+"         "+cal.getParcial2()+"         "+cal.getRecupercion()+"            "+cal.getNotafinal());
            }
        }
        Cadena.saltolinea(1);
        System.out.println("\t\033[32mCALIFICADO CON EXITO");
        Cadena.saltolinea(1);
    }
    public static void notafinal(int idestudiante, int idmateria){
        Double notafinal;
        Cadena.saltolinea(1);
        System.out.println("\t\033[34mINGRESE NOTA: ");
        System.out.print("\tNota Final: ");
        notafinal = Cadena.leerdecimal();
        calificacion.get(obtenerPosicion(idestudiante, idmateria)).setNotafinal(notafinal);
        System.out.println("\t\033[32mCALIFICADO CON EXITO");
        Cadena.saltolinea(1);
        System.out.println("\tParcial 1    Parcial 2    Recuperación    Nota Final");
                               
        for (Calificacion cal : calificacion) {
            if (cal.getIdestudiante()==estudiante.get(idestudiante-1).getIdpersona() && cal.getIdmateria()==materia.get(idmateria-1).getIdmateria()) {
                System.out.println("\t  "+cal.getParcial1()+"         "+cal.getParcial2()+"         "+cal.getRecupercion()+"            "+cal.getNotafinal());
            }
            
        }
    }
    public static void obsNotas(int idestudiante){
        int idmateria;
        Cadena.saltolinea(2);
        int idcarrera=estudiante.get(idestudiante-1).getIdcarrera();
        String nomcarrera = carrera.get(idcarrera-1).getNom_carrera();
        System.out.println("\t\t\033[34mCARRERA: "+nomcarrera);
        System.out.println("\t\033[31mItem\tMATERIAS");
        
        for (Estudiante_Materia est_Ma : estud_mater) {
            if (est_Ma.getIdestudiante()==estudiante.get(idestudiante-1).getIdpersona() && est_Ma.getIdmateria()==materia.get(est_Ma.getIdmateria()-1).getIdmateria()) {
                System.out.println("\t["+est_Ma.getIdmateria()+"]\t"+materia.get(est_Ma.getIdmateria()-1).getNom_materia());
            }
            
        }
        System.out.print("\tElija Item de materia: ");
       idmateria = Cadena.leerentero();
       Cadena.saltolinea(2);
        verNotasEst(idestudiante, idmateria);
        Cadena.saltolinea(2);
    }
    
     public static void validacionLogin(String cedula, String password){
        String userAdmin = "admin";
        String passAdmin = "admin";
        boolean loginCorrecto=false;
        if (cedula.equals(userAdmin) && password.equals(passAdmin)) {
            
            Logica.iniciarSistemaAdmin();
        } else {
            int pos=0;
            
            for (Estudiante estu : estudiante) {
               
                pos++; 
                if (cedula.equals(estu.getCedula()) && password.equals(estu.getPassword())) {
                    loginCorrecto=true;
                    break;
                }
                
            }
            if (loginCorrecto) {
                Logica.iniciarSistemaEstudiante(pos);
            }else{
             int pos2 =0;
                
                for (Profesor profes : profesor) {
                    
                   pos2++;
                    if (profes.getCedula().equals(cedula) && profes.getPassword().equals(password)) {
                        loginCorrecto=true;
                        break;
                    }
                    
                }
                if (loginCorrecto) {
                Logica.iniciarSistemaProfesor(pos2);
            }else{
                  Cadena.saltolinea(2);
                System.out.println("\t\033[31m---------------------");
                System.out.println("\t\033[31mUSUARIO NO ENCONTRADO");
                System.out.println("\t\033[31mIntente de nuevo!!");
                System.out.println("\t\033[31m---------------------");
                Cadena.saltolinea(2);
                Login();  
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
