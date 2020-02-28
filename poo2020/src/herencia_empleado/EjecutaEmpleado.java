package herencia_empleado;

import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        boolean eleccion;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pulse 1 si desea calcular el sueldo de un empleado por horas " +
                "o 2 si desea imprimir el sueldo de un empleado asalariado. ");
        opcion = sc.nextInt();
        sc.nextLine();
        if (opcion == 1){
            // Creacion de objeto de la clase Empleado por Horas.
            String nombre, cargo, dependencia;
            int horas;
            double valorHora;

            System.out.println("CREACION DE OBJETO ESTUDIANTE.");
            System.out.println("Ingrese el nombre:");
            nombre = sc.nextLine();
            System.out.println("Ingrese el cargo: ");
            cargo = sc.nextLine();
            System.out.println("Ingrese la dependencia: ");
            dependencia = sc.nextLine();
            System.out.println("Ingrese el numero de horas trabajadas: ");
            horas = sc.nextInt();
            System.out.println("Ingrese el valor de la hora: ");
            valorHora = sc.nextInt();

            EmpleadoPorHoras eph = new EmpleadoPorHoras(horas, valorHora, nombre, cargo, dependencia);
            eph.calcular_Sueldo(horas, valorHora);

            System.out.println("-------------------------------");
            System.out.println("Datos de objeto Empleado Por Horas.");
            System.out.println("Nombre: " + eph.getNombre());
            System.out.println("Cargo: " + eph.getCargo());
            System.out.println("Dependencia: " + eph.getDependencia());
            System.out.println("Sueldo: " + eph.getSueldo());
        }else{
            String nombre, cargo, dependencia;
            double sueldo_mensual;
            // Creacion de objeto de la clase Empleado Asalariado.
            System.out.println("CREACION DE OBJETO EMPLEADO ASALARIADO.");
            System.out.println("Ingrese el nombre:");
            nombre = sc.nextLine();
            System.out.println("Ingrese el cargo: ");
            cargo = sc.nextLine();
            System.out.println("Ingrese la dependencia: ");
            dependencia = sc.nextLine();
            System.out.println("Ingrese el sueldo mensual: ");
            sueldo_mensual = sc.nextInt();


            EmpleadoAsalariado eas = new EmpleadoAsalariado(sueldo_mensual, nombre, cargo, dependencia);


            System.out.println("-------------------------------");
            System.out.println("Datos de objeto estudiante.");
            System.out.println("Nombre: " + eas.getNombre());
            System.out.println("Cargo: " + eas.getCargo());
            System.out.println("Dependencia: " + eas.getDependencia());
            System.out.println("Sueldo Mensual: " + eas.getValor_mensual());
        }
    }

}
