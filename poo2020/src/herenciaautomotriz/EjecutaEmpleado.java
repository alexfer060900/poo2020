package herenciaautomotriz;
import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        String rfc;
        String nombre;
        String departamento;
        String puesto;
        double sueldomensual;
        double cuotaTrab;
        double trabajos;
        double ventaTotal;
        double sueldomin;
        double autos;
        double valor = 0;
        double aux;
        int opcion;
        int opcion2;
        boolean proceder = true;
        String cadenaFinal = "";
        cadenaFinal = String.format("%sRFC   NOMBRE  DEPARTAMENTO    PUESTO  SUELDO QUINCENA\n" , cadenaFinal);
        Scanner sc = new Scanner(System.in);

        while (proceder){
        System.out.println("Menu");
        System.out.println("1. Empleado Administrativo");
        System.out.println("2. Empleado Mecanico");
        System.out.println("3. Empleado Vendedor");
        System.out.println("Elija la opcion a realizar: ");
        opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("CREACION DE EMPLEADO ADMINISTRATIVO");
                System.out.println("Ingrese el RFC: ");
                rfc = sc.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese el departamento: ");
                departamento = sc.nextLine();
                puesto = "Administrativo";
                System.out.println("Ingrese el sueldo mensual: ");
                sueldomensual = sc.nextDouble();

                EmpAdmvo ea = new EmpAdmvo(sueldomensual, rfc, nombre, departamento, puesto);
                cadenaFinal = String.format("%s%s   %s  %s  %s  %.2f\n", cadenaFinal, rfc, nombre, departamento,
                        puesto, ea.calcularSueldoQuincenal(sueldomensual));
                break;
            case 2:
                System.out.println("CREACION DE EMPLEADO MECANICO");
                System.out.println("Ingrese el RFC: ");
                rfc = sc.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese el departamento: ");
                departamento = sc.nextLine();
                puesto = "Mecanico";
                System.out.println("Ingrese el numero de trabajos realizados: ");
                trabajos = sc.nextInt();
                System.out.println("Ingrese el valor a pagar por trabajo realizado: ");
                cuotaTrab = sc.nextDouble();
                ventaTotal = trabajos * cuotaTrab;

                EmpMecanico em = new EmpMecanico(ventaTotal, rfc, nombre, departamento, puesto);
                cadenaFinal = String.format("%s%s   %s  %s  %s  %.2f\n", cadenaFinal, rfc, nombre, departamento,
                        puesto, em.calcularSqMecanico(ventaTotal));
                break;
            case 3:
                System.out.println("CREACION DE EMPLEADO VENDEDOR");
                System.out.println("Ingrese el RFC: ");
                rfc = sc.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese el departamento: ");
                departamento = sc.nextLine();
                puesto = "Vendedor";
                System.out.println("Ingrese el valor del sueldo minimo: ");
                sueldomin = sc.nextDouble();
                System.out.println("Ingrese el numero de automoviles vendidos: ");
                autos = sc.nextInt();
                for (int i = 0; i < autos; i++) {
                    System.out.println("Ingrese el valor del auto: ");
                    aux = sc.nextDouble();
                    valor = valor + aux;
                }

                EmpVendedor ev = new EmpVendedor(valor, sueldomin, rfc, nombre, departamento, puesto);
                cadenaFinal = String.format("%s%s   %s  %s  %s  %.2f\n", cadenaFinal, rfc, nombre, departamento,
                        puesto, ev.calcularsqVendedor(valor, sueldomin));
                break;
        }
            System.out.println("Presione 1 si desea seguir registrando empleados o 2 si desea imprimir el reporte.");
            opcion2 = sc.nextInt();
            if (opcion2 == 2){
                proceder = false;
            }

        }
        System.out.printf("%s" , cadenaFinal);
    }
}
