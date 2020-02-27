package herencia;

import java.util.Scanner;

public class EjecutaPersonal {
    public static void main(String[] args) {

        // Creacion de objeto de la clase Estudiante.
        String nombre, identificacion, estado_civil, carrera, fecha_nac;
        Scanner teclado = new Scanner(System.in);
        System.out.println("CREACION DE OBJETO ESTUDIANTE.");
        System.out.println("Ingrese el nombre:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese carrera del estudiante: ");
        carrera = teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese fecha nacimiento: ");
        fecha_nac = teclado.nextLine();


        Estudiante est = new Estudiante(carrera, nombre, identificacion, estado_civil, fecha_nac);


        System.out.println("-------------------------------");
        System.out.println("Datos de objeto estudiante.");
        System.out.println("Nombre: " + est.getNombre());
        System.out.println("Identificacion: " + est.getIdentificacion());
        System.out.println("Carrera: " + est.getCarrera());
        System.out.println("Estado Civil: " + est.getEstado_civil());
        System.out.println("Fecha De Nacimiento: " + est.getFecha_nac());

        // Creacion de objeto de la clase Docente.

        System.out.println("CREACION DE OBJETO DOCENTE.");
        System.out.println("Ingrese el nombre:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese carrera del estudiante: ");
        String area = teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese fecha nacimiento: ");
        fecha_nac = teclado.nextLine();


        Docente doc = new Docente(area, nombre, identificacion, estado_civil, fecha_nac);


        System.out.println("-------------------------------");
        System.out.println("Datos de objeto estudiante.");
        System.out.println("Nombre: " + doc.getNombre());
        System.out.println("Identificacion: " + doc.getIdentificacion());
        System.out.println("Area: " + doc.getArea());
        System.out.println("Estado Civil: " + doc.getEstado_civil());
        System.out.println("Fecha De Nacimiento: " + doc.getFecha_nac());

        // Creacion de objeto de la clase Estudiante.
        System.out.println("CREACION DE OBJETO ADMINISTRATIVO.");
        System.out.println("Ingrese el nombre:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese dependencia del estudiante: ");
        String dependencia = teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese fecha nacimiento: ");
        fecha_nac = teclado.nextLine();


        Administrativo adm = new Administrativo(dependencia, nombre, identificacion, estado_civil, fecha_nac);


        System.out.println("-------------------------------");
        System.out.println("Datos de objeto estudiante.");
        System.out.println("Nombre: " + adm.getNombre());
        System.out.println("Identificacion: " + adm.getIdentificacion());
        System.out.println("Carrera: " + adm.getDependencia());
        System.out.println("Estado Civil: " + adm.getEstado_civil());
        System.out.println("Fecha De Nacimiento: " + adm.getFecha_nac());
    }
}
