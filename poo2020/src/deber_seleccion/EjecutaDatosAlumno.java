package deber_seleccion;
import java.util.Scanner;
public class EjecutaDatosAlumno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno.");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la primera calificacion.");
        Double nota1 = teclado.nextDouble();
        System.out.println("Ingrese la segunda calificacion.");
        Double nota2 = teclado.nextDouble();
        System.out.println("Ingrese la tercera calificacion.");
        Double nota3 = teclado.nextDouble();
        System.out.println("Ingrese la cuarta calificacion.");
        Double nota4 = teclado.nextDouble();

        DatosAlumno objAlumno = new DatosAlumno();
        objAlumno.establecerNombAlumno(nombre);
        objAlumno.establecerNota1(nota1);
        objAlumno.establecerNota2(nota2);
        objAlumno.establecerNota3(nota3);
        objAlumno.establecerNota4(nota4);
        objAlumno.calcularPromedio();
        objAlumno.calcularObservacion();

        System.out.println(objAlumno.obtenerNombreAlum());
        System.out.println(objAlumno.obtenerPromedio());
        System.out.println(objAlumno.obtenerObservacion());
    }
}
