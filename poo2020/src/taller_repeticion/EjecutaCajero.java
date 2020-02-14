package taller_repeticion;

import java.util.Scanner;

public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el saldo inicial de la cuenta");
        int saldo_inicial = teclado.nextInt();
        teclado.nextLine();

        // creamos una instancia de la clase
        Cajero cajero = new Cajero();
        int opcion1 = 0;
        while (opcion1 != 4) {

            System.out.println("Cajero automatico UTPL");
            System.out.println("Digite 1: retirar");
            System.out.println("digite 2: depositar");
            System.out.println("digite 3: consultar saldo");
            System.out.println("digite 4: para salir");
            System.out.println("_________________");
            opcion1 = teclado.nextInt();
            teclado.nextLine();
            switch (opcion1) {
                case 1:
                    System.out.println("ingrese el valor a retirar: ");
                    int valor_retiro = teclado.nextInt();
                    teclado.nextLine();
                    cajero.retirar(valor_retiro);
                    System.out.println("saldo contable: " + cajero.consultar_saldo());
                    break;
                case 2:
                    System.out.println("ingrese un valor a depositar: ");
                    int valor_deposito = teclado.nextInt();
                    teclado.nextLine();
                    cajero.depositar(valor_deposito);
                    System.out.println("saldo contable: " + cajero.consultar_saldo());
                    break;
                case 3:
                    System.out.println(" \t");
                    System.out.println("saldo de la cuenta es: " + cajero.consultar_saldo());

                    break;
                case 4:
                    System.out.println("gracias por prefeirnos");
                    break;
                default:
                    System.out.println("no existe una opcion seleccionada");

            }

            System.out.println("¡cual es el saldo inicial de mi cuenta?: " + cajero.consultar_saldo());

            System.out.println("saldo de la cuenta" + cajero.consultar_saldo());
        }
    }
}
