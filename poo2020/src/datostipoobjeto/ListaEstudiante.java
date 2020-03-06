package datostipoobjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
        public static void main(String[] args) {

            List<Estudiante> estudiantes = new ArrayList<Estudiante>();
            System.out.println("SISTEMA DE INGRESO DE ESTUDIANTES");
            boolean proceder = true;
            Scanner sc = new Scanner(System.in);
            int opcion;
            do{
                System.out.println("Digite 1 para almacenar nuevo estudiante: ");
                System.out.println("Digite 2 para presentar estudiantes: ");
                System.out.println("Digite 3 para salir: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion){
                    case 1:
                        Estudiante estudiante = new Estudiante();
                        System.out.println("Ingrese el nombre: ");
                        estudiante.setNombre(sc.nextLine());
                        System.out.println("Ingrese el correo: ");
                        estudiante.setCorreo(sc.nextLine());
                        System.out.println("Ingrese la carrera: ");
                        estudiante.setCarrera(sc.nextLine());
                        System.out.println("Ingrese la cedula: ");
                        estudiante.setCedula(sc.nextLine());
                        System.out.println("Ingrese la edad: ");
                        estudiante.setEdad(sc.nextInt());
                        sc.nextLine();

                        estudiantes.add(estudiante);
                        break;
                    case 2:
                        System.out.println("FICHAS DE ESTUDIANTES REGISTRADOS");
                        for (Estudiante e: estudiantes){
                            System.out.println("Nombre: " + e.getNombre());
                            System.out.println("Correo: " + e.getCorreo());
                            System.out.println("Carrera: " + e.getCarrera());
                            System.out.println("Cedula: " + e.getCedula());
                            System.out.println("Edad: " + e.getEdad());
                            System.out.println("----------------------------------------------------");
                        }
                        break;
                    case 3:
                        proceder = false;
                        break;
                    default:
                        System.out.println("Opcion Incorrecta.");
                }
            }while (proceder);
        }
}
