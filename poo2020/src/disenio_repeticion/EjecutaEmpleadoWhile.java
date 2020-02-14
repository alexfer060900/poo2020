package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoWhile {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    Boolean nuevoEmpleado = true;
        while (nuevoEmpleado == true){
        //Solicito el ingreso de los datos requeridos.
        System.out.println("Nombre del Empleado.");
        String nombEmp= teclado.nextLine();

        System.out.println("Ingrese el valor de la cuota por hora.");
        double cuoHr = teclado.nextDouble();

        System.out.println("Ingrese el numero de horas trabajadas.");
        int hours = teclado.nextInt();
        // Creo el objeto
        Empleado objEmpleado = new Empleado();
        // LLamada a cada uno de los metodos
        objEmpleado.establecerNombre(nombEmp);
        objEmpleado.establecerCuota(cuoHr);
        objEmpleado.establecerHoras(hours);
        objEmpleado.calcularSueldo();

        System.out.println(objEmpleado.obtenerNombre());
        System.out.println(objEmpleado.obtenerSueldo());
        System.out.println("¿Desea calcular el sueldo de otro empleado?");
        String opcion = teclado.next();

        if (opcion.equals("No")) {
            nuevoEmpleado = false;
        }
        teclado.nextLine();
        }
    }
}
