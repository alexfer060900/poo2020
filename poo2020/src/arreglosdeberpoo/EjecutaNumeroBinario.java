package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaNumeroBinario {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero;
            int[] numeroDescompuesto = new int[6];
            int aux;

            System.out.println("Ingrese el numero binario: ");
            numero = sc.nextInt();
            aux = numero;
            for (int i = 0; i < 6 ; i++) {
                numeroDescompuesto[i] = aux % 10;

                aux = aux / 10;
            }

            NumeroBinario array = new NumeroBinario(numero, numeroDescompuesto);
            array.calcular_decimal();
            array.presentar();
    }
}



