package taller_repeticion;

import java.util.Scanner;

public class EjecutaFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero= teclado.nextInt();
        int acumulador =1;
        Factorial factorial  = new Factorial(numero,acumulador );
        System.out.println(factorial.calcular_factorial(numero,acumulador));


    }
}
