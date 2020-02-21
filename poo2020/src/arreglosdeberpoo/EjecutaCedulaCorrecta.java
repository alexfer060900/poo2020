package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaCedulaCorrecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cedula;
        int[] cedulaDescompuesta = new int[10];
        int aux;

        System.out.println("Ingrese el numero de cedula: ");
        cedula = sc.nextInt();
        aux = cedula;
        for (int i = 0; i < 10 ; i++) {
            cedulaDescompuesta[i] = aux % 10;

            aux = aux / 10;
        }

        CedulaCorrecta array = new CedulaCorrecta(cedula, cedulaDescompuesta);
        array.calcular_cedula();
        array.presentar();
    }
}
