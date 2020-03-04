package polimorfismo_poo;

import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {

        EmpleadoPorHoras2 empHoras = new EmpleadoPorHoras2();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculo sueldo quincenal de empleado por horas");
        System.out.println("Ingrese horas trabajadas: ");
        empHoras.setHorasTrab(teclado.nextInt());
        System.out.println("Ingrese la cuota por horas: ");
        empHoras.setCuota(teclado.nextInt());
        empHoras.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: " + empHoras.getSueldo());

        EmpleadoAsalariado2 empAs = new EmpleadoAsalariado2();
        System.out.println("Calculo de sueldo quincenal de empleado asalariado.");
        System.out.println("Ingrese sueldo mensual: ");
        empAs.setSueldo_mensual(teclado.nextInt());
        empAs.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: " + empAs.getSueldo());
    }
}
