package datostipoobjeto;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        int contador;
        Estudiante estudiante;
        boolean bandera = true;
        int opcion;
        Estudiante[] estudiantes = new Estudiante[3];
        Scanner teclado = new Scanner(System.in);

        for(contador = 0; contador < estudiantes.length; contador ++){
            System.out.println("Ingreso de nuevo estudiante: ");
            Estudiante est = new Estudiante();
            System.out.println("Ingrese el nombre: ");
            est.setNombre(teclado.nextLine());
            System.out.println("Ingrese la cedula: ");
            est.setCedula(teclado.nextLine());
            System.out.println("Ingrese la edad: ");
            est.setEdad(teclado.nextInt());
            teclado.nextLine();
            System.out.println("Ingrese la carrera: ");
            est.setCarrera(teclado.nextLine());
            System.out.println("Ingrese el correo: ");
            est.setCorreo(teclado.nextLine());

            estudiantes[contador] = est;
            }
        System.out.println("LISTA DE ESTUDIANTES");
        System.out.println("Cedula\tNombre");
        int edad_acum = 0;
        for(contador = 0; contador < estudiantes.length; contador ++){
            edad_acum = edad_acum + estudiantes[contador].getEdad();
            System.out.println(estudiantes[contador].getCedula()+ "\t" +estudiantes[contador].getNombre());
        }
        System.out.println("EDAD PROMEDIO DE LOS ESTUDIANTES: " + (edad_acum / estudiantes.length));
        System.out.println("FIN DEL PROGRAMA");
    }
}
