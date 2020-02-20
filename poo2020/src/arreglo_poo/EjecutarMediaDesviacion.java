package arreglo_poo;

import java.util.Scanner;

public class EjecutarMediaDesviacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese número posicion: " + i);
            numeros[i] = teclado.nextInt();
        }
        MediaDesviacion mediaDesviacion = new MediaDesviacion(numeros);
        mediaDesviacion.presentar();
    }
}
