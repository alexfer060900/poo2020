package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaDatosEstudiantes {
    public static void main(String[] args) {
        {
            Scanner teclado = new Scanner(System.in);

            String[] nombres = new String [5];
            int[] edad = new int[5];
            String[] iniciales = new String [5];

            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese el nombre del estudiante: ");
                nombres[i] = teclado.next();
                System.out.println("Ingrese la edad del estudiante: " );
                edad[i] = teclado.nextInt();
                System.out.println("Ingrese las iniciales de la institucion a la que pertenece: " );
                iniciales[i] = teclado.next();
            }

            DatosEstudiantes array = new DatosEstudiantes(nombres, edad, iniciales);

            array.presentar();
        }
    }
}
