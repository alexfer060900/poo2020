package taller_repeticion;

import java.util.Scanner;

public class EjecutarNumMulti {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Boolean condi = true;

        while (condi == true) {
            System.out.println("Ingrese el numero: ");
            int num1 = teclado.nextInt();
            System.out.println("Ingrese la cantidad de veces que se debe multiplicar: ");
            int num2 = teclado.nextInt();

            NumMulti numMulti = new NumMulti(num1,num2);
            numMulti.presentar();

            condi = false;
            teclado.nextLine();

            System.out.println("¿Desea ingresar otro Número?");
            String opcion = teclado.nextLine();
            if (opcion.equals("si") || opcion.equals("SI")){
                condi = true;
            } else{
                condi = false;
            }

        }
    }
}
