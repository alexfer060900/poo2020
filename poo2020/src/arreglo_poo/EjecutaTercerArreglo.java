package arreglo_poo;

import java.util.Scanner;

public class EjecutaTercerArreglo {
    public static void main(String[] args) {
        {
            Scanner teclado = new Scanner(System.in);

            int[] vectorA = new int[10];
            int[] vectorB = new int[10];

            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese valor al vector A en la posicion: " + i);
                vectorA[i] = teclado.nextInt();
                System.out.println("Ingrese valor al vector B en la posicion: " + i);
                vectorB[i] = teclado.nextInt();
            }

            TercerArreglo arreglo = new TercerArreglo(vectorA, vectorB);
            arreglo.sumar_arreglos();
            arreglo.presentar();
        }
    }
}
